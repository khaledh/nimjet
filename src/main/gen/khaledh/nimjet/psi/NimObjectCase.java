// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectCase extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimObjectBranches getObjectBranches();

  @NotNull
  List<NimPragma> getPragmaList();

}
