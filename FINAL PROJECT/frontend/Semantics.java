package frontend;

import java.util.ArrayList;
import java.util.HashSet;

import antlr4.*;
import antlr4.SegueParser.LineContext;
import intermediate.symtab.*;
import intermediate.symtab.SymtabEntry.Kind;
import intermediate.type.*;
import intermediate.type.Typespec.*;
import intermediate.util.*;

import static frontend.SemanticErrorHandler.Code.*;
import static intermediate.symtab.SymtabEntry.Kind.*;
import static intermediate.symtab.SymtabEntry.Routine.*;
import static intermediate.type.Typespec.Form.*;

/**
 * Semantic operations.
 * Perform type checking and create symbol tables.
 */
public class Semantics extends SegueBaseVisitor<Object>
{
    private String programName;
    private SymtabStack symtabStack;
    private SymtabEntry programId;
    private SemanticErrorHandler error;
    
    public Semantics(String name)
    {
        programName = name;
        // Create and initialize the symbol table stack.
        this.symtabStack = new SymtabStack();
        Predefined.initialize(symtabStack);
        //Initialize Types, Constants, Standard Routines
        //with TypeSpec //typespec is some properties of datatypes

        this.error = new SemanticErrorHandler();//delete entire file
    }
    
    public SymtabEntry getProgramId() { return programId; }
    public int getErrorCount() { return error.getCount(); };//keep
    
    /**
     * Return the default value for a data type.
     * @param type the data type.
     * @return the default value.
     */
    public static Object defaultValue(Typespec type)
    {
        type = type.baseType(); //if it is a subrange, gets the type

        if (type == Predefined.doubleType)    return Double.valueOf(0.0);
        else /* boolean*/                     return Boolean.valueOf(false);
    }

    @Override 
    public Object visitProgram(SegueParser.ProgramContext ctx) 
    {
        programId = symtabStack.enterLocal(programName, PROGRAM);
        programId.setRoutineSymtab(symtabStack.push());
        
        symtabStack.setProgramId(programId);
        symtabStack.getLocalSymtab().setOwner(programId);
        
        ctx.entry = programId;

        if (ctx.line().size() > 0) {
            for (LineContext line : ctx.line()) visit(line);
        }
        visit(ctx.statement());
        
        // Print the cross-reference table.
        CrossReferencer crossReferencer = new CrossReferencer(); //cross referencer only used in 1 place
        crossReferencer.print(symtabStack);

        return null;
    }
/*
    @Override 
    public Object visitConstantDefinition(
                                SegueParser.ConstantDefinitionContext ctx) 
    { 
        SegueParser.ConstantIdentifierContext idCtx = ctx.constantIdentifier();
        String constantName = idCtx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry constantId = symtabStack.lookupLocal(constantName);
        
        if (constantId == null)
        {
            SegueParser.ConstantContext constCtx = ctx.constant();
            Object constValue = visit(constCtx);
            
            constantId = symtabStack.enterLocal(constantName, CONSTANT);
            constantId.setValue(constValue);
            constantId.setType(constCtx.type);
            
            idCtx.entry = constantId;
            idCtx.type  = constCtx.type;
        }
        else
        {
            error.flag(REDECLARED_IDENTIFIER, ctx);
            
            idCtx.entry = constantId;
            idCtx.type  = Predefined.integerType;
        }

        constantId.appendLineNumber(ctx.getStart().getLine());        
        return null;
    }
*/
/*
    @Override 
    public Object visitConstant(SegueParser.ConstantContext ctx) 
    {
        if (ctx.IDENTIFIER() != null)
        {
            String constantName = ctx.IDENTIFIER().getText().toLowerCase();
            SymtabEntry constantId = symtabStack.lookup(constantName);
            
            if (constantId != null)
            {
                Kind kind = constantId.getKind();
                if ((kind != CONSTANT) && (kind != ENUMERATION_CONSTANT))
                {
                    error.flag(INVALID_CONSTANT, ctx);
                }
                
                ctx.type  = constantId.getType();
                ctx.value = constantId.getValue();
                
                constantId.appendLineNumber(ctx.getStart().getLine());
            }
            else
            {
                error.flag(UNDECLARED_IDENTIFIER, ctx);
                
                ctx.type = Predefined.integerType;
                ctx.value = 0;
            }
        }
        else if (ctx.characterConstant() != null)
        {
            ctx.type  = Predefined.charType;
            ctx.value = (char) ctx.getText().charAt(1);
        }
        else if (ctx.stringConstant() != null)
        {
            String pascalString = ctx.stringConstant().STRING().getText();
            String unquoted = pascalString.substring(1, pascalString.length()-1);
            ctx.type  = Predefined.stringType;            
            ctx.value = unquoted.replace("''", "'").replace("\"", "\\\"");
        }
        else  // number
        {
            if (ctx.unsignedNumber().integerConstant() != null)
            {
                ctx.type  = Predefined.integerType;
                ctx.value = Integer.parseInt(ctx.getText());
            }
            else
            {
                ctx.type  = Predefined.realType;
                ctx.value = Float.parseFloat(ctx.getText());
            }
        }
        
        return ctx.value;
    }
    */

