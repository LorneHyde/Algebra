import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.xml.transform.ErrorListener;
import java.util.Scanner;

public class UserInputParser {
    static boolean hasErrors = false;
    static String errorMessage = "";
    static String inputString = "";

    public static void main(String[] args) {
        while (true) {
            hasErrors = false;
            errorMessage = "";
            System.out.println("Please enter in an algebraic expression, and I will expand the brackets for you.");
            System.out.println("If you would like to quit, type \"quit\".");
            Scanner scanner = new Scanner(System.in);
            inputString = scanner.nextLine();
            if (inputString.toLowerCase().equals("quit")) {
                System.exit(0);
            } else {
                try {
                    AlgebraicExpression a = expandBrackets(inputString);
                    if (hasErrors) {
                        printErrorMessage();
                    } else {
                        System.out.println("Your expression with brackets expanded is:");
                        System.out.println(a);
                    }
                }
                catch (RuntimeException e) {
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
                "type \"rules\". To see a list of example inputs, type \"examples\".");
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
        MyAlgebraVisitor expander = new MyAlgebraVisitor();
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