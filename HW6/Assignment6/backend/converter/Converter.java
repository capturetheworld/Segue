package backend.converter;

import java.util.Hashtable;

import antlr4.*;

import intermediate.symtab.*;
import intermediate.type.*;
import intermediate.type.Typespec.Form;

import static intermediate.symtab.SymtabEntry.Kind.*;
import static intermediate.type.Typespec.Form.*;

/**
 * Convert Pascal programs to Java.
 */
public class Converter extends PascalBaseVisitor<Object>
{
    private CodeGenerator code;
    private boolean programVariables = true;
    private boolean recordFields = false;
    private String currentSeparator = "";
    
    // Map a Pascal datatype name to the Java datatype name.
    private static Hashtable<String, String> typeNameTable;
    static
    {
        typeNameTable = new Hashtable<>();
        typeNameTable.put("integer", "int");
        typeNameTable.put("real",    "double");
        typeNameTable.put("boolean", "boolean");
        typeNameTable.put("char",    "char");
        typeNameTable.put("string",  "String");
    }

    /**
     * Get the name of the object (Java) file.
     * @return the name.
     */
    public String getObjectFileName() { return code.getObjectFileName(); }
    
    @Override 
    public Object visitProgram(PascalParser.ProgramContext ctx) 
    { 
        visit(ctx.programHeader());
        
        // Execution timer and runtime standard input.
        code.indent();
        code.emitLine("private static java.util.Scanner _sysin = " +
                      "new java.util.Scanner(System.in);");
        code.emitLine();
        
        // Level 1 declarations.
        PascalParser.ProgramIdentifierContext idCtx = 
                                        ctx.programHeader().programIdentifier();
        visit(ctx.block().declarations()); 
        emitUnnamedRecordDefinitions(idCtx.entry.getRoutineSymtab());
        
        // Main.
        code.emitLine();
        code.emitLine("public static void main(String[] args)");        
        code.emitLine("{");
        code.indent();
        
        // Execution timer.
        code.emitLine("java.time.Instant _start = java.time.Instant.now();");
        code.emitLine();
        
        // Allocate structured data.
        emitAllocateStructuredVariables("", idCtx.entry.getRoutineSymtab());
        code.emitLine();
        
        // Main compound statement.
        visit(ctx.block().compoundStatement().statementList());
        
        // Print the execution time.
        code.emitLine();
        code.emitLine("java.time.Instant _end = java.time.Instant.now();");
        code.emitLine("long _elapsed = java.time.Duration." +
                      "between(_start, _end).toMillis();");
        code.emitLine("System.out.printf(\"\\n[%,d milliseconds execution time.]" +
                                         "\\n\", _elapsed);");
        
        code.dedent();
        code.emitLine("}");

        code.dedent();
        code.emitLine("}");

        code.close();
        return null;
    }
    
    @Override 
    public Object visitProgramHeader(PascalParser.ProgramHeaderContext ctx) 
    { 
        String programName = ctx.programIdentifier().entry.getName();
        code = new CodeGenerator(programName, "java");
        
        // Emit the Java program class.
        code.emitLine("public class " + programName);
        code.emitLine("{");
        
        return null;
    }

    @Override 
    public Object visitConstantDefinition(
                                    PascalParser.ConstantDefinitionContext ctx) 
    { 
        PascalParser.ConstantIdentifierContext idCtx = ctx.constantIdentifier();
        PascalParser.ConstantContext constCtx = ctx.constant();
        String constantName = idCtx.entry.getName();
        Typespec type = constCtx.type;
        String pascalTypeName = type.getIdentifier().getName();
        String javaTypeName = typeNameTable.get(pascalTypeName);
        
        code.emitStart();
        if (programVariables) code.emit("private static ");
        code.emitEnd("final " + javaTypeName + " " + constantName + " = "
                              + constCtx.getText() + ";");

        return null;
    }
    
