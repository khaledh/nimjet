// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDefValue extends PsiElement {

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
  NimConceptDecl getConceptDecl();

  @Nullable
  NimEnumDecl getEnumDecl();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprColonEqExprList> getExprColonEqExprListList();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimLiteral> getLiteralList();

  @Nullable
  NimObjectDecl getObjectDecl();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimPar> getParList();

  @Nullable
  NimPostExprBlocks getPostExprBlocks();

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

  @Nullable
  NimTupleDecl getTupleDecl();

}
