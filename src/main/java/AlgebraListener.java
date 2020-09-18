// Generated from C:/Users/lorni/IdeaProjects/Algebra/src/main/antlr4\Algebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgebraParser}.
 */
public interface AlgebraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlgebraicExpression(AlgebraParser.AlgebraicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlgebraicExpression(AlgebraParser.AlgebraicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#potentiallyComplicatedProduct}.
	 * @param ctx the parse tree
	 */
	void enterPotentiallyComplicatedProduct(AlgebraParser.PotentiallyComplicatedProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#potentiallyComplicatedProduct}.
	 * @param ctx the parse tree
	 */
	void exitPotentiallyComplicatedProduct(AlgebraParser.PotentiallyComplicatedProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInBracketsWithPotentialPower(AlgebraParser.ExpressionInBracketsWithPotentialPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInBracketsWithPotentialPower(AlgebraParser.ExpressionInBracketsWithPotentialPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithoutNestedBrackets(AlgebraParser.ExpressionWithoutNestedBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithoutNestedBrackets(AlgebraParser.ExpressionWithoutNestedBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#simpleFullyFactorisedExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFullyFactorisedExpression(AlgebraParser.SimpleFullyFactorisedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#simpleFullyFactorisedExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFullyFactorisedExpression(AlgebraParser.SimpleFullyFactorisedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void enterSumInBracketsPossiblyWithPower(AlgebraParser.SumInBracketsPossiblyWithPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void exitSumInBracketsPossiblyWithPower(AlgebraParser.SumInBracketsPossiblyWithPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumOfTermsFirstTermNegative}
	 * labeled alternative in {@link AlgebraParser#sumofterms}.
	 * @param ctx the parse tree
	 */
	void enterSumOfTermsFirstTermNegative(AlgebraParser.SumOfTermsFirstTermNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumOfTermsFirstTermNegative}
	 * labeled alternative in {@link AlgebraParser#sumofterms}.
	 * @param ctx the parse tree
	 */
	void exitSumOfTermsFirstTermNegative(AlgebraParser.SumOfTermsFirstTermNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumOfTermsFirstTermPositive}
	 * labeled alternative in {@link AlgebraParser#sumofterms}.
	 * @param ctx the parse tree
	 */
	void enterSumOfTermsFirstTermPositive(AlgebraParser.SumOfTermsFirstTermPositiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumOfTermsFirstTermPositive}
	 * labeled alternative in {@link AlgebraParser#sumofterms}.
	 * @param ctx the parse tree
	 */
	void exitSumOfTermsFirstTermPositive(AlgebraParser.SumOfTermsFirstTermPositiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withCoefficient}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void enterWithCoefficient(AlgebraParser.WithCoefficientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withCoefficient}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void exitWithCoefficient(AlgebraParser.WithCoefficientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleNumber}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNumber(AlgebraParser.SimpleNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleNumber}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNumber(AlgebraParser.SimpleNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withoutCoefficient}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void enterWithoutCoefficient(AlgebraParser.WithoutCoefficientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withoutCoefficient}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void exitWithoutCoefficient(AlgebraParser.WithoutCoefficientContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#coefficient}.
	 * @param ctx the parse tree
	 */
	void enterCoefficient(AlgebraParser.CoefficientContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#coefficient}.
	 * @param ctx the parse tree
	 */
	void exitCoefficient(AlgebraParser.CoefficientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withoutExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void enterWithoutExponent(AlgebraParser.WithoutExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withoutExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void exitWithoutExponent(AlgebraParser.WithoutExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withPositiveExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void enterWithPositiveExponent(AlgebraParser.WithPositiveExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withPositiveExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void exitWithPositiveExponent(AlgebraParser.WithPositiveExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withNegativeExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void enterWithNegativeExponent(AlgebraParser.WithNegativeExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withNegativeExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void exitWithNegativeExponent(AlgebraParser.WithNegativeExponentContext ctx);
}