    /*
    @Override 
    public Object visitTypeDefinition(SegueParser.TypeDefinitionContext ctx) 
    { 
        SegueParser.TypeIdentifierContext idCtx = ctx.typeIdentifier();
        String typeName = idCtx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry typeId = symtabStack.lookupLocal(typeName);
        
        SegueParser.TypeSpecificationContext typespecCtx = 
                                                        ctx.typeSpecification();
        
        // If it's a record type, create a named record type.
        if (typespecCtx instanceof SegueParser.RecordTypespecContext)
        {
            typeId = createRecordType(
                    (SegueParser.RecordTypespecContext) typespecCtx, typeName);            
        }

        // Enter the type name of any other type into the symbol table.
        else if (typeId == null)
        {
            visit(typespecCtx);
            
            typeId = symtabStack.enterLocal(typeName, TYPE);
            typeId.setType(typespecCtx.type);
            typespecCtx.type.setIdentifier(typeId);
        }
        
        // Redeclared identifier.
        else 
        {
            error.flag(REDECLARED_IDENTIFIER, ctx);
        }
        
        idCtx.entry = typeId;
        idCtx.type  = typespecCtx.type;

        typeId.appendLineNumber(ctx.getStart().getLine());        
        return null;
    }

    @Override 
    public Object visitRecordTypespec(SegueParser.RecordTypespecContext ctx) 
    { 
        // Create an unnamed record type.
        String recordTypeName = Symtab.generateUnnamedName();
        createRecordType(ctx, recordTypeName);
        
        return null;
    }
    
    /**
     * Create a new record type.
     * @param recordTypeSpecCtx the RecordTypespecContext.
     * @param recordTypeName the name of the record type.
     * @return the symbol table entry of the record type identifier.
     */
    /*
    private SymtabEntry createRecordType(
                        SegueParser.RecordTypespecContext recordTypeSpecCtx, 
                        String recordTypeName)
    {
        SegueParser.RecordTypeContext recordTypeCtx = 
                                                recordTypeSpecCtx.recordType();
        Typespec recordType = new Typespec(RECORD);
        
        SymtabEntry recordTypeId = symtabStack.enterLocal(recordTypeName, TYPE);
        recordTypeId.setType(recordType);
        recordType.setIdentifier(recordTypeId);
        
        String recordTypePath = createRecordTypePath(recordType);
        recordType.setRecordTypePath(recordTypePath);

        // Enter the record fields into the record type's symbol table.
        Symtab recordSymtab = createRecordSymtab(recordTypeCtx.recordFields(),
                                                 recordTypeId);
        recordType.setRecordSymtab(recordSymtab);

        recordTypeCtx.entry    = recordTypeId;
        recordTypeSpecCtx.type = recordType;
        
        return recordTypeId;
    }
    */
    /**
     * Create the fully qualified type pathname of a record type.
     * @param recordType the record type.
     * @return the pathname.
     */
    /*
    private String createRecordTypePath(Typespec recordType)
    {
        SymtabEntry recordId = recordType.getIdentifier();
        SymtabEntry parentId = recordId.getSymtab().getOwner();
        String path = recordId.getName();
        
        while (   (parentId.getKind() == TYPE) 
               && (parentId.getType().getForm() == RECORD))
        {
            path = parentId.getName() + "$" + path;
            parentId = parentId.getSymtab().getOwner();
        }
        
        path = parentId.getName() + "$" + path;
        return path;
    }
    */
    /**
     * Create the symbol table for a record type.
     * @param ctx the RecordFieldsContext,
     * @param ownerId the symbol table entry of the owner's identifier.
     * @return the symbol table.
     */
    /*
    private Symtab createRecordSymtab(SegueParser.RecordFieldsContext ctx,
                                      SymtabEntry ownerId) 
    { 
        Symtab recordSymtab = symtabStack.push();

        recordSymtab.setOwner(ownerId);
        visit(ctx.variableDeclarationsList());
        recordSymtab.resetVariables(RECORD_FIELD);
        symtabStack.pop();
        
        return recordSymtab;
    }
    */
    /*
    @Override 
    public Object visitSimpleTypespec(SegueParser.SimpleTypespecContext ctx) 
    { 
        visit(ctx.simpleType());
        ctx.type = ctx.simpleType().type;
        
        return null;
    }

    @Override 
    public Object visitTypeIdentifierTypespec(
                                SegueParser.TypeIdentifierTypespecContext ctx) 
    { 
        visit(ctx.typeIdentifier());
        ctx.type = ctx.typeIdentifier().type;
        
        return null;
    }
    */
    /*
    @Override 
    public Object visitTypeIdentifier(SegueParser.TypeIdentifierContext ctx) 
    { 
        String typeName = ctx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry typeId = symtabStack.lookup(typeName);
        
        if (typeId != null)
        {
            if (typeId.getKind() != TYPE)
            {
                error.flag(INVALID_TYPE, ctx);
                ctx.type = Predefined.integerType;
            }
            else
            {
                ctx.type = typeId.getType();
            }
            
            typeId.appendLineNumber(ctx.start.getLine());
        }
        else
        {
            error.flag(UNDECLARED_IDENTIFIER, ctx);
            ctx.type = Predefined.integerType;
        }
        
        ctx.entry = typeId;
        return null;
    }
    */
    /*
    @Override 
    public Object visitEnumerationTypespec(
                                    SegueParser.EnumerationTypespecContext ctx) 
    { 
        Typespec enumType = new Typespec(ENUMERATION);
        ArrayList<SymtabEntry> constants = new ArrayList<>();
        int value = -1;

        // Loop over the enumeration constants.
        for (SegueParser.EnumerationConstantContext constCtx : 
                                    ctx.enumerationType().enumerationConstant())
        {
            SegueParser.ConstantIdentifierContext constIdCtx = 
                                                constCtx.constantIdentifier();
            String constantName = constIdCtx.IDENTIFIER().getText()
                                                         .toLowerCase();
            SymtabEntry constantId = symtabStack.lookupLocal(constantName);
            
            if (constantId == null)
            {
                constantId = symtabStack.enterLocal(constantName, 
                                                    ENUMERATION_CONSTANT);
                constantId.setType(enumType);
                constantId.setValue(++value);
                
                constants.add(constantId);
            }
            else
            {
                error.flag(REDECLARED_IDENTIFIER, constCtx);
            }
            
            constIdCtx.entry = constantId;
            constIdCtx.type  = enumType;
            
            constantId.appendLineNumber(ctx.getStart().getLine());        
        }

        enumType.setEnumerationConstants(constants);
        ctx.type = enumType;
       
        return null;
    }

    @Override 
    public Object visitSubrangeTypespec(
                                    SegueParser.SubrangeTypespecContext ctx) 
    { 
        Typespec type = new Typespec(SUBRANGE);
        SegueParser.SubrangeTypeContext subCtx = ctx.subrangeType();
        SegueParser.ConstantContext minCtx = subCtx.constant().get(0);
        SegueParser.ConstantContext maxCtx = subCtx.constant().get(1);
        
        Object minObj = visit(minCtx);
        Object maxObj = visit(maxCtx);
        
        Typespec minType = minCtx.type;
        Typespec maxType = maxCtx.type;
        
        if (   (   (minType.getForm() != SCALAR)
                && (minType.getForm() != ENUMERATION))
            || (minType == Predefined.realType)
            || (minType == Predefined.stringType))
        {
            error.flag(INVALID_CONSTANT, minCtx);
            minType = Predefined.integerType;
            minObj = 0;
        }
        
        int minValue;
        int maxValue;

        if (minType == Predefined.integerType)
        {
            minValue = (Integer) minObj;
            maxValue = (Integer) maxObj;
        }
        else if (minType == Predefined.charType)
        {
            minValue = (Character) minObj;
            maxValue = (Character) maxObj;
        }
        else  // enumeration constants
        {
            minValue = (Integer) minCtx.value;
            maxValue = (Integer) maxCtx.value;
        }

        if ((maxType != minType) || (minValue > maxValue))
        {
            error.flag(INVALID_CONSTANT, maxCtx);
            maxType = minType;
            maxObj  = minObj;
        }
        
        type.setSubrangeBaseType(minType);
        type.setSubrangeMinValue((Integer) minValue);
        type.setSubrangeMaxValue((Integer) maxValue);

        ctx.type = type;
        return null;
    }

    @Override 
    public Object visitArrayTypespec(SegueParser.ArrayTypespecContext ctx) 
    { 
        Typespec arrayType = new Typespec(ARRAY);
        SegueParser.ArrayTypeContext arrayCtx = ctx.arrayType();
        SegueParser.ArrayDimensionListContext listCtx = 
                                                arrayCtx.arrayDimensionList();
        
        ctx.type = arrayType;
        
        // Loop over the array dimensions.
        int count = listCtx.simpleType().size();
        for (int i = 0; i < count; i++)
        {
            SegueParser.SimpleTypeContext simpleCtx = 
                                                    listCtx.simpleType().get(i);
            visit(simpleCtx);
            arrayType.setArrayIndexType(simpleCtx.type);
            arrayType.setArrayElementCount(typeCount(simpleCtx.type));
            
            if (i < count-1) 
            {
                Typespec elmtType = new Typespec(ARRAY);
                arrayType.setArrayElementType(elmtType);
                arrayType = elmtType;
            }
        }
        
        visit(arrayCtx.typeSpecification());
        Typespec elmtType = arrayCtx.typeSpecification().type;
        arrayType.setArrayElementType(elmtType);
        
        return null;
    }
    */
    /**
     * Return the number of values in a datatype.
     * @param type the datatype.
     * @return the number of values.
     */
    /*
    private int typeCount(Typespec type)
    {
        int count = 0;
        
        if (type.getForm() == ENUMERATION)
        {
            ArrayList<SymtabEntry> constants = type.getEnumerationConstants();
            count = constants.size();
        }
        else  // subrange
        {
            int minValue = type.getSubrangeMinValue();
            int maxValue = type.getSubrangeMaxValue();
            count = maxValue - minValue + 1;
        }
        
        return count;
    }
    */
    /*
    @Override 
    public Object visitVariableDeclarations(
                                SegueParser.VariableDeclarationsContext ctx) 
    { 
        SegueParser.TypeSpecificationContext typeCtx = ctx.typeSpecification();
        visit(typeCtx);
        
        SegueParser.VariableIdentifierListContext listCtx = 
                                                ctx.variableIdentifierList();
        
        // Loop over the variables being declared.
        for (SegueParser.VariableIdentifierContext idCtx : 
                                                listCtx.variableIdentifier())
        {
            int lineNumber = idCtx.getStart().getLine();        
            String variableName = idCtx.IDENTIFIER().getText().toLowerCase();
            SymtabEntry variableId = symtabStack.lookupLocal(variableName);
            
            if (variableId == null)
            {
                variableId = symtabStack.enterLocal(variableName, VARIABLE);
                variableId.setType(typeCtx.type);
                
                // Assign slot numbers to local variables.
                Symtab symtab = variableId.getSymtab();
                if (symtab.getNestingLevel() > 1)
                {
                    variableId.setSlotNumber(symtab.nextSlotNumber());
                }
                
                idCtx.entry = variableId;
            }
            else
            {
                error.flag(REDECLARED_IDENTIFIER, ctx);
            }
            
            variableId.appendLineNumber(lineNumber);        
        }
        
        return null;
    }
    */
    @Override 
    @SuppressWarnings("unchecked")
    public Object visitFunctiondef(SegueParser.FunctiondefContext ctx) 
    {
        SegueParser.FunctionIDContext idCtx = ctx.functionID();
        SegueParser.ParamListContext parameters = ctx.paramList();
        String routineName = idCtx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry routineId = symtabStack.lookupLocal(routineName);
        
        if (routineId != null)
        {
            error.flag(REDECLARED_IDENTIFIER, 
                       ctx.getStart().getLine(), routineName);
            
        }else{

        routineId = symtabStack.enterLocal(routineName, FUNCTION);
        routineId.setRoutineCode(DECLARED);
        idCtx.entry = routineId;
        
        // Append to the parent routine's list of subroutines.
        SymtabEntry parentId = symtabStack.getLocalSymtab().getOwner();
        parentId.appendSubroutine(routineId);
        
        routineId.setRoutineSymtab(symtabStack.push());
        idCtx.entry = routineId;
        
        Symtab symtab = symtabStack.getLocalSymtab();
        symtab.setOwner(routineId);
        
        if (parameters != null)
        {
            ArrayList<SymtabEntry> parameterIds = (ArrayList<SymtabEntry>) visit(parameters);
            routineId.setRoutineParameters(parameterIds);
            
            for (SymtabEntry parmId : parameterIds)
            {
                parmId.setSlotNumber(symtab.nextSlotNumber());
            }
        }

        visit(ctx.lineList());
        
        routineId.setExecutable(ctx.lineList());
        
        symtabStack.pop();
    }
        return null;
    }

