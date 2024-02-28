// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPar extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimOp0> getOp0List();

  @NotNull
  List<NimOp6> getOp6List();

  @NotNull
  List<NimArrayConstr> getArrayConstrList();

  @NotNull
  List<NimBuiltInMagics> getBuiltInMagicsList();

  @Nullable
  NimDoBlock getDoBlock();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprColonEqExprList> getExprColonEqExprListList();

  @NotNull
  List<NimExtraPostExprBlock> getExtraPostExprBlockList();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimLiteral> getLiteralList();

  @NotNull
  List<NimOperator> getOperatorList();

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
  List<NimTupleConstr> getTupleConstrList();

}
