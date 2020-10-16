package backend.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import intermediate.symtab.*;
import intermediate.symtab.SymtabEntry.Kind;
import intermediate.type.*;

/**
 * <h1>MemoryMap</h1>
 *
 * <p>The interpreter's runtime memory map.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class MemoryMap
    extends HashMap<String, Cell>
{
    private static final long serialVersionUID = 0L; 

    /**
     * Constructor.
     * Create a memory map and allocate its memory cells
     * based on the entries in a symbol table.
     * @param symtab the symbol table.
     */
    public MemoryMap(Symtab symtab)
    {
        ArrayList<SymtabEntry> entries = symtab.sortedEntries();

        // Loop for each entry of the symbol table.
        for (SymtabEntry entry : entries) 
        {
            Kind kind = entry.getKind();
            
            switch (kind)
            {
                case VARIABLE:
                case FUNCTION:
                case VALUE_PARAMETER:
                case RECORD_FIELD:
                {
                    // Not a reference parameter: Allocate cells for the
                    //                            value in the hashmap.
                    String name = entry.getName();
                    Typespec type = entry.getType();
                    put(name, new Cell(allocateCellValue(type)));
                    break;
                }
                    
                case REFERENCE_PARAMETER:
                {
                    // Reference parameter: Allocate a single cell to hold a 
                    //                      reference in the hashmap.
                    String name = entry.getName();
                    put(name, new Cell(null));
                }
                
                default: break;
            }
        }
    }

    /**
     * Return the memory cell with the given name.
     * @param name the name.
     * @return the cell.
     */
    public Cell getCell(String name) { return get(name); }
    
    /**
     * Replace the memory cell with the given name.
     * @param name the name.
     * @param cell the replacement cell.
     */
    public void replaceCell(String name, Cell cell) { put(name, cell); }

    /**
     * Get an arraylist of all the names in the memory map.
     * @return the arraylist.
     */
    public ArrayList<String> getAllNames()
    {
        ArrayList<String> list = new ArrayList<String>();

        Set<String> names = keySet();
        Iterator<String> it = names.iterator();
        while (it.hasNext()) list.add(it.next());

        return list;
    }

    /**
     * Make an allocation for a value of a given data type for a memory cell.
     * @param type the data type.
     * @return the allocation.
     */
    private Object allocateCellValue(Typespec type)
    {
        switch (type.getForm()) 
        {
            case ARRAY:  return allocateArrayCells(type);
            case RECORD: return allocateRecordMap(type);
            default:     return null;  // uninitialized scalar value
        }
    }

    /**
     * Allocate the memory cells of an array.
     * @param type the array type.
     * @return the allocation.
     */
    private Object[] allocateArrayCells(Typespec type)
    {
        int elmtCount = type.getArrayElementCount();
        Typespec elmtType = type.getArrayElementType();
        Cell allocation[] = new Cell[elmtCount];

        for (int i = 0; i < elmtCount; ++i) 
        {
            allocation[i] = new Cell(allocateCellValue(elmtType));
        }

        return allocation;
    }

    /**
     * Allocate the memory map for a record.
     * @param type the record type.
     * @return the allocation.
     */
    private MemoryMap allocateRecordMap(Typespec type)
    {
        Symtab symtab = (Symtab) type.getRecordSymtab();
        MemoryMap memoryMap = new MemoryMap(symtab);

        return memoryMap;
    }
}