    @Override 
    @SuppressWarnings("unchecked")
    public Object visitParamList(SegueParser.ParamListContext ctx)
    {
        ArrayList<SymtabEntry> parameterList = new ArrayList<>();
        
        // Loop over the parameter declarations.
        for (SegueParser.ParamContext dclCtx : ctx.param()) {
            parameterList.add((SymtabEntry)visit(dclCtx));
        }
        
        return parameterList;
    }

    @Override 
    public Object visitParam(SegueParser.ParamContext ctx) 
    {
        Kind kind = VALUE_PARAMETER; 
        
        Typespec parmType = ctx.boolIdentifier() != null ? Predefined.booleanType : Predefined.doubleType;

            int lineNumber = ctx.getStart().getLine();
            String parmName;
            if(ctx.boolIdentifier() != null) parmName = ctx.boolIdentifier().IDENTIFIER().getText().toLowerCase();
            else parmName = ctx.numIdentifier().IDENTIFIER().getText().toLowerCase();
            SymtabEntry parmId = symtabStack.lookupLocal(parmName);
            
            if (parmId == null)
            {
                parmId = symtabStack.enterLocal(parmName, kind);
                parmId.setType(parmType);
            }
            else
            {
                error.flag(REDECLARED_IDENTIFIER, ctx);
            }
            
            ctx.entry = parmId;
            ctx.type  = parmType;
            
            parmId.appendLineNumber(lineNumber);

            return parmId;
    }
    /*
    @Override 
    public Object visitAssignmentStatement(
                                    SegueParser.AssignmentStatementContext ctx) 
    {
        SegueParser.LhsContext lhsCtx = ctx.lhs();
        SegueParser.RhsContext rhsCtx = ctx.rhs();
        
        visitChildren(ctx);
        
        Typespec lhsType = lhsCtx.type;
        Typespec rhsType = rhsCtx.expression().type;
        
        if (!TypeChecker.areAssignmentCompatible(lhsType, rhsType))
        {
            error.flag(INCOMPATIBLE_ASSIGNMENT, rhsCtx);
        }
        
        return null;
    }

    @Override 
    public Object visitLhs(SegueParser.LhsContext ctx) 
    {
        SegueParser.VariableContext varCtx = ctx.variable();
        visit(varCtx);
        ctx.type = varCtx.type;
        
        return null;
    }

    @Override 
    public Object visitIfStatement(SegueParser.IfStatementContext ctx) 
    {
        SegueParser.ExpressionContext     exprCtx  = ctx.expression();
        SegueParser.TrueStatementContext  trueCtx  = ctx.trueStatement();
        SegueParser.FalseStatementContext falseCtx = ctx.falseStatement();
        
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        
        if (!TypeChecker.isBoolean(exprType))
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, exprCtx);
        }
        
        visit(trueCtx);
        if (falseCtx != null) visit(falseCtx);
        
        return null;
    }
    */
    /*
    @Override 
    public Object visitCaseStatement(SegueParser.CaseStatementContext ctx) 
    {
        SegueParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        Form exprTypeForm = exprType.getForm();
        
        if (   (   (exprTypeForm != SCALAR) 
                && (exprTypeForm != ENUMERATION) 
                && (exprTypeForm != SUBRANGE))
            || (exprType == Predefined.realType)
            || (exprType == Predefined.stringType))
        {
            error.flag(TYPE_MISMATCH, exprCtx);
            exprType = Predefined.integerType;
        }
        
        HashSet<Integer> constants = new HashSet<>();
        SegueParser.CaseBranchListContext branchListCtx = ctx.caseBranchList();
        
        // Loop over the CASE branches.
        for (SegueParser.CaseBranchContext branchCtx : 
                                                    branchListCtx.caseBranch())
        {
            SegueParser.CaseConstantListContext constListCtx = 
                                                    branchCtx.caseConstantList();
            SegueParser.StatementContext stmtCtx = branchCtx.statement();
            
            if (constListCtx != null)
            {
                // Loop over the CASE constants in each branch.
                for (SegueParser.CaseConstantContext caseConstCtx : 
                                                    constListCtx.caseConstant())
                {
                    SegueParser.ConstantContext constCtx = 
                                                        caseConstCtx.constant();
                    Object constValue = visit(constCtx);
                    
                    caseConstCtx.type  = constCtx.type;
                    caseConstCtx.value = 0;
                    
                    if (constCtx.type != exprType)
                    {
                        error.flag(TYPE_MISMATCH, constCtx);
                    }
                    else if (   (constCtx.type == Predefined.integerType)
                             || (constCtx.type.getForm() == ENUMERATION))
                    {
                        caseConstCtx.value = (Integer) constValue;
                    }
                    else if (constCtx.type == Predefined.charType)
                    {
                        caseConstCtx.value = (Character) constValue;
                    }
                    
                    if (constants.contains(caseConstCtx.value))
                    {
                        error.flag(DUPLICATE_CASE_CONSTANT, constCtx);
                    }
                    else
                    {
                        constants.add(caseConstCtx.value);
                    }
                }
            }
            
            if (stmtCtx != null) visit(stmtCtx);
        }
        
        return null;
    }

    @Override 
    public Object visitRepeatStatement(SegueParser.RepeatStatementContext ctx) 
    {
        SegueParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        
        if (!TypeChecker.isBoolean(exprType))
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, exprCtx);
        }
        
        visit(ctx.statementList());
        return null;
    }

    @Override 
    public Object visitWhileStatement(SegueParser.WhileStatementContext ctx) 
    {
        SegueParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        
        if (!TypeChecker.isBoolean(exprType))
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, exprCtx);
        }
        
        visit(ctx.statement());
        return null;
    }

    @Override 
    public Object visitForStatement(SegueParser.ForStatementContext ctx) 
    {
        SegueParser.VariableContext varCtx = ctx.variable();
        visit(varCtx);
        
        String controlName = varCtx.variableIdentifier().getText().toLowerCase();
        Typespec controlType = Predefined.integerType;
        
        if (varCtx.entry != null)
        {
            controlType = varCtx.type;
            
            if (   (controlType.getForm() != SCALAR )
                || (controlType == Predefined.realType)
                || (controlType == Predefined.stringType)
                || (varCtx.modifier().size() != 0))
            {
                error.flag(INVALID_CONTROL_VARIABLE, varCtx);
            }
        }
        else
        {
            error.flag(UNDECLARED_IDENTIFIER, ctx.getStart().getLine(), 
                       controlName);
        }
        
        SegueParser.ExpressionContext startCtx = ctx.expression().get(0);
        SegueParser.ExpressionContext endCtx   = ctx.expression().get(1);
        
        visit(startCtx);
        visit(endCtx);
        
        if (startCtx.type != controlType) error.flag(TYPE_MISMATCH, startCtx);
        if (startCtx.type != endCtx.type) error.flag(TYPE_MISMATCH, endCtx);
        
        visit(ctx.statement());
        return null;
    }
    */
    /*
    @Override 
    public Object visitProcedureCallStatement(
                                SegueParser.ProcedureCallStatementContext ctx) 
    {
        SegueParser.ProcedureNameContext nameCtx = ctx.procedureName();
        SegueParser.ArgumentListContext listCtx = ctx.argumentList();
        String name = ctx.procedureName().getText().toLowerCase();
        SymtabEntry procedureId = symtabStack.lookup(name);
        boolean badName = false;
        
        if (procedureId == null)
        {
            error.flag(UNDECLARED_IDENTIFIER, nameCtx);
            badName = true;
        }
        else if (procedureId.getKind() != PROCEDURE)
        {
            error.flag(NAME_MUST_BE_PROCEDURE, nameCtx);
            badName = true;
        }
        
        // Bad procedure name. Do a simple arguments check and then leave.
        if (badName)
        {
            for (SegueParser.ArgumentContext exprCtx : listCtx.argument())
            {
                visit(exprCtx);
            }
        }
        
        // Good procedure name.
        else
        {
            ArrayList<SymtabEntry> parms = procedureId.getRoutineParameters();
            checkCallArguments(listCtx, parms);
        }
        
        nameCtx.entry = procedureId;
        return null;
    }
*/
    @Override 
    public Object visitFunctioncall(SegueParser.FunctioncallContext ctx) 
    {
        SegueParser.FunctionIDContext nameCtx = ctx.functionID();
        SegueParser.ArgListContext listCtx = ctx.argList();
        String name = nameCtx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry functionId = symtabStack.lookup(name);
        boolean badName = false;
        
        ctx.type = Predefined.undefinedType;

        if (functionId == null)
        {
            error.flag(UNDECLARED_IDENTIFIER, nameCtx);
            badName = true;
        }
        else if (functionId.getKind() != FUNCTION)
        {
            error.flag(NAME_MUST_BE_FUNCTION, nameCtx);
            badName = true;
        }
        
        // Bad function name. Do a simple arguments check and then leave.
        if (badName)
        {
            for (SegueParser.ArgContext exprCtx : listCtx.arg())
            {
                visit(exprCtx);
            }
        }
        
        // Good function name.
        else
        {
            ArrayList<SymtabEntry> parameters = functionId.getRoutineParameters();
            checkCallArguments(listCtx, parameters);
            ctx.type = functionId.getType();
        }
        
        nameCtx.entry = functionId;
        nameCtx.type  = ctx.type;

        return null;
    }
    
