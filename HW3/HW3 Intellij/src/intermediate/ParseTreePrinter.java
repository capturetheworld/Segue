/**
 * Parse tree printer class for a simple interpreter.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
package intermediate;

import java.util.ArrayList;

import static intermediate.Node.NodeType.*;

public class ParseTreePrinter
{
    private static final String INDENT_SIZE = "    ";

    private String indentation;  // indentation of a line
    private StringBuilder line;  // output line

    /**
     * Constructor
     * @param ps the output print stream.
     */
    public ParseTreePrinter()
    {
        this.indentation = "";
        this.line = new StringBuilder();
    }

    /**
     * Print a parse tree.
     * @param node the parse tree's root node.
     */
    public void print(Node node)
    {
        // Opening tag.
        line.append(indentation); line.append("<" + node.type);
        
        // Attributes.
        if      (node.type == PROGRAM)          line.append(" " + node.text);
        else if (node.type == VARIABLE)         line.append(" " + node.text);
        else if (node.type == INTEGER_CONSTANT) line.append(" " + (long) node.value);
        else if (node.type == REAL_CONSTANT)    line.append(" " + node.value);
        else if (node.type == STRING_CONSTANT)  line.append(" '" + (String) node.value + "'");
        if (node.lineNumber > 0)                line.append(" line " + node.lineNumber);

        // Print the node's children followed by the closing tag.
        ArrayList<Node> children = node.children;
        if ((children != null) && (children.size() > 0)) 
        {
            line.append(">");
            printLine();

            printChildren(children);
            line.append(indentation); line.append("</" + node.type + ">");
        }

        // No children: Close off the tag.
        else line.append(" />");

        printLine();
    }

    /**
     * Print a parse tree node's child nodes.
     * @param children the array list of child nodes.
     */
    private void printChildren(ArrayList<Node> children)
    {
        String saveIndentation = indentation;
        indentation += INDENT_SIZE;
        for (Node child : children) print(child);
        indentation = saveIndentation;
    }

    /**
     * Print an output line.
     */
    private void printLine()
    {
        System.out.println(line);
        line.setLength(0);
    }
}
