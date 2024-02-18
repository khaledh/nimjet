// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDefValue extends PsiElement {

  @Nullable
  NimConceptDecl getConceptDecl();

  @Nullable
  NimEnumDecl getEnumDecl();

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimObjectDecl getObjectDecl();

  @Nullable
  NimPostExprBlocks getPostExprBlocks();

  @Nullable
  NimTupleDecl getTupleDecl();

}
