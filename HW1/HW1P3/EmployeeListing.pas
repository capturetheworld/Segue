{ Sample Pascal Program. }
{ R. Mak }

PROGRAM EmployeeListing(output);

CONST
  MAX_EMPLOYEES   = 100;
  NAME_SEPARATOR  = ',';

TYPE
  CodeChar = 'A'..'Z';
  CodeSet = SET OF CodeChar;
  ProfessionEnum = (SCIENTIST, TEACHER, UNKNOWN);

  EmployeeRec = RECORD
    id : integer;
    jobCode : CodeChar;
    lastName : string;
    firstName : string;
    profession : ProfessionEnum;
  END;

VAR
  employeeCount : integer;
  employees : ARRAY [1..MAX_EMPLOYEES] OF EmployeeRec;
  scientistCodes, teacherCodes : CodeSet;  {initialized in main}

{Read and return the job code.}
FUNCTION ReadJobCode : CodeChar;

VAR
  ch : char;

BEGIN
  read(ch);  {skip blank}
  read(ch);  {job code}
  ReadJobCode := ch;
END;

{Read a first or last name and return it by reference.}
PROCEDURE ReadName(VAR name : string);

VAR
  i : integer;
  ch : char;

BEGIN
  i := 0;
  name := '';   {initialize to the empty string}
  read(ch);     {skip blank}

  {Loop to read name characters until the field separator.}
  REPEAT
    IF NOT eoln THEN BEGIN
      read(ch);  {name character}
      IF ch <> NAME_SEPARATOR THEN name := name + ch;
    END;
  UNTIL eoln OR (ch = NAME_SEPARATOR);
END;

{Determine the employee's profession based on the job code.}
FUNCTION DetermineProfession(jobCode : CodeChar) : ProfessionEnum;

BEGIN
  IF jobCode IN scientistCodes THEN BEGIN
    DetermineProfession := SCIENTIST;
  END
  ELSE IF jobCode IN teacherCodes THEN BEGIN
    DetermineProfession := TEACHER;
  END
  ELSE BEGIN
    DetermineProfession := UNKNOWN;
  END;
END;

{Read the employee records.}
PROCEDURE ReadEmployees;

VAR
  i : integer;
  count : integer;

BEGIN
  read(i);  {first employee id}

  {Read to the end sentinel or until MAX_EMPLOYEES have been read.}
  WHILE (i > 0) AND (count < MAX_EMPLOYEES) DO BEGIN
    count := count + 1;

    WITH employees[count] DO BEGIN
      id := i;
      jobCode := ReadJobCode;
      ReadName(lastName);
      ReadName(firstName);
      profession := DetermineProfession(jobCode);
    END;

    readln;   {finish input line}
    read(i);  {next employee id}
  END;

  employeeCount := count;
END;

{Sort the employee records by employee ID.}
PROCEDURE SortEmployees;

VAR
  i, j : integer;
  temp : EmployeeRec;

BEGIN
  FOR i := 1 TO employeeCount-1 DO BEGIN
    FOR j := i+1 TO employeeCount DO BEGIN
      IF employees[i].id > employees[j].id THEN BEGIN
        temp         := employees[i];
        employees[i] := employees[j];
        employees[j] := temp;
      END;
    END;
  END;
END;

{Print the employee records.}
PROCEDURE PrintEmployees;

VAR
  i : integer;

BEGIN
  FOR i := 1 TO employeeCount DO BEGIN
    writeln;

    WITH employees[i] DO BEGIN
      writeln('        Id: ', id);
      writeln('  Job code: ', jobCode);
      writeln(' Last name: ', lastName);
      writeln('First name: ', firstName);

      write('Profession: ');
      CASE profession OF
        SCIENTIST: writeln('scientist');
        TEACHER:   writeln('teacher');
        UNKNOWN:   writeln('unknown');
      END;
    END;
  END;

  writeln;
  writeln(employeeCount:1, ' employees read.');
END;

BEGIN {EmployeeListing}
  scientistCodes := ['B', 'C', 'P'];
  teacherCodes   := ['E', 'H', 'U'];

  ReadEmployees;
  SortEmployees;
  PrintEmployees;
END.