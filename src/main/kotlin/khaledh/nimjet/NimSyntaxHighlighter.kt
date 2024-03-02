//package khaledh.nimjet
//
//import khaledh.nimjet.NimLexerAdapter
//import khaledh.nimjet.psi.NimTypes
//import com.intellij.lexer.Lexer
//import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
//import com.intellij.openapi.editor.HighlighterColors
//import com.intellij.openapi.editor.colors.TextAttributesKey
//import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
//import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
//import com.intellij.psi.TokenType
//import com.intellij.psi.tree.IElementType
//
//class NimSyntaxHighlighter : SyntaxHighlighterBase() {
//
//    companion object {
//        val KEY = createTextAttributesKey("NIM_KEY", DefaultLanguageHighlighterColors.KEYWORD)
//        val SEPARATOR = createTextAttributesKey("NIM_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
//        val VALUE = createTextAttributesKey("NIM_VALUE", DefaultLanguageHighlighterColors.STRING)
//        val COMMENT = createTextAttributesKey("NIM_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
//        val BAD_CHARACTER = createTextAttributesKey("NIM_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
//
//        val KEY_KEYS = arrayOf(KEY)
//        val SEPARATOR_KEYS = arrayOf(SEPARATOR)
//        val VALUE_KEYS = arrayOf(VALUE)
//        val COMMENT_KEYS = arrayOf(COMMENT)
//        val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
//        val EMPTY_KEYS = emptyArray<TextAttributesKey>()
//    }
//
//    override fun getHighlightingLexer(): Lexer = NimLexerAdapter()
//
//    override fun getTokenHighlights(tokenType: IElementType?) = when (tokenType) {
//        NimTypes.KEY -> KEY_KEYS
//        NimTypes.SEPARATOR -> SEPARATOR_KEYS
//        NimTypes.VALUE -> VALUE_KEYS
//        NimTypes.COMMENT -> COMMENT_KEYS
//        TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
//        else -> EMPTY_KEYS
//    }
//}
package khaledh.nimjet

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.psi.TokenType
import khaledh.nimjet.psi.NimElementTypes

class NimSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        private val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE)
        private val TYPE = createTextAttributesKey("NIM_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME)
        private val KEYWORD = createTextAttributesKey("NIM_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        private val ID = createTextAttributesKey("NIM_ID", DefaultLanguageHighlighterColors.IDENTIFIER)
        private val OPERATOR = createTextAttributesKey("NIM_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        private val NUMBER = createTextAttributesKey("NIM_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        private val STRING = createTextAttributesKey("NIM_STRING", DefaultLanguageHighlighterColors.STRING)
        private val COMMENT = createTextAttributesKey("NIM_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        private val BUILTIN = createTextAttributesKey("NIM_BUILTIN", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)
        private val PARENS = createTextAttributesKey("NIM_PAREN", DefaultLanguageHighlighterColors.PARENTHESES)
        private val BRACES = createTextAttributesKey("NIM_BRACE", DefaultLanguageHighlighterColors.BRACES)
        private val BRACKETS = createTextAttributesKey("NIM_BRACKET", DefaultLanguageHighlighterColors.BRACKETS)
        private val COMMA = createTextAttributesKey("NIM_COMMA", DefaultLanguageHighlighterColors.COMMA)
        private val SEMICOLON = createTextAttributesKey("NIM_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        private val DOT = createTextAttributesKey("NIM_DOT", DefaultLanguageHighlighterColors.DOT)

        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val ID_KEYS = arrayOf(ID)
        private val OPERATOR_KEYS = arrayOf(OPERATOR)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val STRING_KEYS = arrayOf(STRING)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val BUILTIN_KEYS = arrayOf(BUILTIN)
        private val PARENS_KEYS = arrayOf(PARENS)
        private val BRACES_KEYS = arrayOf(BRACES)
        private val BRACKETS_KEYS = arrayOf(BRACKETS)
        private val COMMA_KEYS = arrayOf(COMMA)
        private val SEMICOLON_KEYS = arrayOf(SEMICOLON)
        private val DOT_KEYS = arrayOf(DOT)
    }

    override fun getHighlightingLexer(): Lexer = NimLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        if (tokenType == null) {
            return EMPTY_KEYS
        }

        return when (tokenType) {
            NimElementTypes.ADDR,
            NimElementTypes.ASM,
            NimElementTypes.BIND,
            NimElementTypes.BLOCK,
            NimElementTypes.BREAK,
            NimElementTypes.CASE,
            NimElementTypes.CAST,
            NimElementTypes.CONST,
            NimElementTypes.CONTINUE,
            NimElementTypes.CONVERTER,
            NimElementTypes.DEFER,
            NimElementTypes.DISCARD,
            NimElementTypes.DISTINCT,
            NimElementTypes.DO,
            NimElementTypes.ELIF,
            NimElementTypes.ELSE,
            NimElementTypes.END,
            NimElementTypes.EXCEPT,
            NimElementTypes.EXPORT,
            NimElementTypes.FINALLY,
            NimElementTypes.FOR,
            NimElementTypes.FROM,
            NimElementTypes.FUNC,
            NimElementTypes.IF,
            NimElementTypes.IMPORT,
            NimElementTypes.INCLUDE,
            NimElementTypes.INTERFACE,
            NimElementTypes.ITERATOR,
            NimElementTypes.LET,
            NimElementTypes.MACRO,
            NimElementTypes.METHOD,
            NimElementTypes.MIXIN,
            NimElementTypes.OUT,
            NimElementTypes.PROC,
            NimElementTypes.PTR,
            NimElementTypes.RAISE,
            NimElementTypes.REF,
            NimElementTypes.RETURN,
            NimElementTypes.STATIC,
            NimElementTypes.TEMPLATE,
            NimElementTypes.TRY,
            NimElementTypes.TYPE,
            NimElementTypes.USING,
            NimElementTypes.VAR,
            NimElementTypes.WHEN,
            NimElementTypes.WHILE,
            NimElementTypes.YIELD,
                -> KEYWORD_KEYS

//            NimElementTypes.BOOL,
//            NimElementTypes.TRUE,
//            NimElementTypes.FALSE,
//            NimElementTypes.CHAR,
//            NimElementTypes.STRING,
//            NimElementTypes.CSTRING,
//            NimElementTypes.INT,
//            NimElementTypes.INT8,
//            NimElementTypes.INT16,
//            NimElementTypes.INT32,
//            NimElementTypes.INT64,
//            NimElementTypes.UINT,
//            NimElementTypes.UINT8,
//            NimElementTypes.UINT16,
//            NimElementTypes.UINT32,
//            NimElementTypes.UINT64,
//            NimElementTypes.FLOAT,
//            NimElementTypes.FLOAT32,
//            NimElementTypes.FLOAT64,
//            NimElementTypes.ARRAY,
//            NimElementTypes.SEQ,
//            NimElementTypes.OPENARRAY,
//            NimElementTypes.SET,
//            NimElementTypes.UNCHECKEDARRAY,
            NimElementTypes.CONCEPT,
            NimElementTypes.ENUM,
            NimElementTypes.NIL,
            NimElementTypes.OBJECT,
            NimElementTypes.TUPLE,
//            NimElementTypes.POINTER,
//            NimElementTypes.VOID,
//            NimElementTypes.UNTYPED,
//            NimElementTypes.AUTO,
//            NimElementTypes.VARARGS,
            // c (compatibility) types
//            NimElementTypes.BIGGEST_FLOAT,
//            NimElementTypes.BIGGEST_INT,
//            NimElementTypes.BIGGEST_UINT,
//            NimElementTypes.CCHAR,
//            NimElementTypes.CDOUBLE,
//            NimElementTypes.CFLOAT,
//            NimElementTypes.CINT,
//            NimElementTypes.CLONG,
//            NimElementTypes.CLONG_DOUBLE,
//            NimElementTypes.CLONG_LONG,
//            NimElementTypes.CSCHAR,
//            NimElementTypes.CSHORT,
//            NimElementTypes.CSIZE_T,
//            NimElementTypes.CSTRING_ARRAY,
//            NimElementTypes.CUCHAR,
//            NimElementTypes.CUINT,
//            NimElementTypes.CULONG,
//            NimElementTypes.CULONG_LONG,
//            NimElementTypes.CUSHORT,
                -> BUILTIN_KEYS

            NimElementTypes.IDENT
                -> ID_KEYS

            NimElementTypes.INT_LIT,
            NimElementTypes.FLOAT_LIT,
            NimElementTypes.CUSTOM_NUMERIC_LIT,
                -> NUMBER_KEYS

            NimElementTypes.CHAR_LIT,
            NimElementTypes.STR_LIT,
            NimElementTypes.TRIPLESTR_LIT,
            NimElementTypes.RSTR_LIT,
            NimElementTypes.STR_ERROR,
            NimElementTypes.TRIPLESTR_ERROR,
                -> STRING_KEYS

            NimElementTypes.OP_ARROW, NimElementTypes.OP_ARROW_LIKE,
            NimElementTypes.OP1,
            NimElementTypes.OP2,
            NimElementTypes.OP3,
            NimElementTypes.OP4,
            NimElementTypes.OP5,
            NimElementTypes.DOTDOT, NimElementTypes.OP_DOTLIKE,
            NimElementTypes.OP7,
            NimElementTypes.OP8,
            NimElementTypes.OP9,
            NimElementTypes.OP10,
            NimElementTypes.OR, NimElementTypes.XOR,  // OP3_KW
            NimElementTypes.AND,               // OP4_KW
            NimElementTypes.IN, NimElementTypes.NOTIN,
            NimElementTypes.IS, NimElementTypes.ISNOT,
            NimElementTypes.NOT, NimElementTypes.OF,
            NimElementTypes.AS,                // OP5_KW
            NimElementTypes.DIV, NimElementTypes.MOD,
            NimElementTypes.SHL, NimElementTypes.SHR, // OP6_KW
//            NimTypes.EQUALS,
//            NimTypes.COLON,
                -> OPERATOR_KEYS

            NimElementTypes.LPAREN,
            NimElementTypes.RPAREN,
                -> PARENS_KEYS

            NimElementTypes.LBRACE,
            NimElementTypes.RBRACE,
                -> BRACES_KEYS

            NimElementTypes.LBRACKET,
            NimElementTypes.RBRACKET,
                -> BRACKETS_KEYS

            NimElementTypes.COMMA,
                -> COMMA_KEYS
            NimElementTypes.SEMICOLON,
                -> SEMICOLON_KEYS
            NimElementTypes.DOT,
                -> DOT_KEYS

            NimElementTypes.LINE_COMMENT,
            NimElementTypes.MULTILINE_COMMENT,
            NimElementTypes.MULTILINE_COMMENT_ERROR
                -> COMMENT_KEYS

            TokenType.BAD_CHARACTER
                -> BAD_CHAR_KEYS

            else
                -> EMPTY_KEYS
        }
    }

}
