import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestCompositeTerm {

    @Test
    public void testPlusOnTwoSingleVariableTermsWithSameSymbol() {
        var two_x = new CompositeTerm('x', 2, 1);
        var x = new CompositeTerm('x');
        var sum = x.plus(two_x);
        assertTrue(sum instanceof CompositeTerm);
        assertEquals(((CompositeTerm) sum).getCoefficient(), 3);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentSymbols() {
        var x = new CompositeTerm('x');
        var y = new CompositeTerm('y');
        var sum = x.plus(y);
        HashSet<CompositeTerm> termList;
        if (sum instanceof SumOfTerms) {
            termList = ((SumOfTerms) sum).getSet();
        }
        else termList = null;
        assertTrue(sum instanceof SumOfTerms);
        assertTrue((termList.contains(x) && termList.contains(y) && termList.size() == 2));
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentExponents() {
        var x = new CompositeTerm('x');
        var xSquared = new CompositeTerm('x', 1, 2);
        var sum = x.plus(xSquared);

        HashSet<CompositeTerm> termList;
        if (sum instanceof SumOfTerms) {
            termList = ((SumOfTerms) sum).getSet();
        }
        else termList = null;

        assertTrue(sum instanceof SumOfTerms);
        assertTrue((termList.contains(x) && termList.contains(xSquared) && termList.size() == 2));
    }

    @Test
    public void testPlusOnSingleVariableTermWithSumOfTerms() {
        var x = new CompositeTerm('x');
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(new CompositeTerm('y'));
        sumSet.add(new CompositeTerm('x', 2, 2));
        sumSet.add(new CompositeTerm('x', 3, 1));
        var sum = new SumOfTerms(sumSet);
        var expected_answer_set = new HashSet<CompositeTerm>();
        expected_answer_set.add(new CompositeTerm('y'));
        expected_answer_set.add(new CompositeTerm('x', 2, 2));
        expected_answer_set.add(new CompositeTerm('x', 4, 1));

        var answer = x.plus(sum);
        var also_answer = sum.plus(x);

        assertEquals(answer, also_answer);
        assertEquals(answer, new SumOfTerms(expected_answer_set));
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentSymbols() {
        var x = new CompositeTerm('x');
        var y = new CompositeTerm('y');
        assertNotEquals(x, y);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentExponents() {
        var x = new CompositeTerm('x');
        var x_squared = new CompositeTerm('x', 1, 2);
        assertNotEquals(x, x_squared);
    }
    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentQuantities() {
        var x = new CompositeTerm('x');
        var two_x = new CompositeTerm('x', 2, 1);
        assertNotEquals(x, two_x);
    }

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
    public void testPlusWhenGivenTwoComparableMultivariableTerms() {
        var termSet = new HashSet<SimpleTerm>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 2));
        var product1 = new CompositeTerm(termSet, 1);
        var product2 = new CompositeTerm(termSet, 3);
        var sum = product1.plus(product2);
        assertEquals(new CompositeTerm(termSet, 4), sum);
    }

    @Test
    public void testPlusWhenGivenSingleVariableTermAndMultiVariableTerm() {
        var termSet = new HashSet<SimpleTerm>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 2));
        var product1 = new CompositeTerm(termSet);
        var simpleTerm = new CompositeTerm('x');
        var sum = product1.plus(simpleTerm);
        var expectedTermSet = new HashSet<CompositeTerm>();
        expectedTermSet.add(product1);
        expectedTermSet.add(simpleTerm);
        var expected_answer = new SumOfTerms(expectedTermSet);
        assertEquals(sum, expected_answer);
    }

    @Test
    public void testPlusWhenGivenTwoIncomparableMultiVariableTerms() {
        var termSet1 = new HashSet<SimpleTerm>();
        termSet1.add(new SimpleTerm('x'));
        termSet1.add(new SimpleTerm('y', 2));
        var termSet2 = new HashSet<SimpleTerm>();
        termSet2.add(new SimpleTerm('x'));
        termSet2.add(new SimpleTerm('y', 3));
        var product1 = new CompositeTerm(termSet1);
        var product2 = new CompositeTerm(termSet2);
        var sum = product1.plus(product2);
        var expectedTermSet = new HashSet<CompositeTerm>();
        expectedTermSet.add(product1);
        expectedTermSet.add(product2);
        var expected_answer = new SumOfTerms(expectedTermSet);
        assertEquals(sum, expected_answer);
    }

}

//TODO: Incorporate other tests into same suite
//TODO: Then, rename these tests and rearrange them into an appropriate order
//TODO: Then commit!
//TODO: Then, put the functions in TestTerm into an appropriate order
//TODO: Then, add appropriate comments
//TODO: Then, fix AlgebraicExpression interface
//TODO: Then add some method for multiplying a Term with a SumOfTerms, with appropriate test
//TODO: Work on bringing in GUI
//TODO: Any sort of fraction or division can then come in later if and only if I have time
