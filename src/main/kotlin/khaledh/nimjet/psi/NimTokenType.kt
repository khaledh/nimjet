package khaledh.nimjet.psi

import khaledh.nimjet.NimLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls


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
    NimTypes.IDENT to "identifier",
    NimTypes.INT_LIT to "int literal",
    NimTypes.FLOAT_LIT to "float literal",
    NimTypes.CUSTOM_NUMERIC_LIT to "custom numeric literal",
    NimTypes.COMMENT to "comment",
)

val punctuations = hashMapOf(
    NimTypes.COLON to ":",
    NimTypes.SEMICOLON to ";",
    NimTypes.COMMA to ",",
    NimTypes.LPAREN to "(",
    NimTypes.RPAREN to ")",
)

val operators = hashMapOf(
    NimTypes.EQUALS to "=",
    NimTypes.DIV to "/",
)

val keywords = hashMapOf(
    NimTypes.VAR to "var",
    NimTypes.TYPE to "type",
    NimTypes.OBJECT to "object",
    NimTypes.DISCARD to "discard",
    NimTypes.NIL to "nil",
    NimTypes.PROC to "proc",
    NimTypes.IF to "if",
    NimTypes.ELIF to "elif",
    NimTypes.ELSE to "else",
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
