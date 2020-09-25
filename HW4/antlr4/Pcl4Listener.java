// Generated from c:\Users\mcnan\Documents\SJSU\Fall 2020\CS 153\CS153-Compiler-Design\HW4\Pcl4.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Pcl4Parser}.
 */
public interface Pcl4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Pcl4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Pcl4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(Pcl4Parser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(Pcl4Parser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#programParameters}.
	 * @param ctx the parse tree
	 */
	void enterProgramParameters(Pcl4Parser.ProgramParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#programParameters}.
	 * @param ctx the parse tree
	 */
	void exitProgramParameters(Pcl4Parser.ProgramParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Pcl4Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Pcl4Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Pcl4Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Pcl4Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Pcl4Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Pcl4Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(Pcl4Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(Pcl4Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Pcl4Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Pcl4Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(Pcl4Parser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(Pcl4Parser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(Pcl4Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(Pcl4Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(Pcl4Parser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(Pcl4Parser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(Pcl4Parser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(Pcl4Parser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(Pcl4Parser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(Pcl4Parser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(Pcl4Parser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(Pcl4Parser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void enterWritelnStatement(Pcl4Parser.WritelnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writelnStatement}.
	 * @param ctx the parse tree
	 */
	void exitWritelnStatement(Pcl4Parser.WritelnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Pcl4Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Pcl4Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(Pcl4Parser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(Pcl4Parser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Pcl4Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Pcl4Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(Pcl4Parser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(Pcl4Parser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(Pcl4Parser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(Pcl4Parser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(Pcl4Parser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(Pcl4Parser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(Pcl4Parser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(Pcl4Parser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(Pcl4Parser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(Pcl4Parser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(Pcl4Parser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link Pcl4Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(Pcl4Parser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Pcl4Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Pcl4Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Pcl4Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Pcl4Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(Pcl4Parser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(Pcl4Parser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(Pcl4Parser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(Pcl4Parser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(Pcl4Parser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(Pcl4Parser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(Pcl4Parser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(Pcl4Parser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(Pcl4Parser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(Pcl4Parser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(Pcl4Parser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(Pcl4Parser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(Pcl4Parser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(Pcl4Parser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(Pcl4Parser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(Pcl4Parser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(Pcl4Parser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(Pcl4Parser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writeArgumentsOn}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgumentsOn(Pcl4Parser.WriteArgumentsOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writeArgumentsOn}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgumentsOn(Pcl4Parser.WriteArgumentsOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writeArgumentListOn}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgumentListOn(Pcl4Parser.WriteArgumentListOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writeArgumentListOn}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgumentListOn(Pcl4Parser.WriteArgumentListOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writeArgumentsLn}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgumentsLn(Pcl4Parser.WriteArgumentsLnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writeArgumentsLn}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgumentsLn(Pcl4Parser.WriteArgumentsLnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writeArgumentListLn}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgumentListLn(Pcl4Parser.WriteArgumentListLnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writeArgumentListLn}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgumentListLn(Pcl4Parser.WriteArgumentListLnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgumentList(Pcl4Parser.WriteArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgumentList(Pcl4Parser.WriteArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(Pcl4Parser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(Pcl4Parser.WriteArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void enterFieldWidth(Pcl4Parser.FieldWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#fieldWidth}.
	 * @param ctx the parse tree
	 */
	void exitFieldWidth(Pcl4Parser.FieldWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pcl4Parser#decimalPlaces}.
	 * @param ctx the parse tree
	 */
	void enterDecimalPlaces(Pcl4Parser.DecimalPlacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pcl4Parser#decimalPlaces}.
	 * @param ctx the parse tree
	 */
	void exitDecimalPlaces(Pcl4Parser.DecimalPlacesContext ctx);
}