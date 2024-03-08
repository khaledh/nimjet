package khaledh.nimjet.psi.impl

import khaledh.nimjet.NimIcons
import khaledh.nimjet.psi.NimNamedElement
import khaledh.nimjet.psi.NimElementTypes
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import khaledh.nimjet.psi.NimIdent
import khaledh.nimjet.psi.NimIdentReference
import javax.swing.Icon

class NimPsiImplUtil {

    companion object {

        @JvmStatic
        fun getName(element: NimNamedElement): String {
            return element.text
        }

        @JvmStatic
        @Suppress("UNUSED_PARAMETER")
        fun setName(element: NimNamedElement, newName: String): PsiElement {
//            val node: ASTNode = element.node.findChildByType(NimTypes.ID)!!
//            if (node != null) {
//                val property = NimElementFactory.createVarDeclaration(element.project, newName)
//                val newKeyNode = property.firstChild.node
//                element.node.replaceChild(node, newKeyNode)
//            }
            return element
        }

        @JvmStatic
        fun getNameIdentifier(element: NimNamedElement): PsiElement {
            return element
        }

        @JvmStatic
        fun getReference(element: NimIdent): PsiReference {
            return NimIdentReference(element, TextRange(0, element.textLength))
        }

        @JvmStatic
        fun getPresentation(element: NimNamedElement): ItemPresentation {
            return object : ItemPresentation {
                override fun getPresentableText(): String? {
                    return element.name
                }

                override fun getLocationString(): String {
                    return element.containingFile.virtualFile.path
                }

                override fun getIcon(unused: Boolean): Icon {
                    return NimIcons.FILE
                }
            }
        }
    }

}
