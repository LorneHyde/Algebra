grammar Algebra;

algebraicExpression:
    '-' potentiallyComplicatedProduct(potentialyComplicatedProductWithSign)* #algebraicExpressionFirstTermNegative
    | potentiallyComplicatedProduct(potentialyComplicatedProductWithSign)* #algebraicExpressionFirstTermPositive
    ;

potentialyComplicatedProductWithSign: op=('-'|'+') potentiallyComplicatedProduct;

potentiallyComplicatedProduct: (potentiallyComplicatedFactor)+;

potentiallyComplicatedFactor:
    simpleFullyFactorisedExpression #potentiallyComplicatedFactorSFFE
    |'(' potentiallyComplicatedProduct ')' #potentiallyComplicatedProductInBrackets
    | '(' algebraicExpression ')' #algebraicExpressionInBrackets
    | expressionInBracketsWithPotentialPower #potentiallyComplicatedFactorEIBWPP
    ;

expressionInBracketsWithPotentialPower: '(' expressionWithoutNestedBrackets ')' #expressionInBracketsWONested
    | '(' expressionWithoutNestedBrackets ')' ('^' POSITIVE_INT) #expressionInBracketsPositivePowerWONested
    ;

expressionWithoutNestedBrackets: '-' simpleFullyFactorisedExpression (termInExprWithoutNestedBrackets)*
        #expressionWONestedStartingWithNegativeSFFE
    | sumofterms termInExprWithoutNestedBrackets* #expressionWONestedStartingWithSOT
    | simpleFullyFactorisedExpression termInExprWithoutNestedBrackets* #expressionWONestedStartingWithSFFE
    | compositeterm termInExprWithoutNestedBrackets* #expressionWONestedStartingWithCT
    ;

termInExprWithoutNestedBrackets: (op = ('-' | '+')) simpleFullyFactorisedExpression # sffeInExprWithoutNestedBrackets
    | '+' sumofterms #sotInExprWithoutNestedBrackets
    | '+' compositeterm #ctInExprWithoutNestedBrackets
    ;

simpleFullyFactorisedExpression: (sumInBracketsPossiblyWithPower | compositeterm) sumInBracketsPossiblyWithPower* ;

sumInBracketsPossiblyWithPower: '(' sumofterms ')' '^' POSITIVE_INT #sumInBracketsWithPower
 | '(' sumofterms ')' #sumInBracketsWithoutPower
 ;

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

SUB: '-' ;
PLUS: '+' ;
POSITIVE_INT: [0-9]+ ;
CHAR: [a-z] ;
WS: (' ' | [\t\r\n])+ -> skip ;