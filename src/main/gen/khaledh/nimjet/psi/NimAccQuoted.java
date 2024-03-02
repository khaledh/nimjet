// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

<<<<<<<< HEAD:src/main/gen/khaledh/nimjet/psi/NimSimpleExpr.java
public interface NimSimpleExpr extends NimExpr {
|||||||| parent of 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/NimSymbolOrKeyword.java
public interface NimSymbolOrKeyword extends PsiElement {
========
public interface NimAccQuoted extends PsiElement {
>>>>>>>> 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/NimAccQuoted.java

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimOp0> getOp0List();

<<<<<<<< HEAD:src/main/gen/khaledh/nimjet/psi/NimSimpleExpr.java
  @Nullable
  NimPragma getPragma();
|||||||| parent of 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/NimSymbolOrKeyword.java
  @Nullable
  NimBuiltInMagics getBuiltInMagics();

  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();
========
  @NotNull
  List<NimKeyword> getKeywordList();

  @NotNull
  List<NimOperator> getOperatorList();
>>>>>>>> 8cd1660 (update grammar):src/main/gen/khaledh/nimjet/psi/NimAccQuoted.java

}
