import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestSimpleTerm {

    @Test
    public void testPlusOnTwoSimpleTermsWithSameSymbol() throws Throwable {
        var two_x = new SimpleTerm('x', 2, 1);
        var x = new SimpleTerm('x');
        var sum = x.plus(two_x);
        assertTrue(sum instanceof SimpleTerm);
        assertEquals(((SimpleTerm) sum).getQuantity(), 3);
    }

    @Test
    public void testPlusOnTwoSimpleTermsWithDifferentSymbols() throws Throwable {
        var x = new SimpleTerm('x');
        var y = new SimpleTerm('y');
        var sum = x.plus(y);
        HashSet<Term> termList;
        if (sum instanceof SumOfTerms) {
            termList = ((SumOfTerms) sum).getSet();
        }
        else termList = null;
        assertTrue(sum instanceof SumOfTerms);
        assertTrue((termList.contains(x) && termList.contains(y) && termList.size() == 2));
    }

    @Test
    public void testPlusOnTwoSimpleTermsWithDifferentExponents() throws Throwable {
        var x = new SimpleTerm('x');
        var xSquared = new SimpleTerm('x', 1, 2);
        var sum = x.plus(xSquared);

        HashSet<Term> termList;
        if (sum instanceof SumOfTerms) {
            termList = ((SumOfTerms) sum).getSet();
        }
        else termList = null;

        assertTrue(sum instanceof SumOfTerms);
        assertTrue((termList.contains(x) && termList.contains(xSquared) && termList.size() == 2));
    }

    @Test
    public void testPlusOnSumOfTerms() throws Throwable {
        var x = new SimpleTerm('x');
        var sumSet = new HashSet<Term>();
        sumSet.add(new SimpleTerm('y'));
        sumSet.add(new SimpleTerm('x', 2, 2));
        sumSet.add(new SimpleTerm('x', 3, 1));
        var sum = new SumOfTerms(sumSet);
        var expected_answer_set = new HashSet<Term>();
        expected_answer_set.add(new SimpleTerm('y'));
        expected_answer_set.add(new SimpleTerm('x', 2, 2));
        expected_answer_set.add(new SimpleTerm('x', 4, 1));

        var answer = x.plus(sum);
        var also_answer = sum.plus(x);

        assertEquals(answer, also_answer);
        assertEquals(answer, new SumOfTerms(expected_answer_set));
    }

    @Test
    public void testEqualsReturnsTrueWhenAppropriate() throws Throwable {
        var x = new SimpleTerm('x');
        var also_x = new SimpleTerm('x', 1, 1);
        assertEquals(x, also_x);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenTermsWithDifferentSymbols() throws Throwable {
        var x = new SimpleTerm('x');
        var y = new SimpleTerm('y');
        assertNotEquals(x, y);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenTermsWithDifferentExponents() throws Throwable {
        var x = new SimpleTerm('x');
        var x_squared = new SimpleTerm('x', 1, 2);
        assertNotEquals(x, x_squared);
    }
    @Test
    public void testEqualsReturnsFalseWhenGivenDifferentQuantities() throws Throwable {
        var x = new SimpleTerm('x');
        var two_x = new SimpleTerm('x', 2, 1);
        assertNotEquals(x, two_x);
    }
}
