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

public class NimObjectBranchesImpl extends ASTWrapperPsiElement implements NimObjectBranches {

  public NimObjectBranchesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitObjectBranches(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimColonComment> getColonCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimColonComment.class);
  }

  @Override
  @NotNull
  public List<NimExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExpr.class);
  }

  @Override
  @NotNull
  public List<NimObjectBranch> getObjectBranchList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimObjectBranch.class);
  }

  @Override
  @NotNull
  public List<NimObjectPart> getObjectPartList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimObjectPart.class);
  }

}
