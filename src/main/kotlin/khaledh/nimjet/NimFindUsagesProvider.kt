package khaledh.nimjet

import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import khaledh.nimjet.psi.NimIdent

class NimFindUsagesProvider : FindUsagesProvider {
    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        return psiElement is PsiNamedElement
    }

    override fun getHelpId(psiElement: PsiElement): String? {
        return null
    }

    override fun getType(element: PsiElement): String {
        return if (element is NimIdent) "identifier" else ""
    }

    override fun getDescriptiveName(element: PsiElement): String {
        return if (element is NimIdent) element.text else ""
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
        return if (element is NimIdent) element.text else ""
    }
}