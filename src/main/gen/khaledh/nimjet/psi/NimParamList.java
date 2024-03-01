// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimParamList extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimOpr> getOprList();

  @NotNull
  List<NimBuiltInMagics> getBuiltInMagicsList();

  @NotNull
  List<NimCommaOptcomment> getCommaOptcommentList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimPragma> getPragmaList();

  @NotNull
  List<NimTypeDesc> getTypeDescList();

}
