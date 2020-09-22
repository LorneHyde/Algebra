package algebra;
import java.util.HashSet;

public class ConstantsForTests {
    public static final CompositeTerm zero = new CompositeTerm(0);
    public static final CompositeTerm one = new CompositeTerm(1);
    public static final CompositeTerm three = new CompositeTerm(3);
    public static final CompositeTerm four = new CompositeTerm(4);
    public static final CompositeTerm x = new CompositeTerm('x');
    public static final CompositeTerm two_x = new CompositeTerm('x', 2, 1);
    public static final CompositeTerm three_x = new CompositeTerm('x', 3, 1);
    public static final CompositeTerm xSquared = new CompositeTerm('x', 1, 2);
    public static final CompositeTerm y = new CompositeTerm('y');
    public static final CompositeTerm z = new CompositeTerm('z');
    public static final CompositeTerm xyCubed = get_xyCubed();
    public static final CompositeTerm xySquared = get_xySquared();
    public static final CompositeTerm three_xySquared = new CompositeTerm(xySquared.getSet(), 3);
    public static final CompositeTerm four_xySquared = new CompositeTerm(xySquared.getSet(), 4);

    public static final SumOfTerms x_plus_three = get_x_plus_three();
    public static final SumOfTerms x_plus_four = get_x_plus_four();
    public static final SumOfTerms x_plus_y = get_x_plus_y();
    public static final SumOfTerms y_plus_three_x = get_y_plus_three_x();
    public static final SumOfTerms y_plus_three_x_plus_three = get_y_plus_three_x_plus_three();
    public static final SumOfTerms x_plus_xSquared = get_x_plus_xSquared();
    public static final SumOfTerms y_plus_xSquared_plus_two_x = get_y_plus_xSquared_plus_two_x();
    public static final SumOfTerms y_plus_xSquared_plus_three_x = get_y_plus_xSquared_plus_three_x();
    public static final SumOfTerms y_plus_z_plus_xSquared_plus_three_x = get_y_plus_z_plus_xSquared_plus_two_x();
    public static final SumOfTerms x_plus_xySquared = get_x_plus_xySquared();
    public static final SumOfTerms xySquared_plus_xyCubed = get_xySquared_plus_xyCubed();

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
}