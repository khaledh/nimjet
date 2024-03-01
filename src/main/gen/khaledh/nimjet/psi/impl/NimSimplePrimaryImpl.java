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

public class NimSimplePrimaryImpl extends ASTWrapperPsiElement implements NimSimplePrimary {

  public NimSimplePrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitSimplePrimary(this);
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
  public NimCastExpr getCastExpr() {
    return findChildByClass(NimCastExpr.class);
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
  public NimSetOrTableConstr getSetOrTableConstr() {
    return findChildByClass(NimSetOrTableConstr.class);
  }

  @Override
  @Nullable
  public NimTupleConstr getTupleConstr() {
    return findChildByClass(NimTupleConstr.class);
  }

}
