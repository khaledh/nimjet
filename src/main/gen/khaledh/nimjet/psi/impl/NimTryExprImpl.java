// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static khaledh.nimjet.psi.NimTypes.*;
import khaledh.nimjet.psi.*;

public class NimTryExprImpl extends NimExprImpl implements NimTryExpr {

  public NimTryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTryExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimComment> getCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimComment.class);
  }

  @Override
  @NotNull
  public List<NimColonComment> getColonCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimColonComment.class);
  }

  @Override
  @NotNull
  public List<NimOptionalExprList> getOptionalExprListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOptionalExprList.class);
  }

  @Override
  @NotNull
  public List<NimStmtList> getStmtListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimStmtList.class);
  }

}
