// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimConstant extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimIdent> getIdentList();

  @Nullable
  NimOpr getOpr();

  @Nullable
  NimBuiltInMagics getBuiltInMagics();

  @Nullable
  NimColonComment getColonComment();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimTypeDesc getTypeDesc();

  @Nullable
  NimVarTuple getVarTuple();

}
