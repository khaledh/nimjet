package khaledh.nimjet.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import khaledh.nimjet.psi.NimNamedElement

abstract class NimNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), NimNamedElement
