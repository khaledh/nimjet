package khaledh.nimjet

import com.intellij.lang.Language

object NimLanguage : Language("Nim") {
    private fun readResolve(): Any = NimLanguage
    override fun getDisplayName() = "Nim"
    override fun isCaseSensitive() = true
}
