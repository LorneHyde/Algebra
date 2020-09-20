
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.InputStream;
import java.util.Scanner;

public class UserInputParser {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter in an algebraic expression, and I will expand the brackets for you.");
            System.out.println("If you would like to quit, type \"quit\".");
            Scanner scanner = new Scanner(System.in);
            var answer = scanner.nextLine();
            if (answer.toLowerCase().equals("quit")) {
                System.exit(0);
            }
            else {
                ANTLRInputStream input = new ANTLRInputStream(answer); //TODO: Replace this with something not deprecated.
                AlgebraLexer lexer = new AlgebraLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                AlgebraParser parser = new AlgebraParser(tokens);
                ParseTree tree = parser.algebraicExpression();
                MyAlgebraVisitor expander = new MyAlgebraVisitor();
                AlgebraicExpression a = expander.visit(tree);
                System.out.println("Your expression with brackets expanded is:");
                System.out.println(a);
                System.out.println();
            }
        }
    }
}