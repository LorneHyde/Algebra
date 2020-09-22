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
        var x = new CompositeTerm('x');
        var y = new CompositeTerm('y');
        var expectedResult = x.plus(y);
        var actualResult = UserInputParser.simplify("x + y");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenNonSimplifiedSumWithoutBrackets() {
        var expectedResult = new SumOfTerms(new CompositeTerm('x', 2, 1));
        var actualResult = UserInputParser.simplify("x + x");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumRaisedToPower() {
        var expectedResult = UserInputParser.simplify("x^3 + 3x^2y + 3y^2x + y^3");
        var actualResult = UserInputParser.simplify("(x+y)^3");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumRaisedToZeroPower() {
        var expectedResult = new SumOfTerms(new CompositeTerm(1));
        var actualResult = UserInputParser.simplify("(x+1)^0");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenCompositeTermTimesSumOfTerms() {
        var expectedResult = UserInputParser.simplify("x^2 - 3x");
        var actualResult = UserInputParser.simplify("x(x-3)");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenPairOfNonNestedBrackets() {
        var expectedResult = UserInputParser.simplify("x^2 - y^2");
        var actualResult = UserInputParser.simplify("(x+y)(x-y)");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumContainingBracketsThatNeedExpanding() {
        var expectedResult = new SumOfTerms(new CompositeTerm('x', 1, 2));
        var actualResult = UserInputParser.simplify("(x+y)(x-y) + y^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenNestedPower() {
        var expectedResult = new SumOfTerms(new CompositeTerm('x', 1, 4));
        var actualResult = UserInputParser.simplify("((x+y)(x-y) + y^2)^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSumWithBracketsThatShouldEvaluateToZero() {
        var expectedResult = new SumOfTerms(new CompositeTerm(0));
        var actualResult = UserInputParser.simplify("(x+1)^2 - (x+1)^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenComplicatedNestedExpression() {
        var expectedResult = UserInputParser.simplify("x^3 + x^2 + x + 1");
        var actualResult = UserInputParser.simplify("x(x(x+1)+1)+1");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSimplifyWhenGivenSeveralZeroTermsWithDifferentSymbols() {
        var expectedResult = new SumOfTerms();
        var actualResult = UserInputParser.simplify("0x - 0y + 0xyz + 0");
        assertEquals(expectedResult, actualResult);
    }
}
