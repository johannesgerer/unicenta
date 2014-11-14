// -*- mode: java; -*-

// test with
// echo -n 100*3 | grun Expr expr -tree

grammar Sales;

lines: (line)+ ;
line:  amount? price ArticleKey
		|  article amount? price Enter;

amount: INT '*' ;
article: INT '/' ;
price returns [int result] : INT {$result = $INT.int;}  ;

INT : [0-9]+ ; 
Enter: [\r\n]+ ;

ArticleKey: [a-zA-Z] ;


// Local Variables:
// compile-command: "antlr4 -o source/com/openbravo/pos/sales  -package com.openbravo.pos.sales Sales.g4 && javac -cp /usr/share/java/antlr-complete.jar  Sales*.java"
// End:
