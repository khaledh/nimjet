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

public class NimStmtImpl extends ASTWrapperPsiElement implements NimStmt {

  public NimStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitStmt(this);
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
  public NimAsmStmt getAsmStmt() {
    return findChildByClass(NimAsmStmt.class);
  }

  @Override
  @Nullable
  public NimBlockStmt getBlockStmt() {
    return findChildByClass(NimBlockStmt.class);
  }

  @Override
  @Nullable
  public NimCaseStmt getCaseStmt() {
    return findChildByClass(NimCaseStmt.class);
  }

  @Override
  @Nullable
  public NimConstant getConstant() {
    return findChildByClass(NimConstant.class);
  }

  @Override
  @Nullable
  public NimDeferStmt getDeferStmt() {
    return findChildByClass(NimDeferStmt.class);
  }

  @Override
  @Nullable
  public NimForStmt getForStmt() {
    return findChildByClass(NimForStmt.class);
  }

  @Override
  @Nullable
  public NimIfStmt getIfStmt() {
    return findChildByClass(NimIfStmt.class);
  }

  @Override
  @Nullable
  public NimRoutine getRoutine() {
    return findChildByClass(NimRoutine.class);
  }

  @Override
  @Nullable
  public NimSimpleStmt getSimpleStmt() {
    return findChildByClass(NimSimpleStmt.class);
  }

  @Override
  @Nullable
  public NimStaticStmt getStaticStmt() {
    return findChildByClass(NimStaticStmt.class);
  }

  @Override
  @Nullable
  public NimTryStmt getTryStmt() {
    return findChildByClass(NimTryStmt.class);
  }

  @Override
  @Nullable
  public NimTypeDef getTypeDef() {
    return findChildByClass(NimTypeDef.class);
  }

  @Override
  @Nullable
  public NimVariable getVariable() {
    return findChildByClass(NimVariable.class);
  }

  @Override
  @Nullable
  public NimWhenStmt getWhenStmt() {
    return findChildByClass(NimWhenStmt.class);
  }

  @Override
  @Nullable
  public NimWhileStmt getWhileStmt() {
    return findChildByClass(NimWhileStmt.class);
  }

}
