// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static khaledh.nimjet.psi.NimElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import khaledh.nimjet.psi.*;

public class NimPragmaImpl extends ASTWrapperPsiElement implements NimPragma {

  public NimPragmaImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPragma(this);
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
  public List<NimDoBlock> getDoBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDoBlock.class);
  }

  @Override
  @NotNull
  public List<NimExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExpr.class);
  }

  @Override
  @NotNull
  public List<NimExprList> getExprListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExprList.class);
  }

  @Override
  @NotNull
  public List<NimOptExprList> getOptExprListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOptExprList.class);
  }

  @Override
  @NotNull
  public List<NimStmtList> getStmtListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimStmtList.class);
  }

}
