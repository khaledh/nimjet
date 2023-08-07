package khaledh.nimjet;

import khaledh.nimjet.psi.NimTypes;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

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

Set<Character> OpChars = new HashSet<>(Arrays.asList(
        '+', '-', '*', '/', '\\', '<', '>', '!', '?', '^',
        '.', '|', '=', '%', '&', '$', '@', '~', ':'));

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

Digit          = [0-9]
BinDigit       = [01]
OctDigit       = [0-7]
HexDigit       = [0-9a-fA-F]

Opr            = [=+\-*/<>@$~&%|!?\^.:\\]
NotOpr         = [^=+\-*/<>@$~&%|!?\^.:\\]

IdentStartChar = [a-zA-Z\x80-\xFF]
IdentChar      = [a-zA-Z0-9\x80-\xFF]
Ident          = {IdentStartChar} ("_"? {IdentChar})*

Char           = [^\'\r\n]
CharEsc        = \\r|\\c|\\n|\\l|\\f|\\t|\\v|\\\\|\\\"|\\'|\\[0-9]+|\\a|\\b|\\e|\\x[0-9a-fA-F]{2}
CharLit        = \'({Char}|{CharEsc})\'

%%

<YYINITIAL> {
  \"(\\.|[^\"\\\n])*\n   { return NimTypes.STR_ERROR; }
  \"(\\.|[^\"\\\n])*\"   { return NimTypes.STR_LIT; }
  \"\"\"                 { yybegin(TRIPLEQUOTE); tripleQuoteCount = 0; }

  ("r"|"R")\"            { yybegin(RAWSTRING); rawQuoteCount = 0; }

  "#"[^"\n"]*"\n"(\s*"#"[^"\n"]*"\n")*
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
//  "`"                    { return NimTypes.ACCENT; }

  // special operator tokens: ':', '::', '=', '.', '..'
  ":"{NotOpr}            { yypushback(1); return NimTypes.COLON; }
//  "::"{NotOpr}           { yypushback(1); return NimTypes.COLONCOLON; }
  "="{NotOpr}            { yypushback(1); return NimTypes.EQUALS; }
  "."{NotOpr}            { yypushback(1); return NimTypes.DOT; }
//  ".."{NotOpr}           { yypushback(1); return NimTypes.DOTDOT; }

  // operators have 11 precendence levels (0 to 10)
  // the order of the rules is important, because the first match wins
  {Opr}*[-~=]">"         { return NimTypes.OP0; }
  [$\^]{Opr}*            { return considerAssign(NimTypes.OP10); }
  [*%/\\]{Opr}*          { return considerAssign(NimTypes.OP9); }
  \~{Opr}*               { return NimTypes.OP8; }
  [+\-|]{Opr}*           { return considerAssign(NimTypes.OP8); }
  \&{Opr}*               { return considerAssign(NimTypes.OP7); }
  \.{Opr}*               { return considerAssign(NimTypes.OP6); }
  [=<>!]{Opr}*           { return NimTypes.OP5; }
  \?{Opr}*               { return NimTypes.OP2; }
  {Opr}+                 { return NimTypes.OP2; }

  {CharLit}              { return NimTypes.CHAR_LIT; }

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
  "_"                    { return NimTypes.IDENT; }
  {Ident}                { return NimTypes.IDENT; }


  "-"? {Digit} ("_"? {Digit})*
                         { return handleUnaryMinus(NimTypes.DEC_LIT); }
  "-"? "0"("b"|"B") {BinDigit} ("_"? {BinDigit})*
                         { return handleUnaryMinus(NimTypes.BIN_LIT); }
  "-"? "0o" {OctDigit} ("_"? {OctDigit})*
                         { return handleUnaryMinus(NimTypes.OCT_LIT); }
  "-"? "0"("x"|"X") {HexDigit} ("_"? {HexDigit})*
                         { return handleUnaryMinus(NimTypes.HEX_LIT); }

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
