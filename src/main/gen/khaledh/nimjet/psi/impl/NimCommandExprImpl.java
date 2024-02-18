// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static khaledh.nimjet.psi.NimTypes.*;
import khaledh.nimjet.psi.*;

public class NimCommandExprImpl extends NimExprImpl implements NimCommandExpr {

  public NimCommandExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitCommandExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NimCommandParamFirst getCommandParamFirst() {
    return findNotNullChildByClass(NimCommandParamFirst.class);
  }

}
