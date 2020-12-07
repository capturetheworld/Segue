// Generated from /Users/adanhernandez/Desktop/PRO/FALL 2020/CS 153/Assignment 2/CS153-Compiler-Design/FINAL PROJECT/Segue.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SegueParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SegueVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SegueParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SegueParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SegueParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#lineList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineList(SegueParser.LineListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SegueParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(SegueParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(SegueParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SegueParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SegueParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SegueParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SegueParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#printArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArguments(SegueParser.PrintArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthStatement(SegueParser.SynthStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthFunction(SegueParser.SynthFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SegueParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#functionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionID(SegueParser.FunctionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#functionSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSymbol(SegueParser.FunctionSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(SegueParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SegueParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(SegueParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(SegueParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#numericalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpression(SegueParser.NumericalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SegueParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SegueParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(SegueParser.PrefixOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#suffixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixOp(SegueParser.SuffixOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#numIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIdentifier(SegueParser.NumIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#numSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumSymbol(SegueParser.NumSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(SegueParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#booleanTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTerm(SegueParser.BooleanTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#booleanSingleton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSingleton(SegueParser.BooleanSingletonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#notStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotStatement(SegueParser.NotStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#notSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSymbol(SegueParser.NotSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#boolIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIdentifier(SegueParser.BoolIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#boolSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSymbol(SegueParser.BoolSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthSetFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthSetFunction(SegueParser.SynthSetFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthChannelFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthChannelFunction(SegueParser.SynthChannelFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthNoteFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthNoteFunction(SegueParser.SynthNoteFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthStartFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthStartFunction(SegueParser.SynthStartFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthNoteSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthNoteSet(SegueParser.SynthNoteSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthNoteLerp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthNoteLerp(SegueParser.SynthNoteLerpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthPointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthPointStatement(SegueParser.SynthPointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthMidiPitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthMidiPitch(SegueParser.SynthMidiPitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthVolume}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthVolume(SegueParser.SynthVolumeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthVibratoAmplitude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthVibratoAmplitude(SegueParser.SynthVibratoAmplitudeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#synthVibratoFrequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthVibratoFrequency(SegueParser.SynthVibratoFrequencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(SegueParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(SegueParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(SegueParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(SegueParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(SegueParser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#numberConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConstant(SegueParser.NumberConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(SegueParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#unsignedintegerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedintegerConstant(SegueParser.UnsignedintegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#unsigneddoubleConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigneddoubleConstant(SegueParser.UnsigneddoubleConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegueParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SegueParser.SignContext ctx);
}