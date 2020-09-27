// Generated from /Users/ian/Documents/GitHub/CS153-Compiler-Design/HW4/Pcl4.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Pcl4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Pcl4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Pcl4Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(Pcl4Parser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#programParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramParameters(Pcl4Parser.ProgramParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Pcl4Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(Pcl4Parser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Pcl4Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(Pcl4Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Pcl4Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(Pcl4Parser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(Pcl4Parser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(Pcl4Parser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Pcl4Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Pcl4Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Pcl4Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(Pcl4Parser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(Pcl4Parser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(Pcl4Parser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(Pcl4Parser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writelnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritelnStatement(Pcl4Parser.WritelnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Pcl4Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(Pcl4Parser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Pcl4Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(Pcl4Parser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(Pcl4Parser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(Pcl4Parser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(Pcl4Parser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(Pcl4Parser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(Pcl4Parser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Pcl4Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Pcl4Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(Pcl4Parser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(Pcl4Parser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(Pcl4Parser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(Pcl4Parser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(Pcl4Parser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(Pcl4Parser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(Pcl4Parser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(Pcl4Parser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(Pcl4Parser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(Pcl4Parser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(Pcl4Parser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writeArgumentsOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgumentsOn(Pcl4Parser.WriteArgumentsOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writeArgumentListOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgumentListOn(Pcl4Parser.WriteArgumentListOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writeArgumentsLn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgumentsLn(Pcl4Parser.WriteArgumentsLnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writeArgumentListLn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgumentListLn(Pcl4Parser.WriteArgumentListLnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgumentList(Pcl4Parser.WriteArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#writeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgument(Pcl4Parser.WriteArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#fieldWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldWidth(Pcl4Parser.FieldWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pcl4Parser#decimalPlaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalPlaces(Pcl4Parser.DecimalPlacesContext ctx);
}