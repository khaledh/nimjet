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

public class NimSemiStmtListImpl extends ASTWrapperPsiElement implements NimSemiStmtList {

  public NimSemiStmtListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitSemiStmtList(this);
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
  public List<NimAsmStmt> getAsmStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimAsmStmt.class);
  }

  @Override
  @NotNull
  public List<NimBlockStmt> getBlockStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimBlockStmt.class);
  }

  @Override
  @NotNull
  public List<NimBreakStmt> getBreakStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimBreakStmt.class);
  }

  @Override
  @NotNull
  public List<NimCaseStmt> getCaseStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimCaseStmt.class);
  }

  @Override
  @NotNull
  public List<NimCommentStmt> getCommentStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimCommentStmt.class);
  }

  @Override
  @NotNull
  public List<NimConstant> getConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimConstant.class);
  }

  @Override
  @NotNull
  public List<NimContinueStmt> getContinueStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimContinueStmt.class);
  }

  @Override
  @NotNull
  public List<NimDeferStmt> getDeferStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDeferStmt.class);
  }

  @Override
  @NotNull
  public List<NimDiscardStmt> getDiscardStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDiscardStmt.class);
  }

  @Override
  @NotNull
  public List<NimExportStmt> getExportStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExportStmt.class);
  }

  @Override
  @Nullable
  public NimExpr getExpr() {
    return findChildByClass(NimExpr.class);
  }

  @Override
  @NotNull
  public List<NimExprStmt> getExprStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExprStmt.class);
  }

  @Override
  @NotNull
  public List<NimForStmt> getForStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimForStmt.class);
  }

  @Override
  @NotNull
  public List<NimFromStmt> getFromStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimFromStmt.class);
  }

  @Override
  @NotNull
  public List<NimIfStmt> getIfStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIfStmt.class);
  }

  @Override
  @NotNull
  public List<NimImportStmt> getImportStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimImportStmt.class);
  }

  @Override
  @NotNull
  public List<NimIncludeStmt> getIncludeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimIncludeStmt.class);
  }

  @Override
  @NotNull
  public List<NimPragmaStmt> getPragmaStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPragmaStmt.class);
  }

  @Override
  @NotNull
  public List<NimRaiseStmt> getRaiseStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimRaiseStmt.class);
  }

  @Override
  @NotNull
  public List<NimReturnStmt> getReturnStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimReturnStmt.class);
  }

  @Override
  @NotNull
  public List<NimRoutine> getRoutineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimRoutine.class);
  }

  @Override
  @NotNull
  public List<NimStaticStmt> getStaticStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimStaticStmt.class);
  }

  @Override
  @NotNull
  public List<NimTryStmt> getTryStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimTryStmt.class);
  }

  @Override
  @NotNull
  public List<NimTypeDef> getTypeDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimTypeDef.class);
  }

  @Override
  @NotNull
  public List<NimVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimVariable.class);
  }

  @Override
  @NotNull
  public List<NimWhenStmt> getWhenStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimWhenStmt.class);
  }

  @Override
  @NotNull
  public List<NimWhileStmt> getWhileStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimWhileStmt.class);
  }

  @Override
  @NotNull
  public List<NimYieldStmt> getYieldStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimYieldStmt.class);
  }

}
