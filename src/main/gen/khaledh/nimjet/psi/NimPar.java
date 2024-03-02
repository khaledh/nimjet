// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPar extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimArrayConstr> getArrayConstrList();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimLiteral> getLiteralList();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @NotNull
  List<NimPar> getParList();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimPragmaStmt getPragmaStmt();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @NotNull
  List<NimRawTypeDesc> getRawTypeDescList();

  @Nullable
  NimSemiStmtList getSemiStmtList();

  @NotNull
  List<NimSetOrTableConstr> getSetOrTableConstrList();

  @NotNull
  List<NimStmtList> getStmtListList();

  @NotNull
  List<NimTupleConstr> getTupleConstrList();

}
