// Generated from C:/Users/lorni/IdeaProjects/Algebra/src/main/antlr4\algebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link algebraParser}.
 */
public interface algebraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link algebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlgebraicExpression(algebraParser.AlgebraicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlgebraicExpression(algebraParser.AlgebraicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#potentiallyComplicatedProduct}.
	 * @param ctx the parse tree
	 */
	void enterPotentiallyComplicatedProduct(algebraParser.PotentiallyComplicatedProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#potentiallyComplicatedProduct}.
	 * @param ctx the parse tree
	 */
	void exitPotentiallyComplicatedProduct(algebraParser.PotentiallyComplicatedProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInBracketsWithPotentialPower(algebraParser.ExpressionInBracketsWithPotentialPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInBracketsWithPotentialPower(algebraParser.ExpressionInBracketsWithPotentialPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithoutNestedBrackets(algebraParser.ExpressionWithoutNestedBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithoutNestedBrackets(algebraParser.ExpressionWithoutNestedBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#simpleFullyFactorisedExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFullyFactorisedExpression(algebraParser.SimpleFullyFactorisedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#simpleFullyFactorisedExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFullyFactorisedExpression(algebraParser.SimpleFullyFactorisedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void enterSumInBracketsPossiblyWithPower(algebraParser.SumInBracketsPossiblyWithPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 */
	void exitSumInBracketsPossiblyWithPower(algebraParser.SumInBracketsPossiblyWithPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#sumofterms}.
	 * @param ctx the parse tree
	 */
	void enterSumofterms(algebraParser.SumoftermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#sumofterms}.
	 * @param ctx the parse tree
	 */
	void exitSumofterms(algebraParser.SumoftermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void enterCompositeterm(algebraParser.CompositetermContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#compositeterm}.
	 * @param ctx the parse tree
	 */
	void exitCompositeterm(algebraParser.CompositetermContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#coefficient}.
	 * @param ctx the parse tree
	 */
	void enterCoefficient(algebraParser.CoefficientContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#coefficient}.
	 * @param ctx the parse tree
	 */
	void exitCoefficient(algebraParser.CoefficientContext ctx);
	/**
	 * Enter a parse tree produced by {@link algebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void enterSimpleterm(algebraParser.SimpletermContext ctx);
	/**
	 * Exit a parse tree produced by {@link algebraParser#simpleterm}.
	 * @param ctx the parse tree
	 */
	void exitSimpleterm(algebraParser.SimpletermContext ctx);
}