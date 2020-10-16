PROGRAM ErrorAssignment;

VAR
    i, j, k : integer;
    alpha, beta, gamma : real;
    p : boolean;
    m, j, n : integer;
    str, txt : string;
    
BEGIN
    str = 'Hello, world!';
    bye := 'Goodbye, world!';
    
    i := str;
    j := bye;
    i := i + k + m + j;
    
    alpha := 3.14526;
    k := i*4.5 - 7;
    beta := alpha*3 + str - 2.7;
    gamma := 14 - i*bye + 15.2 - str mod 2.2 + 5;
    
    j := 14 + alpha div 2 - 12;
    k := i + 24*(gamma mod j)div 3.0;
    
    str := str - txt;
    
    p := k < str;
    p := (i < j) AND (alpha - beta) or (str*txt >= +); 
END.