    @Override 
    public Object visitTypeDefinition(PascalParser.TypeDefinitionContext ctx) 
    { 
        PascalParser.TypeIdentifierContext idCtx = ctx.typeIdentifier();
        String typeName = idCtx.entry.getName();
        PascalParser.TypeSpecificationContext typeCtx = ctx.typeSpecification();
        Form form = typeCtx.type.getForm();
        
        if (form == ENUMERATION)
        {
            code.emitStart();
            if (programVariables) code.emit("private static ");
            code.emit("enum " + typeName);
            visit(typeCtx);
        }
        else if (form == RECORD)
        {
            code.emitStart();
            if (programVariables) code.emit("public static ");
            code.emitEnd("class " + typeName);
            code.emitLine("{");
            code.indent();
         
            emitUnnamedRecordDefinitions(typeCtx.type.getRecordSymtab());
            visit(typeCtx);
            
            code.dedent();
            code.emitLine("}");
            code.emitLine();
        }
        
        return null;
    }
            
    @Override 
    public Object visitEnumerationTypespec(
                                    PascalParser.EnumerationTypespecContext ctx) 
    {
        String separator = " {";
        
        for (PascalParser.EnumerationConstantContext constCtx : 
                                    ctx.enumerationType().enumerationConstant())
        {
            code.emit(separator + constCtx.constantIdentifier().entry.getName());
            separator = ", ";
        }

        code.emitEnd("};");
        return null;
    }

    /**
     * Emit a record type definition for an unnamed record.
     * @param symtab the symbol table that can contain unnamed records.
     */
    private void emitUnnamedRecordDefinitions(Symtab symtab)
    {
        // Loop to look for names of unnamed record types.
        for (SymtabEntry id : symtab.sortedEntries())
        {
            if (   (id.getKind() == TYPE) 
                && (id.getType().getForm() == RECORD)
                && (id.getName().startsWith(Symtab.UNNAMED_PREFIX)))
            {
                code.emitStart();
                if (programVariables) code.emit("public static ");
                code.emitEnd("class " + id.getName());
                code.emitLine("{");
                code.indent();
                emitRecordFields(id.getType().getRecordSymtab());
                code.dedent();
                code.emitLine("}");
                code.emitLine();
            }
        }
    }
    
    /**
     * Emit the record fields of a record.
     * @param symtab the symbol table of the unnamed record.
     */
    private void emitRecordFields(Symtab symtab)
    {
        emitUnnamedRecordDefinitions(symtab);
        
        // Loop over the entries of the symbol table.
        for (SymtabEntry fieldId : symtab.sortedEntries())
        {
            if (fieldId.getKind() == RECORD_FIELD)
            {
                code.emitStart(typeName(fieldId.getType()));
                code.emit(" " + fieldId.getName());
                code.emitEnd(";");
            }
        }
    }
    
    @Override 
    public Object visitRecordTypespec(PascalParser.RecordTypespecContext ctx) 
    {
        PascalParser.RecordFieldsContext fieldsCtx = 
                                                ctx.recordType().recordFields();
        recordFields = true;
        visit(fieldsCtx.variableDeclarationsList());
        recordFields = false;
        
        return null;
    }

    @Override 
    public Object visitVariableDeclarations(
                                PascalParser.VariableDeclarationsContext ctx) 
    { 
        PascalParser.TypeSpecificationContext typeCtx = ctx.typeSpecification();
        PascalParser.VariableIdentifierListContext listCtx = 
                                                ctx.variableIdentifierList();
        
        for (PascalParser.VariableIdentifierContext varCtx : 
                                                listCtx.variableIdentifier())
        {
            code.emitStart();
            if (programVariables && !recordFields) code.emit("private static ");
            code.emit(typeName(typeCtx.type));

            code.emit(" " + varCtx.entry.getName());
            if (typeCtx.type.getForm() == ARRAY) emitArraySpecifier(typeCtx.type);        
            code.emitEnd(";");          
        }

        return null;
    }
    
    /**
     * Emit a pair of empty brackets for each dimension.
     * @param type the array datatype.
     */
    private void emitArraySpecifier(Typespec type)
    {
        String brackets = "";
        
        while (type.getForm() == ARRAY)
        {
            brackets += "[]";
            type = type.getArrayElementType();
        }
        
        code.emit(brackets);
    }
    
