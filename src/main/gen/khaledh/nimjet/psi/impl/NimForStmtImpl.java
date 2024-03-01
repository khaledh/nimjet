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

public class NimForStmtImpl extends ASTWrapperPsiElement implements NimForStmt {

  public NimForStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitForStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
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
  public NimColonComment getColonComment() {
    return findChildByClass(NimColonComment.class);
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
  @NotNull
  public List<NimPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimPragma.class);
  }

  @Override
  @Nullable
  public NimStmtList getStmtList() {
    return findChildByClass(NimStmtList.class);
  }

  @Override
  @NotNull
  public List<NimVarTuple> getVarTupleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimVarTuple.class);
  }

}
