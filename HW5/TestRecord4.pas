PROGRAM TestRecord4;

TYPE
    PersonRec =  RECORD
                     firstName : string;
                     lastName  : string;
                     age       : integer;
                     address   : RECORD
                                     street : string;
                                     city   : string;
                                     state  : string;
                                     zip    : string;
                                 END;
                     phones    : ARRAY [0..1] OF string;
                 END;

VAR
    john : PersonRec;
    persons : ARRAY [0..4] OF PersonRec;
    
    age  : integer;
    name : string;
    st   : string;

PROCEDURE print(VAR pers : PersonRec);

    VAR
        age : integer;
        street, city : string;
        phs : ARRAY [0..1] OF string;

    BEGIN
        age := pers.age;

        street := pers.address.street;
        city   := pers.address.city;

        phs[0] := pers.phones[0];
        phs[1] := pers.phones[1];

        writeln;
        writeln('First name: ', pers.firstName);
        writeln(' Last name: ', pers.lastName);
        writeln('       Age: ', age);
        writeln('    Street: ', street);
        writeln('      City: ', city);
        writeln('     State: ', pers.address.state);
        writeln('       ZIP: ', pers.address.zip);
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

    age  := john.age;
    name := john.firstName;
    st   := john.address.street;

    writeln('   age = ', age);
    writeln('  name = ', name);
    writeln('street = ', st);

    john.phones[0] := '888-8888';
    john.phones[1] := john.phones[0];
    
    writeln(' phone #1 = ', john.phones[0]);
    writeln(' phone #2 = ', john.phones[1]);

    print(john);
    
    persons[3].firstName := 'Mary';
    persons[3].lastName  := 'Jane';
    persons[3].age := 24;
    persons[3].address.street := '2363 Brushglen Way';
    persons[3].address.city   := 'San Jose';
    persons[3].address.state  := 'CALIFORNIA';
    persons[3].address.zip    := '94133';
    persons[3].phones[0]      := '111-1111';
    persons[3].phones[1]      := '222-2222';
    
    print(persons[3]);
END.
