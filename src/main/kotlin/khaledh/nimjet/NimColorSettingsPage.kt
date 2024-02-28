//package khaledh.nimjet
//
//import com.intellij.openapi.options.colors.AttributesDescriptor
//import com.intellij.openapi.options.colors.ColorDescriptor
//import com.intellij.openapi.options.colors.ColorSettingsPage
//
//class NimColorSettingsPage : ColorSettingsPage {
//
//    companion object {
//        private val descriptors = arrayOf(
//            AttributesDescriptor("Key", NimSyntaxHighlighter.KEY),
//            AttributesDescriptor("Separator", NimSyntaxHighlighter.SEPARATOR),
//            AttributesDescriptor("Value", NimSyntaxHighlighter.VALUE),
//            AttributesDescriptor("Comment", NimSyntaxHighlighter.COMMENT)
//        )
//
//        private val demoTags = mapOf(
//            "key" to NimSyntaxHighlighter.KEY,
//            "separator" to NimSyntaxHighlighter.SEPARATOR,
//            "value" to NimSyntaxHighlighter.VALUE,
//            "comment" to NimSyntaxHighlighter.COMMENT
//        )
//    }
//
//    override fun getDisplayName() = "Nim"
//
//    override fun getIcon() = NimIcons.FILE
//
//    override fun getAttributeDescriptors() = descriptors
//
//    override fun getAdditionalHighlightingTagToDescriptorMap() = demoTags
//
//    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY
//
//    override fun getHighlighter() = NimSyntaxHighlighter()
//
//    override fun getDemoText() = """
//        # Nim Color Settings Demo
//
//        key = value
//        separator: value
//
//        # This is a comment
//    """.trimIndent()
//}