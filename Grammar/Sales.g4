// -*- mode: java; -*-

// test with
// echo -n 100*3 | grun Expr expr -tree

grammar Sales;

line:  completeLine
    |  article amount? price?
    |  asd;

asd: amount? price;

completeLine:  amount? price ArticleKey
		|  article amount? price Enter;

amount  returns [int result] : INT '*' {$result = $INT.int;};
article returns [int result] : INT '/' {$result = $INT.int;};
price   returns [int result] : INT {$result = $INT.int;};

INT : [0-9]+ ; 
Enter: [\r\n]+ ;  //the existence of this token will lead to the following wrong match without any error:
// '35\n' == (line (asd (price 35)))

ArticleKey: [a-zA-Z] ;


// Local Variables:
// compile-command: "antlr4 -o source/com/openbravo/pos/sales  -package com.openbravo.pos.sales Sales.g4 && javac -cp /usr/share/java/antlr-complete.jar  Sales*.java"
// End:
