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

public class NimPrimaryExprImpl extends NimExprImpl implements NimPrimaryExpr {

  public NimPrimaryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimaryExpr(this);
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
  @Nullable
  public NimExpr getExpr() {
    return findChildByClass(NimExpr.class);
  }

  @Override
  @Nullable
  public NimOperator getOperator() {
    return findChildByClass(NimOperator.class);
  }

  @Override
  @Nullable
  public NimRawTypeDesc getRawTypeDesc() {
    return findChildByClass(NimRawTypeDesc.class);
  }

  @Override
  @Nullable
  public NimSimplePrimary getSimplePrimary() {
    return findChildByClass(NimSimplePrimary.class);
  }

}
