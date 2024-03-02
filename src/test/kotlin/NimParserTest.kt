package khaledh.nimjet

import com.intellij.psi.impl.DebugUtil
import com.intellij.testFramework.ParsingTestCase

class NimParserTest : ParsingTestCase("", "nim", NimParserDefinition()) {

    override fun getTestDataPath(): String {
        return "src/test/testData"
    }

    fun testSimple() {
        doTest(true)
        val psiFile = myFile
        println(DebugUtil.psiToString(psiFile, false, true))
    }

    override fun skipSpaces(): Boolean {
        return true
    }

    override fun includeRanges(): Boolean {
        return true
    }

}
