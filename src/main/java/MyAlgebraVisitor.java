import java.util.HashSet;

public class MyAlgebraVisitor extends AlgebraBaseVisitor<AlgebraicExpression> {
    @Override
    public AlgebraicExpression visitAlgebraicExpression(AlgebraParser.AlgebraicExpressionContext ctx) {
        return super.visitAlgebraicExpression(ctx);
    }

    @Override
    public AlgebraicExpression visitPotentiallyComplicatedProduct(AlgebraParser.PotentiallyComplicatedProductContext ctx) {
        return super.visitPotentiallyComplicatedProduct(ctx);
    }

    @Override
    public AlgebraicExpression visitExpressionInBracketsWithPotentialPower(AlgebraParser.ExpressionInBracketsWithPotentialPowerContext ctx) {
        return super.visitExpressionInBracketsWithPotentialPower(ctx);
    }

    @Override
    public AlgebraicExpression visitExpressionWithoutNestedBrackets(AlgebraParser.ExpressionWithoutNestedBracketsContext ctx) {
        return super.visitExpressionWithoutNestedBrackets(ctx);
    }

    @Override
    public AlgebraicExpression visitSimpleFullyFactorisedExpression(AlgebraParser.SimpleFullyFactorisedExpressionContext ctx) {
        return super.visitSimpleFullyFactorisedExpression(ctx);
    }

    @Override
    public AlgebraicExpression visitSumInBracketsPossiblyWithPower(AlgebraParser.SumInBracketsPossiblyWithPowerContext ctx) {
        return super.visitSumInBracketsPossiblyWithPower(ctx);
    }

    @Override
    public AlgebraicExpression visitSumOfTermsFirstTermNegative(AlgebraParser.SumOfTermsFirstTermNegativeContext ctx) {
        return super.visitSumOfTermsFirstTermNegative(ctx);
    }

    @Override
    public AlgebraicExpression visitSumOfTermsFirstTermPositive(AlgebraParser.SumOfTermsFirstTermPositiveContext ctx) {
        return super.visitSumOfTermsFirstTermPositive(ctx);
    }

    @Override
    public AlgebraicExpression visitSimpleNumber(AlgebraParser.SimpleNumberContext ctx) {
        int coefficient = Integer.parseInt(ctx.coefficient().getText());
        return new CompositeTerm(coefficient);
    }

    @Override
    public AlgebraicExpression visitWithCoefficient(AlgebraParser.WithCoefficientContext ctx) {
        int coefficient = Integer.parseInt(ctx.coefficient().getText());
        var newTermSet = new HashSet<SimpleTerm>();
        for (var i : ctx.simpleterm()) {
            var term = visit(i);
            newTermSet.addAll(term.giveATerm().getSet());
        } //TODO: This would reduce a term such as xx to x. Warn the user.
        return new CompositeTerm(newTermSet, coefficient);
    }

    @Override
    public AlgebraicExpression visitWithoutCoefficient(AlgebraParser.WithoutCoefficientContext ctx) {
        var newTermSet = new HashSet<SimpleTerm>();
        for (var i : ctx.simpleterm()) {
            var term = visit(i);
            newTermSet.addAll(term.giveATerm().getSet());
        } //TODO: This would reduce a term such as xx to x. Warn the user.
        return new CompositeTerm(newTermSet);
    }

    @Override
    public AlgebraicExpression visitWithoutExponent(AlgebraParser.WithoutExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        return new CompositeTerm(character);
    }

    @Override
    public AlgebraicExpression visitWithPositiveExponent(AlgebraParser.WithPositiveExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        int exponent = Integer.parseInt(ctx.POSITIVE_INT().getText());
        return new CompositeTerm(character, 1, exponent);
    }

    @Override
    public AlgebraicExpression visitWithNegativeExponent(AlgebraParser.WithNegativeExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        int exponent = -1 * Integer.parseInt(ctx.POSITIVE_INT().getText());
        return new CompositeTerm(character, 1, exponent);
    }
}
