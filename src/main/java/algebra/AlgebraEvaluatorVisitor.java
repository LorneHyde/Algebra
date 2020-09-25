package algebra;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.List;
import algebra.AlgebraParser.*;

public class AlgebraEvaluatorVisitor extends AlgebraBaseVisitor<AlgebraicExpression> {

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitAlgebraicExpressionFirstTermNegative(AlgebraParser.AlgebraicExpressionFirstTermNegativeContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.potentiallyComplicatedProduct()).asNegative());
        for (PotentialyComplicatedProductWithSignContext x : ctx.potentialyComplicatedProductWithSign()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitAlgebraicExpressionFirstTermPositive(AlgebraParser.AlgebraicExpressionFirstTermPositiveContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.potentiallyComplicatedProduct()));
        for (PotentialyComplicatedProductWithSignContext x : ctx.potentialyComplicatedProductWithSign()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitPotentialyComplicatedProductWithSign(AlgebraParser.PotentialyComplicatedProductWithSignContext ctx) {
        if (ctx.op.getType() == AlgebraParser.SUB) {
            return visit(ctx.potentiallyComplicatedProduct()).asNegative();
        } else {
            return visit(ctx.potentiallyComplicatedProduct());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitPotentiallyComplicatedProduct(AlgebraParser.PotentiallyComplicatedProductContext ctx) {
        AlgebraicExpression expressionSoFar = new CompositeTerm(1);
        for (PotentiallyComplicatedFactorContext i : ctx.potentiallyComplicatedFactor()) {
            expressionSoFar = expressionSoFar.multiply(visit(i));
        }
        return expressionSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitPotentiallyComplicatedProductInBrackets(AlgebraParser.PotentiallyComplicatedProductInBracketsContext ctx) {
        return visit(ctx.potentiallyComplicatedProduct());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitAlgebraicExpressionInBrackets(AlgebraParser.AlgebraicExpressionInBracketsContext ctx) {
        return visit(ctx.algebraicExpression());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitPotentiallyComplicatedFactorSFFE(AlgebraParser.PotentiallyComplicatedFactorSFFEContext ctx) {
        return visit(ctx.simpleFullyFactorisedExpression());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitPotentiallyComplicatedFactorEIBWPP(AlgebraParser.PotentiallyComplicatedFactorEIBWPPContext ctx) {
        return visit(ctx.expressionInBracketsWithPotentialPower());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitExpressionInBracketsWONested(AlgebraParser.ExpressionInBracketsWONestedContext ctx) {
        return visit(ctx.expressionWithoutNestedBrackets());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitExpressionInBracketsPositivePowerWONested(AlgebraParser.ExpressionInBracketsPositivePowerWONestedContext ctx) {
        int power = Integer.parseInt(ctx.POSITIVE_INT().getText());
        AlgebraicExpression sumInBrackets = visit(ctx.expressionWithoutNestedBrackets());
        AlgebraicExpression sumRaisedSoFar = new CompositeTerm(1);
        for (int i = 1; i <= power; i++) {
            sumRaisedSoFar = sumRaisedSoFar.multiply(sumInBrackets);
        }
        return sumRaisedSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithNegativeSFFE(AlgebraParser.ExpressionWONestedStartingWithNegativeSFFEContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.simpleFullyFactorisedExpression()).asNegative();
        List<TermInExprWithoutNestedBracketsContext> remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (TermInExprWithoutNestedBracketsContext i : remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithSOT(AlgebraParser.ExpressionWONestedStartingWithSOTContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.sumofterms());
        List<TermInExprWithoutNestedBracketsContext> remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (TermInExprWithoutNestedBracketsContext i : remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithSFFE(AlgebraParser.ExpressionWONestedStartingWithSFFEContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.simpleFullyFactorisedExpression());
        List<TermInExprWithoutNestedBracketsContext> remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (TermInExprWithoutNestedBracketsContext i : remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitExpressionWONestedStartingWithCT(AlgebraParser.ExpressionWONestedStartingWithCTContext ctx) {
        AlgebraicExpression sumSoFar = visit(ctx.compositeterm());
        List<TermInExprWithoutNestedBracketsContext> remainingTerms = ctx.termInExprWithoutNestedBrackets();
        for (TermInExprWithoutNestedBracketsContext i : remainingTerms) {
            sumSoFar = sumSoFar.plus(visit(i));
        }
        return sumSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSffeInExprWithoutNestedBrackets(AlgebraParser.SffeInExprWithoutNestedBracketsContext ctx) {
        if (ctx.op.getType() == AlgebraParser.SUB) {
            return visit(ctx.simpleFullyFactorisedExpression()).asNegative();
        } else {
            return visit(ctx.simpleFullyFactorisedExpression());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSotInExprWithoutNestedBrackets(AlgebraParser.SotInExprWithoutNestedBracketsContext ctx) {
        return visit(ctx.sumofterms());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitCtInExprWithoutNestedBrackets(AlgebraParser.CtInExprWithoutNestedBracketsContext ctx) {
        return visit(ctx.compositeterm());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSimpleFullyFactorisedExpression(AlgebraParser.SimpleFullyFactorisedExpressionContext ctx) {
        AlgebraicExpression expressionSoFar = new CompositeTerm(1);
        for (ParseTree i : ctx.children) {
            expressionSoFar = expressionSoFar.multiply(visit(i));
        }
        return expressionSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSumInBracketsWithPower(AlgebraParser.SumInBracketsWithPowerContext ctx) {
        int power = Integer.parseInt(ctx.POSITIVE_INT().getText());
        AlgebraicExpression sumInBrackets = visit(ctx.sumofterms());
        AlgebraicExpression sumRaisedSoFar = new CompositeTerm(1);
        for (int i = 1; i <= power; i++) {
            sumRaisedSoFar = sumRaisedSoFar.multiply(sumInBrackets);
        }
        return sumRaisedSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSumInBracketsWithoutPower(AlgebraParser.SumInBracketsWithoutPowerContext ctx) {
        return visit(ctx.sumofterms());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSumOfTermsFirstTermNegative(AlgebraParser.SumOfTermsFirstTermNegativeContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.startTerm).asNegative());
        for (TermInSumContext x : ctx.termInSum()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSumOfTermsFirstTermPositive(AlgebraParser.SumOfTermsFirstTermPositiveContext ctx) {
        AlgebraicExpression sumSoFar = new SumOfTerms();
        sumSoFar = sumSoFar.plus(visit(ctx.startTerm));
        for (TermInSumContext x : ctx.termInSum()) {
            sumSoFar = sumSoFar.plus(visit(x));
        }
        return sumSoFar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitTermInSum(AlgebraParser.TermInSumContext ctx) {
        AlgebraicExpression evaluatedTerm = visit(ctx.compositeterm());
        if (ctx.op.getType() == AlgebraParser.SUB) {
            evaluatedTerm = evaluatedTerm.asNegative();
        }
        return evaluatedTerm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitSimpleNumber(AlgebraParser.SimpleNumberContext ctx) {
        int coefficient = Integer.parseInt(ctx.coefficient().getText());
        return new CompositeTerm(coefficient);
    }

    /**
     * Returns a simplified set containing one SimpleTerm for each algebraic variable,
     * by multiplying the terms in the list together..
     */
    private HashSet<SimpleTerm> getSimpleTerms(List<AlgebraParser.SimpletermContext> termContextList) {
        HashSet<SimpleTerm> newTermSet = new HashSet<>();
        for (SimpletermContext i : termContextList) {
            AlgebraicExpression term = visit(i);
            thisTermSetLoop:
            for (SimpleTerm j : term.giveATerm().getSet()) {
                final char jSymbol = j.getSymbol();
                for (SimpleTerm k : newTermSet) {
                    if (jSymbol == k.getSymbol()) {
                        SimpleTerm multipliedTerm = j.multiplyWithSameSymbol(k);
                        newTermSet.remove(k);
                        newTermSet.add(multipliedTerm);
                        continue thisTermSetLoop;
                    }
                }
                newTermSet.add(j);
            }
        }
        return newTermSet;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitWithCoefficient(AlgebraParser.WithCoefficientContext ctx) {
        int coefficient = Integer.parseInt(ctx.coefficient().getText());
        HashSet<SimpleTerm> newTermSet = getSimpleTerms(ctx.simpleterm());
        return new CompositeTerm(newTermSet, coefficient);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitWithoutCoefficient(AlgebraParser.WithoutCoefficientContext ctx) {
        HashSet<SimpleTerm> newTermSet = getSimpleTerms(ctx.simpleterm());
        return new CompositeTerm(newTermSet);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitWithoutExponent(AlgebraParser.WithoutExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        return new CompositeTerm(character);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitWithPositiveExponent(AlgebraParser.WithPositiveExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        int exponent = Integer.parseInt(ctx.POSITIVE_INT().getText());
        return new CompositeTerm(character, 1, exponent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression visitWithNegativeExponent(AlgebraParser.WithNegativeExponentContext ctx) {
        char character = ctx.CHAR().getText().charAt(0);
        int exponent = -1 * Integer.parseInt(ctx.POSITIVE_INT().getText());
        return new CompositeTerm(character, 1, exponent);
    }
}