    /**
     * Convert a Pascal type name to the equivalent Java type name.
     * @param pascalType the datatype name.
     * @return the Java type name.
     */
    private String typeName(Typespec pascalType)
    {
        Form form = pascalType.getForm();
        SymtabEntry typeId = pascalType.getIdentifier();
        String pascalTypeName = typeId != null ? typeId.getName() : null;
        
        if (form == ARRAY)
        {
            Typespec elmtType = pascalType.getArrayBaseType();
            pascalTypeName = elmtType.getIdentifier().getName();
            String javaTypeName = typeNameTable.get(pascalTypeName);
            return javaTypeName != null ? javaTypeName : pascalTypeName;
        }
        else if (form == SUBRANGE)
        {
            Typespec baseType = pascalType.baseType();
            pascalTypeName = baseType.getIdentifier().getName();
            return typeNameTable.get(pascalTypeName);
        }
        else if (form == ENUMERATION) 
        {
            return pascalTypeName != null ? pascalTypeName : "int";
        }
        else if (form == RECORD) return pascalTypeName;
        else                     return typeNameTable.get(pascalTypeName);
    }

    @Override 
    public Object visitTypeIdentifier(PascalParser.TypeIdentifierContext ctx) 
    {
        Typespec pascalType = ctx.type;
        String javaTypeName = typeName(pascalType);        
        code.emit(javaTypeName);
        
        return null;
    }

    @Override 
    public Object visitVariableIdentifierList(
                                PascalParser.VariableIdentifierListContext ctx) 
    {
        String separator = " ";
        
        for (PascalParser.VariableIdentifierContext varCtx : 
                                                    ctx.variableIdentifier())
        {
            code.emit(separator);
            code.emit(varCtx.getText());
            separator = ", ";
        }

        return null;
    }

    @Override 
    public Object visitRoutineDefinition(
                                    PascalParser.RoutineDefinitionContext ctx) 
    {
        PascalParser.FunctionHeadContext  funcCtx = ctx.functionHead();
        PascalParser.ProcedureHeadContext procCtx = ctx.procedureHead();
        PascalParser.RoutineIdentifierContext idCtx = null;
        PascalParser.ParametersContext parmsCtx = null;
        boolean functionDefinition = funcCtx != null;
        String routineName;
        
        programVariables = false;
        code.emitLine();
        code.emitStart("static ");
        
        if (functionDefinition)
        {
            idCtx = funcCtx.routineIdentifier();
            parmsCtx = funcCtx.parameters();
            visit(funcCtx.typeIdentifier());
        }
        else
        {
            idCtx = procCtx.routineIdentifier();
            parmsCtx = procCtx.parameters();
            code.emit("void");
        }
        
        routineName = idCtx.entry.getName();
        code.emit(" " + routineName);
        
        code.emit("(");
        if (parmsCtx != null) visit(parmsCtx);
        code.emitEnd(")");
        code.emitLine("{");
        code.indent(); 
        
        if (functionDefinition)
        {
            // Function associated variable.
            code.emitStart();
            visit(funcCtx.typeIdentifier());
            code.emit(" " + routineName + ";");
            code.emitLine();
        }
        
        visit(ctx.block().declarations());
        
        // Allocate structured data.
        emitAllocateStructuredVariables("", idCtx.entry.getRoutineSymtab());
        code.emitLine();

        visit(ctx.block().compoundStatement().statementList());    
        
        if (functionDefinition)
        {
            // Return function value.
            code.emitLine();
            code.emitLine("return " + routineName + ";");
        }
        
        code.dedent();
        code.emitLine("}");       
        
        return null;
    }
    
    @Override 
    public Object visitParameters(PascalParser.ParametersContext ctx) 
    {
        currentSeparator = "";
        
        code.mark();
        visit(ctx.parameterDeclarationsList());
                  
        return null;
    }

    @Override 
    public Object visitParameterDeclarations(
                                PascalParser.ParameterDeclarationsContext ctx) 
    {
        PascalParser.ParameterIdentifierListContext parmListCtx = 
                                                ctx.parameterIdentifierList();
        PascalParser.TypeIdentifierContext typeCtx = ctx.typeIdentifier();
        Typespec parmType = typeCtx.type;
        
        // Loop over the parameters.
        for (PascalParser.ParameterIdentifierContext parmIdCtx : 
                                            parmListCtx.parameterIdentifier())
        {
            code.emit(currentSeparator);
            code.split(60);   
            
            visit(typeCtx);
            code.emit(" " + parmIdCtx.entry.getName());
            
            if (parmType.getForm() == ARRAY) emitArraySpecifier(parmType);
            currentSeparator = ", ";
        }
        
        return null;
    }

