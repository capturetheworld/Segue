program TestWhile(input, output, error);

var
    i, j : integer;
    
begin
    i := 1;
    while i <= 5 do begin
        writeln('i = ', i);
        i := i + 1
    end;
    
    writeln;
    
    i := 1;
    while i <= 5 do begin
        j := 10;
        
        while j <= 30 do begin
            writeln('i = ', i, ', j = ', j);
            j := j + 10
        end;
        
        i := i + 1
    end
end.