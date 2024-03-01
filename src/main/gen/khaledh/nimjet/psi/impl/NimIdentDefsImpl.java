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

public class NimIdentDefsImpl extends ASTWrapperPsiElement implements NimIdentDefs {

  public NimIdentDefsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitIdentDefs(this);
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
  public List<NimIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIdent.class);
  }

  @Override
  @NotNull
  public List<NimOpr> getOprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOpr.class);
  }

  @Override
  @NotNull
  public List<NimBuiltInMagics> getBuiltInMagicsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimBuiltInMagics.class);
  }

  @Override
  @Nullable
  public NimCommaOptcomment getCommaOptcomment() {
    return findChildByClass(NimCommaOptcomment.class);
  }

  @Override
  @NotNull
  public List<NimDotSuffix> getDotSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDotSuffix.class);
  }

  @Override
  @Nullable
  public NimExpr getExpr() {
    return findChildByClass(NimExpr.class);
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

  @Override
  @Nullable
  public NimPostExprBlocks getPostExprBlocks() {
    return findChildByClass(NimPostExprBlocks.class);
  }

  @Override
  @NotNull
  public List<NimPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPragma.class);
  }

  @Override
  @Nullable
  public NimTypeDesc getTypeDesc() {
    return findChildByClass(NimTypeDesc.class);
  }

}
