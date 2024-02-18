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

public class NimIdentOrLiteralImpl extends ASTWrapperPsiElement implements NimIdentOrLiteral {

  public NimIdentOrLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitIdentOrLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimArrayConstr getArrayConstr() {
    return findChildByClass(NimArrayConstr.class);
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
  @Nullable
  public NimLiteral getLiteral() {
    return findChildByClass(NimLiteral.class);
  }

  @Override
  @Nullable
  public NimPar getPar() {
    return findChildByClass(NimPar.class);
  }

  @Override
  @Nullable
  public NimSetOrTableConstr getSetOrTableConstr() {
    return findChildByClass(NimSetOrTableConstr.class);
  }

  @Override
  @Nullable
  public NimSymbol getSymbol() {
    return findChildByClass(NimSymbol.class);
  }

  @Override
  @Nullable
  public NimTupleConstr getTupleConstr() {
    return findChildByClass(NimTupleConstr.class);
  }

}
