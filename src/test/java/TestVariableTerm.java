import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestVariableTerm {
    @Test
    public void testAdd() throws Throwable {
        var two_x = new VariableTerm('x', 2);
        var y = new VariableTerm('y', 3);
        var x = new VariableTerm('x');
        var three_x = x.add(two_x);
        var addxy = x.add(y);
        assertTrue(three_x instanceof VariableTerm);
        assertEquals(((VariableTerm) three_x).getQuantity(), 3);
        assertTrue(addxy instanceof SumOfTerms);
        var addxyList = ((SumOfTerms) addxy).getAll();
        assertTrue((addxyList.contains(x) && addxyList.contains(y) && addxyList.size() == 2));
    }
}
