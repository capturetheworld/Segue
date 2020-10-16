program ErrorIf;

var
    i, j, k : integer;
    x, y : real;
    p, q : boolean;
    str, txt : string;
    
begin
    IF i := j THEN x := 3.14
              ELSE x := -5;
     
    IF i <> j;
    IF i <> j ELSE y := -5;
    
    IF i THEN BEGIN
        x := -7
    END ELSE 
    BEGIN
        x > 8;
    END;
     
    IF i <> j THEN;
    IF i <> j THEN ELSE;
    
    IF p THEN 
         ELSE BEGIN
            x := 77.77;
            y := 88.88;
         END;
    
    if p then i := 33 else if not q then i := 44 else if i = j then i := 55 else i := 6;
    if not p then if q then j := 9 else j := -9;
    if p then if q then k := 11 else k := 12;
    
    if not p and q and (i <> j and (x < y) then write('Good-bye');
    if not p then if q then i <> j then if x < y then writeln(', world!');
end.