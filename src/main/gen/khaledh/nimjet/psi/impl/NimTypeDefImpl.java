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

public class NimTypeDefImpl extends ASTWrapperPsiElement implements NimTypeDef {

  public NimTypeDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitTypeDef(this);
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
  public NimGenericParamList getGenericParamList() {
    return findChildByClass(NimGenericParamList.class);
  }

  @Override
  @NotNull
  public NimIdentVis getIdentVis() {
    return findNotNullChildByClass(NimIdentVis.class);
  }

  @Override
  @Nullable
  public NimIndAndComment getIndAndComment() {
    return findChildByClass(NimIndAndComment.class);
  }

  @Override
  @Nullable
  public NimPragma getPragma() {
    return findChildByClass(NimPragma.class);
  }

  @Override
  @Nullable
  public NimTypeDefValue getTypeDefValue() {
    return findChildByClass(NimTypeDefValue.class);
  }

}
