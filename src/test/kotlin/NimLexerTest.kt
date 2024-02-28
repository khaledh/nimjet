package khaledh.nimjet

import khaledh.nimjet.psi.NimElementTypes
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.StringReader


class NimLexerTest {

    @Test
    fun testComments() {
        val input = "# This is a comment"
        val lexer = NimLexer(StringReader(input))
        lexer.reset(input, 0, input.length, 0)
        assertEquals(NimElementTypes.COMMENT, lexer.advance())
//        assertEquals(" This is a comment", lexer.yytext())
    }
}
