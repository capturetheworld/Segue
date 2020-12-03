grammar Segfault;

@header {
    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;
}


//STARTPGM : '{' ;
program           :  statement+  ;

statement:  assignmentStatement
            | ifStatement
            | whileStatement
            | printStatement
            ;

assignmentStatement locals [ Typespec type = null, SymtabEntry entry = null ] 
                    :  boolIdentifier '=' booleanExpression | numIdentifier '=' numericalExpression; 
ifStatement:   IF '(' booleanExpression ')' '{' statement+ '}' ELSE '{' statement+ '}'; // or ()
whileStatement : WHILE '(' booleanExpression ')' '{' statement'}';
printStatement : PRINT printArguments;
printArguments : '(' statement+')';
synthStatement : SYNTH '.' synthFunction;
synthFunction : synthSetFunction
                | synthChannelFunction
                | synthNoteFunction
                | synthStartFunction;





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


synthSetFunction : SET '(' numericalExpression ')';
synthChannelFunction : CHANNEL '[' numericalExpression ']' '.' SET '(' numericalExpression ')';
synthNoteFunction : NOTE '[' numericalExpression ']' '.' (synthNoteSet | synthNoteLerp);
synthStartFunction : START '(' ')';
synthNoteSet : SET '(' (numericalExpression ',')? numericalExpression (',' synthPointStatement)? ')';
synthNoteLerp : LERP '(' numericalExpression (',' synthPointStatement)? ')';
synthPointStatement: '{' (synthMidiPitch | numericalExpression)? (',' synthVolume)?  (',' synthVibratoAmplitude)? (',' synthVibratoFrequency)? '}';
synthMidiPitch : 'm' numericalExpression;
synthVolume : 'v' numericalExpression;
synthVibratoAmplitude : 'a' numericalExpression;
synthVibratoFrequency : 'f' numericalExpression;




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





TYPE      : T Y P E ;
OF        : O F ;
VAR       : V A R ;
AND       : A N D ;
OR        : O R ;
NOT       : N O T ;
 IF        : I F  ;
THEN      : T H E N ;
ELSE      : E L S E ;
UNTIL     : U N T I L ;
TRUE      : T R U E;
FALSE     : F A L S E;
PRINT   : P R I N T;
FUNC  : F U N C ;
WHILE  : W H I L E ;
SYNTH : S Y N T H;
SET : S E T;
CHANNEL : C H A N N E L;
NOTE : N O T E;
LERP : L E R P;
START : S T A R T;





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

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ;