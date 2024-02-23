// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimSimplePrimary extends PsiElement {

  @Nullable
  NimComment getComment();

  @NotNull
  NimIdentOrLiteral getIdentOrLiteral();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

}
