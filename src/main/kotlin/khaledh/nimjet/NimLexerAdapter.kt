package khaledh.nimjet

import com.intellij.lexer.FlexAdapter

class NimLexerAdapter : FlexAdapter(NimLexer(null)) {
}