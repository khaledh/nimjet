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

public class NimParImpl extends ASTWrapperPsiElement implements NimPar {

  public NimParImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPar(this);
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
  public List<NimArrayConstr> getArrayConstrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimArrayConstr.class);
  }

  @Override
  @Nullable
  public NimDoBlock getDoBlock() {
    return findChildByClass(NimDoBlock.class);
  }

  @Override
  @NotNull
  public List<NimExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExpr.class);
  }

  @Override
  @NotNull
  public List<NimExprColonEqExprList> getExprColonEqExprListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExprColonEqExprList.class);
  }

  @Override
  @NotNull
  public List<NimExtraPostExprBlock> getExtraPostExprBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExtraPostExprBlock.class);
  }

  @Override
  @NotNull
  public List<NimIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIdent.class);
  }

  @Override
  @NotNull
  public List<NimLiteral> getLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimLiteral.class);
  }

  @Override
  @NotNull
  public List<NimOperator> getOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOperator.class);
  }

  @Override
  @NotNull
  public List<NimPar> getParList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPar.class);
  }

  @Override
  @Nullable
  public NimPragma getPragma() {
    return findChildByClass(NimPragma.class);
  }

  @Override
  @Nullable
  public NimPragmaStmt getPragmaStmt() {
    return findChildByClass(NimPragmaStmt.class);
  }

  @Override
  @NotNull
  public List<NimPrimarySuffix> getPrimarySuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPrimarySuffix.class);
  }

  @Override
  @NotNull
  public List<NimRawTypeDesc> getRawTypeDescList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimRawTypeDesc.class);
  }

  @Override
  @Nullable
  public NimSemiStmtList getSemiStmtList() {
    return findChildByClass(NimSemiStmtList.class);
  }

  @Override
  @NotNull
  public List<NimSetOrTableConstr> getSetOrTableConstrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimSetOrTableConstr.class);
  }

  @Override
  @NotNull
  public List<NimTupleConstr> getTupleConstrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimTupleConstr.class);
  }

}
