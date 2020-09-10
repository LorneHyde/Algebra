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
}