import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import antlr4.*;

import frontend.*;
import intermediate.symtab.*;

// import intermediate.util.BackendMode;
import backend.compiler.Compiler;

// import static intermediate.util.BackendMode.*;

public class Segue {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("USAGE: Segue sourceFileName");
            return;
        }

        String sourceFileName = args[0];

        // Generate a source file listing.
        new Listing(sourceFileName);

        // Create the input stream.
        InputStream source = new FileInputStream(sourceFileName);

        // Create the character stream from the input stream.
        CharStream cs = CharStreams.fromStream(source);

        // Custom syntax error handler.
        CustomErrorListener err = new CustomErrorListener();

        // Create a lexer which scans the character stream
        // to create a token stream.
        SegueLexer lexer = new SegueLexer(cs);
        lexer.removeErrorListeners();
        lexer.addErrorListener(err);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser which parses the token stream.
        SegueParser parser = new SegueParser(tokens);

        // Pass 1: Check syntax and create the parse tree.
        System.out.printf("\nPASS 1 Syntax: ");
        parser.removeErrorListeners();
        parser.addErrorListener(err);
        ParseTree tree = parser.program();

        int errorCount = err.getCount();
        if (errorCount > 0) {
            System.out.println("There were " + errorCount + " errors in Parser Pass.");
            System.out.println("Object file not created or modified.");
            return;
        } else {
            System.out.println("There were no errors in Pass 1");
        }

        // Pass 2: Semantic operations.
        Path p = Paths.get(sourceFileName);
        String programName = p.getFileName().toString();

        System.out.printf("\nPASS 2 Semantics:\n");
        Semantics pass2 = new Semantics(programName);
        pass2.visit(tree);

        errorCount = pass2.getErrorCount();
        if (errorCount > 0) {
            System.out.println("There were " + errorCount + " errors in the Semantic Pass.");
            System.out.println("Object file not created or modified.");
            return;
        }
        /* 
        // Pass 3: Compile the Pascal program.
        System.out.printf("\nPASS 3 Compilation: ");
        SymtabEntry programId = pass2.getProgramId();
        Compiler pass3 = new Compiler(programId);
        pass3.visit(tree);
        

        System.out.printf("Object file \"%s\" created.\n", pass3.getObjectFileName());
        */

    }
}
