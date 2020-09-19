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
	 * Visit a parse tree produced by {@link AlgebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgebraicExpression(AlgebraParser.AlgebraicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#potentiallyComplicatedProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentiallyComplicatedProduct(AlgebraParser.PotentiallyComplicatedProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInBracketsWithPotentialPower(AlgebraParser.ExpressionInBracketsWithPotentialPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWithoutNestedBrackets(AlgebraParser.ExpressionWithoutNestedBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#simpleFullyFactorisedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFullyFactorisedExpression(AlgebraParser.SimpleFullyFactorisedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInBracketsPossiblyWithPower(AlgebraParser.SumInBracketsPossiblyWithPowerContext ctx);
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