grammar Segfault;

@header {
    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;
}


program           : STARTPGM programHeader ENDPGM ;



STARTPGM : '{' ;
ENDPGM : '}' ;