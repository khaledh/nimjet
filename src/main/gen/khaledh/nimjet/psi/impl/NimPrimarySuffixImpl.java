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

public class NimPrimarySuffixImpl extends ASTWrapperPsiElement implements NimPrimarySuffix {

  public NimPrimarySuffixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPrimarySuffix(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimBraceSuffix getBraceSuffix() {
    return findChildByClass(NimBraceSuffix.class);
  }

  @Override
  @Nullable
  public NimBracketSuffix getBracketSuffix() {
    return findChildByClass(NimBracketSuffix.class);
  }

  @Override
  @Nullable
  public NimCmdStart getCmdStart() {
    return findChildByClass(NimCmdStart.class);
  }

  @Override
  @Nullable
  public NimCommandExpr getCommandExpr() {
    return findChildByClass(NimCommandExpr.class);
  }

  @Override
  @Nullable
  public NimDotSuffix getDotSuffix() {
    return findChildByClass(NimDotSuffix.class);
  }

  @Override
  @Nullable
  public NimParenSuffix getParenSuffix() {
    return findChildByClass(NimParenSuffix.class);
  }

}
