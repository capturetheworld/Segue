PROGRAM ErrorProcedure(input, output);

VAR
    i, j : integer;
    x, y : real;
    p : boolean;
    
PROCEDURE alpha(m, n : integer; 
                r : real; 
                VAR k, o : integer; 
                VAR w, z : real; 
                VAR q : boolean);        
    BEGIN
    END;
    
procedure beta;
    begin
    end;
    
PROCEDURE gamma(i, n : integer; 
                r : real;
                VAR w, r : real);
    BEGIN
    END;    
    
BEGIN
    i := 5; j := 7;
    x := 3; y := 2;
    p := false;
        
    alpha(6, i - 3.0, 
          x + y/i, 
          i, j + 2, 
          8*i, i, 
          not p);
          
    beta(i);
    
    x(i, j, k, p);
    
    gamma(12, i*x, 
          i div j,
          i, x + y);
          
    delta(x, y, z);
END.