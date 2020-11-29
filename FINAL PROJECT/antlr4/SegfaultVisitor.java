// Generated from /Users/ian/Documents/GitHub/CS153-Compiler-Design/FINAL PROJECT/Segfault.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SegfaultParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SegfaultVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SegfaultParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SegfaultParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SegfaultParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SegfaultParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SegfaultParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SegfaultParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(SegfaultParser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#numberConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConstant(SegfaultParser.NumberConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(SegfaultParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#unsignedintegerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedintegerConstant(SegfaultParser.UnsignedintegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#unsigneddoubleConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigneddoubleConstant(SegfaultParser.UnsigneddoubleConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#boolSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSymbol(SegfaultParser.BoolSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#doubleSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSymbol(SegfaultParser.DoubleSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(SegfaultParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SegfaultParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SegfaultParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(SegfaultParser.PrintlnContext ctx);
}