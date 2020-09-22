// Generated from C:/Users/lorni/IdeaProjects/Algebra/src/main/antlr4\Algebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgebraParser}.
 */
public interface AlgebraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code algebraicExpressionFirstTermNegative}
	 * labeled alternative in {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlgebraicExpressionFirstTermNegative(AlgebraParser.AlgebraicExpressionFirstTermNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code algebraicExpressionFirstTermNegative}
	 * labeled alternative in {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlgebraicExpressionFirstTermNegative(AlgebraParser.AlgebraicExpressionFirstTermNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code algebraicExpressionFirstTermPositive}
	 * labeled alternative in {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlgebraicExpressionFirstTermPositive(AlgebraParser.AlgebraicExpressionFirstTermPositiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code algebraicExpressionFirstTermPositive}
	 * labeled alternative in {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlgebraicExpressionFirstTermPositive(AlgebraParser.AlgebraicExpressionFirstTermPositiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraParser#potentialyComplicatedProductWithSign}.
	 * @param ctx the parse tree
	 */
	void enterPotentialyComplicatedProductWithSign(AlgebraParser.PotentialyComplicatedProductWithSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#potentialyComplicatedProductWithSign}.
	 * @param ctx the parse tree
	 */
	void exitPotentialyComplicatedProductWithSign(AlgebraParser.PotentialyComplicatedProductWithSignContext ctx);
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
	 * Enter a parse tree produced by the {@code potentiallyComplicatedFactorSFFE}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void enterPotentiallyComplicatedFactorSFFE(AlgebraParser.PotentiallyComplicatedFactorSFFEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code potentiallyComplicatedFactorSFFE}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void exitPotentiallyComplicatedFactorSFFE(AlgebraParser.PotentiallyComplicatedFactorSFFEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code potentiallyComplicatedProductInBrackets}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void enterPotentiallyComplicatedProductInBrackets(AlgebraParser.PotentiallyComplicatedProductInBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code potentiallyComplicatedProductInBrackets}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void exitPotentiallyComplicatedProductInBrackets(AlgebraParser.PotentiallyComplicatedProductInBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code algebraicExpressionInBrackets}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void enterAlgebraicExpressionInBrackets(AlgebraParser.AlgebraicExpressionInBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code algebraicExpressionInBrackets}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void exitAlgebraicExpressionInBrackets(AlgebraParser.AlgebraicExpressionInBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code potentiallyComplicatedFactorEIBWPP}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void enterPotentiallyComplicatedFactorEIBWPP(AlgebraParser.PotentiallyComplicatedFactorEIBWPPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code potentiallyComplicatedFactorEIBWPP}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 */
	void exitPotentiallyComplicatedFactorEIBWPP(AlgebraParser.PotentiallyComplicatedFactorEIBWPPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionInBracketsWONested}
	 * labeled alternative in {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInBracketsWONested(AlgebraParser.ExpressionInBracketsWONestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionInBracketsWONested}
	 * labeled alternative in {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInBracketsWONested(AlgebraParser.ExpressionInBracketsWONestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionInBracketsPositivePowerWONested}
	 * labeled alternative in {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInBracketsPositivePowerWONested(AlgebraParser.ExpressionInBracketsPositivePowerWONestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionInBracketsPositivePowerWONested}
	 * labeled alternative in {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInBracketsPositivePowerWONested(AlgebraParser.ExpressionInBracketsPositivePowerWONestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionWONestedStartingWithNegativeSFFE}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWONestedStartingWithNegativeSFFE(AlgebraParser.ExpressionWONestedStartingWithNegativeSFFEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionWONestedStartingWithNegativeSFFE}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWONestedStartingWithNegativeSFFE(AlgebraParser.ExpressionWONestedStartingWithNegativeSFFEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionWONestedStartingWithSOT}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWONestedStartingWithSOT(AlgebraParser.ExpressionWONestedStartingWithSOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionWONestedStartingWithSOT}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWONestedStartingWithSOT(AlgebraParser.ExpressionWONestedStartingWithSOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionWONestedStartingWithSFFE}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWONestedStartingWithSFFE(AlgebraParser.ExpressionWONestedStartingWithSFFEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionWONestedStartingWithSFFE}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWONestedStartingWithSFFE(AlgebraParser.ExpressionWONestedStartingWithSFFEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionWONestedStartingWithCT}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWONestedStartingWithCT(AlgebraParser.ExpressionWONestedStartingWithCTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionWONestedStartingWithCT}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWONestedStartingWithCT(AlgebraParser.ExpressionWONestedStartingWithCTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sffeInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterSffeInExprWithoutNestedBrackets(AlgebraParser.SffeInExprWithoutNestedBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sffeInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitSffeInExprWithoutNestedBrackets(AlgebraParser.SffeInExprWithoutNestedBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sotInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterSotInExprWithoutNestedBrackets(AlgebraParser.SotInExprWithoutNestedBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sotInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitSotInExprWithoutNestedBrackets(AlgebraParser.SotInExprWithoutNestedBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterCtInExprWithoutNestedBrackets(AlgebraParser.CtInExprWithoutNestedBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitCtInExprWithoutNestedBrackets(AlgebraParser.CtInExprWithoutNestedBracketsContext ctx);
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
	 * Enter a parse tree produced by the {@code sumInBracketsWithPower}
	 * labeled alternative in {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void enterSumInBracketsWithPower(AlgebraParser.SumInBracketsWithPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumInBracketsWithPower}
	 * labeled alternative in {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void exitSumInBracketsWithPower(AlgebraParser.SumInBracketsWithPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumInBracketsWithoutPower}
	 * labeled alternative in {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void enterSumInBracketsWithoutPower(AlgebraParser.SumInBracketsWithoutPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumInBracketsWithoutPower}
	 * labeled alternative in {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void exitSumInBracketsWithoutPower(AlgebraParser.SumInBracketsWithoutPowerContext ctx);
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
	 * Enter a parse tree produced by {@link AlgebraParser#termInSum}.
	 * @param ctx the parse tree
	 */
	void enterTermInSum(AlgebraParser.TermInSumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraParser#termInSum}.
	 * @param ctx the parse tree
	 */
	void exitTermInSum(AlgebraParser.TermInSumContext ctx);
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