    /**
     * Emit code to allocate data for structured (array or record) variables.
     * @param lhsPrefix the prefix for the target variable name.
     * @param symtab the symbol table containing the variable names.
     */
    private void emitAllocateStructuredVariables(String lhsPrefix, Symtab symtab)
    {
        // Loop over all the symbol table's identifiers to emit
        // code to allocate array and record variables.
        for (SymtabEntry id : symtab.sortedEntries()) 
        {
            if (id.getKind() == VARIABLE) 
            {
                emitAllocateStructuredData(lhsPrefix, id);
            }
        }
    }
    
    /**
     * Emit code to allocate structured (array or record) data.
     * @param lhsPrefix the prefix for the target variable name.
     * @param variableId the symbol table entry of the target variable.
     */
    private void emitAllocateStructuredData(String lhsPrefix, 
                                            SymtabEntry variableId)
    {
        Typespec variableType = variableId.getType();
        Form form = variableType.getForm();
        String variableName = variableId.getName();

        if (form == ARRAY)
        {
            code.emitStart(lhsPrefix + variableName + " = ");
            Typespec elmtType = emitNewArray(variableType);
            code.emitEnd(";");
            
            if (elmtType.isStructured())
            {
                emitNewArrayElement(lhsPrefix, variableName, variableType);
            }
        }
        else if (form == RECORD) 
        {
            code.emitStart(lhsPrefix + variableName + " = ");
            emitNewRecord(lhsPrefix, variableName, variableType);
        }
    }

    /**
     * Emit a string of bracketed dimension sizes for the array datatype.
     * followed by the "new" array allocation.
     * @param type the array datatype.
     * @return the base datatype of the array.
     */
    private Typespec emitNewArray(Typespec type)
    {
        String sizes = "";
        
        while (type.getForm() == ARRAY)
        {
            sizes += "[" + type.getArrayElementCount() + "]";
            type = type.getArrayElementType();
        }
        
        type = type.baseType();
        String pascalTypeName = type.getIdentifier().getName();
        String javaTypeName = typeNameTable.get(pascalTypeName);
        
        if (javaTypeName == null) javaTypeName = pascalTypeName;
        code.emit("new " + javaTypeName + sizes);
        
        return type;
    }

    /**
     * Emit code to allocate an array element.
     * @param lhsPrefix the prefix for the target variable name.
     * @param variableName the name of the target variable.
     * @param elmtType the element's datatype.
     */
    private void emitNewArrayElement(String lhsPrefix, String variableName, 
                                     Typespec elmtType)
    {        
        int dimensionCount = 0;

        do
        {
            int elmtCount = elmtType.getArrayElementCount();
            ++dimensionCount;
            String subscript = "_i" + dimensionCount;
            variableName += "[" + subscript + "]";
            
            code.emitLine("for (int " + subscript + " = 0; " +
                          subscript + " < " + elmtCount +
                          "; " + subscript + "++)");
            code.emitStart("{");
            code.indent();
            
            elmtType = elmtType.getArrayElementType();
        } while (elmtType.getForm() == ARRAY);
        
        String typeName = elmtType.getIdentifier().getName();
        code.emitStart(lhsPrefix + variableName + " = new " + typeName + "()");
        code.emitEnd(";");
        
        emitNewRecordFields(lhsPrefix + variableName + ".", elmtType);
                    
        while (--dimensionCount >= 0) 
        {
            code.dedent();
            code.emitLine("}");
        }
    }
    
    /**
     * Emit code to allocate a new record.
     * @param lhsPrefix the prefix for the target variable name.
     * @param variableName the name of the target variable.
     * @param recordType the record's datatype.
     */
    private void emitNewRecord(String lhsPrefix, String variableName, 
                               Typespec recordType)
    {
        String typePath = recordType.getRecordTypePath();
        int index = typePath.indexOf('$');
        
        // Don't include the program name in the record type path.
        // Replace each $ with a period.
        typePath = typePath.substring(index + 1).replace('$', '.');
        code.emit("new " + typePath + "();");
        
        emitNewRecordFields(lhsPrefix + variableName + ".", recordType);
    }

