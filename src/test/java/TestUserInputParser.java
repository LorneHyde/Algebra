import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserInputParser {
    @Test
    public void testExpandBracketsWhenGivenSimplifiedExpressionWithoutBrackets() {
        var x = new CompositeTerm('x');
        var y = new CompositeTerm('y');
        var xPlusYSet = new HashSet<CompositeTerm>();
        xPlusYSet.add(x);
        xPlusYSet.add(y);
        var expectedResult = new SumOfTerms(xPlusYSet);
        var actualResult = UserInputParser.expandBrackets("x + y");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExpandBracketsWhenGivenNonSimplifiedSumWithoutBracket() {
        var expectedTerm = new CompositeTerm('x', 2, 1);
        var expectedSumSet = new HashSet<CompositeTerm>();
        expectedSumSet.add(expectedTerm);
        var expectedResult = new SumOfTerms(expectedSumSet);
        var actualResult = UserInputParser.expandBrackets("x + x");
        assertEquals(expectedResult, actualResult);
    }
}
