// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface NimIdent extends NimNamedElement {

  @Nullable
  NimAccQuoted getAccQuoted();

  @Nullable
  NimKeyword getKeyword();

  @Nullable
  NimNilLit getNilLit();

  @NotNull
  String getName();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @NotNull
  PsiElement getNameIdentifier();

  @NotNull
  PsiReference getReference();

}
