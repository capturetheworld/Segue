program TestIf;

var
    i, j, k : integer;
    x, y : real;
    p, q : boolean;
    str, txt : string;
    
begin
    i := 1;
    j := 2;
    
    IF i = j THEN x := 3.14
             ELSE x := -5;
     
    IF i <> j THEN y := 3.14
              ELSE y := -5;
    
    writeln('i = ', i, ', j = ', j, ', x = ', x:5:2, ', y = ', y:5:2);
    
    IF i = j THEN BEGIN
        x := -7
    END 
    ELSE BEGIN
        x := 8;
    END;
     
    IF i <> j THEN BEGIN
        y := 14
    END 
    ELSE BEGIN
        y := -2;
    END;
    
    writeln('i = ', i, ', j = ', j, ', x = ', x:5:2, ', y = ', y:5:2);
    
    p := i = j;
    IF p THEN x := 55.55
         ELSE BEGIN
            x := 77.77;
            y := 88.88;
         END;
    
    writeln('i = ', i, ', j = ', j, ', x = ', x:5:2, ', y = ', y:5:2);
    
    q := i <= j;
    k := 10;
    
    if p then i := 33 else if not q then i := 44 else if i = j then i := 55 else i := 6;
    if not p then if q then j := 9 else j := -9;
    if p then if q then k := 11 else k := 12;
    
    writeln('i = ', i, ', j = ', j, ', x = ', x:5:2, ', y = ', y:5:2);
    writeln('k = ', k);
    
    writeln;
    if not p and q and (i <> j) and (x < y) then write('Good-bye');
    if not p then if q then if i <> j then if x < y then writeln(', world!');
end.