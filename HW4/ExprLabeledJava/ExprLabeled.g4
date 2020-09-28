grammar ExprLabeled;

program: statement+ ;

statement : expr NEWLINE                # print
          | IDENTIFIER '=' expr NEWLINE # assign
          | NEWLINE                     # empty
          ;

expr : expr op=('*'|'/') expr   # mulDiv
     | expr op=('+'|'-') expr   # addSub
     | INTEGER                  # int
     | IDENTIFIER               # id
     | '(' expr ')'             # parens
     ;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

IDENTIFIER : [a-zA-Z]+ ; 
INTEGER    : [0-9]+ ;
NEWLINE    : '\r'? '\n' ;

WS : [ \t]+ -> skip ;
