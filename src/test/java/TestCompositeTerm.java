import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestCompositeTerm {
    private static final CompositeTerm zero = new CompositeTerm(0);
    private static final CompositeTerm one = new CompositeTerm(1);
    private static final CompositeTerm three = new CompositeTerm(3);
    private static final CompositeTerm four = new CompositeTerm(4);
    private static final CompositeTerm x = new CompositeTerm('x');
    private static final CompositeTerm two_x = new CompositeTerm('x', 2, 1);
    private static final CompositeTerm three_x = new CompositeTerm('x', 3, 1);
    private static final CompositeTerm xSquared = new CompositeTerm('x', 1, 2);
    private static final CompositeTerm y = new CompositeTerm('y');
    private static final CompositeTerm z = new CompositeTerm('z');
    private static final CompositeTerm xyCubed = get_xyCubed();
    private static final CompositeTerm xySquared = get_xySquared();
    private static final CompositeTerm three_xySquared = new CompositeTerm(xySquared.getSet(), 3);
    private static final CompositeTerm four_xySquared = new CompositeTerm(xySquared.getSet(), 4);

    private static final SumOfTerms x_plus_three = get_x_plus_three();
    private static final SumOfTerms x_plus_four = get_x_plus_four();
    private static final SumOfTerms x_plus_y = get_x_plus_y();
    private static final SumOfTerms y_plus_three_x = get_y_plus_three_x();
    private static final SumOfTerms y_plus_three_x_plus_three = get_y_plus_three_x_plus_three();
    private static final SumOfTerms x_plus_xSquared = get_x_plus_xSquared();
    private static final SumOfTerms y_plus_xSquared_plus_two_x = get_y_plus_xSquared_plus_two_x();
    private static final SumOfTerms y_plus_xSquared_plus_three_x = get_y_plus_xSquared_plus_three_x();
    private static final SumOfTerms y_plus_z_plus_xSquared_plus_three_x = get_y_plus_z_plus_xSquared_plus_two_x();
    private static final SumOfTerms x_plus_xySquared = get_x_plus_xySquared();
    private static final SumOfTerms xySquared_plus_xyCubed = get_xySquared_plus_xyCubed();

    private static SumOfTerms get_x_plus_y() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(x);
        sumSet.add(y);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_three_x() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(three_x);
        sumSet.add(y);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_three_x_plus_three() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(three_x);
        sumSet.add(y);
        sumSet.add(three);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_x_plus_xSquared() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(x);
        sumSet.add(xSquared);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_xSquared_plus_two_x() {
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(y);
        sumSet.add(two_x);
        sumSet.add(xSquared);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_xSquared_plus_three_x() {
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(y);
        sumSet.add(xSquared);
        sumSet.add(three_x);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_z_plus_xSquared_plus_two_x() {
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(y);
        sumSet.add(two_x);
        sumSet.add(xSquared);
        sumSet.add(z);
        return new SumOfTerms(sumSet);
    }

    private static CompositeTerm get_xySquared() {
        var termSet = new HashSet<SimpleTerm>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 2));
        return new CompositeTerm(termSet);
    }

    private static SumOfTerms get_x_plus_xySquared() {
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(xySquared);
        sumSet.add(x);
        return new SumOfTerms(sumSet);
    }

    private static CompositeTerm get_xyCubed() {
        var termSet = new HashSet<SimpleTerm>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 3));
        return new CompositeTerm(termSet);
    }

    private static SumOfTerms get_xySquared_plus_xyCubed() {
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(xySquared);
        sumSet.add(xyCubed);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_x_plus_three() {
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(three);
        sumSet.add(x);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_x_plus_four() {
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(four);
        sumSet.add(x);
        return new SumOfTerms(sumSet);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithSameSymbol() {
        //act:
        var answer = x.plus(two_x);
        var alsoAnswer = two_x.plus(x);
        //assert:
        assertEquals(three_x, answer);
        assertEquals(three_x, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentSymbols() {
        //act
        var answer = x.plus(y);
        var alsoAnswer = y.plus(x);
        //assert
        assertEquals(x_plus_y, answer);
        assertEquals(x_plus_y, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentExponents() {
        //act
        var sum = x.plus(xSquared);
        //assert
        assertEquals(x_plus_xSquared, sum);
    }

    @Test
    public void testPlusOnSingleVariableTermWithComparableSumOfTerms() {
        //act
        var answer = x.plus(y_plus_xSquared_plus_two_x);
        var alsoAnswer = y_plus_xSquared_plus_two_x.plus(x);
        //assert
        assertEquals(y_plus_xSquared_plus_three_x, answer);
        assertEquals(y_plus_xSquared_plus_three_x, alsoAnswer);
    }

    @Test
    public void testPlusOnSingleVariableTermWithIncomparableSumOfTerms() {
        //act
        var answer = z.plus(y_plus_xSquared_plus_two_x);
        var alsoAnswer = y_plus_xSquared_plus_two_x.plus(z);
        //assert
        assertEquals(y_plus_z_plus_xSquared_plus_three_x, answer);
        assertEquals(y_plus_z_plus_xSquared_plus_three_x, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoComparableMultivariableTerms() {
        //act
        var answer = xySquared.plus(three_xySquared);
        var alsoAnswer = three_xySquared.plus(xySquared);
        //assert
        assertEquals(four_xySquared, answer);
        assertEquals(four_xySquared, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenSingleVariableTermAndMultiVariableTerm() {
        //act
        var answer = xySquared.plus(x);
        var alsoAnswer = x.plus(xySquared);
        //assert
        assertEquals(x_plus_xySquared, answer);
        assertEquals(x_plus_xySquared, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoIncomparableMultiVariableTerms() {
        //act
        var answer = xySquared.plus(xyCubed);
        var alsoAnswer = xyCubed.plus(xySquared);
        //assert
        assertEquals(answer, xySquared_plus_xyCubed);
        assertEquals(alsoAnswer, xySquared_plus_xyCubed);
    }

    @Test
    public void testPlusWhenGivenNumberAndSingleVariableTerm() {
        //act
        var answer = x.plus(three);
        var alsoAnswer = three.plus(x);
        //assert
        assertEquals(x_plus_three, answer);
        assertEquals(x_plus_three, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoNumbers() {
        //act
        var answer = three.plus(one);
        var alsoAnswer = one.plus(three);
        //assert
        assertEquals(four, answer);
        assertEquals(four, alsoAnswer);
    }

    @Test
    public void testPlusOnNumberWithComparableSumOfTerms() {
        //act
        var answer = one.plus(x_plus_three);
        var alsoAnswer = x_plus_three.plus(one);
        //assert
        assertEquals(x_plus_four, answer);
        assertEquals(x_plus_four, alsoAnswer);
    }

    @Test
    public void testPlusOnNumberWithIncomparableSumOfTerms() {
        //act
        var answer = three.plus(y_plus_three_x);
        var alsoAnswer = y_plus_three_x.plus(three);
        //assert
        assertEquals(y_plus_three_x_plus_three, answer);
        assertEquals(y_plus_three_x_plus_three, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoZeroTerms() {
        //act
        var answer = zero.plus(zero);
        //assert
        assertEquals(zero, answer);
    }

    @Test
    public void testPlusOnZeroTermWithNonZeroTerm() {
        //act
        var answer = zero.plus(x);
        var alsoAnswer = x.plus(zero);
        //assert
        assertEquals(x, answer);
        assertEquals(x, alsoAnswer);
    }

    @Test
    public void testPlusOnZeroTermWhenGivenNonZeroSumOfTerms() {
        //act
        var answer = zero.plus(x_plus_three);
        var alsoAnswer = x_plus_three.plus(zero);
        //assert
        assertEquals(x_plus_three, answer);
        assertEquals(x_plus_three, alsoAnswer);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentSymbols() {
        assertNotEquals(x, y);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentExponents() {
        assertNotEquals(x, xSquared);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentQuantities() {
        assertNotEquals(x, two_x);
    }
}