// Generated from C:/Users/lorni/IdeaProjects/Algebra/src/main/antlr4\algebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link algebraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface algebraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link algebraParser#algebraicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgebraicExpression(algebraParser.AlgebraicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#potentiallyComplicatedProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotentiallyComplicatedProduct(algebraParser.PotentiallyComplicatedProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#expressionInBracketsWithPotentialPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInBracketsWithPotentialPower(algebraParser.ExpressionInBracketsWithPotentialPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#expressionWithoutNestedBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWithoutNestedBrackets(algebraParser.ExpressionWithoutNestedBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#simpleFullyFactorisedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFullyFactorisedExpression(algebraParser.SimpleFullyFactorisedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#sumInBracketsPossiblyWithPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumInBracketsPossiblyWithPower(algebraParser.SumInBracketsPossiblyWithPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#sumofterms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumofterms(algebraParser.SumoftermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#compositeterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeterm(algebraParser.CompositetermContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#coefficient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoefficient(algebraParser.CoefficientContext ctx);
	/**
	 * Visit a parse tree produced by {@link algebraParser#simpleterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleterm(algebraParser.SimpletermContext ctx);
}