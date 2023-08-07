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
package khaledh.nimjet.highlighter

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import khaledh.nimjet.NimLexerAdapter
import khaledh.nimjet.psi.NimTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.psi.TokenType

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

        private val TYPE_KEYS = arrayOf(TYPE)
        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val ID_KEYS = arrayOf(ID)
        private val OPERATOR_KEYS = arrayOf(OPERATOR)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val STRING_KEYS = arrayOf(STRING)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
    }

    override fun getHighlightingLexer(): Lexer = NimLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        if (tokenType == null) {
            return EMPTY_KEYS
        }

        return when (tokenType) {
            NimTypes.BLOCK,
            NimTypes.DISCARD,
            NimTypes.ELIF,
            NimTypes.ELSE,
            NimTypes.EXCEPT,
            NimTypes.EXPORT,
            NimTypes.FINALLY,
            NimTypes.FOR,
            NimTypes.FROM,
            NimTypes.IF,
            NimTypes.IMPORT,
            NimTypes.INCLUDE,
            NimTypes.OBJECT,
            NimTypes.PROC,
            NimTypes.RAISE,
            NimTypes.RETURN,
            NimTypes.STATIC,
            NimTypes.TRY,
            NimTypes.TYPE,
            NimTypes.VAR,
            NimTypes.WHEN,
            NimTypes.WHILE,
            NimTypes.YIELD,
                -> KEYWORD_KEYS

            NimTypes.IDENT
                -> ID_KEYS

            NimTypes.DEC_LIT,
            NimTypes.BIN_LIT,
            NimTypes.OCT_LIT,
            NimTypes.HEX_LIT,
                -> NUMBER_KEYS

            NimTypes.CHAR_LIT,
            NimTypes.STR_LIT,
            NimTypes.TRIPLESTR_LIT,
            NimTypes.RSTR_LIT,
            NimTypes.STR_ERROR,
            NimTypes.TRIPLESTR_ERROR,
                -> STRING_KEYS

            NimTypes.OP0,
            NimTypes.OP1,
            NimTypes.OP2,
            NimTypes.OP3,
            NimTypes.OP4,
            NimTypes.OP5,
            NimTypes.OP6,
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
            NimTypes.EQUALS,
            NimTypes.LPAREN,
            NimTypes.RPAREN,
            NimTypes.COMMA,
            NimTypes.SEMICOLON,
            NimTypes.COLON,
                -> OPERATOR_KEYS

            NimTypes.COMMENT
                -> COMMENT_KEYS

            TokenType.BAD_CHARACTER
                -> BAD_CHAR_KEYS

            else
                -> EMPTY_KEYS
        }
    }

}
