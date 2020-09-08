import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestSumOfTerms {

    @Test
    public void testPlusWhenGivenSumOfTerms() {
        var x = new SimpleTerm('x');
        var two_x_squared = new SimpleTerm('x',2,2);
        var x_squared = new SimpleTerm('x', 1, 2);
        var y = new SimpleTerm('y');
        var three_x_squared = new SimpleTerm('x', 3, 2);

        var termSet1 = new HashSet<Term>();
        termSet1.add(x);
        termSet1.add(two_x_squared);
        var termSet2 = new HashSet<Term>();
        termSet2.add(x_squared);
        termSet2.add(y);
        var expectedSet = new HashSet<Term>();
        expectedSet.add(three_x_squared);
        expectedSet.add(x);
        expectedSet.add(y);
        var sumOfTerms1 = new SumOfTerms(termSet1);
        var sumOfTerms2 = new SumOfTerms(termSet2);
        var expectedSum = new SumOfTerms(expectedSet);
        var actualSum = sumOfTerms1.plus(sumOfTerms2);

        assertEquals(expectedSum, actualSum);
    }
}