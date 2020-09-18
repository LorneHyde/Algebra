import java.util.HashSet;

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
        int coefficient = Integer.parseInt(ctx.coefficient().getText());
        return new CompositeTerm(coefficient);
    }

    @Override
    public AlgebraicExpression visitWithCoefficient(algebraParser.WithCoefficientContext ctx) {
        int coefficient = Integer.parseInt(ctx.coefficient().getText());
        var newTermSet = new HashSet<SimpleTerm>();
        for (var i : ctx.simpleterm()) {
            var term = visit(i);
            newTermSet.addAll(term.giveATerm().getSet());
        } //TODO: This would reduce a term such as xx to x. Warn the user.
        return new CompositeTerm(newTermSet, coefficient);
    }

    @Override
    public AlgebraicExpression visitWithoutCoefficient(algebraParser.WithoutCoefficientContext ctx) {
        var newTermSet = new HashSet<SimpleTerm>();
        for (var i : ctx.simpleterm()) {
            var term = visit(i);
            newTermSet.addAll(term.giveATerm().getSet());
        } //TODO: This would reduce a term such as xx to x. Warn the user.
        return new CompositeTerm(newTermSet);
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
        char character = ctx.CHAR().getText().charAt(0);
        int exponent = Integer.parseInt(ctx.POSITIVE_INT().getText());
        return new CompositeTerm(character, 1, exponent);
    }

    @Override
    public AlgebraicExpression visitWithNegativeExponent(algebraParser.WithNegativeExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        int exponent = -1 * Integer.parseInt(ctx.POSITIVE_INT().getText());
        return new CompositeTerm(character, 1, exponent);
    }
}
