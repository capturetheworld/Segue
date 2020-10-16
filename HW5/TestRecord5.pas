PROGRAM TestRecord5;

TYPE
    PersonRec =  RECORD
                     firstName : string;
                     lastName  : string;
                     age       : integer;
                     address   : RECORD
                                     street : RECORD
                                                  houseNumber : integer;
                                                  streetName  : string;
                                              END;
                                     city   : string;
                                     state  : string;
                                     zip    : string;
                                 END;
                     phones    : ARRAY [0..1] OF string;
                 END;

VAR
    mary : PersonRec;
    john : PersonRec;
    persons    : ARRAY [0..2, 0..5, 0..10] OF PersonRec;

    age    : integer;
    name   : string;
    street : string;

PROCEDURE print(VAR pers : PersonRec);

    VAR
        age  : integer;
        phs  : ARRAY [0..1] OF string;
        num  : integer;
        name : string;

    BEGIN
        age  := pers.age;
        num  := pers.address.street.houseNumber;
        name := pers.address.street.streetName;

        phs[0] := pers.phones[0];
        phs[1] := pers.phones[1];

        writeln;
        writeln('  First name: ', pers.firstName);
        writeln('   Last name: ', pers.lastName);
        writeln('         Age: ', age);
        writeln('House number: ', num);
        writeln(' Street name: ', pers.address.street.streetName);
        writeln('        City: ', pers.address.city);
        writeln('       State: ', pers.address.state);
        writeln('         ZIP: ', pers.address.zip);
        writeln('    Phone #0: ', phs[0]);
        writeln('    Phone #1: ', phs[1]);
    END;

BEGIN
    mary.firstName := 'Mary';
    mary.lastName  := 'Jane';
    mary.age := 24;
    mary.address.street.houseNumber := 2363;
    mary.address.street.streetName  := 'Brushglen Way';
    mary.address.city   := 'San Jose';
    mary.address.state  := 'CALIFORNIA';
    mary.address.zip    := '94133';
    mary.phones[0]      := '000-0000';
    mary.phones[1]      := '111-1111';
    
    writeln('mary.address.street.streetName = ', mary.address.street.streetName);
    print(mary);

    persons[0][1][2].firstName := 'John';
    
    writeln;
    writeln(' persons[0][1][2].firstName = ', persons[0][1][2].firstName);
    
    persons[0][1][2].lastName  := 'Doe';
    persons[0][1][2].age := 24;
    persons[0][1][2].address.street.houseNumber := 1680;
    persons[0][1][2].address.street.streetName  := '25th Street';
    persons[0][1][2].address.city   := 'San Pablo';
    persons[0][1][2].address.state  := 'CALIFORNIA';
    persons[0][1][2].address.zip    := '94806';
    persons[0][1][2].phones[0]      := '333-3333';
    persons[0][1][2].phones[1]      := '444-4444';

    print(persons[0][1][2]);
    
    john := persons[0][1][2];
    print(john);
END.
