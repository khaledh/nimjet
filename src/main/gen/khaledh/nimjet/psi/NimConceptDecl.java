// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimConceptDecl extends PsiElement {

  @NotNull
  List<NimConceptParam> getConceptParamList();

  @Nullable
  NimPragma getPragma();

  @NotNull
  List<NimTypeDesc> getTypeDescList();

}
