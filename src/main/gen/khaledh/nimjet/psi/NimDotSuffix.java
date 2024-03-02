// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimDotSuffix extends PsiElement {

  @Nullable
  NimComment getComment();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @Nullable
  NimIdent getIdent();

  @Nullable
  NimKeyword getKeyword();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @NotNull
  List<NimStmtList> getStmtListList();

}
