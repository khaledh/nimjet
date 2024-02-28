package khaledh.nimjet

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.formatter.common.AbstractBlock
import khaledh.nimjet.psi.NimElementTypes

class NimFormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val psiFile = formattingContext.psiElement.containingFile
        val rootBlock = NimBlock(formattingContext.psiElement.node, null, Alignment.createAlignment())
        return FormattingModelProvider.createFormattingModelForPsiFile(
            psiFile,
            rootBlock,
            formattingContext.codeStyleSettings
        )
    }

    private class NimBlock(node: ASTNode, wrap: Wrap?,  alignment: Alignment?) : AbstractBlock(node, wrap, alignment) {
        // create a static set of element types that require indent
        companion object {
            val INDENTED_TYPES = setOf(
                NimElementTypes.TYPE_DEF,
                NimElementTypes.IF_STMT,
            )
        }
        override fun buildChildren(): List<Block> {
            val blocks = mutableListOf<Block>()
            node.getChildren(null).forEach {
                blocks.add(NimBlock(it, wrap, alignment))
            }
            return blocks
        }

        override fun getIndent(): Indent? {
            val elementType = node.elementType
            return when {
                elementType in INDENTED_TYPES -> {
                    val depth = generateSequence(node) { it.treeParent }.count()
                    Indent.getSpaceIndent(depth * 2)
                }
                else -> Indent.getNoneIndent()
            }
        }

        override fun getSpacing(child1: Block?, child2: Block): Spacing? {
            return Spacing.getReadOnlySpacing()
        }

        override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
            return ChildAttributes(Indent.getNormalIndent(), null)
        }

        override fun isLeaf(): Boolean {
            return node.firstChildNode == null
        }
    }
}