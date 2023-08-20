// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimVariable extends PsiElement {

  @Nullable
  NimComment getComment();

  @Nullable
  NimExpr getExpr();

  @Nullable
  NimIdentColonEquals1 getIdentColonEquals1();

  @NotNull
  NimIndAndComment getIndAndComment();

  @Nullable
  NimPostExprBlocks getPostExprBlocks();

  @Nullable
  NimVarTuple getVarTuple();

}
