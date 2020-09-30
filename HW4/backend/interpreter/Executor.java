package backend.interpreter;

import antlr4.*;
import antlr4.Pcl4Parser.AddOpContext;
import antlr4.Pcl4Parser.CaseListContext;
import antlr4.Pcl4Parser.ConstantContext;
import antlr4.Pcl4Parser.ConstantListContext;
import antlr4.Pcl4Parser.SignContext;
import antlr4.Pcl4Parser.TermContext;
import antlr4.Pcl4Parser.WriteArgumentContext;
import intermediate.symtab.Symtab;
import intermediate.symtab.SymtabEntry;

public class Executor extends Pcl4BaseVisitor<Object>
{
    private Symtab symtab = new Symtab();

    public Object visitAssignmentStatement(Pcl4Parser.AssignmentStatementContext ctx)
    {
        //System.out.println("Visiting assignment statement");
        String variableName = ctx.lhs().variable().getText();
        visit(ctx.lhs());
        Object value = visit(ctx.rhs());
        
        //System.out.println("Will assign value " + (Double) value + " to variable " + variableName);

        symtab.enter(variableName).setValue((Double) value);;         
        
        
        return value;
    }

    public Object visitRepeatStatement(Pcl4Parser.RepeatStatementContext ctx)
    {
        //System.out.println("Visiting REPEAT statement");
        
        visit(ctx.statementList());

        while(!((Boolean)(visit(ctx.expression())))){

            visit(ctx.statementList());

        }
        return null;
    }

    public Object visitWhileStatement(Pcl4Parser.WhileStatementContext ctx)
    {
        //System.out.println("Visiting WHILE statement");

        while(((Boolean)(visit(ctx.expression())))){

            visit(ctx.statement());

        }
        return null;
    }

    public Object visitIfStatement(Pcl4Parser.IfStatementContext ctx)
    {
        //System.out.println("Visiting IF statement");

        if(((Boolean)(visit(ctx.expression())))){

            visit(ctx.statement(0));

        }
        else if(ctx.statement().size() > 1){

            visit(ctx.statement(1));

        }
        return null;
    }

    public Object visitForStatement(Pcl4Parser.ForStatementContext ctx)
    {
        //System.out.println("Visiting FOR statement");

        String variableName = ctx.IDENTIFIER().getText();
        SymtabEntry variable =  symtab.enter(variableName);
        variable.setValue((Double) (visit(ctx.expression(0))));
        int increment;
        if(ctx.TO() != null){
            increment = 1;
           
        }

        else{ //DOWNTO part
            increment = -1;
        }

        while(true){
                visit(ctx.statement());
                if(variable.getValue() == (double)visit(ctx.expression(1))) break;
                variable.setValue(variable.getValue()+increment);
                //System.out.println("HERE!!!!!   " + variable.getValue());
        }
        return null;
    }

    public Object visitCaseStatement(Pcl4Parser.CaseStatementContext ctx) {
        //System.out.println("Entering case statement");
        Object value = visit(ctx.expression());
        //System.out.println("Value: " + value);
        if (ctx.caseList() != null) {

            CaseListContext current = ctx.caseList();
            CaseListContext selected = null;
            outerloop:

            while (current != null) {
                ConstantListContext constants = current.constantList();

                for (ConstantContext c : constants.constant()) {
                    if (value.equals(visit(c))) {
                        selected = current;
                        break outerloop;
                    }
                }
                current = current.caseList();
            }
            if (selected != null) {
                visit(selected.statement());
            }
        }
        return null;
    }

    public Object visitExpression(Pcl4Parser.ExpressionContext ctx)
    {

        
        //System.out.println("Visiting expression");

        if(ctx.simpleExpression().size() > 1){
                switch(ctx.relOp().getText()){

                    case "=": return visit(ctx.simpleExpression(0)).equals(visit(ctx.simpleExpression(1)));
                    case "<>": return !visit(ctx.simpleExpression(0)).equals(visit(ctx.simpleExpression(1)));

                    case "<": return (double)visit(ctx.simpleExpression(0)) < (double)visit(ctx.simpleExpression(1));
                    case "<=": return (double)visit(ctx.simpleExpression(0)) <= (double)visit(ctx.simpleExpression(1));
                    case ">": return (double)visit(ctx.simpleExpression(0)) > (double)visit(ctx.simpleExpression(1));
                    case ">=": return (double)visit(ctx.simpleExpression(0)) >= (double)visit(ctx.simpleExpression(1));
                }
        }

        else{
            return visit(ctx.simpleExpression(0));

        }
        return null;
      
    }

    public Object visitSimpleExpression(Pcl4Parser.SimpleExpressionContext ctx) {
        if (ctx.term().size() > 1) {
            Object first = visit(ctx.term(0));
            if (first instanceof String) {
                String result = (String)first;
                for (int i = 1; i < ctx.term().size(); i++) {
                    result += (String)visit(ctx.term(i));
                }
                return result;
            }
            else if (first instanceof Double) {
                double result = (double)first;
                if (ctx.sign() != null) result *= (double)visit(ctx.sign());

                
                for (int i = 1; i < ctx.term().size(); i++) {
                    double current = (double)visit(ctx.term(i));
                    if (ctx.addOp(i - 1).getText().equals("+")) result += current;
                    else result -= current;
                }
                return result;
            } else {
                boolean result = (boolean)first;
                for (int i = 1; i < ctx.term().size(); i++) {
                    boolean current = (boolean)visit(ctx.term(i));
                    result = result || current;
                }
                return result;
            }
        } else {
            Object result = visit(ctx.term(0));
            if (result instanceof Double) {
                if (ctx.sign() != null) return (double)result * (double)visit(ctx.sign());
            }
            return result;
        }
    }

