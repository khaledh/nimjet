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

public class NimSimpleStmtImpl extends ASTWrapperPsiElement implements NimSimpleStmt {

  public NimSimpleStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitSimpleStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimBreakStmt getBreakStmt() {
    return findChildByClass(NimBreakStmt.class);
  }

  @Override
  @Nullable
  public NimCommentStmt getCommentStmt() {
    return findChildByClass(NimCommentStmt.class);
  }

  @Override
  @Nullable
  public NimContinueStmt getContinueStmt() {
    return findChildByClass(NimContinueStmt.class);
  }

  @Override
  @Nullable
  public NimDiscardStmt getDiscardStmt() {
    return findChildByClass(NimDiscardStmt.class);
  }

  @Override
  @Nullable
  public NimExportStmt getExportStmt() {
    return findChildByClass(NimExportStmt.class);
  }

  @Override
  @Nullable
  public NimExprStmt getExprStmt() {
    return findChildByClass(NimExprStmt.class);
  }

  @Override
  @Nullable
  public NimFromStmt getFromStmt() {
    return findChildByClass(NimFromStmt.class);
  }

  @Override
  @Nullable
  public NimImportStmt getImportStmt() {
    return findChildByClass(NimImportStmt.class);
  }

  @Override
  @Nullable
  public NimIncludeStmt getIncludeStmt() {
    return findChildByClass(NimIncludeStmt.class);
  }

  @Override
  @Nullable
  public NimPragmaStmt getPragmaStmt() {
    return findChildByClass(NimPragmaStmt.class);
  }

  @Override
  @Nullable
  public NimRaiseStmt getRaiseStmt() {
    return findChildByClass(NimRaiseStmt.class);
  }

  @Override
  @Nullable
  public NimReturnStmt getReturnStmt() {
    return findChildByClass(NimReturnStmt.class);
  }

  @Override
  @Nullable
  public NimYieldStmt getYieldStmt() {
    return findChildByClass(NimYieldStmt.class);
  }

}
