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

public class NimPostExprBlocksImpl extends ASTWrapperPsiElement implements NimPostExprBlocks {

  public NimPostExprBlocksImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitPostExprBlocks(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimDoBlock getDoBlock() {
    return findChildByClass(NimDoBlock.class);
  }

  @Override
  @NotNull
  public List<NimExtraPostExprBlock> getExtraPostExprBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimExtraPostExprBlock.class);
  }

  @Override
  @Nullable
  public NimStmtList getStmtList() {
    return findChildByClass(NimStmtList.class);
  }

}
