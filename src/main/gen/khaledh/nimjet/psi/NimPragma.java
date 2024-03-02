// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPragma extends PsiElement {

  @Nullable
  NimComment getComment();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @NotNull
  List<NimStmtList> getStmtListList();

}
