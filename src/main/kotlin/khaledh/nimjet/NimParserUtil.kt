package khaledh.nimjet

import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.openapi.util.Key
import khaledh.nimjet.psi.NimElementTypes


fun <T> stackOf(vararg elements: T) = ArrayDeque(elements.toList())
fun <T> ArrayDeque<T>.push(element: T) = addLast(element) // returns Unit
fun <T> ArrayDeque<T>.pop() = removeLastOrNull()          // returns T?
fun <T> ArrayDeque<T>.peek() = lastOrNull()               // returns T?

enum class PrimaryMode {
    NORMAL, TYPE_DESC, TYPE_DEF, TRY_SIMPLE
}

class ParserContext {
    var indentStack = stackOf<Int>(0)
    var primaryMode = PrimaryMode.NORMAL

    companion object {
        val KEY: Key<ParserContext> = Key.create("NIM_PARSER_CONTEXT")
    }
}

class NimParserUtil : GeneratedParserUtilBase() {

    companion object {

        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun initContext(builder: PsiBuilder, level: Int): Boolean {
            val ctx = ParserContext()
            builder.putUserData(ParserContext.KEY, ctx)
            return true
        }

        private fun currentIndent(builder: PsiBuilder): Int {
            var result = -1
            val currentOffset = builder.currentOffset
            var offset = currentOffset - 1
            while (offset >= 0 && builder.originalText[offset] == ' ') {
                offset--
            }
            if (offset < 0 || builder.originalText[offset] == '\n') {
                result = currentOffset - offset - 1
            }
            return result
        }

        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun indNone(builder: PsiBuilder, level: Int): Boolean {
            val isNone = currentIndent(builder) == -1
            if (!isNone) {
                builder.error("Invalid indentation")
                return false
            }
            return true
        }

        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun indZero(builder: PsiBuilder, level: Int): Boolean {
            val isZero = currentIndent(builder) == 0
            if (!isZero) {
                builder.error("Invalid indentation")
                return false
            }
            return true
        }

        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun indEquals(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            val currentIndent = currentIndent(builder)
            ctx.indentStack.peek()?.takeIf { currentIndent == it }?.let {
                return true
            }
            builder.error("Invalid indentation")
            return false
        }

        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun indLessThan(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            val currentIndent = currentIndent(builder)
            ctx.indentStack.peek()?.takeIf { currentIndent < it }?.let {
                return true
            }
            builder.error("Invalid indentation")
            return false
        }

        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun indGreaterThan(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            val currentIndent = currentIndent(builder)
            ctx.indentStack.peek()?.takeIf { currentIndent > it }?.let {
                return true
            }
            builder.error("Invalid indentation, expected GT")
            return false
        }

        /**
         * Optional Greater-Than indentation.
         */
        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun optGTIndent(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            val currentIndent = currentIndent(builder)
            if (currentIndent == -1) {
                return true
            }
            ctx.indentStack.peek()?.takeIf { currentIndent > it }?.let {
                return true
            }
            builder.error("Invalid indentation")
            return false
        }

        /**
         * Optional Greater-Than-Or-Equal indentation.
         */
        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun optGTEIndent(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            val currentIndent = currentIndent(builder)
            if (currentIndent == -1) {
                return true
            }
            ctx.indentStack.peek()?.takeIf { currentIndent >= it }?.let {
                return true
            }
            builder.error("Invalid indentation")
            return false
        }

//        @JvmStatic
//        fun indent(builder: PsiBuilder, level: Int): Boolean {
//            val ctx = builder.getUserData(ParserContext.KEY)!!
//            val currentIndent = currentIndent(builder)
//            ctx.indentStack.peek()?.takeIf { currentIndent > it }?.let {
//                ctx.indentStack.push(currentIndent)
//                return true
//            }
//            builder.error("Invalid indentation")
//            return false
//        }
//
//        @JvmStatic
//        fun dedent(builder: PsiBuilder, level: Int): Boolean {
//            val ctx = builder.getUserData(ParserContext.KEY)!!
//            if (ctx.indentStack.isNotEmpty()) {
//                ctx.indentStack.pop()
//            }
//            return true
//        }

        @JvmStatic
        fun indented(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            val currentIndent = currentIndent(builder)
            val innerResult = ctx.indentStack.peek()?.takeIf { currentIndent > it }?.let {
                ctx.indentStack.push(currentIndent)
                val innerResult = parser.parse(builder, level + 1)
                ctx.indentStack.pop()
                return innerResult
            }
            builder.error("Invalid indentation")
            return false
        }

        @JvmStatic
        fun noSpace(builder: PsiBuilder, level: Int): Boolean {
            val currentOffset = builder.currentOffset
            return !builder.originalText[currentOffset - 1].isWhitespace()
        }

        @JvmStatic
        fun sigilOpr(builder: PsiBuilder, level: Int): Boolean {
            if (builder.tokenType == NimElementTypes.OP2) {
                if (builder.originalText[builder.currentOffset] == '@') {
                    builder.advanceLexer()
                    return true
                }
            }
            return false
        }

        @JvmStatic
        fun inNormalMode(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            return ctx.primaryMode == PrimaryMode.NORMAL
        }

        @JvmStatic
        fun inTypeDescMode(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            return ctx.primaryMode == PrimaryMode.TYPE_DESC
        }

        @JvmStatic
        fun inTypeDefMode(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            return ctx.primaryMode == PrimaryMode.TYPE_DEF
        }

        @JvmStatic
        fun inTrySimpleMode(builder: PsiBuilder, level: Int): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            return ctx.primaryMode == PrimaryMode.TRY_SIMPLE
        }

        private fun withPrimaryMode(builder: PsiBuilder, level: Int, mode: PrimaryMode, parser: Parser): Boolean {
            val ctx = builder.getUserData(ParserContext.KEY)!!
            val currentMode = ctx.primaryMode
            ctx.primaryMode = mode
            val innerResult = parser.parse(builder, level + 1)
            ctx.primaryMode = currentMode
            return innerResult
        }

        @JvmStatic
        fun pmNormal(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
            return withPrimaryMode(builder, level, PrimaryMode.NORMAL, parser)
        }

        @JvmStatic
        fun pmTypeDesc(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
            return withPrimaryMode(builder, level, PrimaryMode.TYPE_DESC, parser)
        }

        @JvmStatic
        fun pmTypeDef(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
            return withPrimaryMode(builder, level, PrimaryMode.TYPE_DEF, parser)
        }

        @JvmStatic
        fun pmTrySimple(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
            return withPrimaryMode(builder, level, PrimaryMode.TRY_SIMPLE, parser)
        }

        @JvmStatic
        fun isUnary(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
            val leading = (
                builder.currentOffset > 0 &&
                builder.originalText[builder.currentOffset - 1].isWhitespace()
            )
            var trailing = false
            builder.tokenText?.let {
                trailing = builder.currentOffset + it.length < builder.originalText.length &&
                           builder.originalText[builder.currentOffset + it.length].isWhitespace()
            }
            return leading && !trailing
        }
    }
}
