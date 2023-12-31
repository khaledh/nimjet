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
import khaledh.nimjet.psi.NimTypes

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
            NimTypes.ADDR,
            NimTypes.ASM,
            NimTypes.BIND,
            NimTypes.BLOCK,
            NimTypes.BREAK,
            NimTypes.CASE,
            NimTypes.CAST,
            NimTypes.CONCEPT,
            NimTypes.CONST,
            NimTypes.CONTINUE,
            NimTypes.CONVERTER,
            NimTypes.DEFER,
            NimTypes.DISCARD,
            NimTypes.DISTINCT,
            NimTypes.DO,
            NimTypes.ELIF,
            NimTypes.ELSE,
            NimTypes.END,
            NimTypes.ENUM,
            NimTypes.EXCEPT,
            NimTypes.EXPORT,
            NimTypes.FINALLY,
            NimTypes.FOR,
            NimTypes.FROM,
            NimTypes.FUNC,
            NimTypes.IF,
            NimTypes.IMPORT,
            NimTypes.INCLUDE,
            NimTypes.INTERFACE,
            NimTypes.ITERATOR,
            NimTypes.LET,
            NimTypes.MACRO,
            NimTypes.METHOD,
            NimTypes.MIXIN,
            NimTypes.NIL,
            NimTypes.OBJECT,
            NimTypes.OUT,
            NimTypes.PROC,
            NimTypes.PTR,
            NimTypes.RAISE,
            NimTypes.REF,
            NimTypes.RETURN,
            NimTypes.STATIC,
            NimTypes.TEMPLATE,
            NimTypes.TRY,
            NimTypes.TUPLE,
            NimTypes.TYPE,
            NimTypes.USING,
            NimTypes.VAR,
            NimTypes.WHEN,
            NimTypes.WHILE,
            NimTypes.YIELD,
                -> KEYWORD_KEYS

            NimTypes.BOOL,
            NimTypes.TRUE,
            NimTypes.FALSE,
            NimTypes.CHAR,
            NimTypes.STRING,
            NimTypes.CSTRING,
            NimTypes.INT,
            NimTypes.INT8,
            NimTypes.INT16,
            NimTypes.INT32,
            NimTypes.INT64,
            NimTypes.UINT,
            NimTypes.UINT8,
            NimTypes.UINT16,
            NimTypes.UINT32,
            NimTypes.UINT64,
            NimTypes.FLOAT,
            NimTypes.FLOAT32,
            NimTypes.FLOAT64,
            NimTypes.ARRAY,
            NimTypes.SEQ,
            NimTypes.OPENARRAY,
            NimTypes.SET,
            NimTypes.UNCHECKEDARRAY,
            NimTypes.VOID,
            NimTypes.UNTYPED,
            NimTypes.AUTO,
            NimTypes.VARARGS,
//            NimTypes.NEW,
//            NimTypes.ASSERT,
//            NimTypes.ECHO,
                -> BUILTIN_KEYS

            NimTypes.IDENT
                -> ID_KEYS

            NimTypes.INT_LIT,
            NimTypes.FLOAT_LIT,
            NimTypes.CUSTOM_NUMERIC_LIT,
                -> NUMBER_KEYS

            NimTypes.CHAR_LIT,
            NimTypes.STR_LIT,
            NimTypes.TRIPLESTR_LIT,
            NimTypes.RSTR_LIT,
            NimTypes.STR_ERROR,
            NimTypes.TRIPLESTR_ERROR,
                -> STRING_KEYS

            NimTypes.OP_ARROW, NimTypes.OP_ARROW_LIKE,
            NimTypes.OP1,
            NimTypes.OP2,
            NimTypes.OP3,
            NimTypes.OP4,
            NimTypes.OP5,
            NimTypes.DOTDOT, NimTypes.OP_DOTLIKE,
            NimTypes.OP7,
            NimTypes.OP8,
            NimTypes.OP9,
            NimTypes.OP10,
            NimTypes.OR, NimTypes.XOR,  // OP3_KW
            NimTypes.AND,               // OP4_KW
            NimTypes.IN, NimTypes.NOTIN,
            NimTypes.IS, NimTypes.ISNOT,
            NimTypes.NOT, NimTypes.OF,
            NimTypes.AS,                // OP5_KW
            NimTypes.DIV, NimTypes.MOD,
            NimTypes.SHL, NimTypes.SHR, // OP6_KW
//            NimTypes.EQUALS,
//            NimTypes.COLON,
                -> OPERATOR_KEYS

            NimTypes.LPAREN,
            NimTypes.RPAREN,
                -> PARENS_KEYS

            NimTypes.LBRACE,
            NimTypes.RBRACE,
                -> BRACES_KEYS

            NimTypes.LBRACKET,
            NimTypes.RBRACKET,
                -> BRACKETS_KEYS

            NimTypes.COMMA,
                -> COMMA_KEYS
            NimTypes.SEMICOLON,
                -> SEMICOLON_KEYS
            NimTypes.DOT,
                -> DOT_KEYS

            NimTypes.LINE_COMMENT,
            NimTypes.MULTILINE_COMMENT,
            NimTypes.MULTILINE_COMMENT_ERROR
                -> COMMENT_KEYS

            TokenType.BAD_CHARACTER
                -> BAD_CHAR_KEYS

            else
                -> EMPTY_KEYS
        }
    }

}
