// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimarySuffix extends PsiElement {

  @Nullable
  NimBraceSuffix getBraceSuffix();

  @Nullable
  NimBracketSuffix getBracketSuffix();

  @Nullable
  NimCmdStart getCmdStart();

  @Nullable
  NimCommandExpr getCommandExpr();

  @Nullable
  NimDotSuffix getDotSuffix();

  @Nullable
  NimParenSuffix getParenSuffix();

}
