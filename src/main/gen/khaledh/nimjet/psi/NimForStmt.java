// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimForStmt extends PsiElement {

  @Nullable
  NimColonComment getColonComment();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimIdentWithPragma> getIdentWithPragmaList();

  @Nullable
  NimStmtList getStmtList();

  @NotNull
  List<NimVarTuple> getVarTupleList();

}
