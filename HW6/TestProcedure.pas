PROGRAM TestProcedure(input, output);

VAR
    i, j : integer;
    x, y : real;
    p : boolean;

PROCEDURE alpha(m, n : integer; r : real; k, o : integer; 
                w, z : real; q : boolean);

    VAR a, b, c : real;
        i : integer;
        
    BEGIN
        a := 1; b := 2;
        c := a*b - w/z;
         
        i := 3;
        k := k + i + j + n;
        q := not p or (i = j) and (w > 2) and (w/z = 1.5);
        z := r;
        
        writeln('alpha parms:  m = ', m, ', n = ', n, ', r = ', r:4:2, 
                ', k = ', k, ', o = ', o, ', w = ', w:4:2, ', z = ', z:4:2, 
                ', q = ', q); 
        writeln('alpha locals: a = ', a:4:2, ', b = ', b:4:2, ', c = ', c:4:2,
                ', i = ', i);
    END;
   
procedure beta;

    var i, j : real;
    
    begin
        i := 22; j := 44;
        writeln('beta locals:  Hello, world! ', i+j:4:2);
    end;
  
PROCEDURE gamma(i, n : integer; x, r : real);

    VAR a, b, c : real;

    BEGIN
        a := i + n; 
        b := i*x + r;
        c := i;
        i := i + n;
        
        writeln('gamma parms:  i = ', i, ', n = ', n, ', x = ', x:4:2, ', r = ', r:4:2);
        writeln('gamma locals: a = ', a:4:2, ', b = ', b:4:2, ', c = ', c:4:2); 
                
        
    END;    
  
BEGIN
    i := 5; j := 7;
    x := 3; y := 2;
    p := false;
    writeln('main:         i = ', i, ', j = ', j, ', x = ', x:4:2, ', y = ', y:4:2, ', p = ', p);

    alpha(6, i - 3, 
          x + y/i, 
          i, j, 
          x, y, 
          p);
    writeln('main:         i = ', i, ', j = ', j, ', x = ', x:4:2, ', y = ', y:4:2, ', p = ', p);

    beta();
    writeln('main:         i = ', i, ', j = ', j, ', x = ', x:4:2, ', y = ', y:4:2, ', p = ', p);

    gamma(i, j, 
          i/x, i*j);
    writeln('main:         i = ', i, ', j = ', j, ', x = ', x:4:2, ', y = ', y:4:2, ', p = ', p);
END.