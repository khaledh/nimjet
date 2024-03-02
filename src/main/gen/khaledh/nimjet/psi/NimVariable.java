// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimVariable extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimDotSuffix> getDotSuffixList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @NotNull
  List<NimPragma> getPragmaList();

  @NotNull
  List<NimStmtList> getStmtListList();

  @Nullable
  NimTypeDesc getTypeDesc();

  @Nullable
  NimVarTuple getVarTuple();

}
