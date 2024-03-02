// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectPartItem extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimObjectCase getObjectCase();

  @Nullable
  NimObjectWhen getObjectWhen();

  @NotNull
  List<NimPragma> getPragmaList();

}