    /**
     * Emit code to allocate a record's fields.
     * @param lhsPrefix the prefix for the target variable name.
     * @param recordType the record's datatype.
     */
    private void emitNewRecordFields(String lhsPrefix, Typespec recordType)
    {
        for (SymtabEntry fieldId : recordType.getRecordSymtab().sortedEntries())
        {
            if (fieldId.getKind() == RECORD_FIELD)
            {
                Typespec type = fieldId.getType();
                
                if (type.isStructured())
                {
                    emitAllocateStructuredData(lhsPrefix, fieldId);
                }
            }
        }
    }

    @Override 
    public Object visitStatementList(PascalParser.StatementListContext ctx) 
    {
        for (PascalParser.StatementContext stmtCtx : ctx.statement())
        {
            if (stmtCtx.emptyStatement() == null)
            {
                code.emitStart();
                visit(stmtCtx);
            }
        }
        
        return null;
    }

    @Override 
    public Object visitCompoundStatement(
                                    PascalParser.CompoundStatementContext ctx) 
    {
        code.emit("{");
        code.indent();
        visitChildren(ctx);
        code.dedent();
        code.emitLine("}");
        
        return null;
    }

    @Override 
    public Object visitAssignmentStatement(
                                    PascalParser.AssignmentStatementContext ctx) 
    {
        String lhs  = (String) visit(ctx.lhs().variable());
        String expr = (String) visit(ctx.rhs().expression());
        code.emit(lhs + " = " + expr);
        code.emitEnd(";");
        
        return null;
    }

    @Override 
    public Object visitIfStatement(PascalParser.IfStatementContext ctx) 
    {
        PascalParser.TrueStatementContext  trueCtx  = ctx.trueStatement();
        PascalParser.FalseStatementContext falseCtx = ctx.falseStatement();

        code.emit("if (");
        code.emit((String) visit(ctx.expression()));        
        code.emit(") ");
        
        boolean trueIf = trueCtx.statement().ifStatement() != null;
        boolean trueCompound = trueCtx.statement().compoundStatement() != null;
        
        if (!trueIf)
        {
            if (!trueCompound) code.indent();
            code.emitStart();
        }

        visit(trueCtx);
        if (!(trueIf || trueCompound)) code.dedent();
        
        if (falseCtx != null)
        {
            code.emitStart("else ");
            
            boolean falseIf = falseCtx.statement().ifStatement() != null;
            boolean falseCompound = 
                            falseCtx.statement().compoundStatement() != null;
            
            if (!falseIf)
            {
                if (!falseCompound) code.indent();
                code.emitStart();
            }

            visit(falseCtx);
            if (!(falseIf || falseCompound)) code.dedent();
        }
        
        return null;
    }

    @Override 
    public Object visitCaseStatement(PascalParser.CaseStatementContext ctx) 
    {
        code.emit("switch (" + visit(ctx.expression()) + ")");
        code.emitLine("{");
        
        if (ctx.caseBranchList() != null)
        {
            code.indent();
            visit(ctx.caseBranchList());
            code.dedent();
        }
        
        code.emitLine("}");
        return null;
    }

    @Override 
    public Object visitCaseBranch(PascalParser.CaseBranchContext ctx) 
    {
        PascalParser.CaseConstantListContext listCtx = ctx.caseConstantList();
        
        if (listCtx != null)
        {
            // Loop over this branch's constants.
            for (PascalParser.CaseConstantContext constCtx : 
                                                        listCtx.caseConstant())
            {
                code.emitLine("case " + constCtx.getText().toLowerCase() + ":");
            }
            
            code.indent();
            code.emitStart();
            visit(ctx.statement());
            code.emitLine("break;");
            code.dedent();
        }
        
        return null;
    }
    
    @Override 
    public Object visitRepeatStatement(PascalParser.RepeatStatementContext ctx) 
    {
        boolean needBraces = ctx.statementList().statement().size() > 1;
        
        code.emit("do");
        if (needBraces) code.emitLine("{");
        code.indent();
        
        visit(ctx.statementList());
        
        code.dedent();
        if (needBraces) code.emitLine("}");
        
        code.emitStart("while (!(");
        code.emit((String) visit(ctx.expression()));
        code.emitEnd("));");
        
        return null;
    }

    @Override 
    public Object visitWhileStatement(PascalParser.WhileStatementContext ctx) 
    {
        boolean compound = ctx.statement().compoundStatement() != null;
        
        code.emit("while (");
        code.emit((String) visit(ctx.expression()));
        code.emit(") ");
        
        if (compound) code.emitStart();
        visit(ctx.statement());
        
        return null;
    }