    public Object visitTerm(Pcl4Parser.TermContext ctx)
    {
        if (ctx.factor().size() > 1) {
            Object first = visit(ctx.factor(0));
            if (first instanceof String) return first;
            else if (first instanceof Double) {
                double result = (double)first;
                for (int i = 1; i < ctx.factor().size(); i++) {
                    double current = (double)visit(ctx.factor(i));
                    if (ctx.mulOp(i - 1).DIV() != null) result = truncate(result / current);
                    else if (ctx.mulOp(i - 1).MOD() != null) result = result % current;
                    else if (ctx.mulOp(i - 1).getText().equals("*")) result = result * current;
                    else result = result / current;
                }
                return result;
            } else {
                boolean result = (boolean)first;
                for (int i = 1; i < ctx.factor().size(); i++) {
                    boolean current = (boolean)visit(ctx.factor(i));
                    result = result && current;
                }
                return result;
            }
        } else {
            return visit(ctx.factor(0));
        }
    }

    public Object visitParenthesizedExpression(Pcl4Parser.ParenthesizedExpressionContext ctx)
    {
        return visit(ctx.expression());
    }

    public Object visitVariable(Pcl4Parser.VariableContext ctx)
    {
        //System.out.print("Visiting variable ");
        String variableName = ctx.getText();
        //System.out.println(variableName);
        if(symtab.lookup(variableName) != null) return symtab.lookup(variableName).getValue();
        return null;
    }

    public Object visitIntegerConstant(Pcl4Parser.IntegerConstantContext ctx)
    {
        return Double.parseDouble(ctx.INTEGER().getText());
    }

    public Object visitRealConstant(Pcl4Parser.RealConstantContext ctx)
    {
        return Double.parseDouble(ctx.REAL().getText());
    }

    //END OF INTRUCTIONS

    public Object visitProgram(Pcl4Parser.ProgramContext ctx)
    {
        //System.out.println("Visiting program");
        return visit(ctx.block());
    }
    
    public Object visitStatement(Pcl4Parser.StatementContext ctx)
    {
        //System.out.print("Line " + ctx.getStart().getLine() + ": ");
        return visitChildren(ctx);
    }
    
    public Object visitStatementList(Pcl4Parser.StatementListContext ctx)
    {
        //System.out.println("Visiting statement list");

        for (Pcl4Parser.StatementContext stmtCtx : ctx.statement())
        {
            visit(stmtCtx);
        }
        
        return null;
    }
    
    public Object visitCompoundStatement(Pcl4Parser.CompoundStatementContext ctx)
    {
        //System.out.println("Visiting compound statement");
        return visit(ctx.statementList());
    }
    
    public Object visitWriteStatement(Pcl4Parser.WriteStatementContext ctx)
    {
        //System.out.println("Visiting WRITE statement");
        for (WriteArgumentContext c: ctx.writeArgumentsOn().writeArgumentListOn().writeArgumentList().writeArgument()) {
            System.out.print(visit(c));
        }
        return null;
    }
    
    public Object visitWritelnStatement(Pcl4Parser.WritelnStatementContext ctx)
    {
        //System.out.println("Visiting WRITELN statement");
        if (ctx.writeArgumentsLn() != null) {
            for (WriteArgumentContext c: ctx.writeArgumentsLn().writeArgumentListLn().writeArgumentList().writeArgument()) {
                System.out.print(visit(c));
            }
        }
        System.out.println();
        return null;
    }

    public Object visitWriteArgument(Pcl4Parser.WriteArgumentContext ctx)
    {
        return visit(ctx.expression());
    }
    
    public Object visitNumber(Pcl4Parser.NumberContext ctx)
    {
        //System.out.print("Visiting number: got value ");
        String text = ctx.unsignedNumber().integerConstant().INTEGER().getText();
        Double value = Double.valueOf(text);
        //System.out.println(value);
        if (ctx.sign() != null) value *= (double)visit(ctx.sign());
        return value;
    }

    public Object visitNotFactor(Pcl4Parser.NotFactorContext ctx){
        return !(boolean)visit(ctx.factor());
    }
    public Object visitStringFactor(Pcl4Parser.StringFactorContext ctx){
        String value = ctx.stringConstant().STRING().getText();
        return value.substring(1, value.length() - 1);
    }
    public Object visitCharacterFactor(Pcl4Parser.CharacterFactorContext ctx){

        return ctx.characterConstant().CHARACTER().getText();
    }

    public Object visitSign(Pcl4Parser.SignContext ctx){
        return ctx.getText() == "+" ? 1.0 : -1.0;
    }
    
    public double truncate (double input) {
        if (input > 0) return Math.floor(input);
        else return Math.ceil(input);
    }
}
