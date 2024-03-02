// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDefValue extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimArrayConstr> getArrayConstrList();

  @Nullable
  NimConceptDecl getConceptDecl();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @Nullable
  NimEnumDecl getEnumDecl();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimLiteral> getLiteralList();

  @Nullable
  NimObjectDecl getObjectDecl();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimOptExprList> getOptExprListList();

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
  List<NimStmtList> getStmtListList();

  @NotNull
  List<NimTupleConstr> getTupleConstrList();

  @Nullable
  NimTupleDecl getTupleDecl();

}
