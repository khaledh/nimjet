// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimExpr extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimArrayConstr> getArrayConstrList();

  @Nullable
  NimCaseStmt getCaseStmt();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprColonEqExprList> getExprColonEqExprListList();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimLiteral> getLiteralList();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimPar> getParList();

  @Nullable
  NimPragma getPragma();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @NotNull
  List<NimRawTypeDesc> getRawTypeDescList();

  @NotNull
  List<NimSetOrTableConstr> getSetOrTableConstrList();

  @NotNull
  List<NimTupleConstr> getTupleConstrList();

}
