package khaledh.nimjet.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.psi.util.PsiTreeUtil

class NimIdentReference(element: PsiElement, textRange: TextRange)
    : PsiReferenceBase<PsiElement>(element, textRange)
    , PsiPolyVariantReference {

    private fun findNamedElements(name: String): List<NimNamedElement> {
        val result = mutableListOf<NimNamedElement>()
        val project = myElement.project
        val virtualFile = myElement.containingFile.virtualFile
        val psiManager = PsiManager.getInstance(project)
        val psiFile = psiManager.findFile(virtualFile)
        val namedElements = PsiTreeUtil.findChildrenOfType(psiFile, NimNamedElement::class.java)
        for (namedElement in namedElements) {
            if (name == namedElement.name && namedElement.parent is NimIdentDefs) {
                result.add(namedElement)
            }
        }
        return result
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        var namedElements = findNamedElements(myElement.text)
        // exclude self
        namedElements = namedElements.filter { it != myElement }
        return namedElements.map { PsiElementResolveResult(it) }.toTypedArray()
    }

    override fun resolve(): PsiElement? {
        val results = multiResolve(false)
        return if (results.size == 1) results[0].element else null
    }

}
