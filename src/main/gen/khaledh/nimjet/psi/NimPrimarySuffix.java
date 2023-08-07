// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimarySuffix extends PsiElement {

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimExprColonEqExprList getExprColonEqExprList();

  @Nullable
  NimIndopt getIndopt();

  @Nullable
  NimSymbolOrKeyword getSymbolOrKeyword();

}
