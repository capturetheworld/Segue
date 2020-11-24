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
	 * Visit a parse tree produced by {@link SegfaultParser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(SegfaultParser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#programParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramParameters(SegfaultParser.ProgramParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#programIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIdentifier(SegfaultParser.ProgramIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SegfaultParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(SegfaultParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SegfaultParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SegfaultParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#truestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruestatement(SegfaultParser.TruestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#falsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalsestatement(SegfaultParser.FalsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(SegfaultParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(SegfaultParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#printlnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnstatement(SegfaultParser.PrintlnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SegfaultParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#varIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifier(SegfaultParser.VarIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SegfaultParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(SegfaultParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#doubleConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleConstant(SegfaultParser.DoubleConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(SegfaultParser.BooleanConstantContext ctx);
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
	 * Visit a parse tree produced by {@link SegfaultParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(SegfaultParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(SegfaultParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(SegfaultParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(SegfaultParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(SegfaultParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SegfaultParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(SegfaultParser.PrintlnContext ctx);
}