// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPostExprBlocks extends PsiElement {

  @Nullable
  NimDoBlock getDoBlock();

  @NotNull
  List<NimExtraPostExprBlock> getExtraPostExprBlockList();

  @Nullable
  NimStmtList getStmtList();

}
