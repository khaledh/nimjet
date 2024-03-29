// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPar extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @Nullable
  NimPragmaStmt getPragmaStmt();

  @Nullable
  NimSemiStmtList getSemiStmtList();

  @NotNull
  List<NimStmtList> getStmtListList();

}
