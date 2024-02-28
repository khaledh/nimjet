package khaledh.nimjet

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.diagnostic.Logger
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.util.ProcessingContext
import khaledh.nimjet.psi.NimElementTypes
import khaledh.nimjet.psi.NimIdent


class NimCompletionContributor : CompletionContributor() {

    companion object {
        private val LOG = Logger.getInstance(NimCompletionContributor::class.java)
    }

    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(NimElementTypes.ID),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    LOG.info("CompletionProvider.addCompletions")
                    val file = parameters.originalFile
                    val declarations = PsiTreeUtil.findChildrenOfType(file, NimIdent::class.java)
                    for (declaration in declarations) {
                        LOG.info("CompletionProvider.addCompletions: declaration = ${declaration.text}")
                        val name = declaration.text ?: continue
                        val lookupElement = LookupElementBuilder.create(name)
                        resultSet.addElement(lookupElement)
                    }
                }
            }
        )
    }

}
