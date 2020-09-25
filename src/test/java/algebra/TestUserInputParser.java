package algebra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserInputParser {
    @Test
    public void testSimplifyWhenGivenNonSimplifiedCompositeTerm() {
        AlgebraicExpression actualResult = UserInputParser.simplify("xyxz^2xz^2");
        AlgebraicExpression expectedResult = UserInputParser.simplify("yx^3z^4");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenNonSimplifiedExponent() {
        AlgebraicExpression actualResult = UserInputParser.simplify("xxxxxx");
        AlgebraicExpression expectedResult = new SumOfTerms(new CompositeTerm('x', 1, 6));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSimplifiedExpressionWithoutBrackets() {
        CompositeTerm x = new CompositeTerm('x');
        CompositeTerm y = new CompositeTerm('y');
        AlgebraicExpression expectedResult = x.plus(y);
        AlgebraicExpression actualResult = UserInputParser.simplify("x + y");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenNonSimplifiedSumWithoutBrackets() {
        SumOfTerms expectedResult = new SumOfTerms(new CompositeTerm('x', 2, 1));
        AlgebraicExpression actualResult = UserInputParser.simplify("x + x");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumRaisedToPower() {
        AlgebraicExpression expectedResult = UserInputParser.simplify("x^3 + 3x^2y + 3y^2x + y^3");
        AlgebraicExpression actualResult = UserInputParser.simplify("(x+y)^3");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumRaisedToZeroPower() {
        SumOfTerms expectedResult = new SumOfTerms(new CompositeTerm(1));
        AlgebraicExpression actualResult = UserInputParser.simplify("(x+1)^0");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenCompositeTermTimesSumOfTerms() {
        AlgebraicExpression expectedResult = UserInputParser.simplify("x^2 - 3x");
        AlgebraicExpression actualResult = UserInputParser.simplify("x(x-3)");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenPairOfNonNestedBrackets() {
        AlgebraicExpression expectedResult = UserInputParser.simplify("x^2 - y^2");
        AlgebraicExpression actualResult = UserInputParser.simplify("(x+y)(x-y)");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumContainingBracketsThatNeedExpanding() {
        SumOfTerms expectedResult = new SumOfTerms(new CompositeTerm('x', 1, 2));
        AlgebraicExpression actualResult = UserInputParser.simplify("(x+y)(x-y) + y^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenNestedPower() {
        SumOfTerms expectedResult = new SumOfTerms(new CompositeTerm('x', 1, 4));
        AlgebraicExpression actualResult = UserInputParser.simplify("((x+y)(x-y) + y^2)^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumWithBracketsThatShouldEvaluateToZero() {
        SumOfTerms expectedResult = new SumOfTerms(new CompositeTerm(0));
        AlgebraicExpression actualResult = UserInputParser.simplify("(x+1)^2 - (x+1)^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenComplicatedNestedExpression() {
        AlgebraicExpression expectedResult = UserInputParser.simplify("x^3 + x^2 + x + 1");
        AlgebraicExpression actualResult = UserInputParser.simplify("x(x(x+1)+1)+1");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSeveralZeroTermsWithDifferentSymbols() {
        SumOfTerms expectedResult = new SumOfTerms();
        AlgebraicExpression actualResult = UserInputParser.simplify("0x - 0y + 0xyz + 0");
        assertEquals(expectedResult, actualResult);
    }
}
