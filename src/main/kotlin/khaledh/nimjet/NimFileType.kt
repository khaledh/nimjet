package khaledh.nimjet

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object NimFileType : LanguageFileType(NimLanguage) {
    override fun getName() = "Nim File"
    override fun getDescription(): String = "Nim language file"
    override fun getDefaultExtension(): String = "nim"
    override fun getIcon(): Icon = NimIcons.FILE
}
