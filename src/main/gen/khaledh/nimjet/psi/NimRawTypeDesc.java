// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimRawTypeDesc extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @Nullable
  NimArrayConstr getArrayConstr();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @Nullable
  NimIdent getIdent();

  @Nullable
  NimLiteral getLiteral();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @Nullable
  NimPar getPar();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @Nullable
  NimRawTypeDesc getRawTypeDesc();

  @Nullable
  NimRoutineType getRoutineType();

  @Nullable
  NimSetOrTableConstr getSetOrTableConstr();

  @NotNull
  List<NimStmtList> getStmtListList();

  @Nullable
  NimTupleConstr getTupleConstr();

  @Nullable
  NimTupleType getTupleType();

  @Nullable
  NimTypeDesc getTypeDesc();

}
