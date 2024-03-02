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

public class NimRawTypeDescImpl extends ASTWrapperPsiElement implements NimRawTypeDesc {

  public NimRawTypeDescImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitRawTypeDesc(this);
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
  @Nullable
  public NimArrayConstr getArrayConstr() {
    return findChildByClass(NimArrayConstr.class);
  }

  @Override
  @NotNull
  public List<NimDoBlock> getDoBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimDoBlock.class);
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
  @Nullable
  public NimIdent getIdent() {
    return findChildByClass(NimIdent.class);
  }

  @Override
  @Nullable
  public NimLiteral getLiteral() {
    return findChildByClass(NimLiteral.class);
  }

  @Override
  @NotNull
  public List<NimOperator> getOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOperator.class);
  }

  @Override
  @NotNull
  public List<NimOptExprList> getOptExprListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOptExprList.class);
  }

  @Override
  @Nullable
  public NimPar getPar() {
    return findChildByClass(NimPar.class);
  }

  @Override
  @NotNull
  public List<NimPrimarySuffix> getPrimarySuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPrimarySuffix.class);
  }

  @Override
  @Nullable
  public NimRawTypeDesc getRawTypeDesc() {
    return findChildByClass(NimRawTypeDesc.class);
  }

  @Override
  @Nullable
  public NimRoutineType getRoutineType() {
    return findChildByClass(NimRoutineType.class);
  }

  @Override
  @Nullable
  public NimSetOrTableConstr getSetOrTableConstr() {
    return findChildByClass(NimSetOrTableConstr.class);
  }

  @Override
  @NotNull
  public List<NimStmtList> getStmtListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimStmtList.class);
  }

  @Override
  @Nullable
  public NimTupleConstr getTupleConstr() {
    return findChildByClass(NimTupleConstr.class);
  }

  @Override
  @Nullable
  public NimTupleType getTupleType() {
    return findChildByClass(NimTupleType.class);
  }

  @Override
  @Nullable
  public NimTypeDesc getTypeDesc() {
    return findChildByClass(NimTypeDesc.class);
  }

}
