// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimStmtList extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimBreakStmt> getBreakStmtList();

  @NotNull
  List<NimCommentStmt> getCommentStmtList();

  @NotNull
  List<NimContinueStmt> getContinueStmtList();

  @NotNull
  List<NimDiscardStmt> getDiscardStmtList();

  @NotNull
  List<NimExportStmt> getExportStmtList();

  @NotNull
  List<NimExprStmt> getExprStmtList();

  @NotNull
  List<NimFromStmt> getFromStmtList();

  @NotNull
  List<NimImportStmt> getImportStmtList();

  @NotNull
  List<NimIncludeStmt> getIncludeStmtList();

  @NotNull
  List<NimPragmaStmt> getPragmaStmtList();

  @NotNull
  List<NimRaiseStmt> getRaiseStmtList();

  @NotNull
  List<NimReturnStmt> getReturnStmtList();

  @NotNull
  List<NimYieldStmt> getYieldStmtList();

}
