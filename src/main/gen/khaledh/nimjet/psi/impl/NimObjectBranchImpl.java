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

public class NimObjectBranchImpl extends ASTWrapperPsiElement implements NimObjectBranch {

  public NimObjectBranchImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitObjectBranch(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimColonComment getColonComment() {
    return findChildByClass(NimColonComment.class);
  }

  @Override
  @Nullable
  public NimExprList getExprList() {
    return findChildByClass(NimExprList.class);
  }

  @Override
  @Nullable
  public NimObjectPart getObjectPart() {
    return findChildByClass(NimObjectPart.class);
  }

}
