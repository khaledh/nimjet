// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimIdentDefs extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimOpr> getOprList();

  @NotNull
  List<NimBuiltInMagics> getBuiltInMagicsList();

  @Nullable
  NimCommaOptcomment getCommaOptcomment();

  @NotNull
  List<NimDotSuffix> getDotSuffixList();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();

  @Nullable
  NimPostExprBlocks getPostExprBlocks();

  @NotNull
  List<NimPragma> getPragmaList();

  @Nullable
  NimTypeDesc getTypeDesc();

}
