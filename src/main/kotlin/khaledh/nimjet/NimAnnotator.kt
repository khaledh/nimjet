package khaledh.nimjet

import khaledh.nimjet.psi.NimTypes
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.jetbrains.annotations.NotNull

class NimAnnotator : Annotator {
    override fun annotate(@NotNull element: PsiElement, @NotNull holder: AnnotationHolder) {
        if (element.node.elementType in setOf(NimTypes.STR_ERROR, NimTypes.TRIPLESTR_ERROR)) {
            val expected = if (element.node.elementType == NimTypes.STR_ERROR) "\"" else "\"\"\""
            val endOffset = element.textRange.endOffset
            val range = TextRange.create(endOffset - 1, endOffset)
            holder.newAnnotation(HighlightSeverity.ERROR, "closing $expected expected")
                .range(range)
                .afterEndOfLine()
                .create()
        }
        else if (element.node.elementType == NimTypes.INVALID_IDENT) {
            holder.newAnnotation(HighlightSeverity.ERROR, "invalid identifier")
                .range(element)
                .create()
        }
    }
}
