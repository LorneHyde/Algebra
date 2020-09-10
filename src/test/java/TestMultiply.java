import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestMultiply {
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
    public void testMultiplyWithSameSymbolWorksForSimpleTermWithSameSymbol() {
        var t1 = new SimpleTerm('x', 1);
        var t2 = new SimpleTerm('x', 3);
        var expected_result = new SimpleTerm('x', 4);
        var actual_result = t1.multiplyWithSameSymbol(t2);
        var also_actual_result = t2.multiplyWithSameSymbol(t1);
        assertEquals(expected_result, actual_result);
        assertEquals(expected_result, also_actual_result);
    }

    @Test
    public void testMultiplyWithSameSymbolThrowsExceptionWhenGivenSimpleTermWithDifferentSymbol() {
        var t1 = new SimpleTerm('x');
        var t2 = new SimpleTerm('y');
        assertThrows(IllegalArgumentException.class, () -> t1.multiplyWithSameSymbol(t2));
    }
}