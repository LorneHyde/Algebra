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

    @Test
    public void TestMultiplyWhenGivenTwoProductsOfTerms() {
        var termSet1 = new HashSet<SimpleTerm>();
        termSet1.add(new SimpleTerm('w'));
        termSet1.add(new SimpleTerm('x', 2));
        termSet1.add(new SimpleTerm('y', 3));
        var termSet2 = new HashSet<SimpleTerm>();
        termSet2.add(new SimpleTerm('x'));
        termSet2.add(new SimpleTerm('y', 8));
        termSet2.add(new SimpleTerm('z'));
        var expectedTermSet = new HashSet<SimpleTerm>();
        expectedTermSet.add(new SimpleTerm('w'));
        expectedTermSet.add(new SimpleTerm('x', 3));
        expectedTermSet.add(new SimpleTerm('y', 11));
        expectedTermSet.add(new SimpleTerm('z'));
        var product1 = new ProductOfTerms(termSet1, 2);
        var product2 = new ProductOfTerms(termSet2, 3);
        var expectedProduct = new ProductOfTerms(expectedTermSet, 6);
        var actualResult = product1.multiply(product2);
        var alsoActualResult = product2.multiply(product1);
        assertEquals(expectedProduct, actualResult);
        assertEquals(expectedProduct, alsoActualResult);
    }
}