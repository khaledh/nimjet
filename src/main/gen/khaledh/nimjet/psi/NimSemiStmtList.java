// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimSemiStmtList extends PsiElement {

  @NotNull
  List<NimComment> getCommentList();

  @NotNull
  List<NimAsmStmt> getAsmStmtList();

  @NotNull
  List<NimBlockStmt> getBlockStmtList();

  @NotNull
  List<NimBreakStmt> getBreakStmtList();

  @NotNull
  List<NimCommentStmt> getCommentStmtList();

  @NotNull
  List<NimConstant> getConstantList();

  @NotNull
  List<NimContinueStmt> getContinueStmtList();

  @NotNull
  List<NimDeferStmt> getDeferStmtList();

  @NotNull
  List<NimDiscardStmt> getDiscardStmtList();

  @NotNull
  List<NimExportStmt> getExportStmtList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprStmt> getExprStmtList();

  @NotNull
  List<NimForStmt> getForStmtList();

  @NotNull
  List<NimFromStmt> getFromStmtList();

  @NotNull
  List<NimIdentDefs> getIdentDefsList();

  @NotNull
  List<NimIfStmt> getIfStmtList();

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
  List<NimRoutine> getRoutineList();

  @NotNull
  List<NimStaticStmt> getStaticStmtList();

  @NotNull
  List<NimTryStmt> getTryStmtList();

  @NotNull
  List<NimTypeDef> getTypeDefList();

  @NotNull
  List<NimVarSection> getVarSectionList();

  @NotNull
  List<NimVarTuple> getVarTupleList();

  @NotNull
  List<NimWhenStmt> getWhenStmtList();

  @NotNull
  List<NimWhileStmt> getWhileStmtList();

  @NotNull
  List<NimYieldStmt> getYieldStmtList();

}
