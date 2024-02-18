// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static khaledh.nimjet.psi.NimTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import khaledh.nimjet.psi.*;

public class NimTupleTypeBracketImpl extends ASTWrapperPsiElement implements NimTupleTypeBracket {

  public NimTupleTypeBracketImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTupleTypeBracket(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimComment getComment() {
    return findChildByClass(NimComment.class);
  }

  @Override
  @NotNull
  public List<NimIdentColonEquals1> getIdentColonEquals1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIdentColonEquals1.class);
  }

}
