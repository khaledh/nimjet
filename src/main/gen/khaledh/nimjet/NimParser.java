// This is a generated file. Not intended for manual editing.
package khaledh.nimjet;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static khaledh.nimjet.psi.NimTypes.*;
import static khaledh.nimjet.NimParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NimParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(AMP_EXPR, AND_EXPR, ARROW_EXPR, ASSIGN_EXPR,
      BLOCK_EXPR, CAST_EXPR, CMP_EXPR, COMMAND_EXPR,
      COND_EXPR, DOLLAR_EXPR, EXPR, EXPR_COLON_EQ_EXPR,
      EXPR_EQ_EXPR, FOR_EXPR, IF_EXPR, MUL_EXPR,
      OR_EXPR, PLUS_EXPR, PRIMARY_EXPR, ROUTINE_EXPR,
      SIMPLE_EXPR, SLICE_EXPR, TRY_EXPR, TYPE_DESC_EXPR,
      WHEN_EXPR),
  };

  /* ********************************************************** */
  // LINE_COMMENT | MULTILINE_COMMENT | MULTILINE_COMMENT_ERROR
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, MULTILINE_COMMENT);
    if (!r) r = consumeToken(b, MULTILINE_COMMENT_ERROR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID
  //                         | BOOL | TRUE | FALSE
  //                         | CHAR | STRING | CSTRING
  //                         | INT | INT8 | INT16 | INT32 | INT64
  //                         | UINT | UINT8 | UINT16 | UINT32 | UINT64
  //                         | FLOAT | FLOAT32 | FLOAT64
  //                         | ARRAY | SEQ | OPENARRAY | SET | UNCHECKEDARRAY | VOID | UNTYPED
  //                         | AUTO | VARARGS
  public static boolean IDENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IDENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT, "<ident>");
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CSTRING);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, INT8);
    if (!r) r = consumeToken(b, INT16);
    if (!r) r = consumeToken(b, INT32);
    if (!r) r = consumeToken(b, INT64);
    if (!r) r = consumeToken(b, UINT);
    if (!r) r = consumeToken(b, UINT8);
    if (!r) r = consumeToken(b, UINT16);
    if (!r) r = consumeToken(b, UINT32);
    if (!r) r = consumeToken(b, UINT64);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, FLOAT32);
    if (!r) r = consumeToken(b, FLOAT64);
    if (!r) r = consumeToken(b, ARRAY);
    if (!r) r = consumeToken(b, SEQ);
    if (!r) r = consumeToken(b, OPENARRAY);
    if (!r) r = consumeToken(b, SET);
    if (!r) r = consumeToken(b, UNCHECKEDARRAY);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, UNTYPED);
    if (!r) r = consumeToken(b, AUTO);
    if (!r) r = consumeToken(b, VARARGS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_ARROW | OP_ARROW_LIKE
  public static boolean OP0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OP0")) return false;
    if (!nextTokenIs(b, "<op 0>", OP_ARROW, OP_ARROW_LIKE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_0, "<op 0>");
    r = consumeToken(b, OP_ARROW);
    if (!r) r = consumeToken(b, OP_ARROW_LIKE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OR | XOR
  static boolean OP3_KW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OP3_KW")) return false;
    if (!nextTokenIs(b, "", OR, XOR)) return false;
    boolean r;
    r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, XOR);
    return r;
  }

  /* ********************************************************** */
  // AND
  static boolean OP4_KW(PsiBuilder b, int l) {
    return consumeToken(b, AND);
  }

  /* ********************************************************** */
  // IN | NOTIN | IS | ISNOT | NOT | OF | AS
  static boolean OP5_KW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OP5_KW")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, NOTIN);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, ISNOT);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, OF);
    if (!r) r = consumeToken(b, AS);
    return r;
  }

  /* ********************************************************** */
  // DOTDOT | OP_DOTLIKE
  public static boolean OP6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OP6")) return false;
    if (!nextTokenIs(b, "<op 6>", DOTDOT, OP_DOTLIKE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_6, "<op 6>");
    r = consumeToken(b, DOTDOT);
    if (!r) r = consumeToken(b, OP_DOTLIKE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DIV | MOD | SHL | SHR
  static boolean OP9_KW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OP9_KW")) return false;
    boolean r;
    r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, SHL);
    if (!r) r = consumeToken(b, SHR);
    return r;
  }

  /* ********************************************************** */
  // OP0 | OP1 | OP2 | OP3 | OP4 | OP5 | OP6 | OP7 | OP8 | OP9 | OP10
  public static boolean OPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPR, "<opr>");
    r = OP0(b, l + 1);
    if (!r) r = consumeToken(b, OP1);
    if (!r) r = consumeToken(b, OP2);
    if (!r) r = consumeToken(b, OP3);
    if (!r) r = consumeToken(b, OP4);
    if (!r) r = consumeToken(b, OP5);
    if (!r) r = OP6(b, l + 1);
    if (!r) r = consumeToken(b, OP7);
    if (!r) r = consumeToken(b, OP8);
    if (!r) r = consumeToken(b, OP9);
    if (!r) r = consumeToken(b, OP10);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // plus_expr (&INDNONE OP7 INDGTEOPT plus_expr)*
  public static boolean amp_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "amp_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, AMP_EXPR, "<Expression>");
    r = plus_expr(b, l + 1);
    r = r && amp_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE OP7 INDGTEOPT plus_expr)*
  private static boolean amp_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "amp_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!amp_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "amp_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE OP7 INDGTEOPT plus_expr
  private static boolean amp_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "amp_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = amp_expr_1_0_0(b, l + 1);
    r = r && consumeTokenFast(b, OP7);
    r = r && optGTEIndent(b, l + 1);
    r = r && plus_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean amp_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "amp_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cmp_expr (&INDNONE (OP4|OP4_KW) INDGTEOPT cmp_expr)*
  public static boolean and_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, AND_EXPR, "<Expression>");
    r = cmp_expr(b, l + 1);
    r = r && and_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE (OP4|OP4_KW) INDGTEOPT cmp_expr)*
  private static boolean and_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!and_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE (OP4|OP4_KW) INDGTEOPT cmp_expr
  private static boolean and_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = and_expr_1_0_0(b, l + 1);
    r = r && and_expr_1_0_1(b, l + 1);
    r = r && optGTEIndent(b, l + 1);
    r = r && cmp_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean and_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP4|OP4_KW
  private static boolean and_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1_0_1")) return false;
    boolean r;
    r = consumeTokenFast(b, OP4);
    if (!r) r = OP4_KW(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (<<p1>> <<p2>>) | <<p1>> | <<p2>>
  static boolean and_or(PsiBuilder b, int l, Parser _p1, Parser _p2) {
    if (!recursion_guard_(b, l, "and_or")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = and_or_0(b, l + 1, _p1, _p2);
    if (!r) r = _p1.parse(b, l);
    if (!r) r = _p2.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<p1>> <<p2>>
  private static boolean and_or_0(PsiBuilder b, int l, Parser _p1, Parser _p2) {
    if (!recursion_guard_(b, l, "and_or_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p1.parse(b, l);
    r = r && _p2.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET optind expr_colon_eq_expr_list? optpar RBRACKET
  public static boolean array_constr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_constr")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CONSTR, null);
    r = consumeToken(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, array_constr_2(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expr_colon_eq_expr_list?
  private static boolean array_constr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_constr_2")) return false;
    expr_colon_eq_expr_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // assign_expr (&INDNONE OP1 INDGTEOPT assign_expr)*
  public static boolean arrow_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrow_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ARROW_EXPR, "<Expression>");
    r = assign_expr(b, l + 1);
    r = r && arrow_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE OP1 INDGTEOPT assign_expr)*
  private static boolean arrow_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrow_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrow_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrow_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE OP1 INDGTEOPT assign_expr
  private static boolean arrow_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrow_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrow_expr_1_0_0(b, l + 1);
    r = r && consumeTokenFast(b, OP1);
    r = r && optGTEIndent(b, l + 1);
    r = r && assign_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean arrow_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrow_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ASM pragma? (STR_LIT | RSTR_LIT | TRIPLESTR_LIT | STR_ERROR | TRIPLESTR_ERROR)
  public static boolean asm_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asm_stmt")) return false;
    if (!nextTokenIs(b, ASM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASM_STMT, null);
    r = consumeToken(b, ASM);
    p = r; // pin = 1
    r = r && report_error_(b, asm_stmt_1(b, l + 1));
    r = p && asm_stmt_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // pragma?
  private static boolean asm_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asm_stmt_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  // STR_LIT | RSTR_LIT | TRIPLESTR_LIT | STR_ERROR | TRIPLESTR_ERROR
  private static boolean asm_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asm_stmt_2")) return false;
    boolean r;
    r = consumeToken(b, STR_LIT);
    if (!r) r = consumeToken(b, RSTR_LIT);
    if (!r) r = consumeToken(b, TRIPLESTR_LIT);
    if (!r) r = consumeToken(b, STR_ERROR);
    if (!r) r = consumeToken(b, TRIPLESTR_ERROR);
    return r;
  }

  /* ********************************************************** */
  // or_expr (&INDNONE OP2 INDGTEOPT or_expr)*
  public static boolean assign_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ASSIGN_EXPR, "<Expression>");
    r = or_expr(b, l + 1);
    r = r && assign_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE OP2 INDGTEOPT or_expr)*
  private static boolean assign_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!assign_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assign_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE OP2 INDGTEOPT or_expr
  private static boolean assign_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assign_expr_1_0_0(b, l + 1);
    r = r && consumeTokenFast(b, OP2);
    r = r && optGTEIndent(b, l + 1);
    r = r && or_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean assign_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BLOCK symbol? colon_comment stmt_list
  public static boolean block_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_expr")) return false;
    if (!nextTokenIsFast(b, BLOCK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_EXPR, "<Expression>");
    r = consumeTokenFast(b, BLOCK);
    p = r; // pin = 1
    r = r && report_error_(b, block_expr_1(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // symbol?
  private static boolean block_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_expr_1")) return false;
    symbol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BLOCK symbol? colon_comment stmt_list
  public static boolean block_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_stmt")) return false;
    if (!nextTokenIs(b, BLOCK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STMT, null);
    r = consumeToken(b, BLOCK);
    p = r; // pin = 1
    r = r && report_error_(b, block_stmt_1(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // symbol?
  private static boolean block_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_stmt_1")) return false;
    symbol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE optind expr_colon_eq_expr_list optpar RBRACE
  public static boolean brace_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brace_suffix")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BRACE_SUFFIX, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, expr_colon_eq_expr_list(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LBRACKET optind expr_colon_eq_expr_list optpar RBRACKET
  public static boolean bracket_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_suffix")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BRACKET_SUFFIX, null);
    r = consumeToken(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, expr_colon_eq_expr_list(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BREAK <<maybeind expr>>?
  public static boolean break_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_stmt")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STMT, null);
    r = consumeToken(b, BREAK);
    p = r; // pin = 1
    r = r && break_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<maybeind expr>>?
  private static boolean break_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_stmt_1")) return false;
    maybeind(b, l + 1, NimParser::expr);
    return true;
  }

  /* ********************************************************** */
  // TYPE | STATIC | ADDR
  public static boolean built_in_magics(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "built_in_magics")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_MAGICS, "<built in magics>");
    r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, ADDR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CASE expr COLON? COMMENT?
  //                           ( &INDGT <<indented of_branches>>
  //                           | INDEQ of_branches
  //                           )
  public static boolean case_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_STMT, null);
    r = consumeToken(b, CASE);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, case_stmt_2(b, l + 1)) && r;
    r = p && report_error_(b, case_stmt_3(b, l + 1)) && r;
    r = p && case_stmt_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COLON?
  private static boolean case_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_2")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // COMMENT?
  private static boolean case_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_3")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // &INDGT <<indented of_branches>>
  //                           | INDEQ of_branches
  private static boolean case_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_stmt_4_0(b, l + 1);
    if (!r) r = case_stmt_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGT <<indented of_branches>>
  private static boolean case_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_stmt_4_0_0(b, l + 1);
    r = r && indented(b, l + 1, NimParser::of_branches);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGT
  private static boolean case_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indGreaterThan(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INDEQ of_branches
  private static boolean case_stmt_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_stmt_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && of_branches(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CAST (LBRACKET optind type_desc optpar RBRACKET LPAREN optind expr optpar RPAREN)
  //                         | (LPAREN optind expr_colon_eq_expr optpar RPAREN)
  public static boolean cast_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr")) return false;
    if (!nextTokenIsFast(b, CAST, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAST_EXPR, "<Expression>");
    r = cast_expr_0(b, l + 1);
    if (!r) r = cast_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CAST (LBRACKET optind type_desc optpar RBRACKET LPAREN optind expr optpar RPAREN)
  private static boolean cast_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, CAST);
    p = r; // pin = 1
    r = r && cast_expr_0_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LBRACKET optind type_desc optpar RBRACKET LPAREN optind expr optpar RPAREN
  private static boolean cast_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr_0_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, type_desc(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && report_error_(b, consumeTokens(b, -1, RBRACKET, LPAREN)) && r;
    r = p && report_error_(b, optind(b, l + 1)) && r;
    r = p && report_error_(b, expr(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LPAREN optind expr_colon_eq_expr optpar RPAREN
  private static boolean cast_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expr_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokenFast(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, expr_colon_eq_expr(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // slice_expr (&INDNONE (OP5|OP5_KW) INDGTEOPT slice_expr)*
  public static boolean cmp_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmp_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, CMP_EXPR, "<Expression>");
    r = slice_expr(b, l + 1);
    r = r && cmp_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE (OP5|OP5_KW) INDGTEOPT slice_expr)*
  private static boolean cmp_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmp_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cmp_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cmp_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE (OP5|OP5_KW) INDGTEOPT slice_expr
  private static boolean cmp_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmp_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cmp_expr_1_0_0(b, l + 1);
    r = r && cmp_expr_1_0_1(b, l + 1);
    r = r && optGTEIndent(b, l + 1);
    r = r && slice_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean cmp_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmp_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP5|OP5_KW
  private static boolean cmp_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmp_expr_1_0_1")) return false;
    boolean r;
    r = consumeTokenFast(b, OP5);
    if (!r) r = OP5_KW(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // colon_comment stmt_list post_expr_blocks?
  public static boolean colon_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon_body")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    r = r && colon_body_2(b, l + 1);
    exit_section_(b, m, COLON_BODY, r);
    return r;
  }

  // post_expr_blocks?
  private static boolean colon_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon_body_2")) return false;
    post_expr_blocks(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON COMMENT?
  public static boolean colon_comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon_comment")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COLON_COMMENT, null);
    r = consumeToken(b, COLON);
    p = r; // pin = 1
    r = r && colon_comment_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMENT?
  private static boolean colon_comment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon_comment_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON optind type_desc
  static boolean colon_type_desc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colon_type_desc")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COLON);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && type_desc(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // COMMA COMMENT?
  public static boolean comma_optcomment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_optcomment")) return false;
    if (!nextTokenIs(b, COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && comma_optcomment_1(b, l + 1);
    exit_section_(b, m, COMMA_OPTCOMMENT, r);
    return r;
  }

  // COMMENT?
  private static boolean comma_optcomment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_optcomment_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // command_param_first
  public static boolean command_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_EXPR, "<Expression>");
    r = command_param_first(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr_eq_expr
  public static boolean command_param_extra(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_param_extra")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_PARAM_EXTRA, "<command param extra>");
    r = expr_eq_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr post_expr_blocks?
  public static boolean command_param_first(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_param_first")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_PARAM_FIRST, "<command param first>");
    r = expr(b, l + 1);
    r = r && command_param_first_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // post_expr_blocks?
  private static boolean command_param_first_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_param_first_1")) return false;
    post_expr_blocks(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COMMENT
  public static boolean comment_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_STMT, "<comment stmt>");
    r = COMMENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONCEPT <<optlist concept_param COMMA>> (pragma)? (OF <<optlist type_desc COMMA>>)?
  //                           <<indented stmt_list>>
  public static boolean concept_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_decl")) return false;
    if (!nextTokenIs(b, CONCEPT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONCEPT);
    r = r && optlist(b, l + 1, NimParser::concept_param, COMMA_parser_);
    r = r && concept_decl_2(b, l + 1);
    r = r && concept_decl_3(b, l + 1);
    r = r && indented(b, l + 1, NimParser::stmt_list);
    exit_section_(b, m, CONCEPT_DECL, r);
    return r;
  }

  // (pragma)?
  private static boolean concept_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_decl_2")) return false;
    concept_decl_2_0(b, l + 1);
    return true;
  }

  // (pragma)
  private static boolean concept_decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pragma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OF <<optlist type_desc COMMA>>)?
  private static boolean concept_decl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_decl_3")) return false;
    concept_decl_3_0(b, l + 1);
    return true;
  }

  // OF <<optlist type_desc COMMA>>
  private static boolean concept_decl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_decl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OF);
    r = r && optlist(b, l + 1, NimParser::type_desc, COMMA_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (VAR | OUT)? symbol
  public static boolean concept_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCEPT_PARAM, "<concept param>");
    r = concept_param_0(b, l + 1);
    r = r && symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (VAR | OUT)?
  private static boolean concept_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_param_0")) return false;
    concept_param_0_0(b, l + 1);
    return true;
  }

  // VAR | OUT
  private static boolean concept_param_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concept_param_0_0")) return false;
    boolean r;
    r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, OUT);
    return r;
  }

  /* ********************************************************** */
  // optind expr colon_comment stmt_list COMMENT?
  //                           (ELIF optind expr colon_comment stmt_list COMMENT?)*
  //                           ELSE colon_comment stmt_list
  public static boolean cond_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_EXPR, "<Expression>");
    r = optind(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    r = r && cond_expr_4(b, l + 1);
    r = r && cond_expr_5(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean cond_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr_4")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // (ELIF optind expr colon_comment stmt_list COMMENT?)*
  private static boolean cond_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cond_expr_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cond_expr_5", c)) break;
    }
    return true;
  }

  // ELIF optind expr colon_comment stmt_list COMMENT?
  private static boolean cond_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, ELIF);
    r = r && optind(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    r = r && cond_expr_5_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean cond_expr_5_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_expr_5_0_5")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr colon_comment stmt_list COMMENT?
  //                           (INDEQ ELIF expr colon_comment stmt_list)*
  //                           (INDEQ ELSE colon_comment stmt_list)?
  public static boolean cond_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_stmt")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COND_STMT, "<cond stmt>");
    r = expr(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && report_error_(b, stmt_list(b, l + 1)) && r;
    r = p && report_error_(b, cond_stmt_3(b, l + 1)) && r;
    r = p && report_error_(b, cond_stmt_4(b, l + 1)) && r;
    r = p && cond_stmt_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMENT?
  private static boolean cond_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_stmt_3")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // (INDEQ ELIF expr colon_comment stmt_list)*
  private static boolean cond_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cond_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cond_stmt_4", c)) break;
    }
    return true;
  }

  // INDEQ ELIF expr colon_comment stmt_list
  private static boolean cond_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, ELIF);
    r = r && expr(b, l + 1);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INDEQ ELSE colon_comment stmt_list)?
  private static boolean cond_stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_stmt_5")) return false;
    cond_stmt_5_0(b, l + 1);
    return true;
  }

  // INDEQ ELSE colon_comment stmt_list
  private static boolean cond_stmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_stmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (var_tuple | ident_with_pragma) (colon_comment type_desc)?
  //                           EQUALS optind expr ind_and_comment
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = constant_0(b, l + 1);
    r = r && constant_1(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    p = r; // pin = 3
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, expr(b, l + 1)) && r;
    r = p && ind_and_comment(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // var_tuple | ident_with_pragma
  private static boolean constant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_0")) return false;
    boolean r;
    r = var_tuple(b, l + 1);
    if (!r) r = ident_with_pragma(b, l + 1);
    return r;
  }

  // (colon_comment type_desc)?
  private static boolean constant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_1")) return false;
    constant_1_0(b, l + 1);
    return true;
  }

  // colon_comment type_desc
  private static boolean constant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = colon_comment(b, l + 1);
    r = r && type_desc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE <<maybeind expr>>?
  public static boolean continue_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_stmt")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STMT, null);
    r = consumeToken(b, CONTINUE);
    p = r; // pin = 1
    r = r && continue_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<maybeind expr>>?
  private static boolean continue_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_stmt_1")) return false;
    maybeind(b, l + 1, NimParser::expr);
    return true;
  }

  /* ********************************************************** */
  // <<list ident_with_pragma COMMA>> COMMA?
  //                           (COLON optind type_desc_expr)? (EQUALS optind expr)?
  public static boolean decl_colon_equals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_colon_equals")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_COLON_EQUALS, "<decl colon equals>");
    r = list(b, l + 1, NimParser::ident_with_pragma, COMMA_parser_);
    r = r && decl_colon_equals_1(b, l + 1);
    r = r && decl_colon_equals_2(b, l + 1);
    r = r && decl_colon_equals_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA?
  private static boolean decl_colon_equals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_colon_equals_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // (COLON optind type_desc_expr)?
  private static boolean decl_colon_equals_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_colon_equals_2")) return false;
    decl_colon_equals_2_0(b, l + 1);
    return true;
  }

  // COLON optind type_desc_expr
  private static boolean decl_colon_equals_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_colon_equals_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COLON);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && type_desc_expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (EQUALS optind expr)?
  private static boolean decl_colon_equals_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_colon_equals_3")) return false;
    decl_colon_equals_3_0(b, l + 1);
    return true;
  }

  // EQUALS optind expr
  private static boolean decl_colon_equals_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_colon_equals_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EQUALS);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DEFER colon_comment stmt_list
  public static boolean defer_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defer_stmt")) return false;
    if (!nextTokenIs(b, DEFER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFER_STMT, null);
    r = consumeToken(b, DEFER);
    p = r; // pin = 1
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DISCARD <<maybeind expr>>?
  public static boolean discard_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discard_stmt")) return false;
    if (!nextTokenIs(b, DISCARD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DISCARD_STMT, null);
    r = consumeToken(b, DISCARD);
    p = r; // pin = 1
    r = r && discard_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<maybeind expr>>?
  private static boolean discard_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discard_stmt_1")) return false;
    maybeind(b, l + 1, NimParser::expr);
    return true;
  }

  /* ********************************************************** */
  // DO param_list_arrow pragma? colon_comment stmt_list
  public static boolean do_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_block")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DO_BLOCK, null);
    r = consumeToken(b, DO);
    p = r; // pin = 1
    r = r && report_error_(b, param_list_arrow(b, l + 1));
    r = p && report_error_(b, do_block_2(b, l + 1)) && r;
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // pragma?
  private static boolean do_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_block_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // primary_expr (&INDNONE OP10 INDGTEOPT primary_expr)*
  public static boolean dollar_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollar_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, DOLLAR_EXPR, "<Expression>");
    r = primary_expr(b, l + 1);
    r = r && dollar_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE OP10 INDGTEOPT primary_expr)*
  private static boolean dollar_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollar_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dollar_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dollar_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE OP10 INDGTEOPT primary_expr
  private static boolean dollar_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollar_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dollar_expr_1_0_0(b, l + 1);
    r = r && consumeTokenFast(b, OP10);
    r = r && optGTEIndent(b, l + 1);
    r = r && primary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean dollar_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dollar_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_DOTLIKE optind symbol_or_keyword
  public static boolean dot_like_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_like_suffix")) return false;
    if (!nextTokenIs(b, OP_DOTLIKE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DOT_LIKE_SUFFIX, null);
    r = consumeToken(b, OP_DOTLIKE);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && symbol_or_keyword(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DOT optind symbol_or_keyword
  //                           ( &NOSPACE LBRACKET_COLON expr_list RBRACKET
  //                             (&NOSPACE LPAREN expr_colon_eq_expr RPAREN)?
  //                           )?
  public static boolean dot_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_suffix")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DOT_SUFFIX, null);
    r = consumeToken(b, DOT);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, symbol_or_keyword(b, l + 1)) && r;
    r = p && dot_suffix_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( &NOSPACE LBRACKET_COLON expr_list RBRACKET
  //                             (&NOSPACE LPAREN expr_colon_eq_expr RPAREN)?
  //                           )?
  private static boolean dot_suffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_suffix_3")) return false;
    dot_suffix_3_0(b, l + 1);
    return true;
  }

  // &NOSPACE LBRACKET_COLON expr_list RBRACKET
  //                             (&NOSPACE LPAREN expr_colon_eq_expr RPAREN)?
  private static boolean dot_suffix_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_suffix_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = dot_suffix_3_0_0(b, l + 1);
    r = r && consumeToken(b, LBRACKET_COLON);
    p = r; // pin = 2
    r = r && report_error_(b, expr_list(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RBRACKET)) && r;
    r = p && dot_suffix_3_0_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &NOSPACE
  private static boolean dot_suffix_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_suffix_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = noSpace(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&NOSPACE LPAREN expr_colon_eq_expr RPAREN)?
  private static boolean dot_suffix_3_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_suffix_3_0_4")) return false;
    dot_suffix_3_0_4_0(b, l + 1);
    return true;
  }

  // &NOSPACE LPAREN expr_colon_eq_expr RPAREN
  private static boolean dot_suffix_3_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_suffix_3_0_4_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = dot_suffix_3_0_4_0_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, expr_colon_eq_expr(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &NOSPACE
  private static boolean dot_suffix_3_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_suffix_3_0_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = noSpace(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ENUM optind
  //                           ( &INDGTOPT symbol pragma?
  //                             (&INDNONE EQUALS optind expr (&INDGTEOPT COMMENT)?)?
  //                             ( &INDNONE COMMA COMMENT? | &INDGTEOPT COMMENT? )?
  //                           )+
  public static boolean enum_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECL, null);
    r = consumeToken(b, ENUM);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && enum_decl_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( &INDGTOPT symbol pragma?
  //                             (&INDNONE EQUALS optind expr (&INDGTEOPT COMMENT)?)?
  //                             ( &INDNONE COMMA COMMENT? | &INDGTEOPT COMMENT? )?
  //                           )+
  private static boolean enum_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_decl_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!enum_decl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_decl_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGTOPT symbol pragma?
  //                             (&INDNONE EQUALS optind expr (&INDGTEOPT COMMENT)?)?
  //                             ( &INDNONE COMMA COMMENT? | &INDGTEOPT COMMENT? )?
  private static boolean enum_decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_decl_2_0_0(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && enum_decl_2_0_2(b, l + 1);
    r = r && enum_decl_2_0_3(b, l + 1);
    r = r && enum_decl_2_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGTOPT
  private static boolean enum_decl_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = optGTIndent(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean enum_decl_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  // (&INDNONE EQUALS optind expr (&INDGTEOPT COMMENT)?)?
  private static boolean enum_decl_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_3")) return false;
    enum_decl_2_0_3_0(b, l + 1);
    return true;
  }

  // &INDNONE EQUALS optind expr (&INDGTEOPT COMMENT)?
  private static boolean enum_decl_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_decl_2_0_3_0_0(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && optind(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && enum_decl_2_0_3_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean enum_decl_2_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDGTEOPT COMMENT)?
  private static boolean enum_decl_2_0_3_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_3_0_4")) return false;
    enum_decl_2_0_3_0_4_0(b, l + 1);
    return true;
  }

  // &INDGTEOPT COMMENT
  private static boolean enum_decl_2_0_3_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_3_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_decl_2_0_3_0_4_0_0(b, l + 1);
    r = r && COMMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGTEOPT
  private static boolean enum_decl_2_0_3_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_3_0_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = optGTEIndent(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( &INDNONE COMMA COMMENT? | &INDGTEOPT COMMENT? )?
  private static boolean enum_decl_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4")) return false;
    enum_decl_2_0_4_0(b, l + 1);
    return true;
  }

  // &INDNONE COMMA COMMENT? | &INDGTEOPT COMMENT?
  private static boolean enum_decl_2_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_decl_2_0_4_0_0(b, l + 1);
    if (!r) r = enum_decl_2_0_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE COMMA COMMENT?
  private static boolean enum_decl_2_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_decl_2_0_4_0_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && enum_decl_2_0_4_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean enum_decl_2_0_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean enum_decl_2_0_4_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4_0_0_2")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // &INDGTEOPT COMMENT?
  private static boolean enum_decl_2_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_decl_2_0_4_0_1_0(b, l + 1);
    r = r && enum_decl_2_0_4_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGTEOPT
  private static boolean enum_decl_2_0_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = optGTEIndent(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean enum_decl_2_0_4_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0_4_0_1_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EXPORT optind expr
  //                           ( EXCEPT <<list expr (COMMA optind)>> | (COMMA optind expr)* )
  public static boolean export_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt")) return false;
    if (!nextTokenIs(b, EXPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STMT, null);
    r = consumeToken(b, EXPORT);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, expr(b, l + 1)) && r;
    r = p && export_stmt_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // EXCEPT <<list expr (COMMA optind)>> | (COMMA optind expr)*
  private static boolean export_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = export_stmt_3_0(b, l + 1);
    if (!r) r = export_stmt_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EXCEPT <<list expr (COMMA optind)>>
  private static boolean export_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EXCEPT);
    p = r; // pin = 1
    r = r && list(b, l + 1, NimParser::expr, NimParser::export_stmt_3_0_1_1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA optind
  private static boolean export_stmt_3_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt_3_0_1_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && optind(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA optind expr)*
  private static boolean export_stmt_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!export_stmt_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "export_stmt_3_1", c)) break;
    }
    return true;
  }

  // COMMA optind expr
  private static boolean export_stmt_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_stmt_3_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // block_expr
  //                         | if_expr
  //                         | when_expr
  //                         | case_stmt
  //                         | for_expr
  //                         | try_expr
  //                         | simple_expr
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<Expression>");
    r = block_expr(b, l + 1);
    if (!r) r = if_expr(b, l + 1);
    if (!r) r = when_expr(b, l + 1);
    if (!r) r = case_stmt(b, l + 1);
    if (!r) r = for_expr(b, l + 1);
    if (!r) r = try_expr(b, l + 1);
    if (!r) r = simple_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr ( (COLON | EQUALS) expr
  //                                | do_block extra_post_expr_block*
  //                                )?
  public static boolean expr_colon_eq_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR_COLON_EQ_EXPR, "<Expression>");
    r = expr(b, l + 1);
    r = r && expr_colon_eq_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( (COLON | EQUALS) expr
  //                                | do_block extra_post_expr_block*
  //                                )?
  private static boolean expr_colon_eq_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_1")) return false;
    expr_colon_eq_expr_1_0(b, l + 1);
    return true;
  }

  // (COLON | EQUALS) expr
  //                                | do_block extra_post_expr_block*
  private static boolean expr_colon_eq_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_colon_eq_expr_1_0_0(b, l + 1);
    if (!r) r = expr_colon_eq_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON | EQUALS) expr
  private static boolean expr_colon_eq_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_1_0_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = expr_colon_eq_expr_1_0_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COLON | EQUALS
  private static boolean expr_colon_eq_expr_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_1_0_0_0")) return false;
    boolean r;
    r = consumeTokenFast(b, COLON);
    if (!r) r = consumeTokenFast(b, EQUALS);
    return r;
  }

  // do_block extra_post_expr_block*
  private static boolean expr_colon_eq_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = do_block(b, l + 1);
    r = r && expr_colon_eq_expr_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extra_post_expr_block*
  private static boolean expr_colon_eq_expr_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extra_post_expr_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_colon_eq_expr_1_0_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // optpar <<optlist expr_colon_eq_expr (COMMA optind)>> COMMA? optpar
  public static boolean expr_colon_eq_expr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COLON_EQ_EXPR_LIST, "<expr colon eq expr list>");
    r = optpar(b, l + 1);
    r = r && optlist(b, l + 1, NimParser::expr_colon_eq_expr, NimParser::expr_colon_eq_expr_list_1_1);
    r = r && expr_colon_eq_expr_list_2(b, l + 1);
    r = r && optpar(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA optind
  private static boolean expr_colon_eq_expr_list_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_list_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && optind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean expr_colon_eq_expr_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_colon_eq_expr_list_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // expr (EQUALS expr | do_block extra_post_expr_block*)?
  public static boolean expr_eq_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_eq_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR_EQ_EXPR, "<Expression>");
    r = expr(b, l + 1);
    r = r && expr_eq_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (EQUALS expr | do_block extra_post_expr_block*)?
  private static boolean expr_eq_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_eq_expr_1")) return false;
    expr_eq_expr_1_0(b, l + 1);
    return true;
  }

  // EQUALS expr | do_block extra_post_expr_block*
  private static boolean expr_eq_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_eq_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_eq_expr_1_0_0(b, l + 1);
    if (!r) r = expr_eq_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUALS expr
  private static boolean expr_eq_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_eq_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // do_block extra_post_expr_block*
  private static boolean expr_eq_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_eq_expr_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = do_block(b, l + 1);
    r = r && expr_eq_expr_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extra_post_expr_block*
  private static boolean expr_eq_expr_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_eq_expr_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extra_post_expr_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_eq_expr_1_0_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<list expr COMMA>>
  public static boolean expr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_LIST, "<expr list>");
    r = list(b, l + 1, NimParser::expr, COMMA_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT | ACCENT | OPR | NOT | NIL | CAST | IF | FOR | PROC | FUNC | ITERATOR
  //                         | BIND | LPAREN | LBRACKET | LBRACE | VAR | REF | PTR | ENUM | TUPLE | OBJET
  //                         | WHEN | CASE | OUT | TRY | BLOCK
  //                         | literal
  //                         | built_in_magics
  public static boolean expr_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_start")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_START, "<expr start>");
    r = IDENT(b, l + 1);
    if (!r) r = consumeToken(b, ACCENT);
    if (!r) r = OPR(b, l + 1);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, CAST);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, PROC);
    if (!r) r = consumeToken(b, FUNC);
    if (!r) r = consumeToken(b, ITERATOR);
    if (!r) r = consumeToken(b, BIND);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, LBRACKET);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, PTR);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, TUPLE);
    if (!r) r = consumeToken(b, OBJET);
    if (!r) r = consumeToken(b, WHEN);
    if (!r) r = consumeToken(b, CASE);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, BLOCK);
    if (!r) r = literal(b, l + 1);
    if (!r) r = built_in_magics(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<pmTrySimple simple_expr>>
  //                           ( EQUALS optind expr
  //                           | ( &(INDNONE expr_start)
  //                               <<list <<pmNormal command_param_extra>> ((COMMA | optpar) indopt)>>
  //                             )?
  //                           )
  //                           post_expr_blocks?
  public static boolean expr_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = pmTrySimple(b, l + 1, NimParser::simple_expr);
    r = r && expr_stmt_1(b, l + 1);
    r = r && expr_stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EQUALS optind expr
  //                           | ( &(INDNONE expr_start)
  //                               <<list <<pmNormal command_param_extra>> ((COMMA | optpar) indopt)>>
  //                             )?
  private static boolean expr_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_stmt_1_0(b, l + 1);
    if (!r) r = expr_stmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUALS optind expr
  private static boolean expr_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EQUALS);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( &(INDNONE expr_start)
  //                               <<list <<pmNormal command_param_extra>> ((COMMA | optpar) indopt)>>
  //                             )?
  private static boolean expr_stmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1")) return false;
    expr_stmt_1_1_0(b, l + 1);
    return true;
  }

  // &(INDNONE expr_start)
  //                               <<list <<pmNormal command_param_extra>> ((COMMA | optpar) indopt)>>
  private static boolean expr_stmt_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = expr_stmt_1_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && list(b, l + 1, expr_stmt_1_1_0_1_0_parser_, NimParser::expr_stmt_1_1_0_1_1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &(INDNONE expr_start)
  private static boolean expr_stmt_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = expr_stmt_1_1_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INDNONE expr_start
  private static boolean expr_stmt_1_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1_0_0_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = indNone(b, l + 1);
    p = r; // pin = 1
    r = r && expr_start(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA | optpar) indopt
  private static boolean expr_stmt_1_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_stmt_1_1_0_1_1_0(b, l + 1);
    r = r && consumeToken(b, INDOPT);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA | optpar
  private static boolean expr_stmt_1_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_1_1_0_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = optpar(b, l + 1);
    return r;
  }

  // post_expr_blocks?
  private static boolean expr_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_stmt_2")) return false;
    post_expr_blocks(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INDEQ do_block
  //                           | INDEQ OF expr_list COLON stmt_list
  //                           | INDEQ ELIF expr COLON stmt_list
  //                           | INDEQ EXCEPT opt_expr_list COLON stmt_list
  //                           | INDEQ FINALLY COLON stmt_list
  //                           | INDEQ ELSE COLON stmt_list
  public static boolean extra_post_expr_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra_post_expr_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRA_POST_EXPR_BLOCK, "<extra post expr block>");
    r = extra_post_expr_block_0(b, l + 1);
    if (!r) r = extra_post_expr_block_1(b, l + 1);
    if (!r) r = extra_post_expr_block_2(b, l + 1);
    if (!r) r = extra_post_expr_block_3(b, l + 1);
    if (!r) r = extra_post_expr_block_4(b, l + 1);
    if (!r) r = extra_post_expr_block_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INDEQ do_block
  private static boolean extra_post_expr_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra_post_expr_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && do_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEQ OF expr_list COLON stmt_list
  private static boolean extra_post_expr_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra_post_expr_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && expr_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEQ ELIF expr COLON stmt_list
  private static boolean extra_post_expr_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra_post_expr_block_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, ELIF);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEQ EXCEPT opt_expr_list COLON stmt_list
  private static boolean extra_post_expr_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra_post_expr_block_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, EXCEPT);
    r = r && opt_expr_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEQ FINALLY COLON stmt_list
  private static boolean extra_post_expr_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra_post_expr_block_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeTokens(b, 0, FINALLY, COLON);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEQ ELSE COLON stmt_list
  private static boolean extra_post_expr_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra_post_expr_block_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeTokens(b, 0, ELSE, COLON);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // for_stmt
  public static boolean for_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_expr")) return false;
    if (!nextTokenIsFast(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_EXPR, "<Expression>");
    r = for_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR <<list (var_tuple | ident_with_pragma) COMMA>>
  //                           IN expr colon_comment stmt_list
  public static boolean for_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_stmt")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STMT, null);
    r = consumeToken(b, FOR);
    p = r; // pin = 1
    r = r && report_error_(b, list(b, l + 1, NimParser::for_stmt_1_0, COMMA_parser_));
    r = p && report_error_(b, consumeToken(b, IN)) && r;
    r = p && report_error_(b, expr(b, l + 1)) && r;
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // var_tuple | ident_with_pragma
  private static boolean for_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_stmt_1_0")) return false;
    boolean r;
    r = var_tuple(b, l + 1);
    if (!r) r = ident_with_pragma(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FROM expr IMPORT optind <<list expr (COMMA optind)>>
  public static boolean from_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_stmt")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FROM_STMT, null);
    r = consumeToken(b, FROM);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IMPORT)) && r;
    r = p && report_error_(b, optind(b, l + 1)) && r;
    r = p && list(b, l + 1, NimParser::expr, NimParser::from_stmt_4_1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA optind
  private static boolean from_stmt_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_stmt_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && optind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<optlist IDENT COMMA>> (COLON expr)? (EQUALS optind expr)?
  public static boolean generic_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAM, "<generic param>");
    r = optlist(b, l + 1, NimParser::IDENT, COMMA_parser_);
    r = r && generic_param_1(b, l + 1);
    r = r && generic_param_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COLON expr)?
  private static boolean generic_param_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_1")) return false;
    generic_param_1_0(b, l + 1);
    return true;
  }

  // COLON expr
  private static boolean generic_param_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQUALS optind expr)?
  private static boolean generic_param_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_2")) return false;
    generic_param_2_0(b, l + 1);
    return true;
  }

  // EQUALS optind expr
  private static boolean generic_param_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && optind(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET optind <<optlist generic_param (COMMA | SEMICOLON)>> optpar RBRACKET
  public static boolean generic_param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_list")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAM_LIST, null);
    r = consumeToken(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, optlist(b, l + 1, NimParser::generic_param, NimParser::generic_param_list_2_1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA | SEMICOLON
  private static boolean generic_param_list_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_param_list_2_1")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  static Parser ident_colon_equals_0_$(Parser _p) {
    return (b, l) -> ident_colon_equals_0(b, l + 1, _p);
  }

  // <<list <<p>> (COMMA optind)>> comma_optcomment?
  //                           colon_type_desc? (EQUALS optind expr)?
  public static boolean ident_colon_equals_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "ident_colon_equals_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IDENT_COLON_EQUALS_0, null);
    r = list(b, l + 1, _p, NimParser::ident_colon_equals_0_0_1);
    p = r; // pin = 1
    r = r && report_error_(b, ident_colon_equals_0_1(b, l + 1));
    r = p && report_error_(b, ident_colon_equals_0_2(b, l + 1)) && r;
    r = p && ident_colon_equals_0_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA optind
  private static boolean ident_colon_equals_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_0_0_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && optind(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // comma_optcomment?
  private static boolean ident_colon_equals_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_0_1")) return false;
    comma_optcomment(b, l + 1);
    return true;
  }

  // colon_type_desc?
  private static boolean ident_colon_equals_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_0_2")) return false;
    colon_type_desc(b, l + 1);
    return true;
  }

  // (EQUALS optind expr)?
  private static boolean ident_colon_equals_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_0_3")) return false;
    ident_colon_equals_0_3_0(b, l + 1);
    return true;
  }

  // EQUALS optind expr
  private static boolean ident_colon_equals_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_0_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EQUALS);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  static Parser ident_colon_equals_1_$(Parser _p) {
    return (b, l) -> ident_colon_equals_1(b, l + 1, _p);
  }

  // <<list <<p>> (COMMA optind)>> comma_optcomment?
  //                           <<and_or colon_type_desc (EQUALS optind expr)>>
  public static boolean ident_colon_equals_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "ident_colon_equals_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IDENT_COLON_EQUALS_1, null);
    r = list(b, l + 1, _p, NimParser::ident_colon_equals_1_0_1);
    p = r; // pin = 1
    r = r && report_error_(b, ident_colon_equals_1_1(b, l + 1));
    r = p && and_or(b, l + 1, NimParser::colon_type_desc, NimParser::ident_colon_equals_1_2_1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA optind
  private static boolean ident_colon_equals_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_1_0_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && optind(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // comma_optcomment?
  private static boolean ident_colon_equals_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_1_1")) return false;
    comma_optcomment(b, l + 1);
    return true;
  }

  // EQUALS optind expr
  private static boolean ident_colon_equals_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_colon_equals_1_2_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EQUALS);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ident_vis_dot pragma?
  public static boolean ident_dot_with_pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_dot_with_pragma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_DOT_WITH_PRAGMA, "<ident dot with pragma>");
    r = ident_vis_dot(b, l + 1);
    r = r && ident_dot_with_pragma_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean ident_dot_with_pragma_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_dot_with_pragma_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // symbol | literal
  //                         | LPAREN (<<inTypeDescMode>> | <<inTypeDefMode>>) expr_colon_eq_expr_list optpar RPAREN
  //                         | &LPAREN par
  //                         | array_constr | tuple_constr | set_or_table_constr
  //                         | cast_expr
  public static boolean ident_or_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_or_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_OR_LITERAL, "<ident or literal>");
    r = symbol(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = ident_or_literal_2(b, l + 1);
    if (!r) r = ident_or_literal_3(b, l + 1);
    if (!r) r = array_constr(b, l + 1);
    if (!r) r = tuple_constr(b, l + 1);
    if (!r) r = set_or_table_constr(b, l + 1);
    if (!r) r = cast_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN (<<inTypeDescMode>> | <<inTypeDefMode>>) expr_colon_eq_expr_list optpar RPAREN
  private static boolean ident_or_literal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_or_literal_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ident_or_literal_2_1(b, l + 1);
    r = r && expr_colon_eq_expr_list(b, l + 1);
    r = r && optpar(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<inTypeDescMode>> | <<inTypeDefMode>>
  private static boolean ident_or_literal_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_or_literal_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inTypeDescMode(b, l + 1);
    if (!r) r = inTypeDefMode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &LPAREN par
  private static boolean ident_or_literal_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_or_literal_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident_or_literal_3_0(b, l + 1);
    r = r && par(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &LPAREN
  private static boolean ident_or_literal_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_or_literal_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, LPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol OPR?
  public static boolean ident_vis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_vis")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS, "<ident vis>");
    r = symbol(b, l + 1);
    r = r && ident_vis_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPR?
  private static boolean ident_vis_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_vis_1")) return false;
    OPR(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ident_vis dot_suffix?
  public static boolean ident_vis_dot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_vis_dot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_VIS_DOT, "<ident vis dot>");
    r = ident_vis(b, l + 1);
    r = r && ident_vis_dot_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // dot_suffix?
  private static boolean ident_vis_dot_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_vis_dot_1")) return false;
    dot_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ident_vis pragma?
  public static boolean ident_with_pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_with_pragma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_WITH_PRAGMA, "<ident with pragma>");
    r = ident_vis(b, l + 1);
    r = r && ident_with_pragma_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean ident_with_pragma_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_with_pragma_1")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IF cond_expr
  public static boolean if_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr")) return false;
    if (!nextTokenIsFast(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPR, "<Expression>");
    r = consumeTokenFast(b, IF);
    p = r; // pin = 1
    r = r && cond_expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IF cond_stmt
  public static boolean if_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_stmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, null);
    r = consumeToken(b, IF);
    p = r; // pin = 1
    r = r && cond_stmt(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IMPORT optind expr
  //                           ( EXCEPT <<list expr (COMMA optind)>> | (COMMA optind expr)* )
  public static boolean import_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT, null);
    r = consumeToken(b, IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, expr(b, l + 1)) && r;
    r = p && import_stmt_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // EXCEPT <<list expr (COMMA optind)>> | (COMMA optind expr)*
  private static boolean import_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_stmt_3_0(b, l + 1);
    if (!r) r = import_stmt_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EXCEPT <<list expr (COMMA optind)>>
  private static boolean import_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt_3_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EXCEPT);
    p = r; // pin = 1
    r = r && list(b, l + 1, NimParser::expr, NimParser::import_stmt_3_0_1_1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA optind
  private static boolean import_stmt_3_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt_3_0_1_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && optind(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA optind expr)*
  private static boolean import_stmt_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_stmt_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_stmt_3_1", c)) break;
    }
    return true;
  }

  // COMMA optind expr
  private static boolean import_stmt_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt_3_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COMMA);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && expr(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // INCLUDE optind <<list expr (COMMA optind)>>
  public static boolean include_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STMT, null);
    r = consumeToken(b, INCLUDE);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && list(b, l + 1, NimParser::expr, NimParser::include_stmt_2_1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA optind
  private static boolean include_stmt_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && optind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMMENT | <<indented COMMENT>>)?
  public static boolean ind_and_comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ind_and_comment")) return false;
    Marker m = enter_section_(b, l, _NONE_, IND_AND_COMMENT, "<ind and comment>");
    ind_and_comment_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // COMMENT | <<indented COMMENT>>
  private static boolean ind_and_comment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ind_and_comment_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = COMMENT(b, l + 1);
    if (!r) r = indented(b, l + 1, NimParser::COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<indented <<list (<<p>> | COMMENT) INDEQ>>>>
  static boolean indented_section(PsiBuilder b, int l, Parser _p) {
    return indented(b, l + 1, list_$(indented_section_0_0_0_$(_p), INDEQ_parser_));
  }

  private static Parser indented_section_0_0_0_$(Parser _p) {
    return (b, l) -> indented_section_0_0_0(b, l + 1, _p);
  }

  // <<p>> | COMMENT
  private static boolean indented_section_0_0_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "indented_section_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p.parse(b, l);
    if (!r) r = COMMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INVALID_IDENT
  static boolean invalid(PsiBuilder b, int l) {
    return consumeToken(b, INVALID_IDENT);
  }

  /* ********************************************************** */
  // ADDR | AND | AS | ASM | BIND | BLOCK | BREAK | CASE | CAST | CONCEPT
  //                         | CONST | CONTINUE | CONVERTER | DEFER | DISCARD | DISTINCT | DIV | DO
  //                         | ELIF | ELSE | END | ENUM | EXCEPT | EXPORT | FINALLY | FOR | FROM | FUNC
  //                         | IF | IMPORT | IN | INCLUDE | INTERFACE | IS | ISNOT | ITERATOR | LET
  //                         | MACRO | METHOD | MIXIN | MOD | NIL | NOT | NOTIN | OBJECT | OF | OR | OUT
  //                         | PROC | PTR | RAISE | REF | RETURN | SHL | SHR | STATIC | TEMPLATE | TRY
  //                         | TUPLE | TYPE | USING | VAR | WHEN | WHILE | XOR | YIELD
  public static boolean keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD, "<keyword>");
    r = consumeToken(b, ADDR);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, AS);
    if (!r) r = consumeToken(b, ASM);
    if (!r) r = consumeToken(b, BIND);
    if (!r) r = consumeToken(b, BLOCK);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CASE);
    if (!r) r = consumeToken(b, CAST);
    if (!r) r = consumeToken(b, CONCEPT);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, CONVERTER);
    if (!r) r = consumeToken(b, DEFER);
    if (!r) r = consumeToken(b, DISCARD);
    if (!r) r = consumeToken(b, DISTINCT);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = consumeToken(b, ELIF);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, END);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, EXCEPT);
    if (!r) r = consumeToken(b, EXPORT);
    if (!r) r = consumeToken(b, FINALLY);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, FROM);
    if (!r) r = consumeToken(b, FUNC);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, IMPORT);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, INCLUDE);
    if (!r) r = consumeToken(b, INTERFACE);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, ISNOT);
    if (!r) r = consumeToken(b, ITERATOR);
    if (!r) r = consumeToken(b, LET);
    if (!r) r = consumeToken(b, MACRO);
    if (!r) r = consumeToken(b, METHOD);
    if (!r) r = consumeToken(b, MIXIN);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, NOTIN);
    if (!r) r = consumeToken(b, OBJECT);
    if (!r) r = consumeToken(b, OF);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, PROC);
    if (!r) r = consumeToken(b, PTR);
    if (!r) r = consumeToken(b, RAISE);
    if (!r) r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, SHL);
    if (!r) r = consumeToken(b, SHR);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, TEMPLATE);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, TUPLE);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, USING);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, WHEN);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, XOR);
    if (!r) r = consumeToken(b, YIELD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  static Parser list_$(Parser _p1, Parser _p2) {
    return (b, l) -> list(b, l + 1, _p1, _p2);
  }

  // <<p1>> (<<p2>> <<p1>>)*
  static boolean list(PsiBuilder b, int l, Parser _p1, Parser _p2) {
    if (!recursion_guard_(b, l, "list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p1.parse(b, l);
    r = r && list_1(b, l + 1, _p2, _p1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<p2>> <<p1>>)*
  private static boolean list_1(PsiBuilder b, int l, Parser _p2, Parser _p1) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_1_0(b, l + 1, _p2, _p1)) break;
      if (!empty_element_parsed_guard_(b, "list_1", c)) break;
    }
    return true;
  }

  // <<p2>> <<p1>>
  private static boolean list_1_0(PsiBuilder b, int l, Parser _p2, Parser _p1) {
    if (!recursion_guard_(b, l, "list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p2.parse(b, l);
    r = r && _p1.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT_LIT | FLOAT_LIT | CUSTOM_NUMERIC_LIT
  //                         | STR_LIT | RSTR_LIT | TRIPLESTR_LIT
  //                         | CHAR_LIT | NIL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INT_LIT);
    if (!r) r = consumeToken(b, FLOAT_LIT);
    if (!r) r = consumeToken(b, CUSTOM_NUMERIC_LIT);
    if (!r) r = consumeToken(b, STR_LIT);
    if (!r) r = consumeToken(b, RSTR_LIT);
    if (!r) r = consumeToken(b, TRIPLESTR_LIT);
    if (!r) r = consumeToken(b, CHAR_LIT);
    if (!r) r = consumeToken(b, NIL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INDNONE <<p>> | COMMENT? <<indented <<p>>>>
  static boolean maybeind(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "maybeind")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = maybeind_0(b, l + 1, _p);
    if (!r) r = maybeind_1(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDNONE <<p>>
  private static boolean maybeind_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "maybeind_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indNone(b, l + 1);
    r = r && _p.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT? <<indented <<p>>>>
  private static boolean maybeind_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "maybeind_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = maybeind_1_0(b, l + 1);
    r = r && indented(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean maybeind_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maybeind_1_0")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<initContext>> &INDZERO <<optlist stmt (SEMICOLON | INDEQ)>>
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initContext(b, l + 1);
    r = r && module_1(b, l + 1);
    r = r && optlist(b, l + 1, NimParser::stmt, NimParser::module_2_1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDZERO
  private static boolean module_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indZero(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON | INDEQ
  private static boolean module_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = indEquals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dollar_expr (&INDNONE (OP9|OP9_KW) INDGTEOPT dollar_expr)*
  public static boolean mul_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MUL_EXPR, "<Expression>");
    r = dollar_expr(b, l + 1);
    r = r && mul_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE (OP9|OP9_KW) INDGTEOPT dollar_expr)*
  private static boolean mul_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mul_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mul_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE (OP9|OP9_KW) INDGTEOPT dollar_expr
  private static boolean mul_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mul_expr_1_0_0(b, l + 1);
    r = r && mul_expr_1_0_1(b, l + 1);
    r = r && optGTEIndent(b, l + 1);
    r = r && dollar_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean mul_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP9|OP9_KW
  private static boolean mul_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr_1_0_1")) return false;
    boolean r;
    r = consumeTokenFast(b, OP9);
    if (!r) r = OP9_KW(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LPAREN optind expr_colon_eq_expr_list RPAREN
  public static boolean named_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_params")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAMED_PARAMS, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, expr_colon_eq_expr_list(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OF expr_list colon_comment object_part
  public static boolean object_branch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_branch")) return false;
    if (!nextTokenIs(b, OF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_BRANCH, null);
    r = consumeToken(b, OF);
    p = r; // pin = 1
    r = r && report_error_(b, expr_list(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && object_part(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<list object_branch INDEQ>>
  //                           (INDEQ ELIF expr colon_comment object_part)*
  //                           (INDEQ ELSE colon_comment object_part)?
  public static boolean object_branches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_branches")) return false;
    if (!nextTokenIs(b, OF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list(b, l + 1, NimParser::object_branch, INDEQ_parser_);
    r = r && object_branches_1(b, l + 1);
    r = r && object_branches_2(b, l + 1);
    exit_section_(b, m, OBJECT_BRANCHES, r);
    return r;
  }

  // (INDEQ ELIF expr colon_comment object_part)*
  private static boolean object_branches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_branches_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_branches_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_branches_1", c)) break;
    }
    return true;
  }

  // INDEQ ELIF expr colon_comment object_part
  private static boolean object_branches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_branches_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, ELIF);
    p = r; // pin = 2
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && object_part(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (INDEQ ELSE colon_comment object_part)?
  private static boolean object_branches_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_branches_2")) return false;
    object_branches_2_0(b, l + 1);
    return true;
  }

  // INDEQ ELSE colon_comment object_part
  private static boolean object_branches_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_branches_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, ELSE);
    p = r; // pin = 2
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && object_part(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CASE decl_colon_equals COLON? COMMENT?
  //                           ( &INDGT <<indented object_branches>>
  //                           | INDEQ object_branches)
  public static boolean object_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_case")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_CASE, null);
    r = consumeToken(b, CASE);
    p = r; // pin = 1
    r = r && report_error_(b, decl_colon_equals(b, l + 1));
    r = p && report_error_(b, object_case_2(b, l + 1)) && r;
    r = p && report_error_(b, object_case_3(b, l + 1)) && r;
    r = p && object_case_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COLON?
  private static boolean object_case_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_case_2")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // COMMENT?
  private static boolean object_case_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_case_3")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // &INDGT <<indented object_branches>>
  //                           | INDEQ object_branches
  private static boolean object_case_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_case_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_case_4_0(b, l + 1);
    if (!r) r = object_case_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGT <<indented object_branches>>
  private static boolean object_case_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_case_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_case_4_0_0(b, l + 1);
    r = r && indented(b, l + 1, NimParser::object_branches);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGT
  private static boolean object_case_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_case_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indGreaterThan(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INDEQ object_branches
  private static boolean object_case_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_case_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && object_branches(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OBJECT (&INDNONE OF type_desc)? COMMENT? (&INDGT <<indented object_part>>)?
  public static boolean object_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl")) return false;
    if (!nextTokenIs(b, OBJECT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_DECL, null);
    r = consumeToken(b, OBJECT);
    p = r; // pin = 1
    r = r && report_error_(b, object_decl_1(b, l + 1));
    r = p && report_error_(b, object_decl_2(b, l + 1)) && r;
    r = p && object_decl_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (&INDNONE OF type_desc)?
  private static boolean object_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl_1")) return false;
    object_decl_1_0(b, l + 1);
    return true;
  }

  // &INDNONE OF type_desc
  private static boolean object_decl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_decl_1_0_0(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && type_desc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean object_decl_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean object_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl_2")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // (&INDGT <<indented object_part>>)?
  private static boolean object_decl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl_3")) return false;
    object_decl_3_0(b, l + 1);
    return true;
  }

  // &INDGT <<indented object_part>>
  private static boolean object_decl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_decl_3_0_0(b, l + 1);
    r = r && indented(b, l + 1, NimParser::object_part);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGT
  private static boolean object_decl_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_decl_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indGreaterThan(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<list object_part_item INDEQ>>
  public static boolean object_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PART, "<object part>");
    r = list(b, l + 1, NimParser::object_part_item, INDEQ_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // &INDGT <<indented object_part>>
  //                         | decl_colon_equals COMMENT? | object_when | object_case | NIL | DISCARD
  public static boolean object_part_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_part_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PART_ITEM, "<object part item>");
    r = object_part_item_0(b, l + 1);
    if (!r) r = object_part_item_1(b, l + 1);
    if (!r) r = object_when(b, l + 1);
    if (!r) r = object_case(b, l + 1);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, DISCARD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDGT <<indented object_part>>
  private static boolean object_part_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_part_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_part_item_0_0(b, l + 1);
    r = r && indented(b, l + 1, NimParser::object_part);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGT
  private static boolean object_part_item_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_part_item_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indGreaterThan(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_colon_equals COMMENT?
  private static boolean object_part_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_part_item_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_colon_equals(b, l + 1);
    r = r && object_part_item_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean object_part_item_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_part_item_1_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WHEN expr colon_comment object_part COMMENT?
  //                           (&INDEQ ELIF expr colon_comment object_part COMMENT?)*
  //                           (&INDEQ ELSE colon_comment object_part COMMENT?)?
  public static boolean object_when(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_WHEN, null);
    r = consumeToken(b, WHEN);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && report_error_(b, object_part(b, l + 1)) && r;
    r = p && report_error_(b, object_when_4(b, l + 1)) && r;
    r = p && report_error_(b, object_when_5(b, l + 1)) && r;
    r = p && object_when_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMENT?
  private static boolean object_when_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_4")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // (&INDEQ ELIF expr colon_comment object_part COMMENT?)*
  private static boolean object_when_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_when_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_when_5", c)) break;
    }
    return true;
  }

  // &INDEQ ELIF expr colon_comment object_part COMMENT?
  private static boolean object_when_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_5_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = object_when_5_0_0(b, l + 1);
    r = r && consumeToken(b, ELIF);
    p = r; // pin = 2
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && report_error_(b, object_part(b, l + 1)) && r;
    r = p && object_when_5_0_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &INDEQ
  private static boolean object_when_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_5_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indEquals(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean object_when_5_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_5_0_5")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // (&INDEQ ELSE colon_comment object_part COMMENT?)?
  private static boolean object_when_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_6")) return false;
    object_when_6_0(b, l + 1);
    return true;
  }

  // &INDEQ ELSE colon_comment object_part COMMENT?
  private static boolean object_when_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_6_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = object_when_6_0_0(b, l + 1);
    r = r && consumeToken(b, ELSE);
    p = r; // pin = 2
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && report_error_(b, object_part(b, l + 1)) && r;
    r = p && object_when_6_0_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &INDEQ
  private static boolean object_when_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_6_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indEquals(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT?
  private static boolean object_when_6_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_when_6_0_4")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (INDEQ OF expr_list colon_comment stmt_list)*
  //                            (INDEQ ELIF expr colon_comment stmt_list)*
  //                            (INDEQ ELSE colon_comment stmt_list)?
  public static boolean of_branches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "of_branches")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OF_BRANCHES, "<of branches>");
    r = of_branches_0(b, l + 1);
    r = r && of_branches_1(b, l + 1);
    r = r && of_branches_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (INDEQ OF expr_list colon_comment stmt_list)*
  private static boolean of_branches_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "of_branches_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!of_branches_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "of_branches_0", c)) break;
    }
    return true;
  }

  // INDEQ OF expr_list colon_comment stmt_list
  private static boolean of_branches_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "of_branches_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && expr_list(b, l + 1);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INDEQ ELIF expr colon_comment stmt_list)*
  private static boolean of_branches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "of_branches_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!of_branches_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "of_branches_1", c)) break;
    }
    return true;
  }

  // INDEQ ELIF expr colon_comment stmt_list
  private static boolean of_branches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "of_branches_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, ELIF);
    r = r && expr(b, l + 1);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INDEQ ELSE colon_comment stmt_list)?
  private static boolean of_branches_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "of_branches_2")) return false;
    of_branches_2_0(b, l + 1);
    return true;
  }

  // INDEQ ELSE colon_comment stmt_list
  private static boolean of_branches_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "of_branches_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indEquals(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && colon_comment(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPR | OP3_KW | OP4_KW | OP5_KW | OP9_KW | DOTDOT
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = OPR(b, l + 1);
    if (!r) r = OP3_KW(b, l + 1);
    if (!r) r = OP4_KW(b, l + 1);
    if (!r) r = OP5_KW(b, l + 1);
    if (!r) r = OP9_KW(b, l + 1);
    if (!r) r = consumeToken(b, DOTDOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<optlist expr COMMA>>
  public static boolean opt_expr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opt_expr_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPT_EXPR_LIST, "<opt expr list>");
    r = optlist(b, l + 1, NimParser::expr, COMMA_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT? INDGTOPT
  static boolean optind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optind")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optind_0(b, l + 1);
    r = r && optGTIndent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean optind_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optind_0")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<optlist expr COMMA>>
  public static boolean optional_expr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_expr_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPTIONAL_EXPR_LIST, "<optional expr list>");
    r = optlist(b, l + 1, NimParser::expr, COMMA_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (<<p1>> (<<p2>> <<p1>>)*)?
  static boolean optlist(PsiBuilder b, int l, Parser _p1, Parser _p2) {
    if (!recursion_guard_(b, l, "optlist")) return false;
    optlist_0(b, l + 1, _p1, _p2);
    return true;
  }

  // <<p1>> (<<p2>> <<p1>>)*
  private static boolean optlist_0(PsiBuilder b, int l, Parser _p1, Parser _p2) {
    if (!recursion_guard_(b, l, "optlist_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p1.parse(b, l);
    r = r && optlist_0_1(b, l + 1, _p2, _p1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<p2>> <<p1>>)*
  private static boolean optlist_0_1(PsiBuilder b, int l, Parser _p2, Parser _p1) {
    if (!recursion_guard_(b, l, "optlist_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!optlist_0_1_0(b, l + 1, _p2, _p1)) break;
      if (!empty_element_parsed_guard_(b, "optlist_0_1", c)) break;
    }
    return true;
  }

  // <<p2>> <<p1>>
  private static boolean optlist_0_1_0(PsiBuilder b, int l, Parser _p2, Parser _p1) {
    if (!recursion_guard_(b, l, "optlist_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p2.parse(b, l);
    r = r && _p1.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INDGTEOPT
  static boolean optpar(PsiBuilder b, int l) {
    return optGTEIndent(b, l + 1);
  }

  /* ********************************************************** */
  // and_expr (&INDNONE (OP3|OP3_KW) INDGTEOPT and_expr)*
  public static boolean or_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, OR_EXPR, "<Expression>");
    r = and_expr(b, l + 1);
    r = r && or_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE (OP3|OP3_KW) INDGTEOPT and_expr)*
  private static boolean or_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!or_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE (OP3|OP3_KW) INDGTEOPT and_expr
  private static boolean or_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = or_expr_1_0_0(b, l + 1);
    r = r && or_expr_1_0_1(b, l + 1);
    r = r && optGTEIndent(b, l + 1);
    r = r && and_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean or_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP3|OP3_KW
  private static boolean or_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1_0_1")) return false;
    boolean r;
    r = consumeTokenFast(b, OP3);
    if (!r) r = OP3_KW(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LPAREN optind
  //                           ( &par_keyword semi_stmt_list
  //                           | SEMICOLON semi_stmt_list
  //                           | pragma_stmt
  //                           | simple_expr
  //                             ( ( do_block extra_post_expr_block* )
  //                             | ( EQUALS optind expr (SEMICOLON semi_stmt_list)? )
  //                             | ( SEMICOLON semi_stmt_list )
  //                             | ( (COLON expr | EQUALS expr)?
  //                                 (COMMA <<list expr_colon_eq_expr COMMA>>)?
  //                               )
  //                             )
  //                           )
  //                           optpar RPAREN
  public static boolean par(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PAR, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, par_2(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &par_keyword semi_stmt_list
  //                           | SEMICOLON semi_stmt_list
  //                           | pragma_stmt
  //                           | simple_expr
  //                             ( ( do_block extra_post_expr_block* )
  //                             | ( EQUALS optind expr (SEMICOLON semi_stmt_list)? )
  //                             | ( SEMICOLON semi_stmt_list )
  //                             | ( (COLON expr | EQUALS expr)?
  //                                 (COMMA <<list expr_colon_eq_expr COMMA>>)?
  //                               )
  //                             )
  private static boolean par_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = par_2_0(b, l + 1);
    if (!r) r = par_2_1(b, l + 1);
    if (!r) r = pragma_stmt(b, l + 1);
    if (!r) r = par_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &par_keyword semi_stmt_list
  private static boolean par_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = par_2_0_0(b, l + 1);
    r = r && semi_stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &par_keyword
  private static boolean par_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = par_keyword(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON semi_stmt_list
  private static boolean par_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && semi_stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // simple_expr
  //                             ( ( do_block extra_post_expr_block* )
  //                             | ( EQUALS optind expr (SEMICOLON semi_stmt_list)? )
  //                             | ( SEMICOLON semi_stmt_list )
  //                             | ( (COLON expr | EQUALS expr)?
  //                                 (COMMA <<list expr_colon_eq_expr COMMA>>)?
  //                               )
  //                             )
  private static boolean par_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expr(b, l + 1);
    r = r && par_2_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( do_block extra_post_expr_block* )
  //                             | ( EQUALS optind expr (SEMICOLON semi_stmt_list)? )
  //                             | ( SEMICOLON semi_stmt_list )
  //                             | ( (COLON expr | EQUALS expr)?
  //                                 (COMMA <<list expr_colon_eq_expr COMMA>>)?
  //                               )
  private static boolean par_2_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = par_2_3_1_0(b, l + 1);
    if (!r) r = par_2_3_1_1(b, l + 1);
    if (!r) r = par_2_3_1_2(b, l + 1);
    if (!r) r = par_2_3_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // do_block extra_post_expr_block*
  private static boolean par_2_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = do_block(b, l + 1);
    r = r && par_2_3_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extra_post_expr_block*
  private static boolean par_2_3_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extra_post_expr_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "par_2_3_1_0_1", c)) break;
    }
    return true;
  }

  // EQUALS optind expr (SEMICOLON semi_stmt_list)?
  private static boolean par_2_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && optind(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && par_2_3_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SEMICOLON semi_stmt_list)?
  private static boolean par_2_3_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1_3")) return false;
    par_2_3_1_1_3_0(b, l + 1);
    return true;
  }

  // SEMICOLON semi_stmt_list
  private static boolean par_2_3_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && semi_stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON semi_stmt_list
  private static boolean par_2_3_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && semi_stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON expr | EQUALS expr)?
  //                                 (COMMA <<list expr_colon_eq_expr COMMA>>)?
  private static boolean par_2_3_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = par_2_3_1_3_0(b, l + 1);
    r = r && par_2_3_1_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON expr | EQUALS expr)?
  private static boolean par_2_3_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_3_0")) return false;
    par_2_3_1_3_0_0(b, l + 1);
    return true;
  }

  // COLON expr | EQUALS expr
  private static boolean par_2_3_1_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = par_2_3_1_3_0_0_0(b, l + 1);
    if (!r) r = par_2_3_1_3_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON expr
  private static boolean par_2_3_1_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUALS expr
  private static boolean par_2_3_1_3_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_3_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA <<list expr_colon_eq_expr COMMA>>)?
  private static boolean par_2_3_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_3_1")) return false;
    par_2_3_1_3_1_0(b, l + 1);
    return true;
  }

  // COMMA <<list expr_colon_eq_expr COMMA>>
  private static boolean par_2_3_1_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_2_3_1_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && list(b, l + 1, NimParser::expr_colon_eq_expr, COMMA_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DISCARD | INCLUDE | IF | WHILE | CASE | TRY | DEFER
  //                         | FINALLY | EXCEPT | FOR | BLOCK | CONST | LET
  //                         | WHEN | VAR | MIXIN
  public static boolean par_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "par_keyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAR_KEYWORD, "<par keyword>");
    r = consumeToken(b, DISCARD);
    if (!r) r = consumeToken(b, INCLUDE);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, CASE);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, DEFER);
    if (!r) r = consumeToken(b, FINALLY);
    if (!r) r = consumeToken(b, EXCEPT);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, BLOCK);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, LET);
    if (!r) r = consumeToken(b, WHEN);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, MIXIN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN optind
  //                           <<optlist <<ident_colon_equals_0 ident_with_pragma>> (COMMA | SEMICOLON)>> COMMA?
  //                           optpar RPAREN
  public static boolean param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, optlist(b, l + 1, param_list_2_0_parser_, NimParser::param_list_2_1)) && r;
    r = p && report_error_(b, param_list_3(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMA | SEMICOLON
  private static boolean param_list_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_2_1")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  // COMMA?
  private static boolean param_list_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // param_list? (OP_ARROW optind type_desc)?
  public static boolean param_list_arrow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_arrow")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST_ARROW, "<param list arrow>");
    r = param_list_arrow_0(b, l + 1);
    r = r && param_list_arrow_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_list?
  private static boolean param_list_arrow_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_arrow_0")) return false;
    param_list(b, l + 1);
    return true;
  }

  // (OP_ARROW optind type_desc)?
  private static boolean param_list_arrow_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_arrow_1")) return false;
    param_list_arrow_1_0(b, l + 1);
    return true;
  }

  // OP_ARROW optind type_desc
  private static boolean param_list_arrow_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_arrow_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ARROW);
    r = r && optind(b, l + 1);
    r = r && type_desc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // param_list? (COLON optind type_desc)?
  public static boolean param_list_colon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_colon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST_COLON, "<param list colon>");
    r = param_list_colon_0(b, l + 1);
    r = r && param_list_colon_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_list?
  private static boolean param_list_colon_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_colon_0")) return false;
    param_list(b, l + 1);
    return true;
  }

  // (COLON optind type_desc)?
  private static boolean param_list_colon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_colon_1")) return false;
    param_list_colon_1_0(b, l + 1);
    return true;
  }

  // COLON optind type_desc
  private static boolean param_list_colon_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_colon_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COLON);
    p = r; // pin = COLON
    r = r && report_error_(b, optind(b, l + 1));
    r = p && type_desc(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // &NOSPACE named_params
  //                         | !<<inTrySimpleMode>> LPAREN command_expr RPAREN
  public static boolean paren_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAREN_SUFFIX, "<paren suffix>");
    r = paren_suffix_0(b, l + 1);
    if (!r) r = paren_suffix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &NOSPACE named_params
  private static boolean paren_suffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_suffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paren_suffix_0_0(b, l + 1);
    r = r && named_params(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &NOSPACE
  private static boolean paren_suffix_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_suffix_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = noSpace(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<inTrySimpleMode>> LPAREN command_expr RPAREN
  private static boolean paren_suffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_suffix_1")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = paren_suffix_1_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    p = r; // pin = LPAREN
    r = r && report_error_(b, command_expr(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !<<inTrySimpleMode>>
  private static boolean paren_suffix_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_suffix_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !inTrySimpleMode(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE stmt_list RBRACE
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, stmt_list(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // mul_expr (&INDNONE OP8 INDGTEOPT mul_expr)*
  public static boolean plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PLUS_EXPR, "<Expression>");
    r = mul_expr(b, l + 1);
    r = r && plus_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE OP8 INDGTEOPT mul_expr)*
  private static boolean plus_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!plus_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "plus_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE OP8 INDGTEOPT mul_expr
  private static boolean plus_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = plus_expr_1_0_0(b, l + 1);
    r = r && consumeTokenFast(b, OP8);
    r = r && optGTEIndent(b, l + 1);
    r = r && mul_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean plus_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // &INDNONE (do_block | COLON (extra_post_expr_block | stmt_list)) extra_post_expr_block*
  public static boolean post_expr_blocks(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_expr_blocks")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POST_EXPR_BLOCKS, "<post expr blocks>");
    r = post_expr_blocks_0(b, l + 1);
    r = r && post_expr_blocks_1(b, l + 1);
    r = r && post_expr_blocks_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDNONE
  private static boolean post_expr_blocks_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_expr_blocks_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // do_block | COLON (extra_post_expr_block | stmt_list)
  private static boolean post_expr_blocks_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_expr_blocks_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = do_block(b, l + 1);
    if (!r) r = post_expr_blocks_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON (extra_post_expr_block | stmt_list)
  private static boolean post_expr_blocks_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_expr_blocks_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && post_expr_blocks_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extra_post_expr_block | stmt_list
  private static boolean post_expr_blocks_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_expr_blocks_1_1_1")) return false;
    boolean r;
    r = extra_post_expr_block(b, l + 1);
    if (!r) r = stmt_list(b, l + 1);
    return r;
  }

  // extra_post_expr_block*
  private static boolean post_expr_blocks_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_expr_blocks_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extra_post_expr_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "post_expr_blocks_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LBRACE_DOT optind (expr_colon_eq_expr COMMA?)* optpar (DOT_RBRACE | RBRACE)
  public static boolean pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma")) return false;
    if (!nextTokenIs(b, LBRACE_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA, null);
    r = consumeToken(b, LBRACE_DOT);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, pragma_2(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && pragma_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (expr_colon_eq_expr COMMA?)*
  private static boolean pragma_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pragma_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pragma_2", c)) break;
    }
    return true;
  }

  // expr_colon_eq_expr COMMA?
  private static boolean pragma_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_colon_eq_expr(b, l + 1);
    r = r && pragma_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean pragma_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_2_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // DOT_RBRACE | RBRACE
  private static boolean pragma_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_4")) return false;
    boolean r;
    r = consumeToken(b, DOT_RBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

  /* ********************************************************** */
  // pragma (COLON COMMENT? stmt_list)?
  public static boolean pragma_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt")) return false;
    if (!nextTokenIs(b, LBRACE_DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pragma(b, l + 1);
    r = r && pragma_stmt_1(b, l + 1);
    exit_section_(b, m, PRAGMA_STMT, r);
    return r;
  }

  // (COLON COMMENT? stmt_list)?
  private static boolean pragma_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_1")) return false;
    pragma_stmt_1_0(b, l + 1);
    return true;
  }

  // COLON COMMENT? stmt_list
  private static boolean pragma_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && pragma_stmt_1_0_1(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean pragma_stmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_1_0_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simple_primary // (command_start expr (do_block extra_post_expr_block*)?)?
  //                         | operator optind primary_expr
  //                         | routine_expr
  //                         | raw_type_desc
  public static boolean primary_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PRIMARY_EXPR, "<Expression>");
    r = simple_primary(b, l + 1);
    if (!r) r = primary_expr_1(b, l + 1);
    if (!r) r = routine_expr(b, l + 1);
    if (!r) r = raw_type_desc(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // operator optind primary_expr
  private static boolean primary_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = operator(b, l + 1);
    r = r && optind(b, l + 1);
    r = r && primary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // &INDNONE paren_suffix
  //                         | optpar dot_suffix
  //                         | &INDNONE dot_like_suffix
  //                         | &INDNONE bracket_suffix
  //                         | &INDNONE brace_suffix
  public static boolean primary_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX, "<primary suffix>");
    r = primary_suffix_0(b, l + 1);
    if (!r) r = primary_suffix_1(b, l + 1);
    if (!r) r = primary_suffix_2(b, l + 1);
    if (!r) r = primary_suffix_3(b, l + 1);
    if (!r) r = primary_suffix_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDNONE paren_suffix
  private static boolean primary_suffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_suffix_0_0(b, l + 1);
    r = r && paren_suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean primary_suffix_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // optpar dot_suffix
  private static boolean primary_suffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optpar(b, l + 1);
    r = r && dot_suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE dot_like_suffix
  private static boolean primary_suffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_suffix_2_0(b, l + 1);
    r = r && dot_like_suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean primary_suffix_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDNONE bracket_suffix
  private static boolean primary_suffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_suffix_3_0(b, l + 1);
    r = r && bracket_suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean primary_suffix_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDNONE brace_suffix
  private static boolean primary_suffix_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_suffix_4_0(b, l + 1);
    r = r && brace_suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean primary_suffix_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // &INDNONE
  //                           &( IDENT | ACCENT | literal | NIL | CAST | VAR | OUT | STATIC | TYPE
  //                            | ENUM | TUPLE | OBJECT | PROC | <<isUnary OPR>> | <<isUnary DOTDOT>>
  //                            )
  //                           command_expr
  public static boolean primary_suffix_cmd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_cmd")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_SUFFIX_CMD, "<primary suffix cmd>");
    r = primary_suffix_cmd_0(b, l + 1);
    r = r && primary_suffix_cmd_1(b, l + 1);
    r = r && command_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDNONE
  private static boolean primary_suffix_cmd_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_cmd_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &( IDENT | ACCENT | literal | NIL | CAST | VAR | OUT | STATIC | TYPE
  //                            | ENUM | TUPLE | OBJECT | PROC | <<isUnary OPR>> | <<isUnary DOTDOT>>
  //                            )
  private static boolean primary_suffix_cmd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_cmd_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = primary_suffix_cmd_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENT | ACCENT | literal | NIL | CAST | VAR | OUT | STATIC | TYPE
  //                            | ENUM | TUPLE | OBJECT | PROC | <<isUnary OPR>> | <<isUnary DOTDOT>>
  private static boolean primary_suffix_cmd_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_suffix_cmd_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENT(b, l + 1);
    if (!r) r = consumeToken(b, ACCENT);
    if (!r) r = literal(b, l + 1);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, CAST);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, TUPLE);
    if (!r) r = consumeToken(b, OBJECT);
    if (!r) r = consumeToken(b, PROC);
    if (!r) r = isUnary(b, l + 1, NimParser::OPR);
    if (!r) r = isUnary(b, l + 1, DOTDOT_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RAISE <<maybeind expr>>?
  public static boolean raise_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_stmt")) return false;
    if (!nextTokenIs(b, RAISE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RAISE_STMT, null);
    r = consumeToken(b, RAISE);
    p = r; // pin = 1
    r = r && raise_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<maybeind expr>>?
  private static boolean raise_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_stmt_1")) return false;
    maybeind(b, l + 1, NimParser::expr);
    return true;
  }

  /* ********************************************************** */
  // ( tuple_type
  //                           | routine_type
  //                           | ENUM
  //                           | OBJECT
  //                           | (VAR | OUT | REF | PTR | DISTINCT) type_desc?
  //                           )
  //                           (NOT primary_expr)?
  public static boolean raw_type_desc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_desc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAW_TYPE_DESC, "<raw type desc>");
    r = raw_type_desc_0(b, l + 1);
    r = r && raw_type_desc_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tuple_type
  //                           | routine_type
  //                           | ENUM
  //                           | OBJECT
  //                           | (VAR | OUT | REF | PTR | DISTINCT) type_desc?
  private static boolean raw_type_desc_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_desc_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_type(b, l + 1);
    if (!r) r = routine_type(b, l + 1);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, OBJECT);
    if (!r) r = raw_type_desc_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (VAR | OUT | REF | PTR | DISTINCT) type_desc?
  private static boolean raw_type_desc_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_desc_0_4")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = raw_type_desc_0_4_0(b, l + 1);
    p = r; // pin = 1
    r = r && raw_type_desc_0_4_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // VAR | OUT | REF | PTR | DISTINCT
  private static boolean raw_type_desc_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_desc_0_4_0")) return false;
    boolean r;
    r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, PTR);
    if (!r) r = consumeToken(b, DISTINCT);
    return r;
  }

  // type_desc?
  private static boolean raw_type_desc_0_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_desc_0_4_1")) return false;
    type_desc(b, l + 1);
    return true;
  }

  // (NOT primary_expr)?
  private static boolean raw_type_desc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_desc_1")) return false;
    raw_type_desc_1_0(b, l + 1);
    return true;
  }

  // NOT primary_expr
  private static boolean raw_type_desc_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_desc_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NOT);
    p = r; // pin = 1
    r = r && primary_expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // RETURN <<maybeind expr>>?
  public static boolean return_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, null);
    r = consumeToken(b, RETURN);
    p = r; // pin = 1
    r = r && return_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<maybeind expr>>?
  private static boolean return_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_stmt_1")) return false;
    maybeind(b, l + 1, NimParser::expr);
    return true;
  }

  /* ********************************************************** */
  // optind ident_vis pattern? generic_param_list?
  //                           param_list_colon pragma? (EQUALS COMMENT? stmt_list)? ind_and_comment
  public static boolean routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE, "<routine>");
    r = optind(b, l + 1);
    r = r && ident_vis(b, l + 1);
    r = r && routine_2(b, l + 1);
    r = r && routine_3(b, l + 1);
    r = r && param_list_colon(b, l + 1);
    r = r && routine_5(b, l + 1);
    r = r && routine_6(b, l + 1);
    r = r && ind_and_comment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pattern?
  private static boolean routine_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_2")) return false;
    pattern(b, l + 1);
    return true;
  }

  // generic_param_list?
  private static boolean routine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_3")) return false;
    generic_param_list(b, l + 1);
    return true;
  }

  // pragma?
  private static boolean routine_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_5")) return false;
    pragma(b, l + 1);
    return true;
  }

  // (EQUALS COMMENT? stmt_list)?
  private static boolean routine_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_6")) return false;
    routine_6_0(b, l + 1);
    return true;
  }

  // EQUALS COMMENT? stmt_list
  private static boolean routine_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_6_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EQUALS);
    p = r; // pin = 1
    r = r && report_error_(b, routine_6_0_1(b, l + 1));
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COMMENT?
  private static boolean routine_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_6_0_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (PROC | FUNC | ITERATOR) param_list_colon pragma? (EQUALS COMMENT? stmt_list)?
  public static boolean routine_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE_EXPR, "<Expression>");
    r = routine_expr_0(b, l + 1);
    r = r && param_list_colon(b, l + 1);
    r = r && routine_expr_2(b, l + 1);
    r = r && routine_expr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PROC | FUNC | ITERATOR
  private static boolean routine_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_expr_0")) return false;
    boolean r;
    r = consumeTokenFast(b, PROC);
    if (!r) r = consumeTokenFast(b, FUNC);
    if (!r) r = consumeTokenFast(b, ITERATOR);
    return r;
  }

  // pragma?
  private static boolean routine_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_expr_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  // (EQUALS COMMENT? stmt_list)?
  private static boolean routine_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_expr_3")) return false;
    routine_expr_3_0(b, l + 1);
    return true;
  }

  // EQUALS COMMENT? stmt_list
  private static boolean routine_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, EQUALS);
    r = r && routine_expr_3_0_1(b, l + 1);
    r = r && stmt_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean routine_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_expr_3_0_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (PROC | ITERATOR) param_list_colon pragma?
  public static boolean routine_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_type")) return false;
    if (!nextTokenIs(b, "<routine type>", ITERATOR, PROC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE_TYPE, "<routine type>");
    r = routine_type_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, param_list_colon(b, l + 1));
    r = p && routine_type_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // PROC | ITERATOR
  private static boolean routine_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_type_0")) return false;
    boolean r;
    r = consumeToken(b, PROC);
    if (!r) r = consumeToken(b, ITERATOR);
    return r;
  }

  // pragma?
  private static boolean routine_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_type_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (INDNONE COMMENT)? (INDNONE <<p>> | <<indented_section <<p>>>>)
  static boolean section(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "section")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = section_0(b, l + 1);
    p = r; // pin = 1
    r = r && section_1(b, l + 1, _p);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (INDNONE COMMENT)?
  private static boolean section_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "section_0")) return false;
    section_0_0(b, l + 1);
    return true;
  }

  // INDNONE COMMENT
  private static boolean section_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "section_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indNone(b, l + 1);
    r = r && COMMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDNONE <<p>> | <<indented_section <<p>>>>
  private static boolean section_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "section_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = section_1_0(b, l + 1, _p);
    if (!r) r = indented_section(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDNONE <<p>>
  private static boolean section_1_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "section_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indNone(b, l + 1);
    r = r && _p.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (if_expr | when_expr | stmt)?
  //                           <<optlist (INDGTEOPT stmt) SEMICOLON>>
  public static boolean semi_stmt_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_stmt_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMI_STMT_LIST, "<semi stmt list>");
    r = semi_stmt_list_0(b, l + 1);
    r = r && optlist(b, l + 1, NimParser::semi_stmt_list_1_0, SEMICOLON_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (if_expr | when_expr | stmt)?
  private static boolean semi_stmt_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_stmt_list_0")) return false;
    semi_stmt_list_0_0(b, l + 1);
    return true;
  }

  // if_expr | when_expr | stmt
  private static boolean semi_stmt_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_stmt_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_expr(b, l + 1);
    if (!r) r = when_expr(b, l + 1);
    if (!r) r = stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDGTEOPT stmt
  private static boolean semi_stmt_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi_stmt_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optGTEIndent(b, l + 1);
    r = r && stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE optind (COLON | <<optlist expr_colon_eq_expr (COMMA COMMENT?)>>) optpar RBRACE
  public static boolean set_or_table_constr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_or_table_constr")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SET_OR_TABLE_CONSTR, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, set_or_table_constr_2(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // COLON | <<optlist expr_colon_eq_expr (COMMA COMMENT?)>>
  private static boolean set_or_table_constr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_or_table_constr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    if (!r) r = optlist(b, l + 1, NimParser::expr_colon_eq_expr, NimParser::set_or_table_constr_2_1_1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA COMMENT?
  private static boolean set_or_table_constr_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_or_table_constr_2_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && set_or_table_constr_2_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean set_or_table_constr_2_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_or_table_constr_2_1_1_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // arrow_expr (&INDNONE OP0 INDGTEOPT arrow_expr)* pragma?
  public static boolean simple_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SIMPLE_EXPR, "<Expression>");
    r = arrow_expr(b, l + 1);
    r = r && simple_expr_1(b, l + 1);
    r = r && simple_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE OP0 INDGTEOPT arrow_expr)*
  private static boolean simple_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!simple_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simple_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE OP0 INDGTEOPT arrow_expr
  private static boolean simple_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expr_1_0_0(b, l + 1);
    r = r && OP0(b, l + 1);
    r = r && optGTEIndent(b, l + 1);
    r = r && arrow_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean simple_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pragma?
  private static boolean simple_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expr_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (<<sigilOpr>> optind)? ident_or_literal primary_suffix* primary_suffix_cmd?
  public static boolean simple_primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_primary")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_PRIMARY, "<simple primary>");
    r = simple_primary_0(b, l + 1);
    r = r && ident_or_literal(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, simple_primary_2(b, l + 1));
    r = p && simple_primary_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (<<sigilOpr>> optind)?
  private static boolean simple_primary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_primary_0")) return false;
    simple_primary_0_0(b, l + 1);
    return true;
  }

  // <<sigilOpr>> optind
  private static boolean simple_primary_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_primary_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sigilOpr(b, l + 1);
    r = r && optind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // primary_suffix*
  private static boolean simple_primary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_primary_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primary_suffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simple_primary_2", c)) break;
    }
    return true;
  }

  // primary_suffix_cmd?
  private static boolean simple_primary_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_primary_3")) return false;
    primary_suffix_cmd(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( return_stmt
  //                           | raise_stmt
  //                           | yield_stmt
  //                           | discard_stmt
  //                           | break_stmt
  //                           | continue_stmt
  //                           | pragma_stmt
  //                           | import_stmt
  //                           | export_stmt
  //                           | from_stmt
  //                           | include_stmt
  //                           | comment_stmt
  //                           | expr_stmt
  //                           ) COMMENT?
  public static boolean simple_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_STMT, "<simple stmt>");
    r = simple_stmt_0(b, l + 1);
    r = r && simple_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // return_stmt
  //                           | raise_stmt
  //                           | yield_stmt
  //                           | discard_stmt
  //                           | break_stmt
  //                           | continue_stmt
  //                           | pragma_stmt
  //                           | import_stmt
  //                           | export_stmt
  //                           | from_stmt
  //                           | include_stmt
  //                           | comment_stmt
  //                           | expr_stmt
  private static boolean simple_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt_0")) return false;
    boolean r;
    r = return_stmt(b, l + 1);
    if (!r) r = raise_stmt(b, l + 1);
    if (!r) r = yield_stmt(b, l + 1);
    if (!r) r = discard_stmt(b, l + 1);
    if (!r) r = break_stmt(b, l + 1);
    if (!r) r = continue_stmt(b, l + 1);
    if (!r) r = pragma_stmt(b, l + 1);
    if (!r) r = import_stmt(b, l + 1);
    if (!r) r = export_stmt(b, l + 1);
    if (!r) r = from_stmt(b, l + 1);
    if (!r) r = include_stmt(b, l + 1);
    if (!r) r = comment_stmt(b, l + 1);
    if (!r) r = expr_stmt(b, l + 1);
    return r;
  }

  // COMMENT?
  private static boolean simple_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_stmt_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // amp_expr (&INDNONE OP6 INDGTEOPT amp_expr)*
  public static boolean slice_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SLICE_EXPR, "<Expression>");
    r = amp_expr(b, l + 1);
    r = r && slice_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (&INDNONE OP6 INDGTEOPT amp_expr)*
  private static boolean slice_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!slice_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slice_expr_1", c)) break;
    }
    return true;
  }

  // &INDNONE OP6 INDGTEOPT amp_expr
  private static boolean slice_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slice_expr_1_0_0(b, l + 1);
    r = r && OP6(b, l + 1);
    r = r && optGTEIndent(b, l + 1);
    r = r && amp_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean slice_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STATIC colon_comment stmt_list
  public static boolean static_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_stmt")) return false;
    if (!nextTokenIs(b, STATIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STATIC_STMT, null);
    r = consumeToken(b, STATIC);
    p = r; // pin = 1
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // if_stmt
  //                         | when_stmt
  //                         | while_stmt
  //                         | case_stmt
  //                         | try_stmt
  // //                        | EXCEPT except_block
  // //                        | FINALLY except_block
  //                         | for_stmt
  //                         | block_stmt
  //                         | static_stmt
  //                         | defer_stmt
  //                         | asm_stmt
  //                         | PROC routine
  //                         | METHOD routine
  //                         | FUNC routine
  //                         | ITERATOR routine
  //                         | MACRO routine
  //                         | TEMPLATE routine
  //                         | CONVERTER routine
  //                         | TYPE <<section type_def>>
  //                         | CONST <<section constant>>
  //                         | (LET | VAR | USING) <<section variable>>
  // //                        | bind_stmt
  // //                        | mixin_stmt
  //                         | simple_stmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = if_stmt(b, l + 1);
    if (!r) r = when_stmt(b, l + 1);
    if (!r) r = while_stmt(b, l + 1);
    if (!r) r = case_stmt(b, l + 1);
    if (!r) r = try_stmt(b, l + 1);
    if (!r) r = for_stmt(b, l + 1);
    if (!r) r = block_stmt(b, l + 1);
    if (!r) r = static_stmt(b, l + 1);
    if (!r) r = defer_stmt(b, l + 1);
    if (!r) r = asm_stmt(b, l + 1);
    if (!r) r = stmt_10(b, l + 1);
    if (!r) r = stmt_11(b, l + 1);
    if (!r) r = stmt_12(b, l + 1);
    if (!r) r = stmt_13(b, l + 1);
    if (!r) r = stmt_14(b, l + 1);
    if (!r) r = stmt_15(b, l + 1);
    if (!r) r = stmt_16(b, l + 1);
    if (!r) r = stmt_17(b, l + 1);
    if (!r) r = stmt_18(b, l + 1);
    if (!r) r = stmt_19(b, l + 1);
    if (!r) r = simple_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, NimParser::stmt_recover);
    return r;
  }

  // PROC routine
  private static boolean stmt_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_10")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, PROC);
    p = r; // pin = 1
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // METHOD routine
  private static boolean stmt_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_11")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, METHOD);
    p = r; // pin = 1
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // FUNC routine
  private static boolean stmt_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_12")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FUNC);
    p = r; // pin = 1
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ITERATOR routine
  private static boolean stmt_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_13")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ITERATOR);
    p = r; // pin = 1
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MACRO routine
  private static boolean stmt_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_14")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MACRO);
    p = r; // pin = 1
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TEMPLATE routine
  private static boolean stmt_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_15")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TEMPLATE);
    p = r; // pin = 1
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // CONVERTER routine
  private static boolean stmt_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_16")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, CONVERTER);
    p = r; // pin = 1
    r = r && routine(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TYPE <<section type_def>>
  private static boolean stmt_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_17")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, TYPE);
    p = r; // pin = 1
    r = r && section(b, l + 1, NimParser::type_def);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // CONST <<section constant>>
  private static boolean stmt_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_18")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, CONST);
    p = r; // pin = 1
    r = r && section(b, l + 1, NimParser::constant);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LET | VAR | USING) <<section variable>>
  private static boolean stmt_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_19")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = stmt_19_0(b, l + 1);
    p = r; // pin = 1
    r = r && section(b, l + 1, NimParser::variable);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LET | VAR | USING
  private static boolean stmt_19_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_19_0")) return false;
    boolean r;
    r = consumeToken(b, LET);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, USING);
    return r;
  }

  /* ********************************************************** */
  // &INDNONE <<list simple_stmt SEMICOLON>>
  //                         | &INDGT <<indented <<list stmt (SEMICOLON | INDEQ)>>>>
  public static boolean stmt_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT_LIST, "<stmt list>");
    r = stmt_list_0(b, l + 1);
    if (!r) r = stmt_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDNONE <<list simple_stmt SEMICOLON>>
  private static boolean stmt_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_list_0_0(b, l + 1);
    r = r && list(b, l + 1, NimParser::simple_stmt, SEMICOLON_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean stmt_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDGT <<indented <<list stmt (SEMICOLON | INDEQ)>>>>
  private static boolean stmt_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stmt_list_1_0(b, l + 1);
    r = r && indented(b, l + 1, stmt_list_1_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDGT
  private static boolean stmt_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indGreaterThan(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON | INDEQ
  private static boolean stmt_list_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_list_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = indEquals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(SEMICOLON | INDEQ | INDLT | INDZERO)
  static boolean stmt_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !stmt_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON | INDEQ | INDLT | INDZERO
  private static boolean stmt_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = indEquals(b, l + 1);
    if (!r) r = indLessThan(b, l + 1);
    if (!r) r = indZero(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( ACCENT
  //                             ( keyword | IDENT
  //                             | (operator|DOT|DOTDOT|EQUALS|LPAREN|RPAREN|LBRACKET|RBRACKET|LBRACE|RBRACE)+
  //                             )+
  //                             ACCENT
  //                           )
  //                           | IDENT | built_in_magics
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = symbol_0(b, l + 1);
    if (!r) r = IDENT(b, l + 1);
    if (!r) r = built_in_magics(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ACCENT
  //                             ( keyword | IDENT
  //                             | (operator|DOT|DOTDOT|EQUALS|LPAREN|RPAREN|LBRACKET|RBRACKET|LBRACE|RBRACE)+
  //                             )+
  //                             ACCENT
  private static boolean symbol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ACCENT);
    p = r; // pin = 1
    r = r && report_error_(b, symbol_0_1(b, l + 1));
    r = p && consumeToken(b, ACCENT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ( keyword | IDENT
  //                             | (operator|DOT|DOTDOT|EQUALS|LPAREN|RPAREN|LBRACKET|RBRACKET|LBRACE|RBRACE)+
  //                             )+
  private static boolean symbol_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // keyword | IDENT
  //                             | (operator|DOT|DOTDOT|EQUALS|LPAREN|RPAREN|LBRACKET|RBRACKET|LBRACE|RBRACE)+
  private static boolean symbol_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keyword(b, l + 1);
    if (!r) r = IDENT(b, l + 1);
    if (!r) r = symbol_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (operator|DOT|DOTDOT|EQUALS|LPAREN|RPAREN|LBRACKET|RBRACKET|LBRACE|RBRACE)+
  private static boolean symbol_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol_0_1_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!symbol_0_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_0_1_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // operator|DOT|DOTDOT|EQUALS|LPAREN|RPAREN|LBRACKET|RBRACKET|LBRACE|RBRACE
  private static boolean symbol_0_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0_1_0_2_0")) return false;
    boolean r;
    r = operator(b, l + 1);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, DOTDOT);
    if (!r) r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, LBRACKET);
    if (!r) r = consumeToken(b, RBRACKET);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

  /* ********************************************************** */
  // symbol | keyword
  public static boolean symbol_or_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_or_keyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_OR_KEYWORD, "<symbol or keyword>");
    r = symbol(b, l + 1);
    if (!r) r = keyword(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRY colon_comment stmt_list &(optind (EXCEPT|FINALLY))
  //                           (optind EXCEPT optional_expr_list colon_comment stmt_list)*
  //                           (optind FINALLY colon_comment stmt_list)?
  public static boolean try_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr")) return false;
    if (!nextTokenIsFast(b, TRY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRY_EXPR, "<Expression>");
    r = consumeTokenFast(b, TRY);
    p = r; // pin = 1
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && report_error_(b, stmt_list(b, l + 1)) && r;
    r = p && report_error_(b, try_expr_3(b, l + 1)) && r;
    r = p && report_error_(b, try_expr_4(b, l + 1)) && r;
    r = p && try_expr_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &(optind (EXCEPT|FINALLY))
  private static boolean try_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr_3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = try_expr_3_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // optind (EXCEPT|FINALLY)
  private static boolean try_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optind(b, l + 1);
    r = r && try_expr_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EXCEPT|FINALLY
  private static boolean try_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr_3_0_1")) return false;
    boolean r;
    r = consumeTokenFast(b, EXCEPT);
    if (!r) r = consumeTokenFast(b, FINALLY);
    return r;
  }

  // (optind EXCEPT optional_expr_list colon_comment stmt_list)*
  private static boolean try_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!try_expr_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "try_expr_4", c)) break;
    }
    return true;
  }

  // optind EXCEPT optional_expr_list colon_comment stmt_list
  private static boolean try_expr_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr_4_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = optind(b, l + 1);
    r = r && consumeToken(b, EXCEPT);
    p = r; // pin = 2
    r = r && report_error_(b, optional_expr_list(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (optind FINALLY colon_comment stmt_list)?
  private static boolean try_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr_5")) return false;
    try_expr_5_0(b, l + 1);
    return true;
  }

  // optind FINALLY colon_comment stmt_list
  private static boolean try_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_expr_5_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = optind(b, l + 1);
    r = r && consumeToken(b, FINALLY);
    p = r; // pin = 2
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TRY colon_comment stmt_list &(INDEQ? (EXCEPT|FINALLY))
  //                           (INDEQ? EXCEPT opt_expr_list colon_comment stmt_list)*
  //                           (INDEQ? FINALLY colon_comment stmt_list)?
  public static boolean try_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRY_STMT, null);
    r = consumeToken(b, TRY);
    r = r && colon_comment(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, stmt_list(b, l + 1));
    r = p && report_error_(b, try_stmt_3(b, l + 1)) && r;
    r = p && report_error_(b, try_stmt_4(b, l + 1)) && r;
    r = p && try_stmt_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // &(INDEQ? (EXCEPT|FINALLY))
  private static boolean try_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = try_stmt_3_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INDEQ? (EXCEPT|FINALLY)
  private static boolean try_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_stmt_3_0_0(b, l + 1);
    r = r && try_stmt_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEQ?
  private static boolean try_stmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_0")) return false;
    indEquals(b, l + 1);
    return true;
  }

  // EXCEPT|FINALLY
  private static boolean try_stmt_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_3_0_1")) return false;
    boolean r;
    r = consumeToken(b, EXCEPT);
    if (!r) r = consumeToken(b, FINALLY);
    return r;
  }

  // (INDEQ? EXCEPT opt_expr_list colon_comment stmt_list)*
  private static boolean try_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!try_stmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "try_stmt_4", c)) break;
    }
    return true;
  }

  // INDEQ? EXCEPT opt_expr_list colon_comment stmt_list
  private static boolean try_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_4_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = try_stmt_4_0_0(b, l + 1);
    r = r && consumeToken(b, EXCEPT);
    p = r; // pin = 2
    r = r && report_error_(b, opt_expr_list(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // INDEQ?
  private static boolean try_stmt_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_4_0_0")) return false;
    indEquals(b, l + 1);
    return true;
  }

  // (INDEQ? FINALLY colon_comment stmt_list)?
  private static boolean try_stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_5")) return false;
    try_stmt_5_0(b, l + 1);
    return true;
  }

  // INDEQ? FINALLY colon_comment stmt_list
  private static boolean try_stmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_5_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = try_stmt_5_0_0(b, l + 1);
    r = r && consumeToken(b, FINALLY);
    p = r; // pin = 2
    r = r && report_error_(b, colon_comment(b, l + 1));
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // INDEQ?
  private static boolean try_stmt_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_stmt_5_0_0")) return false;
    indEquals(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN optind expr_colon_eq_expr_list? optpar RPAREN
  public static boolean tuple_constr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_constr")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_CONSTR, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, tuple_constr_2(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expr_colon_eq_expr_list?
  private static boolean tuple_constr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_constr_2")) return false;
    expr_colon_eq_expr_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TUPLE
  //                           ( tuple_type_bracket
  //                           | COMMENT? ( <<indented <<list <<ident_colon_equals_1 IDENT>> INDEQ>>>> )?
  //                           )
  public static boolean tuple_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_decl")) return false;
    if (!nextTokenIs(b, TUPLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_DECL, null);
    r = consumeToken(b, TUPLE);
    p = r; // pin = 1
    r = r && tuple_decl_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // tuple_type_bracket
  //                           | COMMENT? ( <<indented <<list <<ident_colon_equals_1 IDENT>> INDEQ>>>> )?
  private static boolean tuple_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_type_bracket(b, l + 1);
    if (!r) r = tuple_decl_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT? ( <<indented <<list <<ident_colon_equals_1 IDENT>> INDEQ>>>> )?
  private static boolean tuple_decl_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_decl_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_decl_1_1_0(b, l + 1);
    r = r && tuple_decl_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT?
  private static boolean tuple_decl_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_decl_1_1_0")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  // ( <<indented <<list <<ident_colon_equals_1 IDENT>> INDEQ>>>> )?
  private static boolean tuple_decl_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_decl_1_1_1")) return false;
    tuple_decl_1_1_1_0(b, l + 1);
    return true;
  }

  // <<indented <<list <<ident_colon_equals_1 IDENT>> INDEQ>>>>
  private static boolean tuple_decl_1_1_1_0(PsiBuilder b, int l) {
    return indented(b, l + 1, tuple_decl_1_1_1_0_0_0_parser_);
  }

  /* ********************************************************** */
  // TUPLE tuple_type_bracket
  public static boolean tuple_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type")) return false;
    if (!nextTokenIs(b, TUPLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_TYPE, null);
    r = consumeToken(b, TUPLE);
    p = r; // pin = 1
    r = r && tuple_type_bracket(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LBRACKET optind (<<ident_colon_equals_1 IDENT>> (COMMA|SEMICOLON)?)* optpar RBRACKET
  public static boolean tuple_type_bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_bracket")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_TYPE_BRACKET, null);
    r = consumeToken(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, tuple_type_bracket_2(b, l + 1)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (<<ident_colon_equals_1 IDENT>> (COMMA|SEMICOLON)?)*
  private static boolean tuple_type_bracket_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_bracket_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_type_bracket_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_type_bracket_2", c)) break;
    }
    return true;
  }

  // <<ident_colon_equals_1 IDENT>> (COMMA|SEMICOLON)?
  private static boolean tuple_type_bracket_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_bracket_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ident_colon_equals_1(b, l + 1, NimParser::IDENT);
    r = r && tuple_type_bracket_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA|SEMICOLON)?
  private static boolean tuple_type_bracket_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_bracket_2_0_1")) return false;
    tuple_type_bracket_2_0_1_0(b, l + 1);
    return true;
  }

  // COMMA|SEMICOLON
  private static boolean tuple_type_bracket_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_bracket_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // ident_vis generic_param_list? pragma? EQUALS optind type_def_value ind_and_comment
  public static boolean type_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF, "<type def>");
    r = ident_vis(b, l + 1);
    r = r && type_def_1(b, l + 1);
    r = r && type_def_2(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    p = r; // pin = 4
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, type_def_value(b, l + 1)) && r;
    r = p && ind_and_comment(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // generic_param_list?
  private static boolean type_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_1")) return false;
    generic_param_list(b, l + 1);
    return true;
  }

  // pragma?
  private static boolean type_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_2")) return false;
    pragma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( ( tuple_decl | enum_decl | object_decl | concept_decl
  //                             | (REF | PTR | DISTINCT) (tuple_decl | object_decl)
  //                             )
  //                           | simple_expr (COMMA <<list expr_eq_expr COMMA>> post_expr_blocks?)?
  //                           )
  //                           (NOT primary_expr)?
  public static boolean type_def_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEF_VALUE, "<type def value>");
    r = type_def_value_0(b, l + 1);
    r = r && type_def_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( tuple_decl | enum_decl | object_decl | concept_decl
  //                             | (REF | PTR | DISTINCT) (tuple_decl | object_decl)
  //                             )
  //                           | simple_expr (COMMA <<list expr_eq_expr COMMA>> post_expr_blocks?)?
  private static boolean type_def_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_def_value_0_0(b, l + 1);
    if (!r) r = type_def_value_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tuple_decl | enum_decl | object_decl | concept_decl
  //                             | (REF | PTR | DISTINCT) (tuple_decl | object_decl)
  private static boolean type_def_value_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_decl(b, l + 1);
    if (!r) r = enum_decl(b, l + 1);
    if (!r) r = object_decl(b, l + 1);
    if (!r) r = concept_decl(b, l + 1);
    if (!r) r = type_def_value_0_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (REF | PTR | DISTINCT) (tuple_decl | object_decl)
  private static boolean type_def_value_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_def_value_0_0_4_0(b, l + 1);
    r = r && type_def_value_0_0_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // REF | PTR | DISTINCT
  private static boolean type_def_value_0_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_0_4_0")) return false;
    boolean r;
    r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, PTR);
    if (!r) r = consumeToken(b, DISTINCT);
    return r;
  }

  // tuple_decl | object_decl
  private static boolean type_def_value_0_0_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_0_4_1")) return false;
    boolean r;
    r = tuple_decl(b, l + 1);
    if (!r) r = object_decl(b, l + 1);
    return r;
  }

  // simple_expr (COMMA <<list expr_eq_expr COMMA>> post_expr_blocks?)?
  private static boolean type_def_value_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expr(b, l + 1);
    r = r && type_def_value_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA <<list expr_eq_expr COMMA>> post_expr_blocks?)?
  private static boolean type_def_value_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_1_1")) return false;
    type_def_value_0_1_1_0(b, l + 1);
    return true;
  }

  // COMMA <<list expr_eq_expr COMMA>> post_expr_blocks?
  private static boolean type_def_value_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && list(b, l + 1, NimParser::expr_eq_expr, COMMA_parser_);
    r = r && type_def_value_0_1_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // post_expr_blocks?
  private static boolean type_def_value_0_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_0_1_1_0_2")) return false;
    post_expr_blocks(b, l + 1);
    return true;
  }

  // (NOT primary_expr)?
  private static boolean type_def_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_1")) return false;
    type_def_value_1_0(b, l + 1);
    return true;
  }

  // NOT primary_expr
  private static boolean type_def_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_def_value_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && primary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // raw_type_desc | type_desc_expr
  public static boolean type_desc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_desc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DESC, "<type desc>");
    r = raw_type_desc(b, l + 1);
    if (!r) r = type_desc_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (routine_type | simple_expr) (NOT primary_expr)?
  public static boolean type_desc_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_desc_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE_DESC_EXPR, "<Expression>");
    r = type_desc_expr_0(b, l + 1);
    r = r && type_desc_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // routine_type | simple_expr
  private static boolean type_desc_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_desc_expr_0")) return false;
    boolean r;
    r = routine_type(b, l + 1);
    if (!r) r = simple_expr(b, l + 1);
    return r;
  }

  // (NOT primary_expr)?
  private static boolean type_desc_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_desc_expr_1")) return false;
    type_desc_expr_1_0(b, l + 1);
    return true;
  }

  // NOT primary_expr
  private static boolean type_desc_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_desc_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, NOT);
    r = r && primary_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN optind
  //                           <<list ((ident_with_pragma | var_tuple) COMMENT?) COMMA>>
  //                           optpar RPAREN
  public static boolean var_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_tuple")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VAR_TUPLE, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, optind(b, l + 1));
    r = p && report_error_(b, list(b, l + 1, NimParser::var_tuple_2_0, COMMA_parser_)) && r;
    r = p && report_error_(b, optpar(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ident_with_pragma | var_tuple) COMMENT?
  private static boolean var_tuple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_tuple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_tuple_2_0_0(b, l + 1);
    r = r && var_tuple_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ident_with_pragma | var_tuple
  private static boolean var_tuple_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_tuple_2_0_0")) return false;
    boolean r;
    r = ident_with_pragma(b, l + 1);
    if (!r) r = var_tuple(b, l + 1);
    return r;
  }

  // COMMENT?
  private static boolean var_tuple_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_tuple_2_0_1")) return false;
    COMMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (var_tuple EQUALS optind expr | <<ident_colon_equals_1 ident_dot_with_pragma>>)
  //                           post_expr_blocks? ind_and_comment
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = variable_0(b, l + 1);
    r = r && variable_1(b, l + 1);
    r = r && ind_and_comment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var_tuple EQUALS optind expr | <<ident_colon_equals_1 ident_dot_with_pragma>>
  private static boolean variable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_0_0(b, l + 1);
    if (!r) r = ident_colon_equals_1(b, l + 1, NimParser::ident_dot_with_pragma);
    exit_section_(b, m, null, r);
    return r;
  }

  // var_tuple EQUALS optind expr
  private static boolean variable_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_tuple(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && optind(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // post_expr_blocks?
  private static boolean variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_1")) return false;
    post_expr_blocks(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WHEN cond_expr
  public static boolean when_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_expr")) return false;
    if (!nextTokenIsFast(b, WHEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_EXPR, "<Expression>");
    r = consumeTokenFast(b, WHEN);
    p = r; // pin = 1
    r = r && cond_expr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // WHEN cond_stmt
  public static boolean when_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_stmt")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHEN_STMT, null);
    r = consumeToken(b, WHEN);
    p = r; // pin = 1
    r = r && cond_stmt(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // WHILE expr colon_comment stmt_list
  public static boolean while_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_stmt")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, null);
    r = consumeToken(b, WHILE);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1));
    r = p && report_error_(b, colon_comment(b, l + 1)) && r;
    r = p && stmt_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // YIELD <<maybeind expr>>?
  public static boolean yield_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_stmt")) return false;
    if (!nextTokenIs(b, YIELD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, YIELD_STMT, null);
    r = consumeToken(b, YIELD);
    p = r; // pin = 1
    r = r && yield_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<maybeind expr>>?
  private static boolean yield_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_stmt_1")) return false;
    maybeind(b, l + 1, NimParser::expr);
    return true;
  }

  static final Parser COMMA_parser_ = (b, l) -> consumeToken(b, COMMA);
  static final Parser DOTDOT_parser_ = (b, l) -> consumeToken(b, DOTDOT);
  static final Parser INDEQ_parser_ = (b, l) -> indEquals(b, l + 1);
  static final Parser SEMICOLON_parser_ = (b, l) -> consumeToken(b, SEMICOLON);
  static final Parser expr_stmt_1_1_0_1_0_parser_ = (b, l) -> pmNormal(b, l + 1, NimParser::command_param_extra);

  private static final Parser param_list_2_0_parser_ = ident_colon_equals_0_$(NimParser::ident_with_pragma);
  private static final Parser stmt_list_1_1_0_parser_ = list_$(NimParser::stmt, NimParser::stmt_list_1_1_0_1);
  private static final Parser tuple_decl_1_1_1_0_0_0_0_parser_ = ident_colon_equals_1_$(NimParser::IDENT);
  private static final Parser tuple_decl_1_1_1_0_0_0_parser_ = list_$(tuple_decl_1_1_1_0_0_0_0_parser_, INDEQ_parser_);
}
