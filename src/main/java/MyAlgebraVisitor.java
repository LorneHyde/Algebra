import java.util.HashSet;

public class MyAlgebraVisitor extends AlgebraBaseVisitor<AlgebraicExpression> {

    @Override
    public AlgebraicExpression visitAlgebraicExpressionFirstTermNegative(AlgebraParser.AlgebraicExpressionFirstTermNegativeContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.potentiallyComplicatedProduct()).asNegative());
        for (var x: ctx.potentialyComplicatedProductWithSign()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitAlgebraicExpressionFirstTermPositive(AlgebraParser.AlgebraicExpressionFirstTermPositiveContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.potentiallyComplicatedProduct()));
        for (var x: ctx.potentialyComplicatedProductWithSign()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitPotentialyComplicatedProductWithSign(AlgebraParser.PotentialyComplicatedProductWithSignContext ctx) {
        if (ctx.op.getType() == AlgebraParser.SUB) {
            return visit(ctx.potentiallyComplicatedProduct()).asNegative();
        }
        else {
            return visit(ctx.potentiallyComplicatedProduct());
        }
    }

    @Override
    public AlgebraicExpression visitPotentiallyComplicatedProduct(AlgebraParser.PotentiallyComplicatedProductContext ctx) {
        AlgebraicExpression expressionSoFar = new CompositeTerm(1);
        for (var i : ctx.potentiallyComplicatedFactor()) {
            expressionSoFar = expressionSoFar.multiply(visit(i));
        }
        return expressionSoFar;
    }

    @Override
    public AlgebraicExpression visitPotentiallyComplicatedProductInBrackets(AlgebraParser.PotentiallyComplicatedProductInBracketsContext ctx) {
        return visit(ctx.potentiallyComplicatedProduct());
    }

    @Override
    public AlgebraicExpression visitAlgebraicExpressionInBrackets(AlgebraParser.AlgebraicExpressionInBracketsContext ctx) {
        return visit(ctx.algebraicExpression());
    }

    @Override
    public AlgebraicExpression visitPotentiallyComplicatedFactorSFFE(AlgebraParser.PotentiallyComplicatedFactorSFFEContext ctx) {
        return visit(ctx.simpleFullyFactorisedExpression());
    }

    @Override
    public AlgebraicExpression visitPotentiallyComplicatedFactorEIBWPP(AlgebraParser.PotentiallyComplicatedFactorEIBWPPContext ctx) {
        return visit(ctx.expressionInBracketsWithPotentialPower());
    }

    @Override
    public AlgebraicExpression visitExpressionInBracketsWONested(AlgebraParser.ExpressionInBracketsWONestedContext ctx) {
        return visit(ctx.expressionWithoutNestedBrackets());
    }

    @Override
    public AlgebraicExpression visitExpressionInBracketsPositivePowerWONested(AlgebraParser.ExpressionInBracketsPositivePowerWONestedContext ctx) {
        int power = Integer.parseInt(ctx.POSITIVE_INT().getText());
        var sumInBrackets = visit(ctx.expressionWithoutNestedBrackets());
        AlgebraicExpression sumRaisedSoFar = new CompositeTerm(1);
        for (int i = 1; i <= power; i++) {
            sumRaisedSoFar = sumRaisedSoFar.multiply(sumInBrackets);
        }
        return sumRaisedSoFar;
    }


    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithNegativeSFFE(AlgebraParser.ExpressionWONestedStartingWithNegativeSFFEContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.simpleFullyFactorisedExpression()).asNegative();
        var remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (var i: remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithSOT(AlgebraParser.ExpressionWONestedStartingWithSOTContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.sumofterms());
        var remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (var i: remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithSFFE(AlgebraParser.ExpressionWONestedStartingWithSFFEContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.simpleFullyFactorisedExpression());
        var remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (var i: remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithCT(AlgebraParser.ExpressionWONestedStartingWithCTContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.compositeterm());
        var remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (var i: remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitSffeInExprWithoutNestedBrackets(AlgebraParser.SffeInExprWithoutNestedBracketsContext ctx) {
        if (ctx.op.getType() == AlgebraParser.SUB) {
            return visit(ctx.simpleFullyFactorisedExpression()).asNegative();
        }
        else {
            return visit(ctx.simpleFullyFactorisedExpression());
        }
    }

    @Override
    public AlgebraicExpression visitSotInExprWithoutNestedBrackets(AlgebraParser.SotInExprWithoutNestedBracketsContext ctx) {
        return visit(ctx.sumofterms());
    }

    @Override
    public AlgebraicExpression visitCtInExprWithoutNestedBrackets(AlgebraParser.CtInExprWithoutNestedBracketsContext ctx) {
        return visit(ctx.compositeterm());
    }

    @Override
    public AlgebraicExpression visitSimpleFullyFactorisedExpression(AlgebraParser.SimpleFullyFactorisedExpressionContext ctx) {
        AlgebraicExpression expressionSoFar = new CompositeTerm(1);
        for (var i : ctx.children) {
            expressionSoFar = expressionSoFar.multiply(visit(i));
        }
        return expressionSoFar;
    }

    @Override
    public AlgebraicExpression visitSumInBracketsWithPower(AlgebraParser.SumInBracketsWithPowerContext ctx) {
        int power = Integer.parseInt(ctx.POSITIVE_INT().getText());
        var sumInBrackets = visit(ctx.sumofterms());
        AlgebraicExpression sumRaisedSoFar = new CompositeTerm(1);
        for (int i = 1; i <= power; i++) {
            sumRaisedSoFar = sumRaisedSoFar.multiply(sumInBrackets);
        }
        return sumRaisedSoFar;
    }

    @Override
    public AlgebraicExpression visitSumInBracketsWithoutPower(AlgebraParser.SumInBracketsWithoutPowerContext ctx) {
        return visit(ctx.sumofterms());
    }

    @Override
    public AlgebraicExpression visitSumOfTermsFirstTermNegative(AlgebraParser.SumOfTermsFirstTermNegativeContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.startTerm).asNegative());
        for (var x: ctx.termInSum()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitSumOfTermsFirstTermPositive(AlgebraParser.SumOfTermsFirstTermPositiveContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.startTerm));
        for (var x: ctx.termInSum()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitTermInSum(AlgebraParser.TermInSumContext ctx) {
        var evaluatedTerm = visit(ctx.compositeterm());
        if (ctx.op.getType() == AlgebraParser.SUB) {
            evaluatedTerm = evaluatedTerm.asNegative();
        }
        return evaluatedTerm;
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
        }
        return new CompositeTerm(newTermSet, coefficient);
    }

    @Override
    public AlgebraicExpression visitWithoutCoefficient(AlgebraParser.WithoutCoefficientContext ctx) {
        var newTermSet = new HashSet<SimpleTerm>();
        for (var i : ctx.simpleterm()) {
            var term = visit(i);
            newTermSet.addAll(term.giveATerm().getSet());
        }
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
