PROGRAM TestAssignment;

VAR
    i, j, k : integer;
    alpha, beta, gamma : real;
    p : boolean;
    ch : char;
    str, txt : string;
    hello, world : string;
    
BEGIN
    i := 32;
    writeln('i = ', i);
    
    alpha := 3.1415926;
    writeln('alpha = ', alpha);
        
    p := true;
    writeln('p = ', p:10);
    
    ch := 'r';
    writeln('ch = ', ch);

    hello := 'Hello';
    world := 'World';
    writeln('hello =  world = ', hello =  world);
    writeln('hello <> world = ', hello <> world);
    writeln('hello <  world = ', hello <  world);
    writeln('hello <= world = ', hello <= world);
    writeln('hello >  world = ', hello >  world);
    writeln('hello >= world = ', hello >= world);

    str := '''"''''Done!''''"''';
    writeln('str = ', str);  

    j := i;
    i := -2 + 3*j + 12;
    k := 5 + i div j mod 4;
    
    write('i = ', i:3, ', j = ', j:3);
    writeln(', k = ', k:3);

    alpha := 9.3;
    beta  := alpha;
    beta  := beta/3.7 - alpha*2;
    gamma := 8.45*(beta + 9.12) + 7 mod 4;
    writeln('i = ', i, ', j = ', j,
            ', alpha = ', alpha:4:2, ', beta = ', beta:6:2, ', gamma = ', gamma,
            ', gamma expression = [', 8.45*(beta + 9.12) + 7 mod 4:-10:2, ']');

    BEGIN
        p := (i = j) OR (alpha >= beta) AND (alpha + beta <> gamma);
        writeln('p = ', p);

        p := not p;
        writeln('not p = ', p);
    END;

    ch := 'r';
    p  := ch > 'm';
    writeln('ch = ''', ch, ''', p = ', p);

    str := 'Hello, ';
    txt := 'world!';
    str := str + txt;
    writeln('str = ', str, '''''''');

    str := '''"''''Done!''''"''';
    txt := '''"''''Finished!''''"''';
    p := str < txt;
    p := (str < txt) and (i > j);
    writeln('p = ', p);
    
    writeln;
    writeln(str);
END.