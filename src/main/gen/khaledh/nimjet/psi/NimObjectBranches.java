// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectBranches extends PsiElement {

  @NotNull
  List<NimColonComment> getColonCommentList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimObjectBranch> getObjectBranchList();

  @NotNull
  List<NimObjectPart> getObjectPartList();

}
