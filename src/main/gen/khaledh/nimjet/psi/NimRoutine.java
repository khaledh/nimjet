// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimRoutine extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @Nullable
  NimGenericParamList getGenericParamList();

  @NotNull
  NimIdent getIdent();

  @Nullable
  NimParamList getParamList();

  @Nullable
  NimPattern getPattern();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimStmtList getStmtList();

  @Nullable
  NimTypeDesc getTypeDesc();

}
