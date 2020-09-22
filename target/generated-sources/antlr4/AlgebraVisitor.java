// Generated from C:/Users/lorni/IdeaProjects/Algebra/src/main/antlr4\Algebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgebraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgebraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code algebraicExpressionFirstTermNegative}
	 * labeled alternative in {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgebraicExpressionFirstTermNegative(AlgebraParser.AlgebraicExpressionFirstTermNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code algebraicExpressionFirstTermPositive}
	 * labeled alternative in {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgebraicExpressionFirstTermPositive(AlgebraParser.AlgebraicExpressionFirstTermPositiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#potentialyComplicatedProductWithSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentialyComplicatedProductWithSign(AlgebraParser.PotentialyComplicatedProductWithSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#potentiallyComplicatedProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentiallyComplicatedProduct(AlgebraParser.PotentiallyComplicatedProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potentiallyComplicatedFactorSFFE}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentiallyComplicatedFactorSFFE(AlgebraParser.PotentiallyComplicatedFactorSFFEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potentiallyComplicatedProductInBrackets}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentiallyComplicatedProductInBrackets(AlgebraParser.PotentiallyComplicatedProductInBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code algebraicExpressionInBrackets}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgebraicExpressionInBrackets(AlgebraParser.AlgebraicExpressionInBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potentiallyComplicatedFactorEIBWPP}
	 * labeled alternative in {@link AlgebraParser#potentiallyComplicatedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentiallyComplicatedFactorEIBWPP(AlgebraParser.PotentiallyComplicatedFactorEIBWPPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionInBracketsWONested}
	 * labeled alternative in {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInBracketsWONested(AlgebraParser.ExpressionInBracketsWONestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionInBracketsPositivePowerWONested}
	 * labeled alternative in {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInBracketsPositivePowerWONested(AlgebraParser.ExpressionInBracketsPositivePowerWONestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionWONestedStartingWithNegativeSFFE}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWONestedStartingWithNegativeSFFE(AlgebraParser.ExpressionWONestedStartingWithNegativeSFFEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionWONestedStartingWithSOT}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWONestedStartingWithSOT(AlgebraParser.ExpressionWONestedStartingWithSOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionWONestedStartingWithSFFE}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWONestedStartingWithSFFE(AlgebraParser.ExpressionWONestedStartingWithSFFEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionWONestedStartingWithCT}
	 * labeled alternative in {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWONestedStartingWithCT(AlgebraParser.ExpressionWONestedStartingWithCTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sffeInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSffeInExprWithoutNestedBrackets(AlgebraParser.SffeInExprWithoutNestedBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sotInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSotInExprWithoutNestedBrackets(AlgebraParser.SotInExprWithoutNestedBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctInExprWithoutNestedBrackets}
	 * labeled alternative in {@link AlgebraParser#termInExprWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtInExprWithoutNestedBrackets(AlgebraParser.CtInExprWithoutNestedBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#simpleFullyFactorisedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFullyFactorisedExpression(AlgebraParser.SimpleFullyFactorisedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumInBracketsWithPower}
	 * labeled alternative in {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInBracketsWithPower(AlgebraParser.SumInBracketsWithPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumInBracketsWithoutPower}
	 * labeled alternative in {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInBracketsWithoutPower(AlgebraParser.SumInBracketsWithoutPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumOfTermsFirstTermNegative}
	 * labeled alternative in {@link AlgebraParser#sumofterms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOfTermsFirstTermNegative(AlgebraParser.SumOfTermsFirstTermNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumOfTermsFirstTermPositive}
	 * labeled alternative in {@link AlgebraParser#sumofterms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOfTermsFirstTermPositive(AlgebraParser.SumOfTermsFirstTermPositiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#termInSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInSum(AlgebraParser.TermInSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withCoefficient}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithCoefficient(AlgebraParser.WithCoefficientContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleNumber}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleNumber(AlgebraParser.SimpleNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withoutCoefficient}
	 * labeled alternative in {@link AlgebraParser#compositeterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithoutCoefficient(AlgebraParser.WithoutCoefficientContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#coefficient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoefficient(AlgebraParser.CoefficientContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withoutExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithoutExponent(AlgebraParser.WithoutExponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withPositiveExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithPositiveExponent(AlgebraParser.WithPositiveExponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withNegativeExponent}
	 * labeled alternative in {@link AlgebraParser#simpleterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithNegativeExponent(AlgebraParser.WithNegativeExponentContext ctx);
}