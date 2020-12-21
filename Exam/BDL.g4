grammar BDL;

program : stmtList '.' ;
stmtList : stmt ( ';' stmt )* ;
 stmt : asgn | ;

 asgn : expr (rhs)+;
 rhs :'=' expr;
 expr : var  
        | '(' var '=' var ')' ;
 var : ID ;
 ID : [a-zA-Z][a-zA-Z0-9]* ;
 WS : [ \t\r\n]+ -> skip ;