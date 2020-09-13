/**
 * Symbol table class for a simple interpreter.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
package intermediate;

import java.util.HashMap;

public class Symtab
{
    private HashMap<String, SymtabEntry> contents = new HashMap<>();
    
    public SymtabEntry enter(String name) 
    { 
        SymtabEntry entry = new SymtabEntry(name);
        contents.put(name, entry);
        
        return entry;
    }
    
    public SymtabEntry lookup(String name) { return contents.get(name); }
}
