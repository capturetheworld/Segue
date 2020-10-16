package backend.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import antlr4.*;

import intermediate.symtab.*;
import intermediate.symtab.SymtabEntry.Kind;
import intermediate.type.*;

import static intermediate.symtab.SymtabEntry.Kind.*;
import static intermediate.type.Typespec.Form.SUBRANGE;
import static backend.interpreter.RuntimeErrorHandler.Code.*;

/**
 * Execute Pascal programs.
 */
public class Executor extends PascalBaseVisitor<Object>
{
    private int executionCount = 0;     // count of executed statements
    private SymtabEntry programId;      // program identifier's symbol table entry
    private RuntimeStack runtimeStack;  // runtime stack
    private Scanner sysin;              // runtime input
    private RuntimeErrorHandler error;  // runtime error handler
    
    public Executor(SymtabEntry programId)
    {
        this.programId = programId;
        runtimeStack = new RuntimeStack();
        sysin = new Scanner(System.in);
        error = new RuntimeErrorHandler();
    }
    
    @Override 
    public Object visitProgram(PascalParser.ProgramContext ctx) 
    { 
        long startTime = System.currentTimeMillis();
        
        StackFrame programFrame = new StackFrame(programId);
        runtimeStack.push(programFrame);
        
        visit(ctx.block().compoundStatement());

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.printf("\n%,20d statements executed." +
                          "\n%,20d runtime errors." +
                          "\n%,20d milliseconds execution time.\n",
                          executionCount, error.getCount(), elapsedTime);

        return null;
    }

    @Override 
    public Object visitStatement(PascalParser.StatementContext ctx) 
    {
        executionCount++;
        visitChildren(ctx);
        
        return null;
    }

    @Override 
    public Object visitAssignmentStatement(
                                    PascalParser.AssignmentStatementContext ctx) 
    {
        PascalParser.ExpressionContext exprCtx = ctx.rhs().expression();
        Object value = visit(exprCtx);
        assignValue(ctx.lhs().variable(), value, exprCtx.type);
        
        return null;
    }
    
    /**
     * Assign a value to a target variable's memory cell.
     * @param varCtx the VariableContext of the target.
     * @param value the value to assign.
     * @param valueType the datatype of the value.
     * @return the target variable's memory cell.
     */
    private Cell assignValue(PascalParser.VariableContext varCtx, 
                             Object value, Typespec valueType)
    {
        Typespec targetType = varCtx.type;
        Cell targetCell = (Cell) visit(varCtx);
        
        assignValue(targetCell, targetType, value, valueType);
        
        return targetCell;
    }
    
    /**
     * Assign a value to a target variable's memory cell.
     * @param targetCell the target variable's memory cell.
     * @param targetType the datatype of the target variable.
     * @param value the value to assign.
     * @param valueType the datatype of the value.
     */
    private void assignValue(Cell targetCell, Typespec targetType,
                             Object value, Typespec valueType)
    {
        // Assign with any necessary type conversions.
        if (   (targetType == Predefined.integerType)
            && (valueType  == Predefined.charType))
        {
            int charValue = (Character) value;
            targetCell.setValue(charValue);
        }
        else if (targetType == Predefined.realType)
        {
            double doubleValue = 
                    (valueType == Predefined.integerType) ? (Integer)   value
                  : (valueType == Predefined.charType)    ? (Character) value
                  :                                         (Double)    value;
            targetCell.setValue(doubleValue);
        }
        else 
        {
            targetCell.setValue(value);
        }
    }

    @Override 
    public Object visitIfStatement(PascalParser.IfStatementContext ctx) 
    {
        PascalParser.TrueStatementContext  trueCtx  = ctx.trueStatement();
        PascalParser.FalseStatementContext falseCtx = ctx.falseStatement();
        boolean value = (Boolean) visit(ctx.expression());
        
        if      (value)            visit(trueCtx);
        else if (falseCtx != null) visit(falseCtx);
        
        return null;
    }

