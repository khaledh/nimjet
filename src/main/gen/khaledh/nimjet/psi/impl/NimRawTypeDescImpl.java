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
  public NimArrayConstr getArrayConstr() {
    return findChildByClass(NimArrayConstr.class);
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
  public NimExprColonEqExprList getExprColonEqExprList() {
    return findChildByClass(NimExprColonEqExprList.class);
  }

  @Override
  @NotNull
  public List<NimKeyword> getKeywordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimKeyword.class);
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
