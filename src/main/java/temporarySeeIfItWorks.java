
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
public class temporarySeeIfItWorks {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        algebraLexer lexer = new algebraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        algebraParser parser = new algebraParser(tokens);
        ParseTree tree = parser.compositeterm();
        MyAlgebraVisitor expander = new MyAlgebraVisitor();
        AlgebraicExpression a = expander.visit(tree);
        System.out.println(a);
    }
}