    @Override 
    public Object visitCaseStatement(PascalParser.CaseStatementContext ctx) 
    {
        PascalParser.ExpressionContext exprCtx = ctx.expression();
        PascalParser.CaseBranchListContext branchListCtx = ctx.caseBranchList();
        
        // First time: Create the jump table.
        if (ctx.jumpTable == null) 
        {
            ctx.jumpTable = createJumpTable(branchListCtx);
        }
        
        Object value = visit(exprCtx);
        int intValue = 
                (exprCtx.type == Predefined.integerType) ? (Integer)   value
                                                         : (Character) value;
        
        // From the jump table obtain the statement corresponding to the value.
        PascalParser.StatementContext stmtCtx = ctx.jumpTable.get(intValue);
        if (stmtCtx != null) visit(stmtCtx);

        return null;
    }
    
    /**
     * Create the jump table for a CASE statement.
     * @param branchListCtx the CaseBranchListContext.
     * @return the jump table.
     */
    private HashMap<Integer, PascalParser.StatementContext> createJumpTable(
                            PascalParser.CaseBranchListContext branchListCtx)
    {
        HashMap<Integer, PascalParser.StatementContext> table = new HashMap<>();
        
        // Loop over the CASE branches.
        for (PascalParser.CaseBranchContext branchCtx : 
                                                    branchListCtx.caseBranch())
        {
            PascalParser.CaseConstantListContext constListCtx = 
                                                    branchCtx.caseConstantList();
            PascalParser.StatementContext stmtCtx = branchCtx.statement();
        
            if (constListCtx != null)
            {
                // Loop over the CASE constants of each CASE branch.
                for (PascalParser.CaseConstantContext caseConstCtx : 
                                                    constListCtx.caseConstant())
                {
                    table.put(caseConstCtx.value, stmtCtx);
                }
            }
        }
        
        return table;
    }
    
    @Override 
    public Object visitRepeatStatement(PascalParser.RepeatStatementContext ctx) 
    {
        PascalParser.StatementListContext listCtx = ctx.statementList();
        boolean value;
        
        do
        {
            visit(listCtx);
            value = (Boolean) visit(ctx.expression());
        } while (!value);
        
        return null;
    }

    @Override 
    public Object visitWhileStatement(PascalParser.WhileStatementContext ctx) 
    {
        PascalParser.StatementContext stmtCtx = ctx.statement();
        boolean value = (Boolean) visit(ctx.expression());
        
        while (value)
        {
            visit(stmtCtx);
            value = (Boolean) visit(ctx.expression());
        }
        
        return null;
    }

    @Override 
    public Object visitForStatement(PascalParser.ForStatementContext ctx) 
    {
        PascalParser.VariableContext   controlCtx   = ctx.variable();
        PascalParser.ExpressionContext startExprCtx = ctx.expression().get(0);
        PascalParser.ExpressionContext stopExprCtx  = ctx.expression().get(1);

        // Initial control value.
        Object startValue = visit(startExprCtx);
        assignValue(controlCtx, startValue, startExprCtx.type);
        
        // Terminal control value.
        boolean to = ctx.TO() != null;
        Object stopValue = visit(stopExprCtx);
        
        // Integer control values.
        if (controlCtx.type.baseType() == Predefined.integerType)
        {
            int control = (Integer) startValue;
            int stop    = (Integer) stopValue;
            
            if (to)
            {
                while (control <= stop)
                {
                    visit(ctx.statement());
                    Object nextValue = ++control;
                    assignValue(controlCtx, nextValue, Predefined.integerType);
                }
            }
            else  // downto
            {
                while (control >= stop)
                {
                    visit(ctx.statement());
                    Object nextValue = --control;
                    assignValue(controlCtx, nextValue, Predefined.integerType);
                }
            }
        }
        
        // Character control values.
        else
        {
            char control = (Character) startValue;
            char stop    = (Character) stopValue;
            
            if (to)
            {
                while (control <= stop)
                {
                    visit(ctx.statement());
                    Object nextValue = ++control;
                    assignValue(controlCtx, nextValue, Predefined.charType);
                }
            }
            else  // downto
            {
                while (control >= stop)
                {
                    visit(ctx.statement());
                    Object nextValue = --control;
                    assignValue(controlCtx, nextValue, Predefined.charType);
                }
            }
        }

        return null;
    }

