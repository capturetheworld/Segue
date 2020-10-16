PROGRAM TestRepeat;

VAR
    i, j : integer;
    
BEGIN
    i := 1;

    REPEAT
        writeln('i = ', i);
        i := i + 1;
    UNTIL i > 5;
    
    writeln;
    
    i := 1;
    
    REPEAT
        j := 10;
        
        REPEAT
            writeln('i = ', i, ', j = ', j);
            j := j + 10
        UNTIL j > 30;
        
        i := i + 1
    UNTIL i > 2;
END.