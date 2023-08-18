package khaledh.nimjet

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object NimFileType : LanguageFileType(NimLanguage) {
    override fun getName() = "Nim"
    override fun getDescription(): String = "Nim"
    override fun getDefaultExtension(): String = "nim"
    override fun getIcon(): Icon = NimIcons.FILE
}
