import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestProductOfTerms {
    @Test
    public void testPlusWhenGivenComparableTerm() {
        var termSet = new HashSet<Term>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 1, 2));
        var product1 = new ProductOfTerms(termSet);
        var product2 = new ProductOfTerms(termSet, 3);
        var sum = product1.plus(product2);
        assertEquals(sum, new ProductOfTerms(termSet, 4));
    }

    @Test
    public void testPlusWhenGivenSimpleTerm() {
        var termSet = new HashSet<Term>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 1, 2));
        var product1 = new ProductOfTerms(termSet);
        var simpleTerm = new SimpleTerm('x');
        var sum = product1.plus(simpleTerm);
        var expectedTermSet = new HashSet<Term>();
        expectedTermSet.add(product1);
        expectedTermSet.add(simpleTerm);
        var expected_answer = new SumOfTerms(expectedTermSet);
        assertEquals(sum, expected_answer);
    }

}