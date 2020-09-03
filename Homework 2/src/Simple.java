/**
 * A simple interpreter to demonstrate scanning, parsing, symbol tables,
 * parse trees, and interpreted program execution.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
import frontend.*;
import intermediate.*;
import backend.*;

import static frontend.Token.TokenType.*;

public class Simple
{
    public static void main(String args[])
    {
        if (args.length != 2)
        {
            System.out.println("Usage: simple -{scan, parse, execute} " +
                               "sourceFileName");
            System.exit(-1);
        }
        
        String operation      = args[0];  // -scan, -parse, or -execute
        String sourceFileName = args[1];
        
        Source source = new Source(sourceFileName);
        
        if (operation.equalsIgnoreCase("-scan"))
        {
            testScanner(source);
        }
        else if (operation.equalsIgnoreCase("-parse"))
        {
            testParser(new Scanner(source), new Symtab());
        }
        else if (operation.equalsIgnoreCase("-execute"))
        {
            Symtab symtab = new Symtab();
            executeProgram(new Parser(new Scanner(source), symtab), symtab);
        }
    }
    
    /**
     * Test the scanner.
     * @param source the input source.
     */
    private static void testScanner(Source source)
    {
        System.out.println("Tokens:");
        System.out.println();
        
        Scanner scanner = new Scanner(source);  // create the scanner
        
        // Loop to extract and print each token from the source one at a time.
        for (Token token = scanner.nextToken(); 
             token.type != END_OF_FILE; 
             token = scanner.nextToken())
        {
            System.out.printf("%12s : %s\n", token.type, token.text);
        }
    }
    
    /**
     * Test the parser.
     * @param scanner the scanner.
     * @param symtab the symbol table.
     */
    private static void testParser(Scanner scanner, Symtab symtab)
    {
        Parser parser = new Parser(scanner, symtab);  // create the parser
        Node programNode = parser.parseProgram();     // and parse the program
        int errorCount = parser.errorCount();
        
        // If no errors, print the parse tree.
        if (errorCount == 0)
        {
            System.out.println("Parse tree:");
            System.out.println();
            
            ParseTreePrinter printer = new ParseTreePrinter();
            printer.print(programNode);
        }
        else
        {
            System.out.println();
            System.out.println("There were " + errorCount + " syntax errors.");
        }
    }
    
    /**
     * Test the executor.
     * @param parser the parser.
     * @param symtab the symbol table.
     */
    private static void executeProgram(Parser parser, Symtab symtab)
    {
        Node programNode = parser.parseProgram();  // build the parse tree
        int errorCount = parser.errorCount();
        
        // If no errors, execute the program using the parse tree.
        if (errorCount == 0)
        {
            Executor executor = new Executor(symtab);
            executor.visit(programNode);
        }
        else
        {
            System.out.println();
            System.out.println("There were " + errorCount + " errors.");
        }
    }
}