    @Override 
    public Object visitForStatement(PascalParser.ForStatementContext ctx) 
    {
        PascalParser.VariableContext controlCtx = ctx.variable();
        boolean compound = ctx.statement().compoundStatement() != null;
        boolean to = ctx.TO() != null;
        
        String controlName = controlCtx.entry.getName();
        String exprText = (String) visit(ctx.expression().get(0));
        
        // Initialize the control variable.
        code.emit("for (" + controlName + " = " + exprText + "; ");
        
        // Test the control variable.
        code.emit(controlName);
        code.emit(to ? " <= " : " >= ");       
        exprText = (String) visit(ctx.expression().get(1));
        code.emit(exprText + "; ");
        
        // Increment or decrement the control variable.
        code.emit(controlName);
        code.emit(to ? "++) " : "--) ");
        
        // Statement.
        if (compound) code.emitStart();
        visit(ctx.statement());
        
        return null;
    }

    @Override 
    public Object visitProcedureCallStatement(
                                PascalParser.ProcedureCallStatementContext ctx) 
    {
        PascalParser.ProcedureNameContext procNameCtx = ctx.procedureName();
        String procedureName = procNameCtx.entry.getName();
        
        code.emit(procedureName);
        code.emit("(");
        
        if (ctx.argumentList() != null)
        {
            code.emit((String) visit(ctx.argumentList()));
        }
        
        code.emitEnd(");");       
        return null;
    }

    @Override 
    public Object visitArgumentList(PascalParser.ArgumentListContext ctx) 
    {
        String text = "";
        String separator = "";
        
        for (PascalParser.ArgumentContext argCtx : ctx.argument())
        {
            text += separator;
            text += (String) visit(argCtx.expression());
            separator = ", ";
        }

        return text;
    }

    @Override 
    public Object visitExpression(PascalParser.ExpressionContext ctx) 
    {
        PascalParser.SimpleExpressionContext simpleCtx1 = 
                                                ctx.simpleExpression().get(0);
        PascalParser.RelOpContext relOpCtx = ctx.relOp();
        String simpleText1 = (String) visit(simpleCtx1);
        String text = simpleText1;
        
        // Second simple expression?
        if (relOpCtx != null)
        {
            String op = relOpCtx.getText();
            
            if      (op.equals("="))  op = "==";
            else if (op.equals("<>")) op = "!=";
            
            PascalParser.SimpleExpressionContext simpleCtx2 = 
                                                ctx.simpleExpression().get(1);
            String simpleText2 = (String) visit(simpleCtx2);
            
            // Java uses the compareTo method for strings.
            if (simpleCtx1.type == Predefined.stringType)
            {
                text =   "(" + simpleText1 + ")." 
                       + "compareTo(" + simpleText2 + ") "
                       + op + " 0";
            }
            else
            {
                text = simpleText1 + " " + op + " " + simpleText2;
            }
        }
        
        return text;
    }

    @Override 
    public Object visitSimpleExpression(PascalParser.SimpleExpressionContext ctx) 
    {
        int count = ctx.term().size();
        String text = "";
        
        if ((ctx.sign() != null) && (ctx.sign().getText().equals("-")))
        {
            text += "-";
        }
        
        // Loop over the simple expressions.
        for (int i = 0; i < count; i++)
        {
            PascalParser.TermContext termCtx = ctx.term().get(i);
            text += (String) visit(termCtx);
            
            if (i < count-1)
            {
                String addOp = ctx.addOp().get(i).getText().toLowerCase();
                if (addOp.equals("or")) addOp = "||";
                
                text += " " + addOp + " ";
            }
        }
        
        return text;
    }

    @Override 
    public Object visitTerm(PascalParser.TermContext ctx) 
    {
        int count = ctx.factor().size();
        String text = "";
        
        // Loop over the terms.
        for (int i = 0; i < count; i++)
        {
            PascalParser.FactorContext factorCtx = ctx.factor().get(i);
            text += (String) visit(factorCtx);
            
            if (i < count-1)
            {
                String mulOp = ctx.mulOp().get(i).getText().toLowerCase();
                if      (mulOp.equals("and")) mulOp = " && ";
                else if (mulOp.equals("div")) mulOp = "/";
                else if (mulOp.equals("mod")) mulOp = "%";
                
                text += mulOp;
            }
        }
        
        return text;
    }

