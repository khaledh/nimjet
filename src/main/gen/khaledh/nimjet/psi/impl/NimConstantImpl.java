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

public class NimConstantImpl extends ASTWrapperPsiElement implements NimConstant {

  public NimConstantImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitConstant(this);
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
  public NimColonComment getColonComment() {
    return findChildByClass(NimColonComment.class);
  }

  @Override
  @Nullable
  public NimExpr getExpr() {
    return findChildByClass(NimExpr.class);
  }

  @Override
  @Nullable
  public NimIdentWithPragma getIdentWithPragma() {
    return findChildByClass(NimIdentWithPragma.class);
  }

  @Override
  @Nullable
  public NimIndAndComment getIndAndComment() {
    return findChildByClass(NimIndAndComment.class);
  }

  @Override
  @Nullable
  public NimTypeDesc getTypeDesc() {
    return findChildByClass(NimTypeDesc.class);
  }

  @Override
  @Nullable
  public NimVarTuple getVarTuple() {
    return findChildByClass(NimVarTuple.class);
  }

}