    @Override 
    public Object visitProcedureCallStatement(
                                PascalParser.ProcedureCallStatementContext ctx) 
    {
        SymtabEntry routineId = ctx.procedureName().entry;
        PascalParser.ArgumentListContext argListCtx = ctx.argumentList();
        StackFrame newFrame = new StackFrame(routineId);
        
        // Execute any actual parameters and initialize
        // the formal parameters in the routine's new stack frame.
        if (argListCtx != null) 
        {
            ArrayList<SymtabEntry> parameters = routineId.getRoutineParameters();
            executeCallArguments(argListCtx, parameters, newFrame);
        }

        // Push the routine's stack frame onto the runtime stack 
        // and execute the procedure.
        runtimeStack.push(newFrame);

        // Execute the routine.
        PascalParser.CompoundStatementContext stmtCtx = 
            (PascalParser.CompoundStatementContext) routineId.getExecutable();
        visit(stmtCtx);

        // Pop off the routine's stack frame.
        runtimeStack.pop();
        
        return null;
    }

    /**
     * Execute procedure and function call arguments.
     * @param argListCtx the ArgumentListContext
     * @param parameters the routine's parameters.
     * @param frame the routine's stack frame.
     */
    private void executeCallArguments(PascalParser.ArgumentListContext argListCtx,
                                     ArrayList<SymtabEntry> parameters,
                                     StackFrame frame)
    {
        // Loop over the parameters.
        for (int i = 0; i < parameters.size(); i++)
        {
            SymtabEntry parmId = parameters.get(i);
            String parmName = parmId.getName();
            Kind parmKind = parmId.getKind();
            Cell parmCell = frame.getCell(parmName);
            PascalParser.ArgumentContext argCtx = argListCtx.argument().get(i);
            Object value = visit(argCtx);
            
            // Value parameter: Copy the argument's value.
            if (parmKind == VALUE_PARAMETER)
            {
                assignValue(parmCell, parmId.getType(),
                            value, argCtx.expression().type);
            }
            
            // Reference parameter: Copy the argument's cell.
            else
            {
                PascalParser.FactorContext factorCtx =
                        argCtx.expression().simpleExpression().get(0)
                              .term().get(0).factor().get(0);
                PascalParser.VariableContext varCtx =
                    ((PascalParser.VariableFactorContext) factorCtx).variable();
                
                Cell argCell = (Cell) visitVariable(varCtx);
                frame.replaceCell(parmName, argCell);
            }
        }
    }

