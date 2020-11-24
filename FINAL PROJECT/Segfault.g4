grammar Segfault;

@header {
    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;
}


//STARTPGM : '{' ;
program           :  statement+  ;


// ENDPGM : '}' ;
//programHeader     : programIdentifier programParameters? ';' ; 
//programParameters : '(' IDENTIFIER ( ',' IDENTIFIER )* ')' ;   //not sure about this part

//rogramIdentifier   locals [ SymtabEntry entry = null ]
    //: IDENTIFIER ;


	// ♪♬(1)
	// music: '♬' | NOTE;
	// NOTE: N O T E;

	// A: 'a' | 'A';
	// EXPRESSION: E|e X|x P|p R E S S I O N;



statement:  assignmentStatement
            |ifStatement
            |whileStatement
            |printStatement
            |commentStatement
            ;

assignmentStatement :  booleanassignment |  doubleassignment; 
ifStatement:  ;
whileStatement : ;
printStatement : ;


left locals [Typespec type = null] : var;
var            locals [ Typespec type = null, SymtabEntry entry = null ] 
    : '$' varIdentifier expression ;  // e.g. $x = 4 
varIdentifier : IDENTIFIER;


numberConstant  : sign? unsignedNumber ;
unsignedNumber  : unsignedDouble | unsignedInteger ;
unsignedDouble  : DOUBLE; //see double values
unsignedInteger : INTEGER; //see integer values
booleanConstant: BOOLEAN ; //see boolean values


/////////////////VALUES///////////////////
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]+ ;
LETTER     : [a-zA-Z]+;
INTEGER    : [0-9]+ ;
DOUBLE     : [0-9]*'.'[0-9]+ ;// format? 9.991.23
BOOLEAN    : [true|false];  
VARTYPE    : '$' | '#';



relOp : '=' | '<>' | '<' | '<=' | '>' | '>=' ;
//addOp : '+' | '-' | ;  // basic arithmatic operations
//mulOp : '*' | '/' | ; // basic arithmatic operations


op:'+' | '-' |'*' | '/' ;


sign: '-';// do we need +?

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
if        : I F  ;
THEN      : T H E N ;
else      : E L S E ;
UNTIL     : U N T I L ;
while     : W H I L E ;
true      : T R U E; //for booleanConstant
false   : F A L S E;//for booleanConstant
DO        : D O ;
println   : P R I N T L N;
PROCEDURE : P R O C E D U R E ;
FUNCTION  : F U N C T I O N ;
WHILE  : W H I L E ;



//BOOLEAN : // ?

//QUOTE     : '\'' ;

//STRING    : QUOTE STRING_CHAR* QUOTE ;

// fragment CHARACTER_CHAR : ~('\'')   // any non-quote character
//                         ;

// fragment STRING_CHAR : QUOTE QUOTE  // two consecutive quotes
//                      | ~('\'')      // any non-quote character
//                      ;

COMMENT : '{' COMMENT_CHARACTER* '}' -> skip ;// todo: change the symbol to "~"

fragment COMMENT_CHARACTER : ~('}') ;