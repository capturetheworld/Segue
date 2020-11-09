// Generated from /Users/ian/Documents/GitHub/CS153-Compiler-Design/HW6/Pascal.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(PascalParser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#programParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramParameters(PascalParser.ProgramParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#programIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIdentifier(PascalParser.ProgramIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(PascalParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantsPart(PascalParser.ConstantsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantDefinitionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionsList(PascalParser.ConstantDefinitionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(PascalParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constantIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantIdentifier(PascalParser.ConstantIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PascalParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(PascalParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typesPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesPart(PascalParser.TypesPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeDefinitionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionsList(PascalParser.TypeDefinitionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(PascalParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(PascalParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypespec(PascalParser.SimpleTypespecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypespec(PascalParser.ArrayTypespecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordTypespec}
	 * labeled alternative in {@link PascalParser#typeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTypespec(PascalParser.RecordTypespecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeIdentifierTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifierTypespec(PascalParser.TypeIdentifierTypespecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumerationTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationTypespec(PascalParser.EnumerationTypespecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subrangeTypespec}
	 * labeled alternative in {@link PascalParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeTypespec(PascalParser.SubrangeTypespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#enumerationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationType(PascalParser.EnumerationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(PascalParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(PascalParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PascalParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#arrayDimensionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDimensionList(PascalParser.ArrayDimensionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(PascalParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordFields(PascalParser.RecordFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variablesPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesPart(PascalParser.VariablesPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDeclarationsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationsList(PascalParser.VariableDeclarationsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarations(PascalParser.VariableDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifierList(PascalParser.VariableIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(PascalParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#routinesPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutinesPart(PascalParser.RoutinesPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#routineDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineDefinition(PascalParser.RoutineDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureHead(PascalParser.ProcedureHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHead(PascalParser.FunctionHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#routineIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineIdentifier(PascalParser.RoutineIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PascalParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterDeclarationsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationsList(PascalParser.ParameterDeclarationsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarations(PascalParser.ParameterDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterIdentifierList(PascalParser.ParameterIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterIdentifier(PascalParser.ParameterIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(PascalParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(PascalParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(PascalParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#trueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStatement(PascalParser.TrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#falseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStatement(PascalParser.FalseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(PascalParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseBranchList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranchList(PascalParser.CaseBranchListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(PascalParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstantList(PascalParser.CaseConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#caseConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstant(PascalParser.CaseConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(PascalParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCallStatement(PascalParser.ProcedureCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(PascalParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(PascalParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PascalParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(PascalParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#writelnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritelnStatement(PascalParser.WritelnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#writeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArguments(PascalParser.WriteArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#writeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgument(PascalParser.WriteArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#fieldWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldWidth(PascalParser.FieldWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#decimalPlaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalPlaces(PascalParser.DecimalPlacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(PascalParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#readlnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadlnStatement(PascalParser.ReadlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#readArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadArguments(PascalParser.ReadArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(PascalParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(PascalParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(PascalParser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(PascalParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFactor(PascalParser.FunctionCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(PascalParser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(PascalParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(PascalParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#indexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexList(PascalParser.IndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(PascalParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(PascalParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PascalParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(PascalParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PascalParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(PascalParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(PascalParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(PascalParser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(PascalParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(PascalParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(PascalParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(PascalParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(PascalParser.MulOpContext ctx);
}