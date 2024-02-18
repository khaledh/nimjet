// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDef extends PsiElement {

  @Nullable
  NimComment getComment();

  @Nullable
  NimGenericParamList getGenericParamList();

  @NotNull
  NimIdentVis getIdentVis();

  @Nullable
  NimIndAndComment getIndAndComment();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimTypeDefValue getTypeDefValue();

}
