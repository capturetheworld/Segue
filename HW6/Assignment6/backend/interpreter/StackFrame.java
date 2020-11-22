package backend.interpreter;

import java.util.ArrayList;

import intermediate.symtab.*;

/**
 * <h1>StackFrame</h1>
 *
 * <p>The runtime stack frame.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class StackFrame
{
    private SymtabEntry routineId;  // symbol table entry of the routine's name
    private StackFrame backlink;    // backlink to the previous frame
    private int nestingLevel;       // scope nesting level of this frame
    private MemoryMap memoryMap;    // memory map of this stack frame

    /**
     * Constructor.
     * @param routineId the symbol table entry of the routine's name.
     */
    public StackFrame(SymtabEntry routineId)
    {
        Symtab symtab = routineId.getRoutineSymtab();

        this.routineId = routineId;
        this.backlink = null;
        this.nestingLevel = symtab.getNestingLevel();
        this.memoryMap = new MemoryMap(symtab);
    }

    /**
     * Get the symbol table entry of the routine's name.
     * @return the symbol table entry.
     */
    public SymtabEntry getRoutineId() { return routineId; }

    /**
     * Get the memory cell for the given name from the memory map.
     * @param name the name.
     * @return the cell.
     */
    public Cell getCell(String name) { return memoryMap.getCell(name); }
    
    /**
     * Replace the memory cell with the given name in the memory map.
     * @param name the name.
     * @param cell the replacement cell.
     */
    public void replaceCell(String name, Cell cell) 
    { 
        memoryMap.replaceCell(name, cell); 
    }

    /**
     * Get the list of all the names in the memory map.
     * @return the list of names.
     */
    public ArrayList<String> getAllNames() { return memoryMap.getAllNames(); }

    /**
     * Get the scope nesting level.
     * @return the nesting level.
     */
    public int getNestingLevel() { return nestingLevel; }

    /**
     * Get the stack frame to which this frame is dynamically linked.
     * @return the link.
     */
    public StackFrame backlink() { return backlink; }

    /**
     * Make a backlink from this stack frame to another one.
     * @param frame the stack frame to link to.
     * @return this stack frame.
     */
    public StackFrame createBacklink(StackFrame frame)
    {
        backlink = frame;
        return this;
    }
}
