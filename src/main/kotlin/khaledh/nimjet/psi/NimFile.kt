package khaledh.nimjet.psi

import khaledh.nimjet.NimFileType
import khaledh.nimjet.NimLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class NimFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, NimLanguage) {
    override fun getFileType(): FileType = NimFileType
    override fun toString(): String = "Nim File"
}
