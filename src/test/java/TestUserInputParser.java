import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserInputParser {
    @Test
    public void testExpandBracketsWhenGivenSimplifiedExpressionWithoutBrackets() {
        var x = new CompositeTerm('x');
        var y = new CompositeTerm('y');
        var expectedResult = x.plus(y);
        var actualResult = UserInputParser.expandBrackets("x + y");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenNonSimplifiedSumWithoutBrackets() {
        var expectedResult = new SumOfTerms(new CompositeTerm('x', 2, 1));
        var actualResult = UserInputParser.expandBrackets("x + x");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenSumRaisedToPower() {
        var expectedResult = UserInputParser.expandBrackets("x^3 + 3x^2y + 3y^2x + y^3");
        var actualResult = UserInputParser.expandBrackets("(x+y)^3");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenCompositeTermTimesSumOfTerms() {
        var expectedResult = UserInputParser.expandBrackets("x^2 - 3x");
        var actualResult = UserInputParser.expandBrackets("x(x-3)");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenPairOfNonNestedBrackets(){
        var expectedResult = UserInputParser.expandBrackets("x^2 - y^2");
        var actualResult = UserInputParser.expandBrackets("(x+y)(x-y)");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenSumContainingBracketsThatNeedExpanding() {
        var expectedResult = new SumOfTerms(new CompositeTerm('x', 1, 2));
        var actualResult = UserInputParser.expandBrackets("(x+y)(x-y) + y^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenNestedPower(){
        var expectedResult = new SumOfTerms(new CompositeTerm('x', 1, 4));
        var actualResult = UserInputParser.expandBrackets("((x+y)(x-y) + y^2)^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenSumWithBracketsThatShouldEvaluateToZero() {
        var expectedResult = new SumOfTerms(new CompositeTerm(0));
        var actualResult = UserInputParser.expandBrackets("(x+1)^2 - (x+1)^2");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenComplicatedNestedExpression(){
        var expectedResult = UserInputParser.expandBrackets("x^3 + x^2 + x + 1");
        var actualResult = UserInputParser.expandBrackets("x(x(x+1)+1)+1");
        assertEquals(expectedResult, actualResult);
    }
}
