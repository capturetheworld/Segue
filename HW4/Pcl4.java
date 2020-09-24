/**
 * A simple interpreter to demonstrate scanning, parsing, symbol tables,
 * parse trees, and interpreted program execution.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.IOException;

import antlr4.*;
import backend.interpreter.*;

public class Pcl4
{
    public static void main(String args[])
    {
        if (args.length != 2)
        {
            System.out.println("Usage: simple -{execute, convert, compile} " +
                               "sourceFileName");
            System.exit(-1);
        }
        
        String operation      = args[0];  // -execute, -convert, -compile
        String sourceFileName = args[1];  // source file name
        FileInputStream source = null;    // input stream
        CharStream chars = null;          // character stream
        
        try
        {
            // Create the input stream.
            source = new FileInputStream(sourceFileName);
            
            // Create the character stream from the input stream.
            chars = CharStreams.fromStream(source);
        }
        catch (IOException ex)
        {
            System.out.println("Source file error: " + sourceFileName);
            System.exit(-1);
        }
        
        // Create a lexer which scans the character stream
        // to create a token stream.
        Pcl4Lexer lexer = new Pcl4Lexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Create a parser which parses the token stream
        // to create a parse tree.
        Pcl4Parser parser = new Pcl4Parser(tokens);
        ParseTree tree = parser.program();
        
        // Backend operation.
        if (operation.equals("-execute")) executeProgram(tree);
        else
        {
            System.out.println("Usage: simple -{execute, convert, compile} " +
                               "sourceFileName");
            System.exit(-1);
        }
    }
    
    /**
     * Execute the source program.
     * @param tree the parse tree root.
     */
    private static void executeProgram(ParseTree tree)
    {
        System.out.println("Execution:\n");
        Executor executor = new Executor();
        executor.visit(tree);
    }
}
