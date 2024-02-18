// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimSimpleExpr extends NimExpr {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimOp0> getOp0List();

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimPragma getPragma();

}
