package khaledh.nimjet

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import khaledh.nimjet.psi.NimFile
import khaledh.nimjet.psi.NimElementTypes

class NimParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = NimLexerAdapter()

    override fun createParser(project: Project): PsiParser = NimParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = STRINGS

    override fun createElement(node: ASTNode): PsiElement = NimElementTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = NimFile(viewProvider)

    companion object {
        val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
//        val COMMENTS: TokenSet = TokenSet.create(NimTypes.MULTILINE_COMMENT, NimTypes.MULTILINE_COMMENT_ERROR)
        val COMMENTS: TokenSet = TokenSet.EMPTY
        val STRINGS: TokenSet = TokenSet.create(NimElementTypes.STR_LIT, NimElementTypes.TRIPLESTR_LIT, NimElementTypes.RSTR_LIT)
        val FILE = IFileElementType(NimLanguage)
    }
}
