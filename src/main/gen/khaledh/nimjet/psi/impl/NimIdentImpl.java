// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static khaledh.nimjet.psi.NimElementTypes.*;
import khaledh.nimjet.psi.*;
import com.intellij.psi.PsiReference;

public class NimIdentImpl extends NimNamedElementImpl implements NimIdent {

  public NimIdentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitIdent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimAccQuoted getAccQuoted() {
    return findChildByClass(NimAccQuoted.class);
  }

  @Override
  @Nullable
  public NimKeyword getKeyword() {
    return findChildByClass(NimKeyword.class);
  }

  @Override
  @Nullable
  public NimNilLit getNilLit() {
    return findChildByClass(NimNilLit.class);
  }

  @Override
  @NotNull
  public String getName() {
    return NimPsiImplUtil.getName(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String newName) {
    return NimPsiImplUtil.setName(this, newName);
  }

  @Override
  @NotNull
  public PsiElement getNameIdentifier() {
    return NimPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  @NotNull
  public PsiReference getReference() {
    return NimPsiImplUtil.getReference(this);
  }

}
