// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimForStmt extends PsiElement {

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimOpr> getOprList();

  @NotNull
  List<NimBuiltInMagics> getBuiltInMagicsList();

  @Nullable
  NimColonComment getColonComment();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimPragma> getPragmaList();

  @Nullable
  NimStmtList getStmtList();

  @NotNull
  List<NimVarTuple> getVarTupleList();

}
