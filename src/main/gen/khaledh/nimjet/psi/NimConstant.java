// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimConstant extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @Nullable
  NimExpr getExpr();

  @Nullable
  NimIdent getIdent();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimTypeDesc getTypeDesc();

  @Nullable
  NimVarTuple getVarTuple();

}
