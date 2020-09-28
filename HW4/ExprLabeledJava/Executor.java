import java.util.HashMap;
import java.util.Map;

public class Executor extends ExprLabeledBaseVisitor<Object> 
{
    // The symbol table to store runtime values (our hack).
    private Map<String, Object> symtab = new HashMap<String, Object>();

    @Override
    public Object visitAssign(ExprLabeledParser.AssignContext ctx) 
    {
        String idName = ctx.IDENTIFIER().getText();  
        Object value = visit(ctx.expr());  // compute the expression value
        symtab.put(idName, value);         // store it into the symbol table
        
        return value;
    }

    @Override
    public Object visitPrint(ExprLabeledParser.PrintContext ctx) 
    {
        Object value = visit(ctx.expr());  // evaluate the expression
        System.out.println(value);         // print the result
        
        return null;
    }

    @Override
    public Object visitInt(ExprLabeledParser.IntContext ctx) 
    {
        return Integer.valueOf(ctx.INTEGER().getText());  // integer value
    }

    @Override
    public Object visitId(ExprLabeledParser.IdContext ctx) 
    {
        String id = ctx.IDENTIFIER().getText();
        
        if (symtab.containsKey(id)) 
        {
            return symtab.get(id);  // value from symbol table
        }
        else return 0;              // dummy value
    }

    @Override
    public Object visitMulDiv(ExprLabeledParser.MulDivContext ctx) 
    {
        int left  = (Integer) visit(ctx.expr(0));  // left  child expression
        int right = (Integer) visit(ctx.expr(1));  // right child expression
        
        if (ctx.op.getType() == ExprLabeledParser.MUL) return left*right;
        else                                           return left/right;
    }

    @Override
    public Object visitAddSub(ExprLabeledParser.AddSubContext ctx) 
    {
        int left  = (Integer) visit(ctx.expr(0));  // left  child expression
        int right = (Integer) visit(ctx.expr(1));  // right child expression
        
        if (ctx.op.getType() == ExprLabeledParser.ADD) return left + right;
        else                                           return left - right;
    }

    @Override
    public Object visitParens(ExprLabeledParser.ParensContext ctx) 
    {
        return visit(ctx.expr());  // return parenthesized expression value
    }
}
