// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimaryExpr extends NimBasicExpr {

  @NotNull
  List<NimComment> getCommentList();

  @Nullable
  NimArrayConstr getArrayConstr();

  @Nullable
  NimCastExpr getCastExpr();

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

  @Nullable
  NimOperator getOperator();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @Nullable
  NimPar getPar();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @Nullable
  NimRawTypeDesc getRawTypeDesc();

  @Nullable
  NimRoutineExpr getRoutineExpr();

  @Nullable
  NimSetOrTableConstr getSetOrTableConstr();

  @NotNull
  List<NimStmtList> getStmtListList();

  @Nullable
  NimTupleConstr getTupleConstr();

}
