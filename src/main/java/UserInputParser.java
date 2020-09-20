import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class UserInputParser {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter in an algebraic expression, and I will expand the brackets for you.");
            System.out.println("If you would like to quit, type \"quit\".");
            Scanner scanner = new Scanner(System.in);
            var inputString = scanner.nextLine();
            if (inputString.toLowerCase().equals("quit")) {
                System.exit(0);
            } else {
                try {
                    AlgebraicExpression a = expandBrackets(inputString);
                    System.out.println("Your expression with brackets expanded is:");
                    System.out.println(a);
                }
                catch (RuntimeException e) {
                    System.out.println("Your expression is not valid. To see a list of rules for user input, " +
                            "type \"rules\". To see a list of example inputs, type \"examples\".");
                }
                System.out.println();
            }
        }
    }

    public static AlgebraicExpression expandBrackets(String algebraString) {
        var inputCharStream = CharStreams.fromString(algebraString);
        AlgebraLexer lexer = new AlgebraLexer(inputCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlgebraParser parser = new AlgebraParser(tokens);
        ParseTree tree = parser.algebraicExpression();
        MyAlgebraVisitor expander = new MyAlgebraVisitor();
        return expander.visit(tree);
    }
}