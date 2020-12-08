package backend.compiler;

import antlr4.*;

import intermediate.symtab.*;
import intermediate.symtab.Predefined;
import intermediate.type.Typespec;

/**
 * Compile Pascal to Jasmin assembly language.
 */
public class Compiler extends SegueBaseVisitor<Object>
{
    private SymtabEntry programId;  // symbol table entry of the program name
    private String programName;     // the program name
    
    private CodeGenerator       code;            // base code generator
    private ProgramGenerator    programCode;     // program code generator
    private StatementGenerator  statementCode;   // statement code generator
    private ExpressionGenerator expressionCode;  // expression code generator
    
    /**
     * Constructor for the base compiler.
     * @param programId the symtab entry for the program name.
     */
    public Compiler(SymtabEntry programId)
    {
        this.programId = programId;        
        programName = programId.getName();
        
        code = new CodeGenerator(programName, "j", this);
    }
    
    /**
     * Constructor for child compilers of procedures and functions.
     * @param parent the parent compiler.
     */
    public Compiler(Compiler parent)
    {
        this.code        = parent.code;
        this.programCode = parent.programCode;
        this.programId   = parent.programId;
        this.programName = parent.programName;
    }
    
    /**
     * Constructor for child compilers of records.
     * @param parent the parent compiler.
     * @param recordId the symbol table entry of the name of the record to compile.
     */
	/*
    public Compiler(Compiler parent, SymtabEntry recordId)
    {        
        //String recordTypePath = recordId.getType().getRecordTypePath();
        code = new CodeGenerator(recordTypePath, "j", this);
        createNewGenerators(code);
        
       // programCode.emitRecord(recordId, recordTypePath);
    }
    */
    /**
     * Create new child code generators.
     * @param parentGenerator the parent code generator.
     */
    private void createNewGenerators(CodeGenerator parentGenerator)
    {
        programCode    = new ProgramGenerator(parentGenerator, this);
        statementCode  = new StatementGenerator(programCode, this);
        expressionCode = new ExpressionGenerator(programCode, this);
    }

