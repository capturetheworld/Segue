program TestFor;

var
    i, j : integer;
    ch : char;
    
begin
    for i := 1 to 5 do writeln('i = ', i);
    writeln;
    
    for i := 1 to 3 do begin
        for j := 4 downto 1 do begin
            writeln('i = ', i, ', j = ', j);
        END
    end;
    
    writeln;
    
    for ch := 'a' to 'z' do write(ch);
    writeln;
    
    for ch := 'Z' DOWNto 'A' do write(ch);
    writeln;
end.