import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class UserInputParser {
    private final static String rules =
            "Your input should be a valid algebraic expression, which I will then simplify.\n" +
                    "This is not the same thing as an equation - note that you can't have the \"=\" sign! \n" +
                    "Equations with nested brackets are allowed - for instance, \"x(x(x+1)+1)+1\" will simplify to " +
                    "x^3 + x^2 + x + 1.\n" +
                    "I can also simplify a sum of terms without brackets " +
                    "- for instance, \"x + 2x\" will simplify to 3x.\n" +
                    "I am able to ignore spaces, so \"x+1\" and \"x + 1\" both mean the same to me.\n" +
                    "I am NOT able to understand any expression which cannot be simplified to a polynomial " +
                    "(possibly with negative exponents).\n" +
                    "For instance, I can understand \"x^-1 + xy\" but I cannot understand \"(x+y)^-1\" or \"x^y\".\n" +
                    "Hence, I will always interpret terms such as x^2y as meaning x^2*y.";
    private static boolean hasErrors = false;
    private static String errorMessage = "";
    private static String inputString = "";

    public static void main(String[] args) {
        while (true) {
            hasErrors = false;
            errorMessage = "";
            System.out.println("Please enter in an algebraic expression, and I will expand the brackets for you.");
            System.out.println("To find out more about the type of input I expect, type \"rules\".");
            System.out.println("If you would like to quit, type \"quit\".");
            Scanner scanner = new Scanner(System.in);
            inputString = scanner.nextLine();
            if (inputString.toLowerCase().equals("quit")) {
                System.exit(0);
            } else if (inputString.toLowerCase().equals("rules")) {
                System.out.println(rules);
            } else {
                try {
                    AlgebraicExpression a = expandBrackets(inputString);
                    if (hasErrors) {
                        printErrorMessage();
                    } else {
                        System.out.println("Your expression with brackets expanded is:");
                        System.out.println(a);
                    }
                } catch (RuntimeException e) {
                    printErrorMessage();
                }
                System.out.println();
            }
        }
    }

    private static void printErrorMessage() {
        System.out.println();
        System.out.println(errorMessage);
        System.out.println("Your expression is not valid. To see a list of rules for user input, " +
                "type \"rules\".");
    }

    public static AlgebraicExpression expandBrackets(String algebraString) {
        CodePointCharStream inputCharStream = CharStreams.fromString(algebraString);
        MeaningfulErrorListener errorListener = new MeaningfulErrorListener();
        AlgebraLexer lexer = new AlgebraLexer(inputCharStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlgebraParser parser = new AlgebraParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.algebraicExpression();
        AlgebraEvaluatorVisitor expander = new AlgebraEvaluatorVisitor();
        return expander.visit(tree);
    }

    private static class MeaningfulErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            if (!hasErrors) {
                hasErrors = true;
                errorMessage += String.format("I was rather confused to see '%s' at position %d of your input. ",
                        inputString.charAt(charPositionInLine), charPositionInLine);
            }
        }
    }
}