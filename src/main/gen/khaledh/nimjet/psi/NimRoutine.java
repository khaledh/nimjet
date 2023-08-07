// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimRoutine extends PsiElement {

  @NotNull
  NimIdentVis getIdentVis();

  @NotNull
  NimIndAndComment getIndAndComment();

  @NotNull
  NimIndopt getIndopt();

  @NotNull
  NimParamListColon getParamListColon();

  @Nullable
  NimPattern getPattern();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimStmtList getStmtList();

}
