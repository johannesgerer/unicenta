// -*- mode: java; -*-

// test with
// echo -n 100*3 | grun Expr expr -tree

grammar Expr;		
prog:	(expr NEWLINE)* ;
expr:	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT
    |	'(' expr ')'
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;

// Local Variables:
// compile-command: "antlr4 Expr.g4 && javac -cp /usr/share/java/antlr-complete.jar Expr*.java"
// End:
