PROGRAM TestRecord3;

TYPE
    AddressRec = RECORD
                     street : string;
                     city   : string;
                     state  : string;
                     zip    : string;
                 END;

    PersonRec =  RECORD
                     firstName : string;
                     lastName  : string;
                     age       : integer;
                     address   : AddressRec;
                     phones    : ARRAY [0..1] OF string;
                 END;

VAR
    john, mary : PersonRec;
    persons    : ARRAY [0..4] OF PersonRec;

    age    : integer;
    name   : string;
    street : string;

PROCEDURE print(VAR pers : PersonRec);

    VAR
        age  : integer;
        addr : AddressRec;
        phs  : ARRAY [0..1] OF string;

    BEGIN
        age := pers.age;

        addr.street := pers.address.street;
        addr.city   := pers.address.city;
        addr.state  := pers.address.state;
        addr.zip    := pers.address.zip;

        phs[0] := pers.phones[0];
        phs[1] := pers.phones[1];

        writeln;
        writeln('First name: ', pers.firstName);
        writeln(' Last name: ', pers.lastName);
        writeln('       Age: ', age);
        writeln('    Street: ', addr.street);
        writeln('      City: ', addr.city);
        writeln('     State: ', addr.state);
        writeln('       ZIP: ', addr.zip);
        writeln('  Phone #1: ', phs[0]);
        writeln('  Phone #2: ', phs[1]);
    END;

BEGIN
    john.firstName := 'John';
    john.lastName  := 'Doe';
    john.age := 24;
    john.address.street := '1680 25th Street';
    john.address.city   := 'San Pablo';
    john.address.state  := 'CALIFORNIA';
    john.address.zip    := '94806';
    john.phones[0]      := '111-1111';
    john.phones[1]      := '222-2222';
    
    age    := john.age;
    name   := john.firstName;
    street := john.address.street;
    
    print(john);

    persons[3].firstName := 'Robert';
    persons[3].lastName  := 'Doe';
    persons[3].age := 24;

    persons[3].address.street := '1680 25th Street';
    persons[3].address.city   := 'San Pablo';
    persons[3].address.state  := 'CALIFORNIA';
    persons[3].address.zip    := '94806';
    persons[3].phones[0]      := '111-1111';
    persons[3].phones[1]      := '222-2222';

    age    := persons[3].age;
    name   := persons[3].firstName;
    street := persons[3].address.street;

    writeln('   age = ', age);
    writeln('  name = ', name);
    writeln('street = ', street);

    persons[3].phones[0] := '888-8888';
    persons[3].phones[1] := persons[3].phones[0];
    
    writeln(' phone #1 = ', persons[3].phones[0]);
    writeln(' phone #2 = ', persons[3].phones[1]);

    print(persons[3]);
   
    mary := persons[3];
    mary.firstName := 'Mary';
    mary.age := 22;
    
    print(mary);
END.