    @Override 
    public Object visitExpression(PascalParser.ExpressionContext ctx) 
    {
        PascalParser.SimpleExpressionContext simpleCtx1 = 
                                                ctx.simpleExpression().get(0);
        PascalParser.RelOpContext relOpCtx = ctx.relOp();
        Object operand1 = visit(simpleCtx1);
        Typespec type1 = simpleCtx1.type;
        
        // More than one simple expression?
        if (relOpCtx != null)
        {
            String op = relOpCtx.getText();
            PascalParser.SimpleExpressionContext simpleCtx2 = 
                                                ctx.simpleExpression().get(1);
            Object operand2 = visit(simpleCtx2);
            Typespec type2 = simpleCtx2.type;

            boolean integerMode   = false;
            boolean realMode      = false;
            boolean characterMode = false;

            if (   (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType)) 
            {
                integerMode = true;
            }
            else if (   (type1 == Predefined.realType) 
                     || (type2 == Predefined.realType))
            {
                realMode = true;
            }
            else if (   (type1 == Predefined.charType) 
                     && (type2 == Predefined.charType))
            {
                characterMode = true;
            }

            if (integerMode || characterMode) 
            {
                int value1 = type1 == Predefined.integerType
                        ? (Integer) operand1 : (Character) operand1;
                int value2 = type2 == Predefined.integerType
                        ? (Integer) operand2 : (Character) operand2;
                Boolean result = false;

                if      (op.equals("=" )) result = value1 == value2;
                else if (op.equals("<>")) result = value1 != value2;
                else if (op.equals("<" )) result = value1 <  value2;
                else if (op.equals("<=")) result = value1 <= value2;
                else if (op.equals(">" )) result = value1 >  value2;
                else if (op.equals(">=")) result = value1 >= value2;
                
                return result;
            }
            else if (realMode)
            {
                double value1 = type1 == Predefined.integerType
                        ? (Integer) operand1 : (Double) operand1;
                double value2 = type2 == Predefined.integerType
                        ? (Integer) operand2 : (Double) operand2;
                Boolean result = false;
                
                if      (op.equals("=" )) result = value1 == value2;
                else if (op.equals("<>")) result = value1 != value2;
                else if (op.equals("<" )) result = value1 <  value2;
                else if (op.equals("<=")) result = value1 <= value2;
                else if (op.equals(">" )) result = value1 >  value2;
                else if (op.equals(">=")) result = value1 >= value2;
                
                return result;
            }
            else  // stringMode) 
            {
                String value1 = (String) operand1;
                String value2 = (String) operand2;
                Boolean result = false;
                int comp = value1.compareTo(value2);
                
                if      (op.equals("=" )) result = comp == 0;
                else if (op.equals("<>")) result = comp != 0;
                else if (op.equals("<" )) result = comp <  0;
                else if (op.equals("<=")) result = comp <= 0;
                else if (op.equals(">" )) result = comp >  0;
                else if (op.equals(">=")) result = comp >= 0;
                
                return result;
            }
        }
        
        return operand1;
    }

    @Override 
    public Object visitSimpleExpression(PascalParser.SimpleExpressionContext ctx) 
    {
        int count = ctx.term().size();
        Boolean negate =    (ctx.sign() != null) 
                         && ctx.sign().getText().equals("-");
        
        // First term.
        PascalParser.TermContext termCtx1 = ctx.term().get(0);
        Object operand1 = visit(termCtx1);
        Typespec type1 = termCtx1.type;
        
        if (negate)
        {
            if (type1 == Predefined.integerType)
            {
                operand1 = -((Integer) operand1);
            }
            else if (type1 == Predefined.realType)
            {
                operand1 = -((Double) operand1);
            }
        }
        
        // Loop over the subsequent terms.
        for (int i = 1; i < count; i++)
        {
            String op = ctx.addOp().get(i-1).getText().toLowerCase();
            PascalParser.TermContext termCtx2 = ctx.term().get(i);
            Object operand2 = visit(termCtx2);
            Typespec type2 = termCtx2.type;

            boolean integerMode = false;
            boolean realMode    = false;
            boolean booleanMode = false;

            if (   (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType)) 
            {
                integerMode = true;
            }
            else if (   (type1 == Predefined.realType) 
                     || (type2 == Predefined.realType))
            {
                realMode = true;
            }
            else if (   (type1 == Predefined.booleanType) 
                     && (type2 == Predefined.booleanType))
            {
                booleanMode = true;
            }
                            
            if (integerMode)
            {
                int value1 = (Integer) operand1;
                int value2 = (Integer) operand2;
                operand1 = (op.equals("+")) ? value1 + value2
                                            : value1 - value2;
            }
            else if (realMode)
            {
                double value1 = type1 == Predefined.integerType
                              ? (Integer) operand1 : (Double) operand1;
                double value2 = type2 == Predefined.integerType
                              ? (Integer) operand2 : (Double) operand2;
                operand1 = (op.equals("+")) ? value1 + value2
                                            : value1 - value2;
            }
            else if (booleanMode)
            {
                operand1 = ((Boolean) operand1) || ((Boolean) operand2);
            }
            else  // stringMode
            {
                operand1 = ((String) operand1) + ((String) operand2);
            }
        }
        
        return operand1;
    }

