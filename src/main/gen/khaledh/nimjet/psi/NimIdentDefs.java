// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimIdentDefs extends PsiElement {

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
  List<NimIdent> getIdentList();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @NotNull
  List<NimPragma> getPragmaList();

  @NotNull
  List<NimStmtList> getStmtListList();

  @Nullable
  NimTypeDesc getTypeDesc();

}
