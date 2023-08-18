package khaledh.nimjet

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.util.parentOfType
import com.intellij.psi.util.parentOfTypes
import khaledh.nimjet.psi.*
import org.jetbrains.annotations.NotNull
import java.awt.Font

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
            NimTypes.STR_ERROR, NimTypes.TRIPLESTR_ERROR -> {
                val expected = if (element.node.elementType == NimTypes.STR_ERROR) "\"" else "\"\"\""
                val endOffset = element.textRange.endOffset
                val range = TextRange.create(endOffset - 1, endOffset)
                holder.newAnnotation(HighlightSeverity.ERROR, "closing $expected expected")
                    .range(range)
                    .afterEndOfLine()
                    .create()
            }

            NimTypes.INVALID_IDENT -> {
                holder.newAnnotation(HighlightSeverity.ERROR, "invalid identifier")
                    .range(element)
                    .create()
            }
        }

        if (element is NimIdentVis && element.parent is NimRoutine) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element)
                .textAttributes(ROUTINE_KEY)
                .create()
        }

        if (element is NimIdentVis && element.parent is NimTypeDef) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element)
                .textAttributes(TYPE_KEY)
                .create()
        }

        if (element is NimPragma) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element)
                .textAttributes(METADATA_KEY)
                .create()
        }
    }
}
