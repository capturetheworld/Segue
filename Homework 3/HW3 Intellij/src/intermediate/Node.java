/**
 * Parse tree node class for a simple interpreter.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
package intermediate;

import java.util.ArrayList;

public class Node
{
    public enum NodeType
    {
        PROGRAM, COMPOUND, ASSIGN, LOOP, TEST, WRITE, WRITELN,
        ADD, SUBTRACT, MULTIPLY, DIVIDE, EQ, LT,
        VARIABLE, INTEGER_CONSTANT, REAL_CONSTANT, STRING_CONSTANT
    }

    public NodeType type;
    public int lineNumber;
    public String text;
    public SymtabEntry entry;
    public Object value;
    public ArrayList<Node> children;
    
    public Node(NodeType type)
    {
        this.type = type;
        this.lineNumber = 0;
        this.text = null;
        this.value = null;
        this.children = new ArrayList<Node>();
    }
    
    public void adopt(Node child) { children.add(child); }
}
