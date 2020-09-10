import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestCompositeTerm {
    @Test
    public void testMultiplyReturnsCorrectTermWithCoefficientWhenGivenTwoTermWithCoefficientsWithSameSymbol() {
        var term1 = new TermWithCoefficient('x', 2, 3);
        var term2 = new TermWithCoefficient('x', 5, 6);
        var expected_result = new TermWithCoefficient('x', 10, 9);
        var actual_result = term1.multiply(term2);
        var also_actual_result = term2.multiply(term1);
        assertEquals(expected_result, actual_result);
        assertEquals(expected_result, also_actual_result);
    }

    @Test
    public void testMultiplyReturnsCorrectProductOfTermsWhenGivenTwoTermWithCoefficientsWithDifferentSymbols() {
        var term1 = new TermWithCoefficient('x', 2, 3);
        var term2 = new TermWithCoefficient('y', 5, 6);
        var expected_set = new HashSet<SimpleTerm>();
        expected_set.add(new SimpleTerm('x', 3));
        expected_set.add(new SimpleTerm('y', 6));
        var expected_result = new ProductOfTerms(expected_set, 10);
        var actual_result = term1.multiply(term2);
        var also_actual_result = term2.multiply(term1);
        assertEquals(expected_result, actual_result);
        assertEquals(expected_result, also_actual_result);
    }

    @Test
    public void TestMultiplyReturnsCorrectAnswerWhenGivenProductOfTermsAndTermWithCoefficient() {
        var term1 = new TermWithCoefficient('x', 2, 3);
        var term2set = new HashSet<SimpleTerm>();
        term2set.add(new SimpleTerm('y'));
        term2set.add(new SimpleTerm('x'));
        term2set.add(new SimpleTerm('z', 2));
        var term2 = new ProductOfTerms(term2set, 1);
        var expectedset = new HashSet<SimpleTerm>();
        expectedset.add(new SimpleTerm('y'));
        expectedset.add(new SimpleTerm('x', 4));
        expectedset.add(new SimpleTerm('z', 2));
        var expectedResult = new ProductOfTerms(expectedset, 2);
        var actualResult = term1.multiply(term2);
        var alsoActualResult = term2.multiply(term1);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult, alsoActualResult);
    }
}