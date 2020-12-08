package backend.compiler;

import antlr4.SegueParser;

import intermediate.symtab.*;
import intermediate.type.*;
import intermediate.type.Typespec.Form;

import static intermediate.type.Typespec.Form.*;
import static backend.compiler.Instruction.*;

/**
 * <h1>ExpressionGenerator</h1>
 *
 * <p>Generate code for an expression.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class ExpressionGenerator extends CodeGenerator
{
    /**
     * Constructor.
     * @param the parent executor.
     */
    public ExpressionGenerator(CodeGenerator parent, Compiler compiler)
    {
        super(parent, compiler);
    }

    /**
     * Emit code for a numerical expression.
     * @param ctx the NumericalExpressionContext.
     */
    public void emitNumericalExpression(SegueParser.NumericalExpressionContext ctx){
        SegueParser.TermContext termCtx = ctx.term(0);

        emitTerm(termCtx);

        if(ctx.term().size() > 1){

            for(int i = 1; i < ctx.term().size(); i++){

                String op = ctx.addOp(i-1).getText();

                emitTerm(ctx.term(i));

                if (op.equals("+")) emit(DADD);
                else                emit(DSUB);

            }
        }
    }

    public void emitTerm(SegueParser.TermContext ctx){

        SegueParser.FactorContext factorCtx = ctx.factor(0);

        emitFactor(factorCtx);

        if(ctx.factor().size() > 1){

            for(int i = 1; i < ctx.factor().size(); i++){

                String op = ctx.mulOp(i-1).getText();

                emitFactor(ctx.factor(i));

                if (op.equals("*")) emit(DMUL);
                else                emit(DDIV);

            }
        }
    }

    public void emitFactor(SegueParser.FactorContext ctx){

        if(ctx.numericalExpression() != null){
            
            emitNumericalExpression(ctx.numericalExpression());
        }
        else if(ctx.numberConstant() != null){
            
            emitLoadDoubleConstant(ctx.numberConstant());
        }
        else if(ctx.numIdentifier() != null){

            emitDoubleVariable(ctx.numIdentifier());
        }
        else if(ctx.prefixOp() != null){

            if(ctx.prefixOp().signOp().getText().equals("++")){

                SymtabEntry varId =  ctx.prefixOp().numIdentifier().entry;

                emitDoubleVariable(ctx.prefixOp().numIdentifier());
                emitLoadConstant(1);
                emit(DADD);
                emitStoreValue(varId, Predefined.doubleType);
                
            }
            else{

                SymtabEntry varId =  ctx.prefixOp().numIdentifier().entry;

                emitDoubleVariable(ctx.prefixOp().numIdentifier());
                emitLoadConstant(-1);
                emit(DADD);
                emitStoreValue(varId, Predefined.doubleType);

            }
            emitDoubleVariable(ctx.prefixOp().numIdentifier());
        }
        else if(ctx.suffixOp() != null){

            emitDoubleVariable(ctx.suffixOp().numIdentifier());

            if(ctx.prefixOp().signOp().getText().equals("++")){

                SymtabEntry varId =  ctx.prefixOp().numIdentifier().entry;

                emitDoubleVariable(ctx.prefixOp().numIdentifier());
                emitLoadConstant(1);
                emit(DADD);
                emitStoreValue(varId, Predefined.doubleType);
                
            }
            else{

                SymtabEntry varId =  ctx.prefixOp().numIdentifier().entry;

                emitDoubleVariable(ctx.prefixOp().numIdentifier());
                emitLoadConstant(-1);
                emit(DADD);
                emitStoreValue(varId, Predefined.doubleType);

            }

        } else if (ctx.rand() != null) {
            emit(INVOKESTATIC, "java/lang/Math.random()D");
        }
    }

    public void emitBooleanExpression(SegueParser.BooleanExpressionContext ctx){
        if(ctx.booleanTerm().size() > 0){
            if(ctx.booleanTerm().size() > 1){
                
                emitBooleanTerm(ctx.booleanTerm(0));
                emitBooleanTerm(ctx.booleanTerm(1));

                Label trueLabel = new Label();
                Label falseLabel = new Label();
                Label exitLabel = new Label();

                switch(ctx.boolOp().getText()){
                    case "&":
                        emit(IAND);
                        emit(GOTO, exitLabel);
                        break;
                    case "|":
                        emit(IOR);
                        emit(GOTO, exitLabel);
                        break;
                    case "==":
                        emit(IF_ICMPEQ,trueLabel);
                        emit(GOTO, falseLabel);
                        break;
                    case "!=":
                        emit(IF_ICMPNE,trueLabel);
                        emit(GOTO, falseLabel);
                        break;
                    default: break;

                }

                emitLabel(trueLabel);
                emit(ICONST_1);
                emit(GOTO, exitLabel);

                emitLabel(falseLabel);
                emit(ICONST_0);
                emit(GOTO, exitLabel);

                emitLabel(exitLabel);
            } else {
                emitBooleanTerm(ctx.booleanTerm(0));
            }
        } else {
            Label trueLabel = new Label();
            Label falseLabel = new Label();
            Label exitLabel = new Label();

            emitNumericalExpression(ctx.numericalExpression(0));
            emitNumericalExpression(ctx.numericalExpression(1));
            emit(DCMPG);

            String op = ctx.relOp().getText();
            if      (op.equals("==" )) emit(IFEQ, trueLabel);
            else if (op.equals("!=")) emit(IFNE, trueLabel);
            else if (op.equals("<" )) emit(IFLT, trueLabel);
            else if (op.equals("<=")) emit(IFLE, trueLabel);
            else if (op.equals(">" )) emit(IFGT, trueLabel);
            else if (op.equals(">=")) emit(IFGE, trueLabel);

            emit(GOTO,falseLabel);
            emitLabel(trueLabel);
            emit(ICONST_1);
            emit(GOTO, exitLabel);

            emitLabel(falseLabel);
            emit(ICONST_0);
            emit(GOTO, exitLabel);

            emitLabel(exitLabel);
        }
    }

    public void emitBooleanTerm(SegueParser.BooleanTermContext ctx){
        if(ctx.booleanExpression() != null){

            emitBooleanExpression(ctx.booleanExpression());
        }
        else{

            emitBooleanSingleton(ctx.booleanSingleton());
        }
    }

    public void emitBooleanSingleton(SegueParser.BooleanSingletonContext ctx){
        if(ctx.notStatement() != null){

            emitNotStatement(ctx.notStatement());
        }
        else if(ctx.boolIdentifier() != null){

            emitLoadValue(ctx.boolIdentifier().entry);
        }
        else{
            emitLoadBooleanConstant(ctx.booleanConstant());
        }
    }
    
    /**
     * Emit code for an expression.
     * @param ctx the ExpressionContext.
     */
    // public void emitExpression(SegueParser.ExpressionContext ctx)
    // {
    //     SegueParser.SimpleExpressionContext simpleCtx1 = 
    //                                             ctx.simpleExpression().get(0);
    //     SegueParser.RelOpContext relOpCtx = ctx.relOp();
    //     Typespec type1 = simpleCtx1.type;
    //     emitSimpleExpression(simpleCtx1);
        
    //     // More than one simple expression?
    //     if (relOpCtx != null)
    //     {
    //         String op = relOpCtx.getText();
    //         SegueParser.SimpleExpressionContext simpleCtx2 = 
    //                                             ctx.simpleExpression().get(1);
    //         Typespec type2 = simpleCtx2.type;

    //         boolean integerMode   = false;
    //         boolean realMode      = false;
    //         boolean characterMode = false;

    //         if (   (type1 == Predefined.integerType)
    //             && (type2 == Predefined.integerType)) 
    //         {
    //             integerMode = true;
    //         }
    //         else if (   (type1 == Predefined.realType) 
    //                  || (type2 == Predefined.realType))
    //         {
    //             realMode = true;
    //         }
    //         else if (   (type1 == Predefined.charType) 
    //                  && (type2 == Predefined.charType))
    //         {
    //             characterMode = true;
    //         }

    //         Label trueLabel = new Label();
    //         Label exitLabel = new Label();

    //         if (integerMode || characterMode) 
    //         {
    //             emitSimpleExpression(simpleCtx2);
                
    //             if      (op.equals("=" )) emit(IF_ICMPEQ, trueLabel);
    //             else if (op.equals("<>")) emit(IF_ICMPNE, trueLabel);
    //             else if (op.equals("<" )) emit(IF_ICMPLT, trueLabel);
    //             else if (op.equals("<=")) emit(IF_ICMPLE, trueLabel);
    //             else if (op.equals(">" )) emit(IF_ICMPGT, trueLabel);
    //             else if (op.equals(">=")) emit(IF_ICMPGE, trueLabel);
    //         }
    //         else if (realMode)
    //         {
    //             if (type1 == Predefined.integerType) emit(I2F);
    //             emitSimpleExpression(simpleCtx2);
    //             if (type2 == Predefined.integerType) emit(I2F);
                
    //             emit(FCMPG);

    //             if      (op.equals("=" )) emit(IFEQ, trueLabel);
    //             else if (op.equals("<>")) emit(IFNE, trueLabel);
    //             else if (op.equals("<" )) emit(IFLT, trueLabel);
    //             else if (op.equals("<=")) emit(IFLE, trueLabel);
    //             else if (op.equals(">" )) emit(IFGT, trueLabel);
    //             else if (op.equals(">=")) emit(IFGE, trueLabel);
    //         }
    //         else  // stringMode
    //         {
    //             emitSimpleExpression(simpleCtx2);
    //             emit(INVOKEVIRTUAL,
    //                  "java/lang/String.compareTo(Ljava/lang/String;)I");
    //             localStack.decrease(1);
                
    //             if      (op.equals("=" )) emit(IFEQ, trueLabel);
    //             else if (op.equals("<>")) emit(IFNE, trueLabel);
    //             else if (op.equals("<" )) emit(IFLT, trueLabel);
    //             else if (op.equals("<=")) emit(IFLE, trueLabel);
    //             else if (op.equals(">" )) emit(IFGT, trueLabel);
    //             else if (op.equals(">=")) emit(IFGE, trueLabel);
    //         }

    //         emit(ICONST_0); // false
    //         emit(GOTO, exitLabel);
    //         emitLabel(trueLabel);
    //         emit(ICONST_1); // true
    //         emitLabel(exitLabel);
            
    //         localStack.decrease(1);  // only one branch will be taken
    //     }
    // }
    
    /**
     * Emit code for a simple expression.
     * @param ctx the SimpleExpressionContext.
     */
    // public void emitSimpleExpression(SegueParser.SimpleExpressionContext ctx)
    // {
    //     int count = ctx.term().size();
    //     Boolean negate =    (ctx.sign() != null) 
    //                      && ctx.sign().getText().equals("-");
        
    //     // First term.
    //     SegueParser.TermContext termCtx1 = ctx.term().get(0);
    //     Typespec type1 = termCtx1.type;
    //     emitTerm(termCtx1);
        
    //     if (negate) emit(type1 == Predefined.integerType ? INEG : FNEG);
        
    //     // Loop over the subsequent terms.
    //     for (int i = 1; i < count; i++)
    //     {
    //         String op = ctx.addOp().get(i-1).getText().toLowerCase();
    //         SegueParser.TermContext termCtx2 = ctx.term().get(i);
    //         Typespec type2 = termCtx2.type;

    //         boolean integerMode = false;
    //         boolean realMode    = false;
    //         boolean booleanMode = false;

    //         if (   (type1 == Predefined.integerType)
    //             && (type2 == Predefined.integerType)) 
    //         {
    //             integerMode = true;
    //         }
    //         else if (   (type1 == Predefined.realType) 
    //                  || (type2 == Predefined.realType))
    //         {
    //             realMode = true;
    //         }
    //         else if (   (type1 == Predefined.booleanType) 
    //                  && (type2 == Predefined.booleanType))
    //         {
    //             booleanMode = true;
    //         }
                            
    //         if (integerMode)
    //         {
    //             emitTerm(termCtx2);
                
    //             if (op.equals("+")) emit(IADD);
    //             else                emit(ISUB);
    //         }
    //         else if (realMode)
    //         {
    //             if (type1 == Predefined.integerType) emit(I2F);
    //             emitTerm(termCtx2);
    //             if (type2 == Predefined.integerType) emit(I2F);
                
    //             if (op.equals("+")) emit(FADD);
    //             else                emit(FSUB);
    //         }
    //         else if (booleanMode)
    //         {
    //             emitTerm(termCtx2);
    //             emit(IOR);
    //         }
    //         else  // stringMode
    //         {
    //             emit(NEW, "java/lang/StringBuilder");
    //             emit(DUP_X1);             
    //             emit(SWAP);                  
    //             emit(INVOKESTATIC, "java/lang/String/valueOf(Ljava/lang/Object;)" +
    //                                "Ljava/lang/String;");
    //             emit(INVOKESPECIAL, "java/lang/StringBuilder/<init>" +
    //                                 "(Ljava/lang/String;)V");
    //             localStack.decrease(1);
                
    //             emitTerm(termCtx2);
    //             emit(INVOKEVIRTUAL, "java/lang/StringBuilder/append(Ljava/lang/String;)" +
    //                                 "Ljava/lang/StringBuilder;");
    //             localStack.decrease(1);
    //             emit(INVOKEVIRTUAL, "java/lang/StringBuilder/toString()" +
    //                                 "Ljava/lang/String;");
    //             localStack.decrease(1);
    //         }
    //     }
    // }
    
    /**
     * Emit code for a term.
     * @param ctx the TermContext.
     */
    // public void emitTerm(SegueParser.TermContext ctx)
    // {
    //     int count = ctx.factor().size();
        
    //     // First factor.
    //     SegueParser.FactorContext factorCtx1 = ctx.factor().get(0);
    //     Typespec type1 = factorCtx1.type;
    //     compiler.visit(factorCtx1);
        
    //     // Loop over the subsequent factors.
    //     for (int i = 1; i < count; i++)
    //     {
    //         String op = ctx.mulOp().get(i-1).getText().toLowerCase();
    //         SegueParser.FactorContext factorCtx2 = ctx.factor().get(i);
    //         Typespec type2 = factorCtx2.type;

    //         boolean integerMode = false;
    //         boolean realMode    = false;

    //         if (   (type1 == Predefined.integerType)
    //             && (type2 == Predefined.integerType)) 
    //         {
    //             integerMode = true;
    //         }
    //         else if (   (type1 == Predefined.realType) 
    //                  || (type2 == Predefined.realType))
    //         {
    //             realMode = true;
    //         }
                
    //         if (integerMode)
    //         {
    //             compiler.visit(factorCtx2);            

    //             if      (op.equals("*"))   emit(IMUL);
    //             else if (op.equals("/"))   emit(FDIV);
    //             else if (op.equals("div")) emit(IDIV);
    //             else if (op.equals("mod")) emit(IREM);
    //         }
    //         else if (realMode)
    //         {
    //             if (type1 == Predefined.integerType) emit(I2F);
    //             compiler.visit(factorCtx2); 
    //             if (type2 == Predefined.integerType) emit(I2F);
                
    //             if      (op.equals("*")) emit(FMUL);
    //             else if (op.equals("/")) emit(FDIV);
    //         }
    //         else  // booleanMode
    //         {
    //             compiler.visit(factorCtx2);                 
    //             emit(IAND);
    //         }
    //     }
    // }
    
    /**
     * Emit code for NOT.
     * @param ctx the NotFactorContext.
     */
    public void emitNotStatement(SegueParser.NotStatementContext ctx)
    {
        compiler.visit(ctx.booleanExpression());
        emit(ICONST_1);
        emit(IXOR);
    }

    /**
     * Emit code to load a scalar variable's value 
     * or a structured variable's address.
     * @param ctx the VariableContext.
     */
    // public void emitLoadValue(SegueParser.VariableContext varCtx)
    // {
    //     // Load the scalar value or structure address.
    //     Typespec variableType = emitLoadVariable(varCtx);
        
    //     // Load an array element's or record field's value.
    //     int modifierCount = varCtx.modifier().size();
    //     if (modifierCount > 0)
    //     {
    //         SegueParser.ModifierContext lastModCtx =
    //                                 varCtx.modifier().get(modifierCount - 1);
            
    //         if (lastModCtx.indexList() != null)
    //         {
    //             emitLoadArrayElementValue(variableType);
    //         }
    //         else
    //         {
    //             emitLoadRecordFieldValue(lastModCtx.field(), variableType);
    //         }
    //     }
    // }

    /**
     * Emit code to load a scalar variable's value 
     * or a structured variable's address.
     * @param variableNode the variable node.
     * @return the datatype of the variable.
     */
    // public Typespec emitLoadVariable(SegueParser.VariableContext varCtx)
    // {
    //     SymtabEntry variableId = varCtx.entry;
    //     Typespec variableType = variableId.getType();
        
    //     // Scalar value or structure address.
    //     emitLoadValue(variableId);

    //     // Loop over subscript and field modifiers.
    //     for (int i = 0; i < modifierCount; ++i)
    //     {
    //         SegueParser.ModifierContext modCtx = varCtx.modifier().get(i);
    //         boolean lastModifier = i == modifierCount - 1;

    //         // Subscript
    //         if (modCtx.indexList() != null) 
    //         {
    //             variableType = emitLoadArrayElementAccess(
    //                             modCtx.indexList(), variableType, lastModifier);
    //         }
            
    //         // Field
    //         else if (!lastModifier)
    //         {
    //             variableType = emitLoadRecordField(modCtx.field(), variableType);
    //         }
    //     }

    //     return variableType;
    // }

    public void emitDoubleVariable(SegueParser.NumIdentifierContext ctx){

        SymtabEntry variableId = ctx.entry;
    
        emitLoadValue(variableId);
        
    }

    public void emitBooleanVariable(SegueParser.BoolIdentifierContext ctx){

        SymtabEntry variableId = ctx.entry;

        emitLoadValue(variableId);
        
    }



    /**
     * Emit code to access an array element by loading the array address
     * and the subscript value. This can subsequently be followed by code
     * to load the array element's value or to store into the array element. 
     * @param subscriptsNode the SUBSCRIPTS node.
     * @param elmtType the array element type.
     * @param lastModifier true if this is the variable's last modifier.
     * @return the type of the element.
     */
    /*
    private Typespec emitLoadArrayElementAccess(
                                    SegueParser.IndexListContext indexListCtx,
                                    Typespec elmtType, boolean lastModifier)
    {
        int indexCount = indexListCtx.index().size();
        
        // Loop over the subscripts.
        for (int i = 0; i < indexCount; i++)
        {
            SegueParser.IndexContext indexCtx = indexListCtx.index().get(i);
            emitExpression(indexCtx.expression());

            Typespec indexType = elmtType.getArrayIndexType();

            if (indexType.getForm() == SUBRANGE) 
            {
                int min = indexType.getSubrangeMinValue();
                if (min != 0) 
                {
                    emitLoadConstant(min);
                    emit(ISUB);
                }
            }

            if (!lastModifier || (i < indexCount - 1)) emit(AALOAD);
            elmtType = elmtType.getArrayElementType();
        }

        return elmtType;
    }
    */

    /**
     * Emit a load of an array element's value.
     * @param elmtType the element type if character, else null.
     */
    /*
    private void emitLoadArrayElementValue(Typespec elmtType)
    {
        Form form = SCALAR;

        if (elmtType != null) 
        {
            elmtType = elmtType.baseType();
            form = elmtType.getForm();
        }

        // Load a character from a string.
        if (elmtType == Predefined.charType) 
        {
            emit(INVOKEVIRTUAL, "java/lang/StringBuilder.charAt(I)C");
        }

        // Load an array element.
        else 
        {
            emit(  elmtType == Predefined.integerType ? IALOAD
                 : elmtType == Predefined.realType    ? FALOAD
                 : elmtType == Predefined.booleanType ? BALOAD
                 : elmtType == Predefined.charType    ? CALOAD
                 : form == ENUMERATION                ? IALOAD
                 :                                      AALOAD);
        }
    }
    */

    /*
    private void emitLoadRecordFieldValue(
                        SegueParser.FieldContext fieldCtx, Typespec recordType)
    {
        emitLoadRecordField(fieldCtx, recordType);
    }
    */

    /**
     * Emit code to load the address or value of a record field.
     * @param fieldCtx the FieldContext.
     * @param last true if this is the variable's last field, else false.
     * @return the type of the field.
     */
    /*
    private Typespec emitLoadRecordField(
                        SegueParser.FieldContext fieldCtx, Typespec recordType)
    {
        SymtabEntry fieldId = fieldCtx.entry;
        String fieldName = fieldId.getName();
        Typespec fieldType = fieldCtx.type;  
        
        String recordTypePath = recordType.getRecordTypePath();
        String fieldPath = recordTypePath + "/" + fieldName;        
        emit(GETFIELD, fieldPath, typeDescriptor(fieldType));

        return fieldType;
    }
    */
    
    /**
     * Emit code to load an integer constant.
     * @parm intCtx the IntegerConstantContext.
     */
    public void emitLoadBooleanConstant(SegueParser.BooleanConstantContext intCtx)
    {
        boolean value = Boolean.parseBoolean(intCtx.getText());
        emitLoadConstant(value? 1 : 0);
    }
    
    /**
     * Emit code to load real constant.
     * @parm intCtx the IntegerConstantContext.
     */
    public void emitLoadDoubleConstant(SegueParser.NumberConstantContext realCtx)
    {   
        Double value = Double.parseDouble(realCtx.getText());
        emitLoadConstant(value);
    }
}
