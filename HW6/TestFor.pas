program TestFor;

var
    i, j : integer;
    ch : char;
    
procedure proc(limit : integer);
    var
        i : integer;
        
    begin
        for i := 1 to limit do writeln('i = ', i);
        writeln;
    end;
    
begin
    proc(5);
    
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