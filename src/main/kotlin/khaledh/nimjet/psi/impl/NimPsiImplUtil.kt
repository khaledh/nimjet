package khaledh.nimjet.psi.impl

import khaledh.nimjet.NimIcons
import khaledh.nimjet.psi.NimNamedElement
import khaledh.nimjet.psi.NimTypes
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import javax.swing.Icon

class NimPsiImplUtil {

    companion object {
//        @JvmStatic
//        fun getKey(element: NimProperty): String? {
//            val keyNode: ASTNode? = element.node.findChildByType(NimTypes.KEY)
//            //  convert escaped spaces to simple spaces
//            return keyNode?.text?.replace("\\ ", " ")
//        }
//
//        @JvmStatic
//        fun getValue(element: NimProperty): String? {
//            val valueNode: ASTNode? = element.node.findChildByType(NimTypes.VALUE)
//            return valueNode?.text
//        }

        @JvmStatic
        fun getName(element: NimNamedElement): String {
            return element.node.findChildByType(NimTypes.IDENT)?.text ?: ""
        }

        @JvmStatic
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
        fun getNameIdentifier(element: NimNamedElement): ASTNode {
            return element.node.findChildByType(NimTypes.IDENT)!!
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
