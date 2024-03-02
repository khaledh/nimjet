// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimForStmt extends PsiElement {

  @Nullable
  NimComment getComment();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimPragma> getPragmaList();

  @Nullable
  NimStmtList getStmtList();

  @NotNull
  List<NimVarTuple> getVarTupleList();

}
