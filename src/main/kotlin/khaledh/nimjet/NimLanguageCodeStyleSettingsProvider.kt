package khaledh.nimjet

import com.intellij.application.options.IndentOptionsEditor
import com.intellij.application.options.SmartIndentOptionsEditor
import com.intellij.lang.Language
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider
import khaledh.nimjet.NimLanguage

class NimLanguageCodeStyleSettingsProvider : LanguageCodeStyleSettingsProvider() {
    override fun getLanguage(): Language {
        return NimLanguage
    }

    override fun getCodeSample(settingsType: SettingsType): String? {
        TODO("Not yet implemented")
    }

    override fun customizeDefaults(
        commonSettings: CommonCodeStyleSettings,
        indentOptions: CommonCodeStyleSettings.IndentOptions
    ) {
        indentOptions.INDENT_SIZE = 2
        indentOptions.CONTINUATION_INDENT_SIZE = 2
        indentOptions.TAB_SIZE = 2
    }

//    override fun getIndentOptionsEditor(): IndentOptionsEditor? {
//        return object : SmartIndentOptionsEditor() {
//            override fun apply(settings: CommonCodeStyleSettings, indentOptions: CommonCodeStyleSettings.IndentOptions) {
//                super.apply(settings, indentOptions)
//                indentOptions.INDENT_SIZE = 2
//                indentOptions.CONTINUATION_INDENT_SIZE = 2
//                indentOptions.TAB_SIZE = 2
//            }
//        }
//    }
}