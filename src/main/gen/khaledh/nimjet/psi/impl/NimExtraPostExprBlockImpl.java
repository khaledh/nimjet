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

public class NimExtraPostExprBlockImpl extends ASTWrapperPsiElement implements NimExtraPostExprBlock {

  public NimExtraPostExprBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitExtraPostExprBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimDoBlock getDoBlock() {
    return findChildByClass(NimDoBlock.class);
  }

  @Override
  @Nullable
  public NimExpr getExpr() {
    return findChildByClass(NimExpr.class);
  }

  @Override
  @Nullable
  public NimExprList getExprList() {
    return findChildByClass(NimExprList.class);
  }

  @Override
  @Nullable
  public NimOptExprList getOptExprList() {
    return findChildByClass(NimOptExprList.class);
  }

  @Override
  @Nullable
  public NimStmtList getStmtList() {
    return findChildByClass(NimStmtList.class);
  }

}