    /**
     * Perform semantic operations on procedure and function call arguments.
     * @param listCtx the ArgumentListContext.
     * @param parameters the arraylist of parameters to fill.
     */
    private void checkCallArguments(SegueParser.ArgListContext listCtx, ArrayList<SymtabEntry> parameters)
    {
        int parmsCount = parameters.size();
        int argsCount = listCtx != null ? listCtx.arg().size() : 0;
        
        if (parmsCount != argsCount)
        {
            error.flag(ARGUMENT_COUNT_MISMATCH, listCtx);
            return;
        }
        
        // Check each argument against the corresponding parameter.
        for (int i = 0; i < parmsCount; i++)
        {
            SegueParser.ArgContext argCtx = listCtx.arg().get(i);
            Typespec form1 = argCtx.booleanExpression() != null ? Predefined.booleanType: Predefined.doubleType;
            Typespec form2 = parameters.get(i).getType();
            
            // For a value parameter, the argument type must be
            // assignment compatible with the parameter type.
            if (!form1.equals(form2))
            {
                error.flag(TYPE_MISMATCH, argCtx);
            }
        }
    }

    /**
     * Determine whether or not an expression is a variable only.
     * @param exprCtx the ExpressionContext.
     * @return true if it's an expression only, else false.
     */
    /*
    private boolean expressionIsVariable(SegueParser.ExpressionContext exprCtx)
    {
        // Only a single simple expression?
        if (exprCtx.simpleExpression().size() == 1)
        {
            SegueParser.SimpleExpressionContext simpleCtx = 
                                              exprCtx.simpleExpression().get(0);
            // Only a single term?
            if (simpleCtx.term().size() == 1)
            {
                SegueParser.TermContext termCtx = simpleCtx.term().get(0);
                
                // Only a single factor?
                if (termCtx.factor().size() == 1)
                {
                    return termCtx.factor().get(0) instanceof 
                                            SegueParser.VariableFactorContext;
                }
            }
        }
        
        return false;
    }
    */
    /*
    @Override 
    public Object visitExpression(SegueParser.ExpressionContext ctx) 
    {
        SegueParser.SimpleExpressionContext simpleCtx1 =
                                                ctx.simpleExpression().get(0);

        // First simple expression.
        visit(simpleCtx1);
        
        Typespec simpleType1 = simpleCtx1.type;
        ctx.type = simpleType1;
        
        SegueParser.RelOpContext relOpCtx = ctx.relOp();
        
        // Second simple expression?
        if (relOpCtx != null)
        {
            SegueParser.SimpleExpressionContext simpleCtx2 = 
                                                ctx.simpleExpression().get(1);
            visit(simpleCtx2);
            
            Typespec simpleType2 = simpleCtx2.type;
            if (!TypeChecker.areComparisonCompatible(simpleType1, simpleType2))
            {
                error.flag(INCOMPATIBLE_COMPARISON, ctx);
            }
            
            ctx.type = Predefined.booleanType;
        }
        
        return null;
    }

    @Override 
    public Object visitSimpleExpression(SegueParser.SimpleExpressionContext ctx) 
    {
        int count = ctx.term().size();
        SegueParser.SignContext signCtx = ctx.sign();
        Boolean hasSign = signCtx != null;
        SegueParser.TermContext termCtx1 = ctx.term().get(0);
        
        if (hasSign)
        {
            String sign = signCtx.getText();
            if (sign.equals("+") && sign.equals("-"))
            {
                error.flag(INVALID_SIGN, signCtx);
            }
        }
        
        // First term.
        visit(termCtx1);
        Typespec termType1 = termCtx1.type;        
        
        // Loop over any subsequent terms.
        for (int i = 1; i < count; i++)
        {
            String op = ctx.addOp().get(i-1).getText().toLowerCase();
            SegueParser.TermContext termCtx2 = ctx.term().get(i);
            visit(termCtx2);
            Typespec termType2 = termCtx2.type;
            
            // Both operands boolean ==> boolean result. Else type mismatch.
            if (op.equals("or"))
            {
                if (!TypeChecker.isBoolean(termType1)) 
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, termCtx1);
                }
                if (!TypeChecker.isBoolean(termType2)) 
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, termCtx2);
                }
                if (hasSign)
                {
                    error.flag(INVALID_SIGN, signCtx);
                }
                
                termType2 = Predefined.booleanType;
            }
            else if (op.equals("+"))
            {
                // Both operands integer ==> integer result
                if (TypeChecker.areBothInteger(termType1, termType2)) 
                {
                    termType2 = Predefined.integerType;
                }

                // Both real operands ==> real result 
                // One real and one integer operand ==> real result
                else if (TypeChecker.isAtLeastOneReal(termType1, termType2)) 
                {
                    termType2 = Predefined.realType;
                }
                
                // Both operands string ==> string result
                else if (TypeChecker.areBothString(termType1, termType2))
                {
                    if (hasSign) error.flag(INVALID_SIGN, signCtx);                    
                    termType2 = Predefined.stringType;
                }

                // Type mismatch.
                else
                {
                    if (!TypeChecker.isIntegerOrReal(termType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx1);
                        termType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(termType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx2);
                        termType2 = Predefined.integerType;
                    }
                }
            }
            else  // -
            {
                // Both operands integer ==> integer result
                if (TypeChecker.areBothInteger(termType1, termType2)) 
                {
                    termType2 = Predefined.integerType;
                }

                // Both real operands ==> real result 
                // One real and one integer operand ==> real result
                else if (TypeChecker.isAtLeastOneReal(termType1, termType2)) 
                {
                    termType2 = Predefined.realType;
                }
                
                // Type mismatch.
                else
                {
                    if (!TypeChecker.isIntegerOrReal(termType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx1);
                        termType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(termType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx2);
                        termType2 = Predefined.integerType;
                    }
                }
            }
            
            termType1 = termType2;
        }
        
        ctx.type = termType1;
        return null;
    }

    @Override 
    public Object visitTerm(SegueParser.TermContext ctx) 
    {
        int count = ctx.factor().size();
        SegueParser.FactorContext factorCtx1 = ctx.factor().get(0);
        
        // First factor.
        visit(factorCtx1);
        Typespec factorType1 = factorCtx1.type; 
        
        // Loop over any subsequent factors.
        for (int i = 1; i < count; i++)
        {
            String op = ctx.mulOp().get(i-1).getText().toLowerCase();
            SegueParser.FactorContext factorCtx2 = ctx.factor().get(i);
            visit(factorCtx2);
            Typespec factorType2 = factorCtx2.type;
            
            if (op.equals("*"))
            {
                // Both operands integer  ==> integer result
                if (TypeChecker.areBothInteger(factorType1, factorType2)) 
                {
                    factorType2 = Predefined.integerType;
                }

                // Both real operands ==> real result 
                // One real and one integer operand ==> real result
                else if (TypeChecker.isAtLeastOneReal(factorType1, factorType2)) 
                {
                    factorType2 = Predefined.realType;
                }
                
                // Type mismatch.
                else
                {
                    if (!TypeChecker.isIntegerOrReal(factorType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx1);
                        factorType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(factorType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx2);
                        factorType2 = Predefined.integerType;
                    }
                }
            }
            else if (op.equals("/"))
            {
                // All integer and real operand combinations ==> real result
                if (   TypeChecker.areBothInteger(factorType1, factorType2)
                    || TypeChecker.isAtLeastOneReal(factorType1, factorType2))
                {
                    factorType2 = Predefined.realType;
                }
                
                // Type mismatch.
                else 
                {
                    if (!TypeChecker.isIntegerOrReal(factorType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx1);
                        factorType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(factorType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx2);
                        factorType2 = Predefined.integerType;
                    }
                }
            }
            else if (op.equals("div") || op.equals("mod"))
            {
                // Both operands integer ==> integer result. Else type mismatch.
                if (!TypeChecker.isInteger(factorType1))
                {
                    error.flag(TYPE_MUST_BE_INTEGER, factorCtx1);
                    factorType2 = Predefined.integerType;
                }
                if (!TypeChecker.isInteger(factorType2))
                {
                    error.flag(TYPE_MUST_BE_INTEGER, factorCtx2);
                    factorType2 = Predefined.integerType;
                }
            }
            else if (op.equals("and"))
            {
                // Both operands boolean ==> boolean result. Else type mismatch.
                if (!TypeChecker.isBoolean(factorType1))
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx1);
                    factorType2 = Predefined.booleanType;
                }
                if (!TypeChecker.isBoolean(factorType2))
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx2);
                    factorType2 = Predefined.booleanType;
                }
            }
            
            factorType1 = factorType2;
        }

        ctx.type = factorType1;
        return null;
    }
    */
    /*
    @Override 
    public Object visitVariableFactor(SegueParser.VariableFactorContext ctx) 
    {
        SegueParser.VariableContext varCtx = ctx.variable();
        visit(varCtx);        
        ctx.type  = varCtx.type;
        
        return null;
    }
    
    @Override 
    public Object visitVariable(SegueParser.VariableContext ctx) 
    {
        SegueParser.VariableIdentifierContext varIdCtx = 
                                                    ctx.variableIdentifier();
        
        visit(varIdCtx);
        ctx.entry = varIdCtx.entry;
        ctx.type  = variableDatatype(ctx, varIdCtx.type);

        return null;
    }
    */
    
