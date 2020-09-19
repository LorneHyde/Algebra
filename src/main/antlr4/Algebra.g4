grammar Algebra;

algebraicExpression: '-'? potentiallyComplicatedProduct(('-'|'+') potentiallyComplicatedProduct)*;

potentiallyComplicatedProduct: (
    simpleFullyFactorisedExpression
    |'(' potentiallyComplicatedProduct ')'
    | '(' algebraicExpression ')'
    | expressionInBracketsWithPotentialPower 
    )+;
expressionInBracketsWithPotentialPower: '(' expressionWithoutNestedBrackets ')' ('^' '-'? POSITIVE_INT)? ;
expressionWithoutNestedBrackets: '-'? (sumofterms | simpleFullyFactorisedExpression | compositeterm)
    ( ('-'|'+') (sumofterms | simpleFullyFactorisedExpression | compositeterm))* ;
simpleFullyFactorisedExpression: (sumInBracketsPossiblyWithPower | compositeterm) sumInBracketsPossiblyWithPower* ;
sumInBracketsPossiblyWithPower: '(' sumofterms ')' ('^' '-'? POSITIVE_INT)? ;

sumofterms: '-' (startTerm = compositeterm) termInSum+ #sumOfTermsFirstTermNegative
 | (startTerm = compositeterm) termInSum+ #sumOfTermsFirstTermPositive
 ;

termInSum: (op = ('-' | '+')) compositeterm;

compositeterm: coefficient simpleterm ('*'? simpleterm)* #withCoefficient
    | coefficient #simpleNumber
    | simpleterm ('*'? simpleterm)* #withoutCoefficient
    ;

coefficient: POSITIVE_INT;

simpleterm: CHAR #withoutExponent
    | CHAR '^' POSITIVE_INT #withPositiveExponent
    | CHAR '^' '-' POSITIVE_INT #withNegativeExponent
    ;

MUL :   '*' ;
ADD :   '+' ;
POWER: '^';
SUB: '-' ;
POSITIVE_INT: [0-9]+;
CHAR: [a-z];
WS: (' ' | [\t\r\n])+ -> skip;