// Generated from /Users/ian/Documents/Github/CS153-Compiler-Design/Exam/BDL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BDLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BDLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BDLParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(BDLParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BDLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BDLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BDLParser#asgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgn(BDLParser.AsgnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BDLParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(BDLParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BDLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BDLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BDLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(BDLParser.VarContext ctx);
}