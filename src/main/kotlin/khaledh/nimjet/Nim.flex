package khaledh.nimjet;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import khaledh.nimjet.psi.NimElementTypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
%%

%class NimLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%char
%eof{ return;
%eof}

%state TRIPLEQUOTE
%state RAWSTRING
%state MULTILINE_COMMENT
%{
private int tripleQuoteCount = 0;
private int rawQuoteCount = 0;
private int multilineCommentLevel = 0;

private final Set<Character> UNARY_MINUS_PRED =
    new HashSet<Character>(Arrays.asList(' ', '\t', '\n', '\r', ',', ';', '(', '[', '{'));

private IElementType handleUnaryMinus(IElementType type) {
    if (yycharat(0) != '-') {
        return type;
    }
    if (yychar > 0 && UNARY_MINUS_PRED.contains(yycharat(-1))) {
        return type;
    }
    yypushback(yylength() - 1);
    yybegin(YYINITIAL);
    return NimElementTypes.OP8;
}

private IElementType considerAssign(IElementType type) {
    return yycharat(yylength() - 1) == '=' ? NimElementTypes.OP1 : type;
}
%}

Opr            = [=+\-*/<>@$~&%|!?\^\.:\\]
NotOpr         = [^=+\-*/<>@$~&%|!?\^\.:\\]

IdentStartChar = [a-zA-Z\x80-\xFF]
IdentChar      = [a-zA-Z0-9\x80-\xFF]
Ident          = {IdentStartChar} ("_"? {IdentChar})*

