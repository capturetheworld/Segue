PROGRAM Newton2;

VAR
    number : real;
    root, prev, diff : real;

BEGIN
    REPEAT
        writeln;
        write('Enter a number: ');
        read(number);

        IF number > 0 THEN BEGIN
            writeln('The square root of ', number, ':');
            writeln;
            
            root := 1;
            prev := 0;
            
            REPEAT
                root := (number/root + root)/2;
                diff := root - prev;
                IF diff < 0 THEN diff := -diff;
                prev := root;
                
                writeln(root:24:10);
            UNTIL diff < 1.0e-10;
        END
    UNTIL number <= 0;
    
    writeln('Done!')
END.

