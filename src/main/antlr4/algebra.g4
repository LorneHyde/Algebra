grammar algebra;

algebraicExpression: potentiallyComplicatedProduct(('-'|'+') potentiallyComplicatedProduct)*;

potentiallyComplicatedProduct: (
    simpleFullyFactorisedExpression
    |'(' potentiallyComplicatedProduct ')'
    | '(' algebraicExpression ')'
    | expressionInBracketsWithPotentialPower 
    )+;
expressionInBracketsWithPotentialPower: '(' expressionWithoutNestedBrackets ')' ('^' '-'? POSITIVE_INT)? ;
expressionWithoutNestedBrackets: (sumofterms | simpleFullyFactorisedExpression | compositeterm)
    ( ('-'|'+') (sumofterms | simpleFullyFactorisedExpression | compositeterm))* ;
simpleFullyFactorisedExpression: (sumInBracketsPossiblyWithPower | compositeterm) sumInBracketsPossiblyWithPower* ;
sumInBracketsPossiblyWithPower: '(' sumofterms ')' ('^' '-'? POSITIVE_INT)? ;
sumofterms: compositeterm(('-'|'+') compositeterm)+ ;
compositeterm: coefficient | (coefficient? simpleterm ('*'? simpleterm)*);
coefficient: POSITIVE_INT;
simpleterm: CHAR ('^' '-'? POSITIVE_INT)?;

POSITIVE_INT: [0-9]+;
CHAR: [a-z];
WS: (' ' | [\t\r\n])+ -> skip;