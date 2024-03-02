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

public class NimVariableImpl extends ASTWrapperPsiElement implements NimVariable {

  public NimVariableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitVariable(this);
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
  public List<NimDoBlock> getDoBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDoBlock.class);
  }

  @Override
  @NotNull
  public List<NimDotSuffix> getDotSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDotSuffix.class);
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
  public List<NimPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPragma.class);
  }

  @Override
  @NotNull
  public List<NimStmtList> getStmtListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimStmtList.class);
  }

  @Override
  @Nullable
  public NimTypeDesc getTypeDesc() {
    return findChildByClass(NimTypeDesc.class);
  }

  @Override
  @Nullable
  public NimVarTuple getVarTuple() {
    return findChildByClass(NimVarTuple.class);
  }

}
