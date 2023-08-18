// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimIdentOrLiteral extends PsiElement {

  @Nullable
  NimArrayConstr getArrayConstr();

  @Nullable
  NimCastExpr getCastExpr();

  @Nullable
  NimExprColonEqExprList getExprColonEqExprList();

  @Nullable
  NimLiteral getLiteral();

  @Nullable
  NimPar getPar();

  @Nullable
  NimSymbol getSymbol();

  @Nullable
  NimTupleConstr getTupleConstr();

}
