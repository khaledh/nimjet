package khaledh.nimjet.psi

import khaledh.nimjet.NimLanguage
import com.intellij.psi.tree.IElementType


//class NimTokenType(debugName: String) : IElementType(debugName, NimLanguage.INSTANCE) {
//    override fun toString(): String {
//        return "NimTokenType." + super.toString()
//    }
//
//    companion object {
//        @JvmField val IDENTIFIER = NimTokenType("IDENTIFIER")
//        @JvmField val INT_LIT = NimTokenType("INT_LIT")
//        @JvmField val STRING = NimTokenType("STRING")
//        @JvmField val COMMENT = NimTokenType("COMMENT")
//
//        @JvmField val IF = NimTokenType("IF")
//        @JvmField val ELSE = NimTokenType("ELSE")
//        @JvmField val WHILE = NimTokenType("WHILE")
//        @JvmField val FOR = NimTokenType("FOR")
//
//        @JvmField val INDENT = NimTokenType("INDENT")
//        @JvmField val DEDENT = NimTokenType("DEDENT")
//    }
//}

// create a map from token type to token name
val placeholders = hashMapOf(
    NimElementTypes.IDENT to "identifier",
    NimElementTypes.INT_LIT to "int literal",
    NimElementTypes.FLOAT_LIT to "float literal",
    NimElementTypes.CUSTOM_NUMERIC_LIT to "custom numeric literal",
//    NimTypes.LINE_COMMENT to "comment",
//    NimTypes.MULTILINE_COMMENT to "comment",
)

val punctuations = hashMapOf(
    NimElementTypes.COLON to ":",
    NimElementTypes.SEMICOLON to ";",
    NimElementTypes.COMMA to ",",
    NimElementTypes.LPAREN to "(",
    NimElementTypes.RPAREN to ")",
)

val operators = hashMapOf(
    NimElementTypes.EQUALS to "=",
    NimElementTypes.DIV to "/",
)

val keywords = hashMapOf(
    NimElementTypes.VAR to "var",
    NimElementTypes.TYPE to "type",
    NimElementTypes.OBJECT to "object",
    NimElementTypes.DISCARD to "discard",
    NimElementTypes.NIL to "nil",
    NimElementTypes.PROC to "proc",
    NimElementTypes.IF to "if",
    NimElementTypes.ELIF to "elif",
    NimElementTypes.ELSE to "else",
)

class NimTokenType(debugName: String) : IElementType(debugName, NimLanguage) {
    override fun toString(): String {
        return placeholders[this]?.let { "<$it>" }
            ?: keywords[this]
            ?: punctuations[this]
            ?: operators[this]
            ?: super.toString()
    }
}
