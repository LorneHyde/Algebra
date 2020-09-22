package algebra;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMultiplyForCompositeTerm {
    @Test
    public void testMultiplyReturnsCorrectTermWhenGivenTwoSingleVariableTermsWithSameSymbol() {
        var term1 = new CompositeTerm('x', 2, 3);
        var term2 = new CompositeTerm('x', 5, 6);
        var expected_result = new CompositeTerm('x', 10, 9);

        var actual_result = term1.multiply(term2);
        var also_actual_result = term2.multiply(term1);

        assertEquals(expected_result, actual_result);
        assertEquals(expected_result, also_actual_result);
    }

    @Test
    public void testMultiplyReturnsCorrectTermsWhenGivenTwoSingleVariableTermsWithDifferentSymbols() {
        var term1 = new CompositeTerm('x', 2, 3);
        var term2 = new CompositeTerm('y', 5, 6);
        var expected_set = new HashSet<SimpleTerm>();
        expected_set.add(new SimpleTerm('x', 3));
        expected_set.add(new SimpleTerm('y', 6));
        var expected_result = new CompositeTerm(expected_set, 10);
        var actual_result = term1.multiply(term2);
        var also_actual_result = term2.multiply(term1);
        assertEquals(expected_result, actual_result);
        assertEquals(expected_result, also_actual_result);
    }

    @Test
    public void testMultiplyReturnsCorrectNumberWhenGivenTwoSingleVariableTermsWithSameSymbolOppositeExponents() {
        var xSquared = new CompositeTerm('x', 1, 2);
        var three_xToThePowerOfMinus2 = new CompositeTerm('x', 3, -2);
        var three = new CompositeTerm(3);
        var shouldBeThree = xSquared.multiply(three_xToThePowerOfMinus2);
        var alsoShouldBeThree = three_xToThePowerOfMinus2.multiply(xSquared);
        assertEquals(three, shouldBeThree);
        assertEquals(three, alsoShouldBeThree);
    }

    @Test
    public void TestMultiplyReturnsCorrectAnswerWhenGivenSingleVariableTermAndMultiVariableTerm() {
        var term1 = new CompositeTerm('x', 2, 3);
        var term2set = new HashSet<SimpleTerm>();
        term2set.add(new SimpleTerm('y'));
        term2set.add(new SimpleTerm('x'));
        term2set.add(new SimpleTerm('z', 2));
        var term2 = new CompositeTerm(term2set, 1);
        var expectedset = new HashSet<SimpleTerm>();
        expectedset.add(new SimpleTerm('y'));
        expectedset.add(new SimpleTerm('x', 4));
        expectedset.add(new SimpleTerm('z', 2));
        var expectedResult = new CompositeTerm(expectedset, 2);
        var actualResult = term1.multiply(term2);
        var alsoActualResult = term2.multiply(term1);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult, alsoActualResult);
    }

    @Test
    public void TestMultiplyWhenGivenTwoMultiVariableTerms() {
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
        var product1 = new CompositeTerm(termSet1, 2);
        var product2 = new CompositeTerm(termSet2, 3);
        var expectedProduct = new CompositeTerm(expectedTermSet, 6);
        var actualResult = product1.multiply(product2);
        var alsoActualResult = product2.multiply(product1);
        assertEquals(expectedProduct, actualResult);
        assertEquals(expectedProduct, alsoActualResult);
    }

    @Test
    public void testMultiplyWhenGivenNumber() {
        var x = new CompositeTerm('x');
        var two = new CompositeTerm(2);
        var expectedResult = new CompositeTerm('x', 2, 1);
        var product = x.multiply(two);
        var alsoProduct = two.multiply(x);
        assertEquals(expectedResult, product);
        assertEquals(expectedResult, alsoProduct);
    }

    @Test
    public void testMultiplyOnTwoNumbers() {
        var three = new CompositeTerm(3);
        var five = new CompositeTerm(5);
        var fifteen = new CompositeTerm(15);
        var three_times_five = three.multiply(five);
        var five_times_three = five.multiply(three);
        assertEquals(fifteen, three_times_five);
        assertEquals(fifteen, five_times_three);
    }
}