    @Override 
    public Object visitVariableFactor(PascalParser.VariableFactorContext ctx) 
    {
        return (String) visit(ctx.variable());
    }

    @Override 
    public Object visitVariable(PascalParser.VariableContext ctx) 
    {
        PascalParser.VariableIdentifierContext idCtx = ctx.variableIdentifier();
        SymtabEntry variableId = idCtx.entry;
        String variableName = variableId.getName();
        Typespec type = ctx.variableIdentifier().type;
               
        if (    (type != Predefined.booleanType)
             && (variableId.getKind() == ENUMERATION_CONSTANT))
        {
            variableName = type.getIdentifier().getName() + "." + variableName;
        }
        
        // Loop over any subscript and field modifiers.
        for (PascalParser.ModifierContext modCtx : ctx.modifier())
        {
            // Subscripts.
            if (modCtx.indexList() != null)
            {
                for (PascalParser.IndexContext indexCtx : 
                                                    modCtx.indexList().index())
                {
                    Typespec indexType = type.getArrayIndexType();
                    int minIndex = 0;
                    
                    if (indexType.getForm() == SUBRANGE)
                    {
                        minIndex = indexType.getSubrangeMinValue();
                    }
                    
                    PascalParser.ExpressionContext exprCtx = 
                                                        indexCtx.expression();
                    String expr = (String) visit(exprCtx);
                    String subscript = 
                          (minIndex == 0) ? expr 
                        : (minIndex < 0)  ? "(" + expr + ")+" + (-minIndex)
                        :                   "(" + expr + ")-" + minIndex ;
                    
                    variableName += "[" + subscript + "]";
                    
                    type = type.getArrayElementType();
                }
            }
            
            // Record field.
            else  
            {
                PascalParser.FieldContext fieldCtx = modCtx.field();
                String fieldName = fieldCtx.entry.getName();
                variableName += "." + fieldName;
                type = fieldCtx.type;
            }
        }
        
        return variableName;
    }

    @Override 
    public Object visitNumberFactor(PascalParser.NumberFactorContext ctx) 
    {
        return ctx.getText();
    }

    @Override 
    public Object visitCharacterFactor(PascalParser.CharacterFactorContext ctx) 
    {
        return ctx.getText();
    }

    @Override 
    public Object visitStringFactor(PascalParser.StringFactorContext ctx) 
    {
        String pascalString = ctx.stringConstant().STRING().getText();
        return '"' + convertString(pascalString) + '"';
    }
    
    /**
     * Convert a Pascal string to a Java string.
     * @param pascalString the Pascal string.
     * @return the Java string.
     */
    private String convertString(String pascalString)
    {
        String unquoted = pascalString.substring(1, pascalString.length()-1);
        return unquoted.replace("''", "'").replace("\"", "\\\"");
    }

    @Override 
    public Object visitFunctionCallFactor(
                                    PascalParser.FunctionCallFactorContext ctx) 
    {
        PascalParser.FunctionCallContext callCtx = ctx.functionCall();
        PascalParser.FunctionNameContext funcNameCtx = callCtx.functionName();
        String functionName = funcNameCtx.entry.getName();
        
        String text = functionName + "(";

        if (callCtx.argumentList() != null)
        {
            text += (String) visit(callCtx.argumentList());
        }
        
        return text += ")";
    }

    @Override 
    public Object visitNotFactor(PascalParser.NotFactorContext ctx) 
    {
        return "!" + visit(ctx.factor());
    }

    @Override 
    public Object visitParenthesizedFactor(
                                    PascalParser.ParenthesizedFactorContext ctx) 
    {
        return "(" + visit(ctx.expression()) + ")";
    }

    @Override 
    public Object visitWriteStatement(PascalParser.WriteStatementContext ctx) 
    {
        code.emit("System.out.printf(");
        code.mark();

        String format    = createWriteFormat(ctx.writeArguments());
        String arguments = createWriteArguments(ctx.writeArguments());
        
        code.emit('"' + format + '"');
        
        if (arguments.length() > 0)
        {
            code.emit(", ");
            code.split(60);
            code.emit(arguments);
        }
        
        code.emitEnd(");");
        return null;
    }

