package khaledh.nimjet

import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.openapi.util.Key


fun <T> stackOf(vararg elements: T) = ArrayDeque(elements.toList())
fun <T> ArrayDeque<T>.push(element: T) = addLast(element) // returns Unit
fun <T> ArrayDeque<T>.pop() = removeLastOrNull()          // returns T?
fun <T> ArrayDeque<T>.peek() = lastOrNull()               // returns T?

class ParserContext {
    var indentStack = stackOf<Int>(0)

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
        fun indOptional(builder: PsiBuilder, level: Int): Boolean {
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
            ctx.indentStack.peek()?.takeIf { currentIndent > it }?.let {
                ctx.indentStack.push(currentIndent)
                val innerResult = parser.parse(builder, level + 1)
                ctx.indentStack.pop()
                return innerResult
            }
            builder.error("Invalid indentation")
            return false
        }
    }
}
