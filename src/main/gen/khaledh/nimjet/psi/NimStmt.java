// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimStmt extends PsiElement {

  @Nullable
  NimAsmStmt getAsmStmt();

  @Nullable
  NimBlockStmt getBlockStmt();

  @Nullable
  NimCaseStmt getCaseStmt();

  @Nullable
  NimConstant getConstant();

  @Nullable
  NimDeferStmt getDeferStmt();

  @Nullable
  NimForStmt getForStmt();

  @Nullable
  NimIfStmt getIfStmt();

  @Nullable
  NimRoutine getRoutine();

  @Nullable
  NimSimpleStmt getSimpleStmt();

  @Nullable
  NimStaticStmt getStaticStmt();

  @Nullable
  NimTryStmt getTryStmt();

  @Nullable
  NimTypeDef getTypeDef();

  @Nullable
  NimVariable getVariable();

  @Nullable
  NimWhenStmt getWhenStmt();

  @Nullable
  NimWhileStmt getWhileStmt();

}
