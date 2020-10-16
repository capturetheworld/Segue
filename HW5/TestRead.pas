program TestRead;

var
    i, j : integer;
    x, y : real;
    p, q : boolean;
    ch1, ch2 : char;
    str1, str2 : string;
    
begin
    write('Enter two integers: ');
    readln(i, j);
    writeln('i = ', i, ', j = ', j);
    writeln;

    write('Enter two floats: ');
    read(x);
    readln(y);
    writeln('x = ', x, ', y = ', y);
    writeln;

    write('Enter two booleans: ');
    readln(p, q);
    writeln('p = ', p, ', q = ', q);
    writeln;

    write('Enter two strings: ');
    readln(str1, str2);
    writeln('str1 = ', str1, ', str2 = ', str2);
    writeln;

    write('Enter two characters: ');
    readln(ch1, ch2);
    writeln('ch1 = ', ch1, ', ch2 = ', ch2);
end.