package khaledh.nimjet;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import khaledh.nimjet.psi.NimTypes;

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
%{
private int tripleQuoteCount = 0;
private int rawQuoteCount = 0;

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
    return NimTypes.OP8;
}

private IElementType considerAssign(IElementType type) {
    return yycharat(yylength() - 1) == '=' ? NimTypes.OP1 : type;
}
%}

Opr            = [=+\-*/<>@$~&%|!?\^.:\\]
NotOpr         = [^=+\-*/<>@$~&%|!?\^.:\\]

IdentStartChar = [a-zA-Z\x80-\xFF]
IdentChar      = [a-zA-Z0-9\x80-\xFF]
Ident          = {IdentStartChar} ("_"? {IdentChar})*

Char           = [^\'\r\n]
CharEsc        = \\r|\\c|\\n|\\l|\\f|\\t|\\v|\\\\|\\\"|\\'|\\[0-9]+|\\a|\\b|\\e|\\x[0-9a-fA-F]{2}
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
  "-"? {FloatLit}        { return handleUnaryMinus(NimTypes.FLOAT_LIT); }
  "-"? {IntLit}          { return handleUnaryMinus(NimTypes.INT_LIT); }
  "-"? {CustomNumLit}    { return handleUnaryMinus(NimTypes.CUSTOM_NUMERIC_LIT); }

  \"(\\.|[^\"\\\n])*\n   { return NimTypes.STR_ERROR; }
  \"(\\.|[^\"\\\n])*\"   { return NimTypes.STR_LIT; }
  \"\"\"                 { yybegin(TRIPLEQUOTE); tripleQuoteCount = 0; }

  ("r"|"R")\"            { yybegin(RAWSTRING); rawQuoteCount = 0; }

  "#"[^\n]*(\n(\s*"#"[^\n]*))*
                         { return NimTypes.COMMENT; }

                         // '*:' is a special case, because it is two tokens in 'var v*: int'
                         // unless it is followed by an operator chracter
  "*:"{Opr}+             { return NimTypes.OP9; }
  "*:"                   { yypushback(1); return NimTypes.OP9; }
  ","                    { return NimTypes.COMMA; }
//  "(."[^\.]              { yypushback(1); return NimTypes.LPAREN_DOT; }
  "("                    { return NimTypes.LPAREN; }
  ")"                    { return NimTypes.RPAREN; }
//  "[."[^\.]              { yypushback(1); return NimTypes.LBRACKET_DOT; }
//  "[:"                   { return NimTypes.LBRACKET_COLON; }
  "["                    { return NimTypes.LBRACKET; }
  "]"                    { return NimTypes.RBRACKET; }
  "{."[^\.]              { yypushback(1); return NimTypes.LBRACE_DOT; }
  "{"                    { return NimTypes.LBRACE; }
  "}"                    { return NimTypes.RBRACE; }
//  ".)"                   { return NimTypes.DOT_RPAREN; }
//  ".]"                   { return NimTypes.DOT_RBRACKET; }
  ".}"                   { return NimTypes.DOT_RBRACE; }
  ";"                    { return NimTypes.SEMICOLON; }
  "`"                    { return NimTypes.ACCENT; }

  // special operator tokens: ':', '::', '=', '.', '..'
  ":"{NotOpr}            { yypushback(1); return NimTypes.COLON; }
//  "::"{NotOpr}           { yypushback(1); return NimTypes.COLONCOLON; }
  "="{NotOpr}            { yypushback(1); return NimTypes.EQUALS; }
  ".."{NotOpr}           { yypushback(1); return NimTypes.DOTDOT; }
  "."{NotOpr}            { yypushback(1); return NimTypes.DOT; }

  // operators have 11 precendence levels (0 to 10)
  // the order of the rules is important, because the first match wins
  "->"                   { return NimTypes.OP_ARROW; }
  {Opr}*?[\-~=]">"       { return NimTypes.OP_ARROW_LIKE; }
  [$\^]{Opr}*            { return considerAssign(NimTypes.OP10); }
  [*%/\\]{Opr}*          { return considerAssign(NimTypes.OP9); }
  \~{Opr}*               { return NimTypes.OP8; }
  [+\-|]{Opr}*           { return considerAssign(NimTypes.OP8); }
  \&{Opr}*               { return considerAssign(NimTypes.OP7); }
  \.{Opr}*               { return considerAssign(NimTypes.OP_DOTLIKE); }
  [=<>!]{Opr}*           { return NimTypes.OP5; }
  \?{Opr}*               { return NimTypes.OP2; }
  {Opr}+                 { return NimTypes.OP2; }

  {CharLit}              { return NimTypes.CHAR_LIT; }

  // built-ins
  "true"                 { return NimTypes.TRUE; }
  "false"                { return NimTypes.FALSE; }
  "char"                 { return NimTypes.CHAR; }
  "string"               { return NimTypes.STRING; }
  "cstring"              { return NimTypes.CSTRING; }
  "int"                  { return NimTypes.INT; }
  "int8"                 { return NimTypes.INT8; }
  "int16"                { return NimTypes.INT16; }
  "int32"                { return NimTypes.INT32; }
  "int64"                { return NimTypes.INT64; }
  "uint"                 { return NimTypes.UINT; }
  "uint8"                { return NimTypes.UINT8; }
  "uint16"               { return NimTypes.UINT16; }
  "uint32"               { return NimTypes.UINT32; }
  "uint64"               { return NimTypes.UINT64; }
  "float"                { return NimTypes.FLOAT; }
  "float32"              { return NimTypes.FLOAT32; }
  "float64"              { return NimTypes.FLOAT64; }
  "array"                { return NimTypes.ARRAY; }
  "seq"                  { return NimTypes.SEQ; }
  "openArray"            { return NimTypes.OPENARRAY; }
  "set"                  { return NimTypes.SET; }
  "UncheckedArray"       { return NimTypes.UNCHECKEDARRAY; }
  "void"                 { return NimTypes.VOID; }
  "auto"                 { return NimTypes.AUTO; }
  "varargs"              { return NimTypes.VARARGS; }
  "new"                  { return NimTypes.NEW; }
  "assert"               { return NimTypes.ASSERT; }
  "echo"                 { return NimTypes.ECHO; }

  // keywords
  "addr"                 { return NimTypes.ADDR; }
  "and"                  { return NimTypes.AND; }
  "asm"                  { return NimTypes.ASM; }
  "as"                   { return NimTypes.AS; }
  "bind"                 { return NimTypes.BIND; }
  "block"                { return NimTypes.BLOCK; }
  "break"                { return NimTypes.BREAK; }
  "case"                 { return NimTypes.CASE; }
  "cast"                 { return NimTypes.CAST; }
  "concept"              { return NimTypes.CONCEPT; }
  "const"                { return NimTypes.CONST; }
  "continue"             { return NimTypes.CONTINUE; }
  "converter"            { return NimTypes.CONVERTER; }
  "defer"                { return NimTypes.DEFER; }
  "discard"              { return NimTypes.DISCARD; }
  "distinct"             { return NimTypes.DISTINCT; }
  "div"                  { return NimTypes.DIV; }
  "do"                   { return NimTypes.DO; }
  "elif"                 { return NimTypes.ELIF; }
  "else"                 { return NimTypes.ELSE; }
  "end"                  { return NimTypes.END; }
  "enum"                 { return NimTypes.ENUM; }
  "except"               { return NimTypes.EXCEPT; }
  "export"               { return NimTypes.EXPORT; }
  "finally"              { return NimTypes.FINALLY; }
  "for"                  { return NimTypes.FOR; }
  "from"                 { return NimTypes.FROM; }
  "func"                 { return NimTypes.FUNC; }
  "if"                   { return NimTypes.IF; }
  "import"               { return NimTypes.IMPORT; }
  "include"              { return NimTypes.INCLUDE; }
  "interface"            { return NimTypes.INTERFACE; }
  "in"                   { return NimTypes.IN; }
  "isnot"                { return NimTypes.ISNOT; }
  "is"                   { return NimTypes.IS; }
  "iterator"             { return NimTypes.ITERATOR; }
  "let"                  { return NimTypes.LET; }
  "macro"                { return NimTypes.MACRO; }
  "method"               { return NimTypes.METHOD; }
  "mixin"                { return NimTypes.MIXIN; }
  "mod"                  { return NimTypes.MOD; }
  "nil"                  { return NimTypes.NIL; }
  "notin"                { return NimTypes.NOTIN; }
  "not"                  { return NimTypes.NOT; }
  "object"               { return NimTypes.OBJECT; }
  "of"                   { return NimTypes.OF; }
  "or"                   { return NimTypes.OR; }
  "out"                  { return NimTypes.OUT; }
  "proc"                 { return NimTypes.PROC; }
  "ptr"                  { return NimTypes.PTR; }
  "raise"                { return NimTypes.RAISE; }
  "ref"                  { return NimTypes.REF; }
  "return"               { return NimTypes.RETURN; }
  "shl"                  { return NimTypes.SHL; }
  "shr"                  { return NimTypes.SHR; }
  "static"               { return NimTypes.STATIC; }
  "template"             { return NimTypes.TEMPLATE; }
  "try"                  { return NimTypes.TRY; }
  "tuple"                { return NimTypes.TUPLE; }
  "type"                 { return NimTypes.TYPE; }
  "using"                { return NimTypes.USING; }
  "var"                  { return NimTypes.VAR; }
  "when"                 { return NimTypes.WHEN; }
  "while"                { return NimTypes.WHILE; }
  "xor"                  { return NimTypes.XOR; }
  "yield"                { return NimTypes.YIELD; }


  "_"({IdentChar}|_)+    { return NimTypes.INVALID_IDENT; }
  "_"                    { return NimTypes.ID; }
  {Ident}                { return NimTypes.ID; }


  [ \t\n\r]+             { return TokenType.WHITE_SPACE; }
  .                      { return TokenType.BAD_CHARACTER; }
}

<TRIPLEQUOTE> {
  \"                     { tripleQuoteCount++;
                           if (tripleQuoteCount >= 3) {
                             if (yycharat(yylength()) != '\"') {
                               yybegin(YYINITIAL);
                               return NimTypes.TRIPLESTR_LIT;
                             }
                           }
                         }
  <<EOF>>                { yybegin(YYINITIAL);
                           return NimTypes.TRIPLESTR_ERROR;
                         }
 [^]                     { tripleQuoteCount = 0; }
}

<RAWSTRING> {
  \"                     { rawQuoteCount++;
                           if (rawQuoteCount == 1 && yycharat(yylength()) != '\"') {
                             yybegin(YYINITIAL);
                             return NimTypes.RSTR_LIT;
                           } else if (rawQuoteCount == 2) {
                              rawQuoteCount = 0;
                           }
                         }
  \n                     { yypushback(1);
                           yybegin(YYINITIAL);
                           return NimTypes.STR_ERROR;
                         }
 [^]                     { rawQuoteCount = 0; }
}
