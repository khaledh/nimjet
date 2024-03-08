// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDefValue extends PsiElement {

  @Nullable
  NimConceptDecl getConceptDecl();

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @Nullable
  NimEnumDecl getEnumDecl();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @Nullable
  NimObjectDecl getObjectDecl();

  @NotNull
  List<NimOptExprList> getOptExprListList();

  @NotNull
  List<NimStmtList> getStmtListList();

  @Nullable
  NimTupleDecl getTupleDecl();

}
