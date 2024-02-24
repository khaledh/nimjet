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

public class NimTypeDefValueImpl extends ASTWrapperPsiElement implements NimTypeDefValue {

  public NimTypeDefValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTypeDefValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimConceptDecl getConceptDecl() {
    return findChildByClass(NimConceptDecl.class);
  }

  @Override
  @Nullable
  public NimEnumDecl getEnumDecl() {
    return findChildByClass(NimEnumDecl.class);
  }

  @Override
  @NotNull
  public List<NimExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExpr.class);
  }

  @Override
  @Nullable
  public NimObjectDecl getObjectDecl() {
    return findChildByClass(NimObjectDecl.class);
  }

  @Override
  @Nullable
  public NimPostExprBlocks getPostExprBlocks() {
    return findChildByClass(NimPostExprBlocks.class);
  }

  @Override
  @Nullable
  public NimTupleDecl getTupleDecl() {
    return findChildByClass(NimTupleDecl.class);
  }

}
