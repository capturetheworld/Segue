PROGRAM HelloWorld;

VAR i : integer;

BEGIN
    i := 0;
    
    REPEAT
        i := i + 1;
        writeln('#', i:1, ': Hello, world!')
    UNTIL i = 5
END.