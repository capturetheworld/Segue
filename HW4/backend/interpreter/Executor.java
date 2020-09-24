package backend.interpreter;

import antlr4.*;

public class Executor extends Pcl4BaseVisitor<Object>
{
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
    
    public Object visitAssignmentStatement(Pcl4Parser.AssignmentStatementContext ctx)
    {
        System.out.println("Visiting assignment statement");
        String variableName = ctx.lhs().variable().getText();
        visit(ctx.lhs());
        Object value = visit(ctx.rhs());
        
        System.out.println("Will assign value " + (Integer) value +
                           " to variable " + variableName);
        return null;
    }
    
    public Object visitRepeatStatement(Pcl4Parser.RepeatStatementContext ctx)
    {
        System.out.println("Visiting REPEAT statement");
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
    
    public Object visitExpression(Pcl4Parser.ExpressionContext ctx)
    {
        System.out.println("Visiting expression");
        return visitChildren(ctx);
    }
    
    public Object visitVariable(Pcl4Parser.VariableContext ctx)
    {
        System.out.print("Visiting variable ");
        String variableName = ctx.getText();
        System.out.println(variableName);
        
        return null;  // should return the variable's value!
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
