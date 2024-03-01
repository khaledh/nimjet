// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimDotSuffix extends PsiElement {

  @Nullable
  NimComment getComment();

  @NotNull
  List<NimIdent> getIdentList();

  @Nullable
  NimBuiltInMagics getBuiltInMagics();

  @Nullable
  NimExpr getExpr();

  @Nullable
  NimExprList getExprList();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();

}
