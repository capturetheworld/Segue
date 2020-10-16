PROGRAM TestRecord1;

TYPE
    PersonRec =  RECORD
                     firstName : string;
                     lastName  : string;
                     age       : integer;
                     phones    : ARRAY [0..1] OF string;
                 END;

VAR
    john : PersonRec;
    age  : integer;
    name : string;

PROCEDURE print(VAR pers : PersonRec);

    VAR
        age  : integer;
        phs  : ARRAY [0..1] OF string;

    BEGIN
        age := pers.age;

        phs[0] := pers.phones[0];
        phs[1] := pers.phones[1];

        writeln;
        writeln('First name: ', pers.firstName);
        writeln(' Last name: ', pers.lastName);
        writeln('       Age: ', age);
        writeln('  Phone #1: ', phs[0]);
        writeln('  Phone #2: ', phs[1]);
    END;

BEGIN
    john.firstName := 'John';
    john.lastName  := 'Doe';
    john.age := 24;

    john.phones[0] := '111-1111';
    john.phones[1] := '222-2222';

    age    := john.age;
    name   := john.firstName;
    
    writeln('First name: ', name);
    writeln(' Last name: ', john.lastName);
    writeln('       Age: ', age);

    writeln('  Phone #1: ', john.phones[0]);
    writeln('  Phone #2: ', john.phones[1]);

    print(john);
END.
