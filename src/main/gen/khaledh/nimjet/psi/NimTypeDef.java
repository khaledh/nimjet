// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDef extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @Nullable
  NimGenericParamList getGenericParamList();

  @NotNull
  NimIdent getIdent();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimTypeDefValue getTypeDefValue();

}
