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

public class NimExprStartImpl extends ASTWrapperPsiElement implements NimExprStart {

  public NimExprStartImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitExprStart(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimIdent getIdent() {
    return findChildByClass(NimIdent.class);
  }

  @Override
  @Nullable
  public NimOpr getOpr() {
    return findChildByClass(NimOpr.class);
  }

  @Override
  @Nullable
  public NimBuiltInMagics getBuiltInMagics() {
    return findChildByClass(NimBuiltInMagics.class);
  }

  @Override
  @Nullable
  public NimLiteral getLiteral() {
    return findChildByClass(NimLiteral.class);
  }

}
