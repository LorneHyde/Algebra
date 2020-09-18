public class MyAlgebraVisitor extends algebraBaseVisitor<AlgebraicExpression> {
    @Override
    public AlgebraicExpression visitAlgebraicExpression(algebraParser.AlgebraicExpressionContext ctx) {
        return super.visitAlgebraicExpression(ctx);
    }

    @Override
    public AlgebraicExpression visitPotentiallyComplicatedProduct(algebraParser.PotentiallyComplicatedProductContext ctx) {
        return super.visitPotentiallyComplicatedProduct(ctx);
    }

    @Override
    public AlgebraicExpression visitExpressionInBracketsWithPotentialPower(algebraParser.ExpressionInBracketsWithPotentialPowerContext ctx) {
        return super.visitExpressionInBracketsWithPotentialPower(ctx);
    }

    @Override
    public AlgebraicExpression visitExpressionWithoutNestedBrackets(algebraParser.ExpressionWithoutNestedBracketsContext ctx) {
        return super.visitExpressionWithoutNestedBrackets(ctx);
    }

    @Override
    public AlgebraicExpression visitSimpleFullyFactorisedExpression(algebraParser.SimpleFullyFactorisedExpressionContext ctx) {
        return super.visitSimpleFullyFactorisedExpression(ctx);
    }

    @Override
    public AlgebraicExpression visitSumInBracketsPossiblyWithPower(algebraParser.SumInBracketsPossiblyWithPowerContext ctx) {
        return super.visitSumInBracketsPossiblyWithPower(ctx);
    }

    @Override
    public AlgebraicExpression visitSumofterms(algebraParser.SumoftermsContext ctx) {
        return super.visitSumofterms(ctx);
    }

    @Override
    public AlgebraicExpression visitSimpleNumber(algebraParser.SimpleNumberContext ctx) {
        return super.visitSimpleNumber(ctx);
    }

    @Override
    public AlgebraicExpression visitWithCoefficient(algebraParser.WithCoefficientContext ctx) {
        return super.visitWithCoefficient(ctx);
    }

    @Override
    public AlgebraicExpression visitWithoutCoefficient(algebraParser.WithoutCoefficientContext ctx) {
        return super.visitWithoutCoefficient(ctx);
    }

    @Override
    public AlgebraicExpression visitCoefficient(algebraParser.CoefficientContext ctx) {
        return super.visitCoefficient(ctx);
    }

    @Override
    public AlgebraicExpression visitWithoutExponent(algebraParser.WithoutExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        return new CompositeTerm(character);
    }

    @Override
    public AlgebraicExpression visitWithPositiveExponent(algebraParser.WithPositiveExponentContext ctx) {
        return super.visitWithPositiveExponent(ctx);
    }

    @Override
    public AlgebraicExpression visitWithNegativeExponent(algebraParser.WithNegativeExponentContext ctx) {
        return super.visitWithNegativeExponent(ctx);
    }
}
