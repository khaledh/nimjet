// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimSimplePrimary extends PsiElement {

  @Nullable
  NimComment getComment();

  @NotNull
  List<NimIdent> getIdentList();

  @Nullable
  NimArrayConstr getArrayConstr();

  @Nullable
  NimBuiltInMagics getBuiltInMagics();

  @Nullable
  NimCastExpr getCastExpr();

  @Nullable
  NimExprColonEqExprList getExprColonEqExprList();

  @NotNull
  List<NimKeyword> getKeywordList();

  @Nullable
  NimLiteral getLiteral();

  @NotNull
  List<NimOperator> getOperatorList();

  @Nullable
  NimPar getPar();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @Nullable
  NimSetOrTableConstr getSetOrTableConstr();

  @Nullable
  NimTupleConstr getTupleConstr();

}