Char           = [^\'\r\n]
CharEsc        = \\[rR]|\\[cC]|\\[nN]|\\[lL]|\\[fF]|\\[tT]|\\[vV]|\\\\|\\\"|\\'|\\[0-9]+|\\[aA]|\\[bB]|\\[eE]|\\[xX][0-9a-fA-F]{2}
CharLit        = \'({Char}|{CharEsc})\'

Digit          = [0-9]
BinDigit       = [01]
OctDigit       = [0-7]
HexDigit       = [0-9a-fA-F]

DecNum         = {Digit} ("_"? {Digit})*
BinNum         = "0" [bB] {BinDigit} ("_"? {BinDigit})*
OctNum         = "0" [o] {OctDigit} ("_"? {OctDigit})*
HexNum         = "0" [xX] {HexDigit} ("_"? {HexDigit})*

IntNum         = {DecNum} | {BinNum} | {OctNum} | {HexNum}
IntSuffix      = \'? [iIuU] (8 | 16 | 32 | 64)
IntLit         = {IntNum} {IntSuffix}?

Exp            = [eE] [+\-]? {DecNum}
FloatNum       = {DecNum} ("\." {DecNum} {Exp}? | {Exp})
FloatSuffix    = ([fF] (32 | 64) | [dD])
FloatLit       = {FloatNum}
               | ({FloatNum} | {DecNum} | {OctNum} | {BinNum}) \'? {FloatSuffix}
               | {HexNum} \' {FloatSuffix}

CustomNumLit   = ({IntLit} | {FloatLit}) \' {Ident}

%%

<YYINITIAL> {
  "-"? {FloatLit}        { return handleUnaryMinus(NimElementTypes.FLOAT_LIT); }
  "-"? {IntLit}          { return handleUnaryMinus(NimElementTypes.INT_LIT); }
  "-"? {CustomNumLit}    { return handleUnaryMinus(NimElementTypes.CUSTOM_NUMERIC_LIT); }

  \"(\\.|[^\"\\\n])*\n   { return NimElementTypes.STR_ERROR; }
  \"(\\.|[^\"\\\n])*\"   { return NimElementTypes.STR_LIT; }
  \"\"\"                 { yybegin(TRIPLEQUOTE); tripleQuoteCount = 0; }

  ("r"|"R")\"            { yybegin(RAWSTRING); rawQuoteCount = 0; }

  "#"?"#["               { yybegin(MULTILINE_COMMENT); multilineCommentLevel = 1; }

  "#"[^\[]?[^\n]*(\n(\s*"#"[^\n]*))*
                         { return NimElementTypes.LINE_COMMENT; }

                         // '*:' is a special case, because it is two tokens in 'var v*: int'
                         // unless it is followed by an operator chracter
  "*:"{Opr}+             { return NimElementTypes.OP9; }
  "*:"                   { yypushback(1); return NimElementTypes.OP9; }
  ","                    { return NimElementTypes.COMMA; }
//  "(."[^\.]              { yypushback(1); return NimTypes.LPAREN_DOT; }
  "("                    { return NimElementTypes.LPAREN; }
  ")"                    { return NimElementTypes.RPAREN; }
//  "[."[^\.]              { yypushback(1); return NimTypes.LBRACKET_DOT; }
//  "[:"                   { return NimTypes.LBRACKET_COLON; }
  "["                    { return NimElementTypes.LBRACKET; }
  "]"                    { return NimElementTypes.RBRACKET; }
  "{."[^\.]              { yypushback(1); return NimElementTypes.LBRACE_DOT; }
  "{"                    { return NimElementTypes.LBRACE; }
  "}"                    { return NimElementTypes.RBRACE; }
//  ".)"                   { return NimTypes.DOT_RPAREN; }
//  ".]"                   { return NimTypes.DOT_RBRACKET; }
  ".}"                   { return NimElementTypes.DOT_RBRACE; }
  ";"                    { return NimElementTypes.SEMICOLON; }
  "`"                    { return NimElementTypes.ACCENT; }

  // special operator tokens: ':', '::', '=', '.', '..'
  ":"{NotOpr}            { yypushback(1); return NimElementTypes.COLON; }
//  "::"{NotOpr}           { yypushback(1); return NimTypes.COLONCOLON; }
  "="{NotOpr}            { yypushback(1); return NimElementTypes.EQUALS; }
  ".."{NotOpr}           { yypushback(1); return NimElementTypes.DOTDOT; }
  "."{NotOpr}            { yypushback(1); return NimElementTypes.DOT; }

  // operators have 11 precendence levels (0 to 10)
  // the order of the rules is important, because the first match wins
  "->"                   { return NimElementTypes.OP_ARROW; }
  {Opr}*?[\-~=]">"       { return NimElementTypes.OP_ARROW_LIKE; }
  [$\^]{Opr}*            { return considerAssign(NimElementTypes.OP10); }
  [*%/\\]{Opr}*          { return considerAssign(NimElementTypes.OP9); }
  \~{Opr}*               { return NimElementTypes.OP8; }
  [+\-|]{Opr}*           { return considerAssign(NimElementTypes.OP8); }
  \&{Opr}*               { return considerAssign(NimElementTypes.OP7); }
  \.{Opr}*               { return considerAssign(NimElementTypes.OP_DOTLIKE); }
  [=<>!]{Opr}*           { return NimElementTypes.OP5; }
  \?{Opr}*               { return NimElementTypes.OP2; }
  {Opr}+                 { return NimElementTypes.OP2; }

  {CharLit}              { return NimElementTypes.CHAR_LIT; }

  // built-ins
  "bool"                 { return NimElementTypes.BOOL; }
  "true"                 { return NimElementTypes.TRUE; }
  "false"                { return NimElementTypes.FALSE; }
  "char"                 { return NimElementTypes.CHAR; }
  "string"               { return NimElementTypes.STRING; }
  "cstring"              { return NimElementTypes.CSTRING; }
  "int"                  { return NimElementTypes.INT; }
  "int8"                 { return NimElementTypes.INT8; }
  "int16"                { return NimElementTypes.INT16; }
  "int32"                { return NimElementTypes.INT32; }
  "int64"                { return NimElementTypes.INT64; }
  "uint"                 { return NimElementTypes.UINT; }
  "uint8"                { return NimElementTypes.UINT8; }
  "uint16"               { return NimElementTypes.UINT16; }
  "uint32"               { return NimElementTypes.UINT32; }
  "uint64"               { return NimElementTypes.UINT64; }
  "float"                { return NimElementTypes.FLOAT; }
  "float32"              { return NimElementTypes.FLOAT32; }
  "float64"              { return NimElementTypes.FLOAT64; }
  "array"                { return NimElementTypes.ARRAY; }
  "seq"                  { return NimElementTypes.SEQ; }
  "openArray"            { return NimElementTypes.OPENARRAY; }
  "UncheckedArray"       { return NimElementTypes.UNCHECKEDARRAY; }
  "set"                  { return NimElementTypes.SET; }
  "object"               { return NimElementTypes.OBJECT; }
  "enum"                 { return NimElementTypes.ENUM; }
  "tuple"                { return NimElementTypes.TUPLE; }
  "concept"              { return NimElementTypes.CONCEPT; }
  "nil"                  { return NimElementTypes.NIL; }
  "pointer"              { return NimElementTypes.POINTER; }
  "void"                 { return NimElementTypes.VOID; }
  "untyped"              { return NimElementTypes.UNTYPED; }
  "auto"                 { return NimElementTypes.AUTO; }
  "varargs"              { return NimElementTypes.VARARGS; }

  // c (compatibility) types
  "BiggestFloat"         { return NimElementTypes.BIGGEST_FLOAT; }
  "BiggestInt"           { return NimElementTypes.BIGGEST_INT; }
  "BiggestUInt"          { return NimElementTypes.BIGGEST_UINT; }
  "cchar"                { return NimElementTypes.CCHAR; }
  "cdouble"              { return NimElementTypes.CDOUBLE; }
  "cfloat"               { return NimElementTypes.CFLOAT; }
  "cint"                 { return NimElementTypes.CINT; }
  "clong"                { return NimElementTypes.CLONG; }
  "clongdouble"          { return NimElementTypes.CLONG_DOUBLE; }
  "clonglong"            { return NimElementTypes.CLONG_LONG; }
  "cschar"               { return NimElementTypes.CSCHAR; }
  "cshort"               { return NimElementTypes.CSHORT; }
  "csize_t"              { return NimElementTypes.CSIZE_T; }
  "cstringArray"         { return NimElementTypes.CSTRING_ARRAY; }
  "cuchar"               { return NimElementTypes.CUCHAR; }
  "cuint"                { return NimElementTypes.CUINT; }
  "culong"               { return NimElementTypes.CULONG; }
  "culonglong"           { return NimElementTypes.CULONG_LONG; }
  "cushort"              { return NimElementTypes.CUSHORT; }


//  "new"                  { return NimTypes.NEW; }
//  "assert"               { return NimTypes.ASSERT; }
//  "echo"                 { return NimTypes.ECHO; }

  // keywords
  "addr"                 { return NimElementTypes.ADDR; }
  "and"                  { return NimElementTypes.AND; }
  "asm"                  { return NimElementTypes.ASM; }
  "as"                   { return NimElementTypes.AS; }
  "bind"                 { return NimElementTypes.BIND; }
  "block"                { return NimElementTypes.BLOCK; }
  "break"                { return NimElementTypes.BREAK; }
  "case"                 { return NimElementTypes.CASE; }
  "cast"                 { return NimElementTypes.CAST; }
  "const"                { return NimElementTypes.CONST; }
  "continue"             { return NimElementTypes.CONTINUE; }
  "converter"            { return NimElementTypes.CONVERTER; }
  "defer"                { return NimElementTypes.DEFER; }
  "discard"              { return NimElementTypes.DISCARD; }
  "distinct"             { return NimElementTypes.DISTINCT; }
  "div"                  { return NimElementTypes.DIV; }
  "do"                   { return NimElementTypes.DO; }
  "elif"                 { return NimElementTypes.ELIF; }
  "else"                 { return NimElementTypes.ELSE; }
  "end"                  { return NimElementTypes.END; }
  "except"               { return NimElementTypes.EXCEPT; }
  "export"               { return NimElementTypes.EXPORT; }
  "finally"              { return NimElementTypes.FINALLY; }
  "for"                  { return NimElementTypes.FOR; }
  "from"                 { return NimElementTypes.FROM; }
  "func"                 { return NimElementTypes.FUNC; }
  "if"                   { return NimElementTypes.IF; }
  "import"               { return NimElementTypes.IMPORT; }
  "include"              { return NimElementTypes.INCLUDE; }
  "interface"            { return NimElementTypes.INTERFACE; }
  "in"                   { return NimElementTypes.IN; }
  "isnot"                { return NimElementTypes.ISNOT; }
  "is"                   { return NimElementTypes.IS; }
  "iterator"             { return NimElementTypes.ITERATOR; }
  "let"                  { return NimElementTypes.LET; }
  "macro"                { return NimElementTypes.MACRO; }
  "method"               { return NimElementTypes.METHOD; }
  "mixin"                { return NimElementTypes.MIXIN; }
  "mod"                  { return NimElementTypes.MOD; }
  "notin"                { return NimElementTypes.NOTIN; }
  "not"                  { return NimElementTypes.NOT; }
  "of"                   { return NimElementTypes.OF; }
  "or"                   { return NimElementTypes.OR; }
  "out"                  { return NimElementTypes.OUT; }
  "proc"                 { return NimElementTypes.PROC; }
  "ptr"                  { return NimElementTypes.PTR; }
  "raise"                { return NimElementTypes.RAISE; }
  "ref"                  { return NimElementTypes.REF; }
  "return"               { return NimElementTypes.RETURN; }
  "shl"                  { return NimElementTypes.SHL; }
  "shr"                  { return NimElementTypes.SHR; }
  "static"               { return NimElementTypes.STATIC; }
  "template"             { return NimElementTypes.TEMPLATE; }
  "try"                  { return NimElementTypes.TRY; }
  "type"                 { return NimElementTypes.TYPE; }
  "using"                { return NimElementTypes.USING; }
  "var"                  { return NimElementTypes.VAR; }
  "when"                 { return NimElementTypes.WHEN; }
  "while"                { return NimElementTypes.WHILE; }
  "xor"                  { return NimElementTypes.XOR; }
  "yield"                { return NimElementTypes.YIELD; }


  "_"({IdentChar}|_)+    { return NimElementTypes.INVALID_IDENT; }
  "_"                    { return NimElementTypes.ID; }
  {Ident}                { return NimElementTypes.ID; }


  [ \t\n\r]+             { return TokenType.WHITE_SPACE; }
  .                      { return TokenType.BAD_CHARACTER; }
}

<TRIPLEQUOTE> {
  \"                     { tripleQuoteCount++;
                             if (tripleQuoteCount >= 3) {
                               if (yycharat(yylength()) != '\"') {
                                 yybegin(YYINITIAL);
                                 return NimElementTypes.TRIPLESTR_LIT;
                               }
                             }
                           }
  <<EOF>>                { yybegin(YYINITIAL);
                             return NimElementTypes.TRIPLESTR_ERROR;
                           }
 [^]                     { tripleQuoteCount = 0; }
}

<RAWSTRING> {
  \"                     { rawQuoteCount++;
                             if (rawQuoteCount == 1 && yycharat(yylength()) != '\"') {
                               yybegin(YYINITIAL);
                               return NimElementTypes.RSTR_LIT;
                             } else if (rawQuoteCount == 2) {
                                rawQuoteCount = 0;
                             }
                           }
  \n                     { yypushback(1);
                             yybegin(YYINITIAL);
                             return NimElementTypes.STR_ERROR;
                           }
 [^]                     { rawQuoteCount = 0; }
}

<MULTILINE_COMMENT> {
  "#"?"#["               { multilineCommentLevel++; }
  "]#"#?                 { multilineCommentLevel--;
                             if (multilineCommentLevel == 0) {
                               yybegin(YYINITIAL);
                               return NimElementTypes.MULTILINE_COMMENT;
                             }
                           }
  <<EOF>>                { yybegin(YYINITIAL);
                             return NimElementTypes.MULTILINE_COMMENT_ERROR;
                           }
 [^]                     { }
}