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
            termList = ((SumOfTerms) sum).getSumSet();
        } else termList = null;
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
            termList = ((SumOfTerms) sum).getSumSet();
        } else termList = null;

        assertTrue(sum instanceof SumOfTerms);
        assertTrue((termList.contains(x) && termList.contains(xSquared) && termList.size() == 2));
    }

    @Test
    public void testPlusOnSingleVariableTermWithComparableSumOfTerms() {
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
    public void testPlusOnSingleVariableTermWithIncomparableSumOfTerms() {
        var x = new CompositeTerm('z');
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(new CompositeTerm('y'));
        sumSet.add(new CompositeTerm('x', 2, 2));
        sumSet.add(new CompositeTerm('x', 3, 1));
        var sum = new SumOfTerms(sumSet);
        var expected_answer_set = new HashSet<CompositeTerm>();
        expected_answer_set.add(new CompositeTerm('y'));
        expected_answer_set.add(new CompositeTerm('x', 2, 2));
        expected_answer_set.add(new CompositeTerm('x', 3, 1));
        expected_answer_set.add(new CompositeTerm('z'));

        var answer = x.plus(sum);
        var also_answer = sum.plus(x);

        assertEquals(new SumOfTerms(expected_answer_set), answer);
        assertEquals(new SumOfTerms(expected_answer_set), also_answer);
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
}

//TODO: Then add some method for multiplying a Term with a SumOfTerms, with appropriate test
//TODO: Work on bringing in GUI
//TODO: Any sort of fraction or division can then come in later if and only if I have time
