package backend.converter;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Emit code for the Pascal-to-Java converter.
 */
public class CodeGenerator
{
    private PrintWriter objectFile;
    private String objectFileName;
    
    private int length;          // length of the code line
    private int position;        // position in the code line
    private String indentation;  // indentation of the code line
    private boolean needLF;      // true if a line feed is needed, else false
    
    private static String blanks;    // 80 blanks
    
    static
    {
        blanks = "";
        for (int i = 0; i < 8; i++) blanks += "          ";
    }
    
    /**
     * Constructor.
     * @param programName the name of the program.
     * @param suffix the suffix of the object file name.
     */
    CodeGenerator(String programName, String suffix)
    {
        // Create the Java object file.
        try 
        {
            objectFileName = programName + "." + suffix;
            objectFile = new PrintWriter(new FileWriter(objectFileName));
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        
        length = 0;
        position = 0;
        indentation = "";
        needLF = false;
    }
    
    /**
     * Get the name of the object (Java) file.
     * @return the name.
     */
    String getObjectFileName() { return objectFileName; }
    
    /**
     * Close the object file.
     */
    void close() { objectFile.close(); }
    
    /**
     * Emit a line feed if needed.
     */
    public void lfIfNeeded()
    {
        if (needLF)
        {
            objectFile.println();
            objectFile.flush();
            length = 0;
            needLF = false;
        }
    }
    
    /**
     * Emit some code.
     * @param code the code to emit.
     */
    public void emit(String code)
    {
        objectFile.print(code);
        objectFile.flush();
        length += code.length();
        needLF = true;
    }
    
    /**
     * Emit the start of a new line of code with indentation.
     */
    public void emitStart()
    {
        lfIfNeeded();
        emit(indentation);  
        position = 0;
    }

    /**
     * Emit the start of a new line with indentation and some code.
     * @param code the code to emit.
     */
    public void emitStart(String code)
    {
        lfIfNeeded();
        emit(indentation + code);  
        position = 0;
    }
    
    /**
     * Emit a blank code line.
     */
    public void emitLine()
    {
        lfIfNeeded();
        objectFile.println();  
        objectFile.flush();
        
        length = 0;
        position = 0;
        needLF = false;
    }
    
    /**
     * Emit a complete line of code with indentation.
     * @param code the code to emit.
     */
    public void emitLine(String code)
    {
        lfIfNeeded();
        objectFile.println(indentation + code);
        objectFile.flush();
        
        length = 0;
        position = 0;
        needLF = false;
    }
    
    /**
     * Emit some code to end a line.
     * @param code the code to emit.
     */
    public void emitEnd(String code)
    {
        objectFile.println(code);
        objectFile.flush();
        
        length = 0;
        position = 0;
        needLF = false;
    }
    
    /**
     * Emit a comment line with indentation.
     * @param text the comment text.
     */
    public void emitCommentLine(String text)
    {
        emitLine(indentation + "// " + text);
        needLF = false;
    }
    
    /**
     * Increase the indentation.
     */
    public void indent()
    {
        indentation += "    ";
    }
    
    /**
     * Decrease the indentation.
     */
    public void dedent()
    {
        indentation = indentation.substring(4);
    }
    
    /**
     * Mark a position in the code line for indentation of the second line
     * after a potential line split.
     */
    public void mark()
    {
        position = length;
    }
    
    /**
     * Split the code line if its length exceeds the given limit
     * and indent the second line to the marked position.
     * @param limit the limit.
     */
    public void split(int limit)
    {
        if (length > limit)
        {
            objectFile.println();  
            objectFile.print(blanks.substring(0, position));
            objectFile.flush();
            
            length = position;
            position = 0;
            needLF = false;
        }
    }
}