    @Override 
    public Object visitWritelnStatement(PascalParser.WritelnStatementContext ctx) 
    {
        if (ctx.writeArguments() != null) 
        {
            code.emit("System.out.printf(");
            code.mark();

            String format    = createWriteFormat(ctx.writeArguments());
            String arguments = createWriteArguments(ctx.writeArguments());
            
            code.emit('"' + format + "\\n\"");  // append line feed
            
            if (arguments.length() > 0)
            {
                code.emit(", ");
                code.split(60);
                code.emit(arguments);
            }
            
            code.emitEnd(");");
        }
        else 
        {
            code.emitEnd("System.out.println();");
        }
        
        return null;
    }
    
    /**
     * Create the printf format string.
     * @param ctx the WriteArgumentsContext.
     * @return the format string.
     */
    private String createWriteFormat(PascalParser.WriteArgumentsContext ctx)
    {
        StringBuffer format = new StringBuffer();
        
        // Loop over the write arguments.
        for (PascalParser.WriteArgumentContext argCtx : ctx.writeArgument())
        {
            Typespec type = argCtx.expression().type;
            String argText = argCtx.getText();
            
            // Append any literal strings.
            if (argText.charAt(0) == '\'') 
            {
                format.append(convertString(argText));
            }
            
            // For any other expressions, append a field specifier.
            else
            {
                format.append("%");
                
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
                
                String typeFlag = type == Predefined.integerType ? "d" 
                                : type == Predefined.realType    ? "f" 
                                : type == Predefined.booleanType ? "b" 
                                : type == Predefined.charType    ? "c" 
                                :                                  "s";
                format.append(typeFlag);
            }
        }
        
        return format.toString();
    }
    
    /**
     * Create the string of write arguments.
     * @param ctx the WriteArgumentsContext.
     * @return the string of arguments.
     */
    private String createWriteArguments(PascalParser.WriteArgumentsContext ctx)
    {
        StringBuffer arguments = new StringBuffer();
        String separator = "";
        
        // Loop over the write arguments.
        for (PascalParser.WriteArgumentContext argCtx : ctx.writeArgument())
        {
            String argText = argCtx.getText();
            
            // Not a literal string.
            if (argText.charAt(0) != '\'') 
            {
                arguments.append(separator).append(visit(argCtx.expression()));
                separator = ", ";
            }
        }
        
        return arguments.toString();
    }

    @Override 
    public Object visitReadStatement(PascalParser.ReadStatementContext ctx) 
    {
        if (ctx.readArguments().variable().size() == 1) 
        {
            visit(ctx.readArguments());
        }
        else
        {
            code.emit("{");
            code.indent();
            code.emitStart();
            
            visit(ctx.readArguments());
            
            code.dedent();
            code.emitLine("}");
        }
        
        return null;
    }

    @Override 
    public Object visitReadlnStatement(PascalParser.ReadlnStatementContext ctx) 
    {
        code.emit("{");
        code.indent();
        code.emitStart();
        
        visit(ctx.readArguments());
        code.emitLine("_sysin.nextLine();");
        
        code.dedent();
        code.emitLine("}");
        
        return null;
    }

    @Override 
    public Object visitReadArguments(PascalParser.ReadArgumentsContext ctx) 
    {
        int size = ctx.variable().size();
        
        // Loop over the read arguments.
        for (int i = 0; i < size; i++)
        {
            PascalParser.VariableContext varCtx = ctx.variable().get(i);
            String varName = varCtx.getText();
            Typespec type = varCtx.type;
            
            // Read a character.
            if (type == Predefined.charType)
            {
                code.emit("{");
                code.indent();
                
                code.emitStart("_sysin.useDelimiter(\"\");");
                code.emitStart(varName + " = _sysin.next().charAt(0);");
                code.emitStart("_sysin.reset();");
                
                code.dedent();
                code.emitLine("}");
            }
            
            // Read any other value.
            else
            {
                String typeName = type == Predefined.integerType ? "Int" 
                                : type == Predefined.realType    ? "Double" 
                                : type == Predefined.booleanType ? "Boolean" 
                                :                                  "";
                
                code.emit(varName + " = _sysin.next" + typeName + "();");
            }
            
            if (i < size-1) code.emitStart();
        }
        
        return null;
    }
}
