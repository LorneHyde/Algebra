
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
public class UserInputParser {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        AlgebraLexer lexer = new AlgebraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlgebraParser parser = new AlgebraParser(tokens);
        ParseTree tree = parser.compositeterm();
        MyAlgebraVisitor expander = new MyAlgebraVisitor();
        AlgebraicExpression a = expander.visit(tree);
        System.out.println(a);
    }
}