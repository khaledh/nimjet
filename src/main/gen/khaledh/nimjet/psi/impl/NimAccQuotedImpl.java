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

<<<<<<<< HEAD:src/main/gen/khaledh/nimjet/psi/impl/NimVarSectionImpl.java
public class NimVarSectionImpl extends ASTWrapperPsiElement implements NimVarSection {
|||||||| parent of 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimSymbolOrKeywordImpl.java
public class NimSymbolOrKeywordImpl extends ASTWrapperPsiElement implements NimSymbolOrKeyword {
========
public class NimAccQuotedImpl extends ASTWrapperPsiElement implements NimAccQuoted {
>>>>>>>> 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimAccQuotedImpl.java

<<<<<<<< HEAD:src/main/gen/khaledh/nimjet/psi/impl/NimVarSectionImpl.java
  public NimVarSectionImpl(@NotNull ASTNode node) {
|||||||| parent of 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimSymbolOrKeywordImpl.java
  public NimSymbolOrKeywordImpl(@NotNull ASTNode node) {
========
  public NimAccQuotedImpl(@NotNull ASTNode node) {
>>>>>>>> 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimAccQuotedImpl.java
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
<<<<<<<< HEAD:src/main/gen/khaledh/nimjet/psi/impl/NimVarSectionImpl.java
    visitor.visitVarSection(this);
|||||||| parent of 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimSymbolOrKeywordImpl.java
    visitor.visitSymbolOrKeyword(this);
========
    visitor.visitAccQuoted(this);
>>>>>>>> 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimAccQuotedImpl.java
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
<<<<<<<< HEAD:src/main/gen/khaledh/nimjet/psi/impl/NimVarSectionImpl.java
  @Nullable
  public NimIdentDefs getIdentDefs() {
    return findChildByClass(NimIdentDefs.class);
  }

  @Override
  @Nullable
  public NimVarTuple getVarTuple() {
    return findChildByClass(NimVarTuple.class);
|||||||| parent of 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimSymbolOrKeywordImpl.java
  @Nullable
  public NimBuiltInMagics getBuiltInMagics() {
    return findChildByClass(NimBuiltInMagics.class);
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
========
  @NotNull
  public List<NimKeyword> getKeywordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimKeyword.class);
  }

  @Override
  @NotNull
  public List<NimOperator> getOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOperator.class);
>>>>>>>> 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/impl/NimAccQuotedImpl.java
  }

}
