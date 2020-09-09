import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestTermWithoutCoefficient {

    @Test
    public void testPlusOnTwoSimpleTermsWithSameSymbol() {
        var two_x = new TermWithoutCoefficient('x', 2, 1);
        var x = new TermWithoutCoefficient('x');
        var sum = x.plus(two_x);
        assertTrue(sum instanceof TermWithoutCoefficient);
        assertEquals(((TermWithoutCoefficient) sum).getCoefficient(), 3);
    }

    @Test
    public void testPlusOnTwoSimpleTermsWithDifferentSymbols() {
        var x = new TermWithoutCoefficient('x');
        var y = new TermWithoutCoefficient('y');
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
    public void testPlusOnTwoSimpleTermsWithDifferentExponents() {
        var x = new TermWithoutCoefficient('x');
        var xSquared = new TermWithoutCoefficient('x', 1, 2);
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
    public void testPlusOnSumOfTerms() {
        var x = new TermWithoutCoefficient('x');
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(new TermWithoutCoefficient('y'));
        sumSet.add(new TermWithoutCoefficient('x', 2, 2));
        sumSet.add(new TermWithoutCoefficient('x', 3, 1));
        var sum = new SumOfTerms(sumSet);
        var expected_answer_set = new HashSet<CompositeTerm>();
        expected_answer_set.add(new TermWithoutCoefficient('y'));
        expected_answer_set.add(new TermWithoutCoefficient('x', 2, 2));
        expected_answer_set.add(new TermWithoutCoefficient('x', 4, 1));

        var answer = x.plus(sum);
        var also_answer = sum.plus(x);

        assertEquals(answer, also_answer);
        assertEquals(answer, new SumOfTerms(expected_answer_set));
    }

    @Test
    public void testEqualsReturnsTrueWhenAppropriate() {
        var x = new TermWithoutCoefficient('x');
        var also_x = new TermWithoutCoefficient('x', 1, 1);
        assertEquals(x, also_x);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenTermsWithDifferentSymbols() {
        var x = new TermWithoutCoefficient('x');
        var y = new TermWithoutCoefficient('y');
        assertNotEquals(x, y);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenTermsWithDifferentExponents() {
        var x = new TermWithoutCoefficient('x');
        var x_squared = new TermWithoutCoefficient('x', 1, 2);
        assertNotEquals(x, x_squared);
    }
    @Test
    public void testEqualsReturnsFalseWhenGivenDifferentQuantities() {
        var x = new TermWithoutCoefficient('x');
        var two_x = new TermWithoutCoefficient('x', 2, 1);
        assertNotEquals(x, two_x);
    }
}
