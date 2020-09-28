package backend.interpreter;

import antlr4.*;
import antlr4.Pcl4Parser.SignContext;
import antlr4.Pcl4Parser.TermContext;
import intermediate.symtab.Symtab;

public class Executor extends Pcl4BaseVisitor<Object>
{
    private Symtab symtab = new Symtab();

    public Object visitAssignmentStatement(Pcl4Parser.AssignmentStatementContext ctx)
    {
        System.out.println("Visiting assignment statement");
        String variableName = ctx.lhs().variable().getText();
        visit(ctx.lhs());
        Object value = visit(ctx.rhs());
        
        System.out.println("Will assign value " + (Integer) value +
                           " to variable " + variableName);

        symtab.enter(variableName).setValue((Double) value);;         
        
        
        return value;
    }

    public Object visitRepeatStatement(Pcl4Parser.RepeatStatementContext ctx)
    {
        System.out.println("Visiting REPEAT statement");
        
        visit(ctx.statementList());

        while(!((Boolean)(visit(ctx.expression())))){

            visit(ctx.statementList());

        }
        return null;
    }

    public Object visitWhileStatement(Pcl4Parser.WhileStatementContext ctx)
    {
        System.out.println("Visiting WHILE statement");

        while(((Boolean)(visit(ctx.expression())))){

            visit(ctx.statement());

        }
        return null;
    }

    public Object visitIfStatement(Pcl4Parser.IfStatementContext ctx)
    {
        System.out.println("Visiting IF statement");

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
        System.out.println("Visiting FOR statement");

        String variableName = ctx.IDENTIFIER().getText();

        symtab.enter(variableName).setValue((Double) (visit(ctx.expression(0))));

        if(ctx.TO() != null){
            //come back to this
        }
        return null;
    }

    public Object visitCaseStatement(Pcl4Parser.CaseStatementContext ctx)
    {
        System.out.println("Visiting CASE statement");
        return null;
    }

    public Object visitExpression(Pcl4Parser.ExpressionContext ctx)
    {
        System.out.println("Visiting expression");
        return visitChildren(ctx);
    }

    public Object visitSimpleExpression(Pcl4Parser.SimpleExpressionContext ctx)
    {
        System.out.println("Visiting simple expression");

        SignContext signContext = ctx.sign();
        
        if(!signContext.isEmpty()){
            String sign = signContext.getText();
            if(sign.equals("-")){
                TermContext termContext = ctx.term(1);
                //Come back to this
            }
        }

        return null;
    }

    public Object visitTerm(Pcl4Parser.ExpressionContext ctx)
    {
        return null;
    }

    public Object visitParenthesizedExpression(Pcl4Parser.ExpressionContext ctx)
    {
        return null;
    }

    public Object visitVariable(Pcl4Parser.VariableContext ctx)
    {
        System.out.print("Visiting variable ");
        String variableName = ctx.getText();
        System.out.println(variableName);
        
        return null;  // should return the variable's value!
    }

    public Object visitIntegerConstant(Pcl4Parser.ExpressionContext ctx)
    {
        return null;
    }

    public Object visitRealConstant(Pcl4Parser.ExpressionContext ctx)
    {
        return null;
    }

    //END OF INTRUCTIONS

    public Object visitProgram(Pcl4Parser.ProgramContext ctx)
    {
        System.out.println("Visiting program");
        return visit(ctx.block());
    }
    
    public Object visitStatement(Pcl4Parser.StatementContext ctx)
    {
        System.out.print("Line " + ctx.getStart().getLine() + ": ");
        return visitChildren(ctx);
    }
    
    public Object visitStatementList(Pcl4Parser.StatementListContext ctx)
    {
        System.out.println("Visiting statement list");

        for (Pcl4Parser.StatementContext stmtCtx : ctx.statement())
        {
            visit(stmtCtx);
        }
        
        return null;
    }
    
    public Object visitCompoundStatement(Pcl4Parser.CompoundStatementContext ctx)
    {
        System.out.println("Visiting compound statement");
        return visit(ctx.statementList());
    }
    
    public Object visitWriteStatement(Pcl4Parser.WriteStatementContext ctx)
    {
        System.out.println("Visiting WRITE statement");
        return null;
    }
    
    public Object visitWritelnStatement(Pcl4Parser.WritelnStatementContext ctx)
    {
        System.out.println("Visiting WRITELN statement");
        return null;
    }
    
    public Object visitNumber(Pcl4Parser.NumberContext ctx)
    {
        System.out.print("Visiting number: got value ");
        String text = ctx.unsignedNumber().integerConstant()
                                          .INTEGER().getText();
        Integer value = Integer.valueOf(text);
        System.out.println(value);
        
        return value;
    }
}