    @Override
    public Object visitNumIdentifier(SegueParser.NumIdentifierContext ctx){
        int lineNumber = ctx.getStart().getLine();        
        String variableName = ctx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry variableId = symtabStack.lookup(variableName);
            
            if (variableId == null)
            {
                variableId = symtabStack.enterLocal(variableName, VARIABLE);
                variableId.setType(Predefined.doubleType);
                
                // Assign slot numbers to local variables.
                Symtab symtab = variableId.getSymtab();
                if (symtab.getNestingLevel() > 1)
                {
                    variableId.setSlotNumber(symtab.nextSlotNumber());
                }
                
                ctx.entry = variableId;
            }
            else
            {
                if (variableId.getType() != Predefined.doubleType) error.flag(SAME_NAME_DIFFERENT_TYPE, ctx);
                ctx.type = variableId.getType();
                ctx.entry = variableId;
               // variableId.appendLineNumber(lineNumber);
    
                Kind kind = variableId.getKind();
                switch (kind)
                {
                    case UNDEFINED:
                        error.flag(INVALID_VARIABLE, ctx);
                        break;
                        
                    default: break;
                }
            }
            
            variableId.appendLineNumber(lineNumber);        
            ctx.type = Predefined.doubleType;
        

        return null;
    }

    @Override
    public Object visitBoolIdentifier(SegueParser.BoolIdentifierContext ctx){

        int lineNumber = ctx.getStart().getLine();        
        String variableName = ctx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry variableId = symtabStack.lookup(variableName);
            
            if (variableId == null)
            {
                variableId = symtabStack.enterLocal(variableName, VARIABLE);
                variableId.setType(Predefined.booleanType);
                
                // Assign slot numbers to local variables.
                Symtab symtab = variableId.getSymtab();
                if (symtab.getNestingLevel() > 1)
                {
                    variableId.setSlotNumber(symtab.nextSlotNumber());
                }
                
                ctx.entry = variableId;
            }
            else
            {
                if (variableId.getType() != Predefined.booleanType) error.flag(SAME_NAME_DIFFERENT_TYPE, ctx);
                ctx.type = variableId.getType();
                ctx.entry = variableId;
               // variableId.appendLineNumber(lineNumber);
    
                Kind kind = variableId.getKind();
                switch (kind)
                {
                    case UNDEFINED:
                        error.flag(INVALID_VARIABLE, ctx);
                        break;
                        
                    default: break;
                }
            }
            
            variableId.appendLineNumber(lineNumber);        
            ctx.type = Predefined.booleanType;
        
        return null;
    }

