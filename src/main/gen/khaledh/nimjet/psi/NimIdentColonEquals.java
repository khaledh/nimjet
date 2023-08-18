// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimIdentColonEquals extends PsiElement {

  @NotNull
  List<NimIdent> getIdentList();

  @Nullable
  NimCommaOptcomment getCommaOptcomment();

  @Nullable
  NimExpr getExpr();

  @Nullable
  NimTypeDesc getTypeDesc();

}