    @Override 
    public Object visitTerm(PascalParser.TermContext ctx) 
    {
        int count = ctx.factor().size();
        
        // First factor.
        PascalParser.FactorContext factorCtx1 = ctx.factor().get(0);
        Object operand1 = visit(factorCtx1);
        Typespec type1 = factorCtx1.type;
        
        // Loop over the subsequent factors.
        for (int i = 1; i < count; i++)
        {
            String op = ctx.mulOp().get(i-1).getText().toLowerCase();
            PascalParser.FactorContext factorCtx2 = ctx.factor().get(i);
            Object operand2 = visit(factorCtx2);            
            Typespec type2 = factorCtx2.type;

            boolean integerMode = false;
            boolean realMode    = false;

            if (   (type1 == Predefined.integerType)
                && (type2 == Predefined.integerType)) 
            {
                integerMode = true;
            }
            else if (   (type1 == Predefined.realType) 
                     || (type2 == Predefined.realType))
            {
                realMode = true;
            }
                
            if (integerMode)
            {
                int value1 = (Integer) operand1;
                int value2 = (Integer) operand2;
                
                if (op.equals("*")) operand1 = value1*value2;
                
                else if (op.equals("div") || op.equals("/") || op.equals("mod"))
                {
                    // Check for division by zero.
                    if (value2 == 0) 
                    {
                        error.flag(DIVISION_BY_ZERO, factorCtx2);
                        operand1 = 0;
                    }
                    
                    if (op.equals("div"))
                    {
                        operand1 = value1/value2;
                    }
                    else if (op.equals("/"))
                    {
                        double doubleValue = value1;
                        operand1 = doubleValue/value2;
                    }
                    else  // mod
                    {
                        operand1 = value1 % value2;
                    }
                }
            }
            else if (realMode)
            {
                double value1 = type1 == Predefined.integerType
                        ? (Integer) operand1 : (Double) operand1;
                double value2 = type2 == Predefined.integerType
                        ? (Integer) operand2 : (Double) operand2;
                
                if (op.equals("*")) operand1 = value1*value2;
                
                else if (op.equals("/"))
                {
                    // Check for division by zero.
                    if (value2 == 0) 
                    {
                        error.flag(DIVISION_BY_ZERO, factorCtx2);
                        operand1 = 0;
                    }
                    else operand1 = value1/value2;
                }
            }
            else  // booleanMode
            {
                operand1 = ((Boolean) operand1) && ((Boolean) operand2);
            }
        }
        
        return operand1;
    }

    @Override 
    public Object visitVariableFactor(PascalParser.VariableFactorContext ctx) 
    {
        PascalParser.VariableContext varCtx = ctx.variable();
        Kind kind = varCtx.entry.getKind();
        
        // Obtain a constant's value from its symbol table entry.
        if ((kind == CONSTANT) || (kind == ENUMERATION_CONSTANT))
        {
            Object value = varCtx.entry.getValue();
            
            if (varCtx.type == Predefined.booleanType)
            {
                value = (Integer) value != 0;
            }
            
            return value;
        }
        
        // Obtain a variable's value from its memory cell.
        else
        {
            Cell variableCell = (Cell) visit(varCtx);
            return variableCell.getValue();
        }
    }