    // @Override 
    // public Object visitVariableIdentifier(
    //                                 SegueParser.VariableIdentifierContext ctx) 
    // {
    //     String variableName = ctx.IDENTIFIER().getText().toLowerCase();
    //     SymtabEntry variableId = symtabStack.lookup(variableName);
        
    //     if (variableId != null)
    //     {
    //         int lineNumber = ctx.getStart().getLine();
    //         ctx.type = variableId.getType();
    //         ctx.entry = variableId;
    //         variableId.appendLineNumber(lineNumber);
            
    //         Kind kind = variableId.getKind();
    //         switch (kind)
    //         {
    //             case TYPE:
    //             case PROGRAM:
    //             case PROGRAM_PARAMETER:
    //             case PROCEDURE:
    //             case UNDEFINED:
    //                 error.flag(INVALID_VARIABLE, ctx);
    //                 break;
                    
    //             default: break;
    //         }
    //     }
    //     else
    //     {
    //         error.flag(UNDECLARED_IDENTIFIER, ctx);
    //         ctx.type = Predefined.integerType;
    //     }

    //     return null;
    // }
    
    /**
     * Determine the datatype of a variable that can have modifiers.
     * @param varCtx the VariableContext.
     * @param varType the variable's datatype without the modifiers.
     * @return the datatype with any modifiers.
     */
    /*
    private Typespec variableDatatype(
                        SegueParser.VariableContext varCtx, Typespec varType)
    {
        Typespec type = varType;
        
        // Loop over the modifiers.
        for (SegueParser.ModifierContext modCtx : varCtx.modifier())
        {
            // Subscripts.
            if (modCtx.indexList() != null)
            {
                SegueParser.IndexListContext indexListCtx = modCtx.indexList();
                
                // Loop over the subscripts.
                for (SegueParser.IndexContext indexCtx : indexListCtx.index())
                {
                    if (type.getForm() == ARRAY)
                    {
                        Typespec indexType = type.getArrayIndexType();
                        SegueParser.ExpressionContext exprCtx = 
                                                        indexCtx.expression();
                        visit(exprCtx);
                        
                        if (indexType.baseType() != exprCtx.type.baseType())
                        {
                            error.flag(TYPE_MISMATCH, exprCtx);
                        }
                        
                        // Datatype of the next dimension.
                        type = type.getArrayElementType();
                    }
                    else
                    {
                        error.flag(TOO_MANY_SUBSCRIPTS, indexCtx);
                    }
                }
            }
            else  // Record field.
            {
                if (type.getForm() == RECORD)
                {
                    Symtab symtab = type.getRecordSymtab();
                    SegueParser.FieldContext fieldCtx = modCtx.field();
                    String fieldName = 
                                fieldCtx.IDENTIFIER().getText().toLowerCase();
                    SymtabEntry fieldId = symtab.lookup(fieldName);

                    // Field of the record type?
                    if (fieldId != null) 
                    {
                        type = fieldId.getType();
                        fieldCtx.entry = fieldId;
                        fieldCtx.type = type;
                        fieldId.appendLineNumber(modCtx.getStart().getLine());
                    }
                    else 
                    {
                        error.flag(INVALID_FIELD, modCtx);
                    }
                }
                
                // Not a record variable.
                else 
                {
                    error.flag(INVALID_FIELD, modCtx);
                }
            }
        }
        
        return type;
    }
    */
    /*
    @Override 
    public Object visitNumberFactor(SegueParser.NumberFactorContext ctx) 
    {
        SegueParser.NumberContext          numberCtx   = ctx.number();
        SegueParser.UnsignedNumberContext  unsignedCtx = numberCtx.unsignedNumber();
        SegueParser.IntegerConstantContext integerCtx  = unsignedCtx.integerConstant();

        ctx.type = (integerCtx != null) ? Predefined.integerType
                                        : Predefined.realType;
        
        return null;
    }

    @Override 
    public Object visitCharacterFactor(
                                    SegueParser.CharacterFactorContext ctx) 
    {
        ctx.type = Predefined.charType;
        return null;
    }

    @Override 
    public Object visitStringFactor(SegueParser.StringFactorContext ctx) 
    {
        ctx.type = Predefined.stringType;
        return null;
    }

    @Override 
    public Object visitNotFactor(SegueParser.NotFactorContext ctx) 
    {
        SegueParser.FactorContext factorCtx = ctx.factor();
        visit(factorCtx);
        
        if (factorCtx.type != Predefined.booleanType)
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx);
        }
        
        ctx.type = Predefined.booleanType;
        return null;
    }

    @Override 
    public Object visitParenthesizedFactor(
                                    SegueParser.ParenthesizedFactorContext ctx) 
    {
        SegueParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        ctx.type = exprCtx.type;

        return null;
    }
    */
}
