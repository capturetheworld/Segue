PROGRAM Newton3;

VAR
    number : integer;

FUNCTION root(x : real) : real;
    VAR
        r, prev, diff : real;

    BEGIN
        r := 1;
        prev := 0;
        
        REPEAT
            r := (x/r + r)/2;
            diff := r - prev;
            IF diff < 0 THEN diff := -diff;
            prev := r
        UNTIL diff < 1.0e-10;
        
        root := r
    END;

PROCEDURE print(n : integer; root : real);
    BEGIN
        writeln('The square root of ', n:4, ' is ', root:8:4)
    END;

BEGIN
    FOR number := 1 TO 25 DO BEGIN
        print(number, root(number))
    END
END.
