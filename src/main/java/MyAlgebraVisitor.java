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
    public AlgebraicExpression visitCompositeterm(algebraParser.CompositetermContext ctx) {
        return super.visitCompositeterm(ctx);
    }

    @Override
    public AlgebraicExpression visitCoefficient(algebraParser.CoefficientContext ctx) {
        return super.visitCoefficient(ctx);
    }

    @Override
    public AlgebraicExpression visitSimpleterm(algebraParser.SimpletermContext ctx) {
        return super.visitSimpleterm(ctx);
    }
}
