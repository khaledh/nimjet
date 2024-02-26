// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimBlockStmt extends PsiElement {

  @NotNull
  List<NimIdent> getIdentList();

  @Nullable
  NimBuiltInMagics getBuiltInMagics();

  @Nullable
  NimColonComment getColonComment();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();

  @Nullable
  NimStmtList getStmtList();

}
