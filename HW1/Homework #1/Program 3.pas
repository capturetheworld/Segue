{ Program 3, Ian SooHoo adapted from 
EmployeeListing.pas provided by Prof. Ron Mak }

PROGRAM PresidentsPgm(output);

USES sysutils;

CONST
  MAX_RECORDS   = 20;
  NAME_SEPARATOR  = ' ';

TYPE
  CodeChar = 'A'..'Z';
  CodeSet = SET OF CodeChar;

  PresidentRec = RECORD
    startYear : integer;
    endYear : integer;
    lastName : string;
    firstName : string;
    middleName : string;
  END;

VAR
  presidentCount : integer;
  presidents : ARRAY [1..MAX_RECORDS] OF PresidentRec;
  toPrint:array [ 1..20] of integer;
  printCount: integer = 0;//size of toPrint


///////////////////////////////////////////////////////////////////////////////////////////////////
{Read a first middle or last name and return it by reference.}
PROCEDURE ReadName(VAR name : string);

VAR
  i : integer;
  ch : char;

BEGIN
  i := 0;
  name := '';   {initialize to the empty string}


  {Loop to read name characters until the field separator.}
  REPEAT
    IF NOT eoln THEN BEGIN
      read(ch);  {name character}
     // writeln(' CHARACTER IS: ', ch);
      IF ch <> NAME_SEPARATOR THEN name := name + ch;
    END;
  UNTIL eoln OR (ch = NAME_SEPARATOR);
END;

///////////////////////////////////////////////////////////////////////////////////////////////////
PROCEDURE ReadPresidents;

VAR
  i : integer;
  count : integer;
  ch: char;


BEGIN
  read(i);  {reads start year}

  {Read to the end sentinel or until MAX_RECORDS have been read.}
  WHILE (i > 0) AND (count < MAX_RECORDS) DO BEGIN
    count := count + 1;

        WITH presidents[count] DO BEGIN
          startYear := i;
          read(i);
          endYear := i;
          read(ch); //dispose of first blank space
          ReadName(firstName);
          //writeln(' FIRST IS: ', firstName);
          ReadName(middleName);
          // writeln(' MID IS: ', middleName);
          ReadName(lastName);
           //writeln(' LAST IS: ', lastName);
          IF(lastName = '') THEN //check to make see if there is a last name
            BEGIN
              lastName := middleName; //if no last name, it means last was stored in middle name
              middleName := ''; //clear the middle name
             // writeln(' WE ARE HERE: ');
            
            END;
        END;
    readln;   {finish input line}
    read(i);  {next President id}
    END;

  presidentCount := count;
  
  
    read(i);  {reads next line}
    WHILE (i > 0) DO BEGIN
        //writeln(i, ' INCOMING');
        toPrint[printCount] := i; //store in the counter
        printCount:= printCount + 1; //increment counter
        read(i);
        //writeln(i, ' INCOMING 2');
    END;

END;

{Sort the Presidental records by President Year.}
PROCEDURE SortPresidents;

VAR
  i, j : integer;
  temp : PresidentRec;

BEGIN //simple bubble sort
  FOR i := 1 TO presidentCount-1 DO BEGIN
    FOR j := i+1 TO presidentCount DO BEGIN
      IF presidents[i].startYear > presidents[j].startYear THEN 
        BEGIN
          temp         := presidents[i];
          presidents[i] := presidents[j];
          presidents[j] := temp;
        END;
    END;
  END;
END;

{Print the President records.}
PROCEDURE PrintAllPresidents;

VAR
  i : integer;

BEGIN
  FOR i := 1 TO presidentCount DO BEGIN
    writeln;

    WITH presidents[i] DO BEGIN
      writeln(' Start Year: ', startYear);
      writeln('   End Year: ', endYear);
      writeln('  Last name: ', lastName);
      writeln('Middle name: ', middleName);
      writeln(' First name: ', firstName);
    END;
  END;

  writeln;
  writeln(presidentCount:1, ' presidents read.');
END;
/////////////////
{Print the President records.}
PROCEDURE PrintSelectPresidents;

VAR
  i : integer;
  j : integer;
  c : integer;

BEGIN
//writeln('PRNT CNT: ',printCount);
  FOR i := 0 TO printCount-1 DO BEGIN //for each desired year
    writeln();
    writeln('FOR YEAR: ', toPrint[i]);
    FOR j := 1 TO presidentCount DO BEGIN //for each possible president
   
    //(toPrint[i] <= presidents[j].endYear);
    if(toPrint[i] <= presidents[j].endYear) AND (toPrint[i] >= presidents[j].startYear) THEN
        BEGIN
            WITH presidents[j] DO BEGIN
              //writeln(' Start Year: ', startYear);
              //writeln('   End Year: ', endYear);
              writeln('  Last name: ', lastName);
              if NOT(middleName = '') THEN
                writeln('Middle name: ', middleName);
              writeln(' First name: ', firstName);
            END;
        writeln;
        c := c + 1;    
        END;

    
    END;
    if (c = 0) then
        writeln('no match');
    c := 0;

    writeln('=======================================');
  END;

  writeln;
 
END;



BEGIN {President Listings}

  ReadPresidents;
  SortPresidents;
  PrintSelectPresidents;
  //PrintAllPresidents;
END.