//import khaledh.nimjet.NimFileType
//import khaledh.nimjet.psi.NimFile
//import khaledh.nimjet.psi.NimProperty
//import com.intellij.openapi.project.Project
//import com.intellij.psi.PsiComment
//import com.intellij.psi.PsiManager
//import com.intellij.psi.PsiWhiteSpace
//import com.intellij.psi.search.FileTypeIndex
//import com.intellij.psi.search.GlobalSearchScope
//import com.intellij.psi.util.PsiTreeUtil
//
//object NimUtil {
//
//    fun findProperties(project: Project, key: String): List<NimProperty> {
//        val result = mutableListOf<NimProperty>()
//
//        val virtualFiles = FileTypeIndex.getFiles(NimFileType, GlobalSearchScope.allScope(project))
//        for (virtualFile in virtualFiles) {
//            val nimFile = PsiManager.getInstance(project).findFile(virtualFile) as? NimFile
//            nimFile?.let { file ->
//                val properties = PsiTreeUtil.getChildrenOfTypeAsList(file, NimProperty::class.java)
//                result.addAll(properties.filter { it.key == key }.map { it })
//            }
//        }
//
//        return result
//    }
//
//    fun findProperties(project: Project): List<NimProperty> {
//        val result = mutableListOf<NimProperty>()
//
//        val virtualFiles = FileTypeIndex.getFiles(NimFileType, GlobalSearchScope.allScope(project))
//        for (virtualFile in virtualFiles) {
//            val nimFile = PsiManager.getInstance(project).findFile(virtualFile) as? NimFile
//            nimFile?.let { file ->
//                val properties = PsiTreeUtil.getChildrenOfTypeAsList(file, NimProperty::class.java)
//                result.addAll(properties.map { it })
//            }
//        }
//
//        return result
//    }
//
//    fun findDocumentationComment(property: NimProperty): String {
//        val result = mutableListOf<String>()
//
//        var element = property.prevSibling
//        while (true) {
//            when (element) {
//                is PsiComment -> {
//                    val comment = element.text.replaceFirst("[!# ]+", "")
//                    result.add(comment)
//                }
//                is PsiWhiteSpace -> {}
//                else -> break
//            }
//            element = element.prevSibling
//        }
//
//        return result.reversed().joinToString("\n")
//    }
//
//}
