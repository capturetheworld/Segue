// Generated from c:\Users\mcnan\Documents\SJSU\Fall 2020\CS 153\CS153-Compiler-Design\FINAL PROJECT\Segfault.g4 by ANTLR 4.8

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
	 * Visit a parse tree produced by {@link SegfaultParser#numericalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpression(SegfaultParser.NumericalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SegfaultParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SegfaultParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#numIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIdentifier(SegfaultParser.NumIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#numSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumSymbol(SegfaultParser.NumSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(SegfaultParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#booleanTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTerm(SegfaultParser.BooleanTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#booleanSingleton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSingleton(SegfaultParser.BooleanSingletonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#boolIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIdentifier(SegfaultParser.BoolIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#boolSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSymbol(SegfaultParser.BoolSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#notSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSymbol(SegfaultParser.NotSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#orSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrSymbol(SegfaultParser.OrSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#andSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndSymbol(SegfaultParser.AndSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(SegfaultParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(SegfaultParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(SegfaultParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(SegfaultParser.MulOpContext ctx);
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
	 * Visit a parse tree produced by {@link SegfaultParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SegfaultParser.SignContext ctx);
}