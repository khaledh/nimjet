// This is a generated file. Not intended for manual editing.
package khaledh.nimjet.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class NimVisitor extends PsiElementVisitor {

  public void visitComment(@NotNull NimComment o) {
    visitPsiElement(o);
  }

  public void visitAccQuoted(@NotNull NimAccQuoted o) {
    visitPsiElement(o);
  }

  public void visitAmpExpr(@NotNull NimAmpExpr o) {
    visitBasicExpr(o);
  }

  public void visitAndExpr(@NotNull NimAndExpr o) {
    visitBasicExpr(o);
  }

  public void visitArrayConstr(@NotNull NimArrayConstr o) {
    visitPsiElement(o);
  }

  public void visitArrowExpr(@NotNull NimArrowExpr o) {
    visitBasicExpr(o);
  }

  public void visitAsmStmt(@NotNull NimAsmStmt o) {
    visitPsiElement(o);
  }

  public void visitAssignExpr(@NotNull NimAssignExpr o) {
    visitBasicExpr(o);
  }

  public void visitBasicExpr(@NotNull NimBasicExpr o) {
    visitExpr(o);
  }

  public void visitBlockExpr(@NotNull NimBlockExpr o) {
    visitExpr(o);
  }

  public void visitBlockStmt(@NotNull NimBlockStmt o) {
    visitPsiElement(o);
  }

  public void visitBraceSuffix(@NotNull NimBraceSuffix o) {
    visitPsiElement(o);
  }

  public void visitBracketSuffix(@NotNull NimBracketSuffix o) {
    visitPsiElement(o);
  }

  public void visitBreakStmt(@NotNull NimBreakStmt o) {
    visitPsiElement(o);
  }

  public void visitCaseStmt(@NotNull NimCaseStmt o) {
    visitExpr(o);
  }

  public void visitCastExpr(@NotNull NimCastExpr o) {
    visitPsiElement(o);
  }

  public void visitCmdStart(@NotNull NimCmdStart o) {
    visitPsiElement(o);
  }

  public void visitCmpExpr(@NotNull NimCmpExpr o) {
    visitBasicExpr(o);
  }

  public void visitCommandExpr(@NotNull NimCommandExpr o) {
    visitPsiElement(o);
  }

  public void visitCommandParamExtra(@NotNull NimCommandParamExtra o) {
    visitPsiElement(o);
  }

  public void visitCommandParamFirst(@NotNull NimCommandParamFirst o) {
    visitPsiElement(o);
  }

  public void visitCommentStmt(@NotNull NimCommentStmt o) {
    visitPsiElement(o);
  }

  public void visitConceptDecl(@NotNull NimConceptDecl o) {
    visitPsiElement(o);
  }

  public void visitConceptParam(@NotNull NimConceptParam o) {
    visitPsiElement(o);
  }

  public void visitCondExpr(@NotNull NimCondExpr o) {
    visitPsiElement(o);
  }

  public void visitCondStmt(@NotNull NimCondStmt o) {
    visitPsiElement(o);
  }

  public void visitConstant(@NotNull NimConstant o) {
    visitPsiElement(o);
  }

  public void visitContinueStmt(@NotNull NimContinueStmt o) {
    visitPsiElement(o);
  }

  public void visitDeferStmt(@NotNull NimDeferStmt o) {
    visitPsiElement(o);
  }

  public void visitDiscardStmt(@NotNull NimDiscardStmt o) {
    visitPsiElement(o);
  }

  public void visitDoBlock(@NotNull NimDoBlock o) {
    visitPsiElement(o);
  }

  public void visitDollarExpr(@NotNull NimDollarExpr o) {
    visitBasicExpr(o);
  }

  public void visitDotSuffix(@NotNull NimDotSuffix o) {
    visitPsiElement(o);
  }

  public void visitEnumDecl(@NotNull NimEnumDecl o) {
    visitPsiElement(o);
  }

  public void visitExportStmt(@NotNull NimExportStmt o) {
    visitPsiElement(o);
  }

  public void visitExpr(@NotNull NimExpr o) {
    visitPsiElement(o);
  }

  public void visitExprList(@NotNull NimExprList o) {
    visitPsiElement(o);
  }

  public void visitExprStmt(@NotNull NimExprStmt o) {
    visitPsiElement(o);
  }

  public void visitForExpr(@NotNull NimForExpr o) {
    visitExpr(o);
  }

  public void visitForStmt(@NotNull NimForStmt o) {
    visitPsiElement(o);
  }

  public void visitFromStmt(@NotNull NimFromStmt o) {
    visitPsiElement(o);
  }

  public void visitGenericParam(@NotNull NimGenericParam o) {
    visitPsiElement(o);
  }

  public void visitGenericParamList(@NotNull NimGenericParamList o) {
    visitPsiElement(o);
  }

  public void visitIdent(@NotNull NimIdent o) {
    visitNamedElement(o);
  }

  public void visitIdentDefs(@NotNull NimIdentDefs o) {
    visitPsiElement(o);
  }

  public void visitIfExpr(@NotNull NimIfExpr o) {
    visitExpr(o);
  }

  public void visitIfStmt(@NotNull NimIfStmt o) {
    visitPsiElement(o);
  }

  public void visitImportStmt(@NotNull NimImportStmt o) {
    visitPsiElement(o);
  }

  public void visitIncludeStmt(@NotNull NimIncludeStmt o) {
    visitPsiElement(o);
  }

  public void visitKeyword(@NotNull NimKeyword o) {
    visitPsiElement(o);
  }

  public void visitLiteral(@NotNull NimLiteral o) {
    visitPsiElement(o);
  }

  public void visitMulExpr(@NotNull NimMulExpr o) {
    visitBasicExpr(o);
  }

  public void visitNamedParams(@NotNull NimNamedParams o) {
    visitPsiElement(o);
  }

  public void visitNilLit(@NotNull NimNilLit o) {
    visitPsiElement(o);
  }

  public void visitObjectBranch(@NotNull NimObjectBranch o) {
    visitPsiElement(o);
  }

  public void visitObjectBranches(@NotNull NimObjectBranches o) {
    visitPsiElement(o);
  }

  public void visitObjectCase(@NotNull NimObjectCase o) {
    visitPsiElement(o);
  }

  public void visitObjectDecl(@NotNull NimObjectDecl o) {
    visitPsiElement(o);
  }

  public void visitObjectPart(@NotNull NimObjectPart o) {
    visitPsiElement(o);
  }

  public void visitObjectPartItem(@NotNull NimObjectPartItem o) {
    visitPsiElement(o);
  }

  public void visitObjectWhen(@NotNull NimObjectWhen o) {
    visitPsiElement(o);
  }

  public void visitOfBranches(@NotNull NimOfBranches o) {
    visitPsiElement(o);
  }

  public void visitOperator(@NotNull NimOperator o) {
    visitPsiElement(o);
  }

  public void visitOptExprList(@NotNull NimOptExprList o) {
    visitPsiElement(o);
  }

  public void visitOptionalExprList(@NotNull NimOptionalExprList o) {
    visitPsiElement(o);
  }

  public void visitOrExpr(@NotNull NimOrExpr o) {
    visitBasicExpr(o);
  }

  public void visitPar(@NotNull NimPar o) {
    visitPsiElement(o);
  }

  public void visitParKeyword(@NotNull NimParKeyword o) {
    visitPsiElement(o);
  }

  public void visitParamList(@NotNull NimParamList o) {
    visitPsiElement(o);
  }

  public void visitParamListArrow(@NotNull NimParamListArrow o) {
    visitPsiElement(o);
  }

  public void visitParenSuffix(@NotNull NimParenSuffix o) {
    visitPsiElement(o);
  }

  public void visitPattern(@NotNull NimPattern o) {
    visitPsiElement(o);
  }

  public void visitPlusExpr(@NotNull NimPlusExpr o) {
    visitBasicExpr(o);
  }

  public void visitPragma(@NotNull NimPragma o) {
    visitPsiElement(o);
  }

  public void visitPragmaStmt(@NotNull NimPragmaStmt o) {
    visitPsiElement(o);
  }

  public void visitPrimaryExpr(@NotNull NimPrimaryExpr o) {
    visitBasicExpr(o);
  }

  public void visitPrimarySuffix(@NotNull NimPrimarySuffix o) {
    visitPsiElement(o);
  }

  public void visitRaiseStmt(@NotNull NimRaiseStmt o) {
    visitPsiElement(o);
  }

  public void visitRawTypeDesc(@NotNull NimRawTypeDesc o) {
    visitPsiElement(o);
  }

  public void visitReturnStmt(@NotNull NimReturnStmt o) {
    visitPsiElement(o);
  }

  public void visitRoutine(@NotNull NimRoutine o) {
    visitPsiElement(o);
  }

  public void visitRoutineExpr(@NotNull NimRoutineExpr o) {
    visitPsiElement(o);
  }

  public void visitRoutineType(@NotNull NimRoutineType o) {
    visitPsiElement(o);
  }

  public void visitSemiStmtList(@NotNull NimSemiStmtList o) {
    visitPsiElement(o);
  }

  public void visitSetOrTableConstr(@NotNull NimSetOrTableConstr o) {
    visitPsiElement(o);
  }

  public void visitSimpleExpr(@NotNull NimSimpleExpr o) {
    visitBasicExpr(o);
  }

  public void visitSliceExpr(@NotNull NimSliceExpr o) {
    visitBasicExpr(o);
  }

  public void visitStaticStmt(@NotNull NimStaticStmt o) {
    visitPsiElement(o);
  }

  public void visitStmtList(@NotNull NimStmtList o) {
    visitPsiElement(o);
  }

  public void visitTryExpr(@NotNull NimTryExpr o) {
    visitExpr(o);
  }

  public void visitTryStmt(@NotNull NimTryStmt o) {
    visitPsiElement(o);
  }

  public void visitTupleConstr(@NotNull NimTupleConstr o) {
    visitPsiElement(o);
  }

  public void visitTupleDecl(@NotNull NimTupleDecl o) {
    visitPsiElement(o);
  }

  public void visitTupleType(@NotNull NimTupleType o) {
    visitPsiElement(o);
  }

  public void visitTupleTypeBracket(@NotNull NimTupleTypeBracket o) {
    visitPsiElement(o);
  }

  public void visitTypeDef(@NotNull NimTypeDef o) {
    visitPsiElement(o);
  }

  public void visitTypeDefValue(@NotNull NimTypeDefValue o) {
    visitPsiElement(o);
  }

  public void visitTypeDesc(@NotNull NimTypeDesc o) {
    visitPsiElement(o);
  }

  public void visitTypeDescExpr(@NotNull NimTypeDescExpr o) {
    visitPsiElement(o);
  }

  public void visitVarSection(@NotNull NimVarSection o) {
    visitPsiElement(o);
  }

  public void visitVarTuple(@NotNull NimVarTuple o) {
    visitPsiElement(o);
  }

  public void visitWhenExpr(@NotNull NimWhenExpr o) {
    visitExpr(o);
  }

  public void visitWhenStmt(@NotNull NimWhenStmt o) {
    visitPsiElement(o);
  }

  public void visitWhileStmt(@NotNull NimWhileStmt o) {
    visitPsiElement(o);
  }

  public void visitYieldStmt(@NotNull NimYieldStmt o) {
    visitPsiElement(o);
  }

  public void visitNamedElement(@NotNull NimNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