    @Override 
    @SuppressWarnings("unchecked")
    public Object visitVariable(PascalParser.VariableContext ctx) 
    {
        SymtabEntry variableId = ctx.entry;
        String variableName = variableId.getName();
        Typespec variableType = variableId.getType();
        int nestingLevel = variableId.getSymtab().getNestingLevel();

        // Get the variable reference from the appropriate activation record.
        StackFrame frame = runtimeStack.getTopmost(nestingLevel);
        Cell variableCell = frame.getCell(variableName);

        // Execute any array subscripts or record fields.
        for (PascalParser.ModifierContext modCtx : ctx.modifier()) 
        {
            // Subscripts.
            if (modCtx.indexList() != null)
            {
                // Compute a new reference for each subscript.
                for (PascalParser.IndexContext indexCtx : 
                                                    modCtx.indexList().index())
                {
                    Typespec indexType = variableType.getArrayIndexType();
                    int minIndex = 0;
                    
                    if (indexType.getForm() == SUBRANGE)
                    {
                        minIndex = indexType.getSubrangeMinValue();
                    }
                    
                    int value = (Integer) visit(indexCtx.expression());
                    int index = value - minIndex;
                    
                    variableCell = ((Cell[]) variableCell.getValue())[index];
                    variableType = variableType.getArrayElementType();
                }
            }

            // Record field.
            else 
            {
                SymtabEntry fieldId = modCtx.field().entry;
                String fieldName = fieldId.getName();

                // Compute a new reference for the field.
                HashMap<String, Cell> map =
                                (HashMap<String, Cell>) variableCell.getValue();
                variableCell = map.get(fieldName);
                variableType = fieldId.getType();
            }
        }

        return variableCell;
    }

    @Override 
    public Object visitNumberFactor(PascalParser.NumberFactorContext ctx) 
    {
        Typespec type = ctx.type;
        
        if (type == Predefined.integerType)
        {
            return Integer.parseInt(ctx.getText());
        }
        else  // double
        {
            return Double.parseDouble(ctx.getText());
        }
    }

    @Override 
    public Object visitCharacterFactor(PascalParser.CharacterFactorContext ctx) 
    {
        return ctx.getText().charAt(1);
    }

    @Override 
    public Object visitStringFactor(PascalParser.StringFactorContext ctx) 
    {
        String pascalString = ctx.stringConstant().STRING().getText();        
        return convertString(pascalString);
    }
    
    /**
     * Convert a Pascal string to a Java string.
     * @param pascalString the Pascal string.
     * @return the Java string.
     */
    private String convertString(String pascalString)
    {
        String unquoted = pascalString.substring(1, pascalString.length()-1);
        return unquoted.replace("''", "'");
    }

    @Override 
    public Object visitFunctionCallFactor(
                                    PascalParser.FunctionCallFactorContext ctx) 
    {
        PascalParser.FunctionCallContext callCtx = ctx.functionCall();
        SymtabEntry routineId = callCtx.functionName().entry;
        PascalParser.ArgumentListContext argListCtx = callCtx.argumentList();
        StackFrame newFrame = new StackFrame(routineId);
        
        // Execute any call arguments and initialize
        // the parameters in the routine's new stack frame.
        if (argListCtx != null) 
        {
            ArrayList<SymtabEntry> parms = routineId.getRoutineParameters();
            executeCallArguments(argListCtx, parms, newFrame);
        }

        // Push the routine's stack frame onto the runtime stack 
        // and execute the procedure.
        runtimeStack.push(newFrame);

        // Execute the routine.
        PascalParser.CompoundStatementContext stmtCtx = 
            (PascalParser.CompoundStatementContext) routineId.getExecutable();
        visit(stmtCtx);
        
        // Get the function value from its associated variable.
        String functionName = routineId.getName();
        Cell valueCell = newFrame.getCell(functionName);
        Object functionValue = valueCell.getValue();

        // Pop off the routine's stack frame.
        runtimeStack.pop();
        
        return functionValue;
    }

