// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTupleTypeBracket extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimIdent> getIdentList();

  @NotNull
  List<NimCommaOptcomment> getCommaOptcommentList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimTypeDesc> getTypeDescList();

}
