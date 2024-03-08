// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectCase extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimIdent> getIdentList();

  @Nullable
  NimObjectBranches getObjectBranches();

  @NotNull
  List<NimPragma> getPragmaList();

  @Nullable
  NimTypeDescExpr getTypeDescExpr();

}
