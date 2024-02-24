package khaledh.nimjet

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import khaledh.nimjet.psi.*
import org.jetbrains.annotations.NotNull

class NimAnnotator : Annotator {
    companion object {
        private val TYPE_KEY =
            TextAttributesKey.createTextAttributesKey("NIM_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME)
        private val METADATA_KEY =
            TextAttributesKey.createTextAttributesKey("NIM_PRAGMA", DefaultLanguageHighlighterColors.METADATA)
        private val ROUTINE_KEY =
            TextAttributesKey.createTextAttributesKey("NIM_ROUTINE", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
    }
    override fun annotate(@NotNull element: PsiElement, @NotNull holder: AnnotationHolder) {
        when (element.node.elementType) {
            NimElementTypes.STR_ERROR, NimElementTypes.TRIPLESTR_ERROR -> {
                val expected = if (element.node.elementType == NimElementTypes.STR_ERROR) "\"" else "\"\"\""
                val endOffset = element.textRange.endOffset
                val range = TextRange.create(endOffset - 1, endOffset)
                holder.newAnnotation(HighlightSeverity.ERROR, "closing $expected expected")
                    .afterEndOfLine()
                    .range(range)
                    .create()
            }

            NimElementTypes.MULTILINE_COMMENT_ERROR -> {
                val expected = "]#"
                val endOffset = element.textRange.endOffset
                val range = TextRange.create(endOffset - 1, endOffset)
                holder.newAnnotation(HighlightSeverity.ERROR, "closing $expected expected")
                    .afterEndOfLine()
                    .range(range)
                    .create()
            }

            NimElementTypes.INVALID_IDENT -> {
                holder.newAnnotation(HighlightSeverity.ERROR, "invalid identifier")
                    .create()
            }
        }

        if (element is NimIdentVis && element.parent is NimRoutine) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .textAttributes(ROUTINE_KEY)
                .create()
        }

        if (element is NimIdentVis && element.parent is NimTypeDef) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .textAttributes(TYPE_KEY)
                .create()
        }

        if (element is NimPragma) {
            // set background color
            val attributes = TextAttributes()
            attributes.backgroundColor = DefaultLanguageHighlighterColors.METADATA.defaultAttributes.backgroundColor

            // naming: *Offset is relative to the whole file, *Index is relative to the element's text
            var startOffset = element.textRange.startOffset
            var nextNewLineIndex = element.text.indexOf('\n')
            while (nextNewLineIndex != -1) {
                val endOffset = element.textRange.startOffset + nextNewLineIndex
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(METADATA_KEY)
                    .range(TextRange.create(startOffset, endOffset))
                    .create()
                startOffset = element.textRange.startOffset + nextNewLineIndex + 1
                // find first non whitespace character offset, starting from  startOffset
                val nonWhitespaceDelta = element.text.subSequence(
                    nextNewLineIndex + 1, element.text.length
                ).indexOfFirst { !it.isWhitespace() }
                if (nonWhitespaceDelta != -1) {
                    startOffset += nonWhitespaceDelta
                }
                nextNewLineIndex = element.text.indexOf('\n', nextNewLineIndex + 1)
            }

            if (startOffset < element.textRange.endOffset) {
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(METADATA_KEY)
                    .range(TextRange.create(startOffset, element.textRange.endOffset))
                    .create()
            }
        }
    }
}