    /**
     * Get the name of the object (Jasmin) file.
     * @return the name.
     */
    public String getObjectFileName() { return code.getObjectFileName(); }
    /** 
    @Override 
    public Object visitProgram(PascalParser.ProgramContext ctx) 
    { 
        createNewGenerators(code);
        programCode.emitProgram(ctx);
        return null;
    }

    @Override 
    public Object visitRoutineDefinition(
                                    PascalParser.RoutineDefinitionContext ctx) 
    {
        createNewGenerators(programCode);
        programCode.emitRoutine(ctx);
        return null;
    }
    
    @Override 
    public Object visitStatement(PascalParser.StatementContext ctx) 
    {
        if (   (ctx.compoundStatement() == null) 
            && (ctx.emptyStatement() == null))
        {
            statementCode.emitComment(ctx);
        }
        
        return visitChildren(ctx);
    }

    @Override 
    public Object visitAssignmentStatement(
                                    PascalParser.AssignmentStatementContext ctx) 
    {
        statementCode.emitAssignment(ctx);
        return null;
    }

    @Override 
    public Object visitIfStatement(PascalParser.IfStatementContext ctx) 
    {
        statementCode.emitIf(ctx);
        return null;
    }

    @Override 
    public Object visitCaseStatement(PascalParser.CaseStatementContext ctx) 
    {
        statementCode.emitCase(ctx);
        return null;
    }

    @Override 
    public Object visitRepeatStatement(PascalParser.RepeatStatementContext ctx) 
    {
        statementCode.emitRepeat(ctx);
        return null;
    }

    @Override 
    public Object visitWhileStatement(PascalParser.WhileStatementContext ctx) 
    {
        statementCode.emitWhile(ctx);
        return null;
    }

    @Override 
    public Object visitForStatement(PascalParser.ForStatementContext ctx) 
    {
        statementCode.emitFor(ctx);
        return null;
    }

    @Override 
    public Object visitProcedureCallStatement(
                                PascalParser.ProcedureCallStatementContext ctx) 
    {
        statementCode.emitProcedureCall(ctx);
        return null;
    }

    @Override 
    public Object visitExpression(PascalParser.ExpressionContext ctx) 
    {
        expressionCode.emitExpression(ctx);
        return null;
    }

    @Override 
    public Object visitVariableFactor(PascalParser.VariableFactorContext ctx) 
    {
        expressionCode.emitLoadValue(ctx.variable());
        return null;
    }

    @Override 
    public Object visitVariable(PascalParser.VariableContext ctx) 
    {
        expressionCode.emitLoadVariable(ctx);        
        return null;
    }

    @Override 
    public Object visitNumberFactor(PascalParser.NumberFactorContext ctx) 
    {
        if (ctx.type == Predefined.integerType) 
        {
            expressionCode.emitLoadIntegerConstant(ctx.number());
        }
        else
        {
            expressionCode.emitLoadRealConstant(ctx.number());
        }
        
        return null;
    }

    @Override 
    public Object visitCharacterFactor(PascalParser.CharacterFactorContext ctx) 
    {
        char ch = ctx.getText().charAt(1);
        expressionCode.emitLoadConstant(ch);

        return null;
    }

    @Override 
    public Object visitStringFactor(PascalParser.StringFactorContext ctx) 
    {
        String jasminString = convertString(ctx.getText());
        expressionCode.emitLoadConstant(jasminString);
        
        return null;
    }
   
    
     * Convert a Pascal string to a Java string.
     * @param pascalString the Pascal string.
     * @return the Java string.
     
    String convertString(String pascalString)
    {
        String unquoted = pascalString.substring(1, pascalString.length()-1);
        return unquoted.replace("''", "'").replace("\"", "\\\"");
    }
    */
    /** 
    @Override 
    public Object visitFunctionCallFactor(
                                    PascalParser.FunctionCallFactorContext ctx) 
    {
        statementCode.emitFunctionCall(ctx.functionCall());
        return null;
    }

    @Override 
    public Object visitNotFactor(PascalParser.NotFactorContext ctx) 
    {
        expressionCode.emitNotFactor(ctx);
        return null;
    }

    @Override 
    public Object visitParenthesizedFactor(
                                    PascalParser.ParenthesizedFactorContext ctx) 
    {
        return visit(ctx.expression());
    }

    @Override 
    public Object visitWriteStatement(PascalParser.WriteStatementContext ctx) 
    {
        statementCode.emitWrite(ctx);
        return null;
    }

    @Override 
    public Object visitWritelnStatement(PascalParser.WritelnStatementContext ctx) 
    {
        statementCode.emitWriteln(ctx);
        return null;
    }

    @Override 
    public Object visitReadStatement(PascalParser.ReadStatementContext ctx) 
    {
        statementCode.emitRead(ctx);
        return null;
    }

    @Override 
    public Object visitReadlnStatement(PascalParser.ReadlnStatementContext ctx) 
    {
        statementCode.emitReadln(ctx);
        return null;
    }
    */
    //segfault part 

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitProgram(SegueParser.ProgramContext ctx) {
		createNewGenerators(code);
        programCode.emitProgram(ctx);
        return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitLine(SegueParser.LineContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitLineList(SegueParser.LineListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitStatement(SegueParser.StatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFunctiondef(SegueParser.FunctiondefContext ctx) {
		createNewGenerators(programCode);
        programCode.emitRoutine(ctx.functionID().entry);
        return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFunctioncall(SegueParser.FunctioncallContext ctx) {
		statementCode.emitCall(ctx.functionID().entry, ctx.argList());
        return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAssignmentStatement(SegueParser.AssignmentStatementContext ctx) {
		statementCode.emitAssignment(ctx);
        return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIfStatement(SegueParser.IfStatementContext ctx) {
		statementCode.emitIf(ctx);
        return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitWhileStatement(SegueParser.WhileStatementContext ctx) {
		statementCode.emitWhile(ctx);
        return null;
	}













	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitPrintStatement(SegueParser.PrintStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthStatement(SegueParser.SynthStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthFunction(SegueParser.SynthFunctionContext ctx) { return visitChildren(ctx); }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitReturnStatement(SegueParser.ReturnStatementContext ctx) {
		Typespec t;
		if (ctx.booleanExpression() != null) {
			visit(ctx.booleanExpression());
			t = Predefined.booleanType;
		} else {
			visit(ctx.numericalExpression());
			t = Predefined.doubleType;
		}
		programCode.emitReturnValue(t);
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitFunctionID(SegueParser.FunctionIDContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitFunctionSymbol(SegueParser.FunctionSymbolContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitParamList(SegueParser.ParamListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitParam(SegueParser.ParamContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitArgList(SegueParser.ArgListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitArg(SegueParser.ArgContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitNumericalExpression(SegueParser.NumericalExpressionContext ctx) {
		expressionCode.emitNumericalExpression(ctx);
        return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitTerm(SegueParser.TermContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitFactor(SegueParser.FactorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitPrefixOp(SegueParser.PrefixOpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitSuffixOp(SegueParser.SuffixOpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitSignOp(SegueParser.SignOpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitNumIdentifier(SegueParser.NumIdentifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitNumSymbol(SegueParser.NumSymbolContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBooleanExpression(SegueParser.BooleanExpressionContext ctx) {
		expressionCode.emitBooleanExpression(ctx);
        return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitBooleanTerm(SegueParser.BooleanTermContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitBooleanSingleton(SegueParser.BooleanSingletonContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitNotStatement(SegueParser.NotStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitNotSymbol(SegueParser.NotSymbolContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitBoolIdentifier(SegueParser.BoolIdentifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitBoolSymbol(SegueParser.BoolSymbolContext ctx) { return visitChildren(ctx); }












	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthSetFunction(SegueParser.SynthSetFunctionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthChannelFunction(SegueParser.SynthChannelFunctionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthNoteFunction(SegueParser.SynthNoteFunctionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthStartFunction(SegueParser.SynthStartFunctionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthNoteSet(SegueParser.SynthNoteSetContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthNoteLerp(SegueParser.SynthNoteLerpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthPointStatement(SegueParser.SynthPointStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthMidiPitch(SegueParser.SynthMidiPitchContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthVolume(SegueParser.SynthVolumeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthVibratoAmplitude(SegueParser.SynthVibratoAmplitudeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public T visitSynthVibratoFrequency(SegueParser.SynthVibratoFrequencyContext ctx) { return visitChildren(ctx); }
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitRelOp(SegueParser.RelOpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitBoolOp(SegueParser.BoolOpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitAddOp(SegueParser.AddOpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitMulOp(SegueParser.MulOpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitBooleanConstant(SegueParser.BooleanConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitNumberConstant(SegueParser.NumberConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitUnsignedNumber(SegueParser.UnsignedNumberContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitUnsignedintegerConstant(SegueParser.UnsignedintegerConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitUnsigneddoubleConstant(SegueParser.UnsigneddoubleConstantContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//@Override public Object visitSign(SegueParser.SignContext ctx) { return visitChildren(ctx); }
}
