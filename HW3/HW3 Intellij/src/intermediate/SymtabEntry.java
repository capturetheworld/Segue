/**
 * Symbol table entry class for a simple interpreter.
 * 
 * (c) 2020 by Ronald Mak
 * Department of Computer Science
 * San Jose State University
 */
package intermediate;

public class SymtabEntry
{
    private String name;
    private Double value;
    
    public SymtabEntry(String name)
    {
        this.name  = name;
        this.value = 0.0;
    }
    
    public String getName()  { return name;  }
    public Double getValue() { return value; }
    
    public void setValue(Double value) { this.value = value; }
}
