import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestProductOfTerms {
    @Test
    public void testPlusWhenGivenComparableTerm() {
        var termSet = new HashSet<SimpleTerm>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 2));
        var product1 = new ProductOfTerms(termSet, 1);
        var product2 = new ProductOfTerms(termSet, 3);
        var sum = product1.plus(product2);
        assertEquals(new ProductOfTerms(termSet, 4), sum);
    }

    @Test
    public void testPlusWhenGivenSimpleTerm() {
        var termSet = new HashSet<TermWithCoefficient>();
        termSet.add(new TermWithCoefficient('x'));
        termSet.add(new TermWithCoefficient('y', 1, 2));
        var product1 = new ProductOfTerms(termSet);
        var simpleTerm = new TermWithCoefficient('x');
        var sum = product1.plus(simpleTerm);
        var expectedTermSet = new HashSet<CompositeTerm>();
        expectedTermSet.add(product1);
        expectedTermSet.add(simpleTerm);
        var expected_answer = new SumOfTerms(expectedTermSet);
        assertEquals(sum, expected_answer);
    }

    @Test
    public void testPlusWhenGivenIncomparableProduct() {
        var termSet1 = new HashSet<TermWithCoefficient>();
        termSet1.add(new TermWithCoefficient('x'));
        termSet1.add(new TermWithCoefficient('y', 1, 2));
        var termSet2 = new HashSet<TermWithCoefficient>();
        termSet2.add(new TermWithCoefficient('x'));
        termSet2.add(new TermWithCoefficient('y', 1, 3));
        var product1 = new ProductOfTerms(termSet1);
        var product2 = new ProductOfTerms(termSet2);
        var sum = product1.plus(product2);
        var expectedTermSet = new HashSet<CompositeTerm>();
        expectedTermSet.add(product1);
        expectedTermSet.add(product2);
        var expected_answer = new SumOfTerms(expectedTermSet);
        assertEquals(sum, expected_answer);
    }
}