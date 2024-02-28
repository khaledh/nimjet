// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimGenericParam extends PsiElement {

  @Nullable
  NimComment getComment();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimExpr> getExprList();

}
