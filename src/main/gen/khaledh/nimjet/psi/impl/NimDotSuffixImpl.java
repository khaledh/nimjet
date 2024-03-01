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

public class NimDotSuffixImpl extends ASTWrapperPsiElement implements NimDotSuffix {

  public NimDotSuffixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitDotSuffix(this);
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
  public List<NimIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIdent.class);
  }

  @Override
  @Nullable
  public NimBuiltInMagics getBuiltInMagics() {
    return findChildByClass(NimBuiltInMagics.class);
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
  @NotNull
  public List<NimKeyword> getKeywordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimKeyword.class);
  }

  @Override
  @NotNull
  public List<NimOperator> getOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOperator.class);
  }

}
