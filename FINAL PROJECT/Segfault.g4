grammar Segfault;

@header {
    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;
}


//STARTPGM : '{' ;
program           :  (statement NEWLINE+)+  ;

statement:  assignmentStatement
            
            | ifStatement
           |  whileStatement
            // |printStatement
            // |commentStatement
            ;

assignmentStatement locals [ Typespec type = null, SymtabEntry entry = null ] 
                    :  boolIdentifier '=' booleanExpression | numIdentifier '=' numericalExpression; 
ifStatement:   IF '(' booleanExpression ')' '{' statement+ '}' ELSE '{' statement+ '}'; // or ()
whileStatement : WHILE '(' booleanExpression ')' '{' statement'}';
//printStatement : ;



numericalExpression : term (addOp term)*;
term : factor (mulOp factor)*;
factor : '(' numericalExpression ')' | numberConstant | numIdentifier;

numIdentifier : numSymbol IDENTIFIER;
numSymbol    : '#';


booleanExpression : booleanTerm (boolOp booleanTerm)?
                    | numericalExpression relOp numericalExpression;

booleanTerm: '(' booleanExpression ')' | booleanSingleton;

booleanSingleton :  notSymbol booleanExpression
                    | boolIdentifier
                    | booleanConstant;

boolIdentifier : boolSymbol IDENTIFIER;
boolSymbol    : '$';

notSymbol : '!';
orSymbol : '|';
andSymbol : '&';



relOp : '==' | '<>' | '<' | '<=' | '>' | '>=' ;
boolOp : andSymbol | orSymbol;

addOp : '+' | '-' | ;  // basic arithmatic operations
mulOp : '*' | '/' | ; // basic arithmatic operations

fragment A : ('a' | 'A') ;
fragment B : ('b' | 'B') ;
fragment C : ('c' | 'C') ;
fragment D : ('d' | 'D') ;
fragment E : ('e' | 'E') ;
fragment F : ('f' | 'F') ;
fragment G : ('g' | 'G') ;
fragment H : ('h' | 'H') ;
fragment I : ('i' | 'I') ;
fragment J : ('j' | 'J') ;
fragment K : ('k' | 'K') ;
fragment L : ('l' | 'L') ;
fragment M : ('m' | 'M') ;
fragment N : ('n' | 'N') ;
fragment O : ('o' | 'O') ;
fragment P : ('p' | 'P') ;
fragment Q : ('q' | 'Q') ;
fragment R : ('r' | 'R') ;
fragment S : ('s' | 'S') ;
fragment T : ('t' | 'T') ;
fragment U : ('u' | 'U') ;
fragment V : ('v' | 'V') ;
fragment W : ('w' | 'W') ;
fragment X : ('x' | 'X') ;
fragment Y : ('y' | 'Y') ;
fragment Z : ('z' | 'Z') ;



PROGRAM   : P R O G R A M ;
CONST     : C O N S T ;
TYPE      : T Y P E ;
OF        : O F ;
VAR       : V A R ;
BEGIN     : B E G I N ;
END       : E N D ;
DIV       : D I V ; // ?
AND       : A N D ;
OR        : O R ;
NOT       : N O T ;
 IF        : I F  ;
THEN      : T H E N ;
ELSE      : E L S E ;
UNTIL     : U N T I L ;
// while     : W H I L E ;
TRUE      : T R U E;
FALSE     : F A L S E;
DO        : D O ;
PRINTLN   : P R I N T L N;
PROCEDURE : P R O C E D U R E ;
FUNCTION  : F U N C T I O N ;
WHILE  : W H I L E ;





COMMENT : '{' COMMENT_CHARACTER* '}' -> skip ;// todo: change the symbol to "~"

fragment COMMENT_CHARACTER : ~('}') ;


/////////////////VALUES///////////////////

booleanConstant: TRUE | FALSE ; //see boolean values
numberConstant  : sign? unsignedNumber ;
unsignedNumber  : unsignedintegerConstant | unsigneddoubleConstant ;
unsignedintegerConstant : INTEGER ;
unsigneddoubleConstant    : DOUBLE;

sign: '-';// do we need +?

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
LETTER     : [a-zA-Z]+;
INTEGER    : [0-9]+ ;
DOUBLE     : [0-9]*'.'[0-9]+ ;// format? 9.991.23 or try INTEGER '.' INTEGER

NEWLINE : '\r'? '\n';
WS      : [ \t]+ -> skip ;