    @Override 
    public Object visitNotFactor(PascalParser.NotFactorContext ctx) 
    {
        boolean value = (boolean) visit(ctx.factor());
        return !value;
    }

    @Override 
    public Object visitParenthesizedFactor(
                                    PascalParser.ParenthesizedFactorContext ctx) 
    {
        return visit(ctx.expression());
    }

    @Override 
    public Object visitWritelnStatement(PascalParser.WritelnStatementContext ctx) 
    {
        visitChildren(ctx);
        System.out.println();
        
        return null;
    }
    
    @Override 
    public Object visitWriteArguments(PascalParser.WriteArgumentsContext ctx) 
    {
        // Loop over each argument.
        for (PascalParser.WriteArgumentContext argCtx : ctx.writeArgument())
        {
            Typespec type = argCtx.expression().type;
            String argText = argCtx.getText();
            
            // Print any literal strings.
            if (argText.charAt(0) == '\'') 
            {
                System.out.print(convertString(argText));
            }
            
            // For any other expression, print its value with a format specifier.
            else
            {
                Object value = visit(argCtx.expression());
                StringBuffer format = new StringBuffer("%");
                
                // Create the format string.
                PascalParser.FieldWidthContext fwCtx = argCtx.fieldWidth();              
                if (fwCtx != null)
                {
                    String sign = (   (fwCtx.sign() != null) 
                                   && (fwCtx.sign().getText().equals("-"))) 
                                ? "-" : "";
                    format.append(sign)
                          .append(fwCtx.integerConstant().getText());
                    
                    PascalParser.DecimalPlacesContext dpCtx = 
                                                        fwCtx.decimalPlaces();
                    if (dpCtx != null)
                    {
                        format.append(".")
                              .append(dpCtx.integerConstant().getText());
                    }
                }
                
                // Use the format string with printf.
                if (type == Predefined.integerType)
                {
                    format.append("d");
                    System.out.printf(format.toString(), (int) value);
                }
                else if (type == Predefined.realType)
                {
                    format.append("f");
                    System.out.printf(format.toString(), (double) value);
                }
                else if (type == Predefined.booleanType)
                {
                    format.append("b");
                    System.out.printf(format.toString(), (boolean) value);
                }
                else if (type == Predefined.charType)
                {
                    format.append("c");
                    System.out.printf(format.toString(), (char) value);
                }
                else  // string
                {
                    format.append("s");
                    System.out.printf(format.toString(), (String) value);
                }
            }
        }

        return null;
    }

    @Override 
    public Object visitReadlnStatement(PascalParser.ReadlnStatementContext ctx) 
    {
        visitChildren(ctx);
        sysin.nextLine();
        
        return null;
    }

    @Override 
    public Object visitReadArguments(PascalParser.ReadArgumentsContext ctx) 
    {
        int size = ctx.variable().size();
        
        // Loop over read arguments.
        for (int i = 0; i < size; i++)
        {
            PascalParser.VariableContext varCtx = ctx.variable().get(i);
            Typespec varType = varCtx.type;
            
            if (varType == Predefined.integerType)
            {
                int value = sysin.nextInt();
                assignValue(varCtx, value, Predefined.integerType);
            }
            else if (varType == Predefined.realType)
            {
                double value = sysin.nextDouble();
                assignValue(varCtx, value, Predefined.realType);
            }
            else if (varType == Predefined.booleanType)
            {
                boolean value = sysin.nextBoolean();
                assignValue(varCtx, value, Predefined.booleanType);
            }
            else if (varType == Predefined.charType)
            {
                sysin.useDelimiter("");
                char value = sysin.next().charAt(0);
                sysin.reset();
                
                assignValue(varCtx, value, Predefined.charType);
            }
            else  // string
            {
                String value = sysin.next();
                assignValue(varCtx, value, Predefined.stringType);
            }
        }
        
        return null;
    }
}
