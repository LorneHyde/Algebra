// Generated from C:/Users/lorni/IdeaProjects/Algebra/src/main/antlr4\Algebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgebraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SUB=5, PLUS=6, POSITIVE_INT=7, CHAR=8, 
		WS=9;
	public static final int
		RULE_algebraicExpression = 0, RULE_potentialyComplicatedProductWithSign = 1, 
		RULE_potentiallyComplicatedProduct = 2, RULE_potentiallyComplicatedFactor = 3, 
		RULE_expressionInBracketsWithPotentialPower = 4, RULE_expressionWithoutNestedBrackets = 5, 
		RULE_termInExprWithoutNestedBrackets = 6, RULE_simpleFullyFactorisedExpression = 7, 
		RULE_sumInBracketsPossiblyWithPower = 8, RULE_sumofterms = 9, RULE_termInSum = 10, 
		RULE_compositeterm = 11, RULE_coefficient = 12, RULE_simpleterm = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"algebraicExpression", "potentialyComplicatedProductWithSign", "potentiallyComplicatedProduct", 
			"potentiallyComplicatedFactor", "expressionInBracketsWithPotentialPower", 
			"expressionWithoutNestedBrackets", "termInExprWithoutNestedBrackets", 
			"simpleFullyFactorisedExpression", "sumInBracketsPossiblyWithPower", 
			"sumofterms", "termInSum", "compositeterm", "coefficient", "simpleterm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'('", "')'", "'^'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SUB", "PLUS", "POSITIVE_INT", "CHAR", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Algebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgebraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AlgebraicExpressionContext extends ParserRuleContext {
		public AlgebraicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algebraicExpression; }
	 
		public AlgebraicExpressionContext() { }
		public void copyFrom(AlgebraicExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlgebraicExpressionFirstTermNegativeContext extends AlgebraicExpressionContext {
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public PotentiallyComplicatedProductContext potentiallyComplicatedProduct() {
			return getRuleContext(PotentiallyComplicatedProductContext.class,0);
		}
		public List<PotentialyComplicatedProductWithSignContext> potentialyComplicatedProductWithSign() {
			return getRuleContexts(PotentialyComplicatedProductWithSignContext.class);
		}
		public PotentialyComplicatedProductWithSignContext potentialyComplicatedProductWithSign(int i) {
			return getRuleContext(PotentialyComplicatedProductWithSignContext.class,i);
		}
		public AlgebraicExpressionFirstTermNegativeContext(AlgebraicExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterAlgebraicExpressionFirstTermNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitAlgebraicExpressionFirstTermNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitAlgebraicExpressionFirstTermNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlgebraicExpressionFirstTermPositiveContext extends AlgebraicExpressionContext {
		public PotentiallyComplicatedProductContext potentiallyComplicatedProduct() {
			return getRuleContext(PotentiallyComplicatedProductContext.class,0);
		}
		public List<PotentialyComplicatedProductWithSignContext> potentialyComplicatedProductWithSign() {
			return getRuleContexts(PotentialyComplicatedProductWithSignContext.class);
		}
		public PotentialyComplicatedProductWithSignContext potentialyComplicatedProductWithSign(int i) {
			return getRuleContext(PotentialyComplicatedProductWithSignContext.class,i);
		}
		public AlgebraicExpressionFirstTermPositiveContext(AlgebraicExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterAlgebraicExpressionFirstTermPositive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitAlgebraicExpressionFirstTermPositive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitAlgebraicExpressionFirstTermPositive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgebraicExpressionContext algebraicExpression() throws RecognitionException {
		AlgebraicExpressionContext _localctx = new AlgebraicExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_algebraicExpression);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new AlgebraicExpressionFirstTermNegativeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(SUB);
				setState(29);
				potentiallyComplicatedProduct();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(30);
					potentialyComplicatedProductWithSign();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
			case POSITIVE_INT:
			case CHAR:
				_localctx = new AlgebraicExpressionFirstTermPositiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				potentiallyComplicatedProduct();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(37);
					potentialyComplicatedProductWithSign();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PotentialyComplicatedProductWithSignContext extends ParserRuleContext {
		public Token op;
		public PotentiallyComplicatedProductContext potentiallyComplicatedProduct() {
			return getRuleContext(PotentiallyComplicatedProductContext.class,0);
		}
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(AlgebraParser.PLUS, 0); }
		public PotentialyComplicatedProductWithSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potentialyComplicatedProductWithSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterPotentialyComplicatedProductWithSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitPotentialyComplicatedProductWithSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitPotentialyComplicatedProductWithSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotentialyComplicatedProductWithSignContext potentialyComplicatedProductWithSign() throws RecognitionException {
		PotentialyComplicatedProductWithSignContext _localctx = new PotentialyComplicatedProductWithSignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_potentialyComplicatedProductWithSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((PotentialyComplicatedProductWithSignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SUB || _la==PLUS) ) {
				((PotentialyComplicatedProductWithSignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(46);
			potentiallyComplicatedProduct();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PotentiallyComplicatedProductContext extends ParserRuleContext {
		public List<PotentiallyComplicatedFactorContext> potentiallyComplicatedFactor() {
			return getRuleContexts(PotentiallyComplicatedFactorContext.class);
		}
		public PotentiallyComplicatedFactorContext potentiallyComplicatedFactor(int i) {
			return getRuleContext(PotentiallyComplicatedFactorContext.class,i);
		}
		public PotentiallyComplicatedProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potentiallyComplicatedProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterPotentiallyComplicatedProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitPotentiallyComplicatedProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitPotentiallyComplicatedProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotentiallyComplicatedProductContext potentiallyComplicatedProduct() throws RecognitionException {
		PotentiallyComplicatedProductContext _localctx = new PotentiallyComplicatedProductContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_potentiallyComplicatedProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			potentiallyComplicatedFactor();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << POSITIVE_INT) | (1L << CHAR))) != 0)) {
				{
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(49);
					match(T__0);
					}
				}

				setState(52);
				potentiallyComplicatedFactor();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PotentiallyComplicatedFactorContext extends ParserRuleContext {
		public PotentiallyComplicatedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potentiallyComplicatedFactor; }
	 
		public PotentiallyComplicatedFactorContext() { }
		public void copyFrom(PotentiallyComplicatedFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PotentiallyComplicatedProductInBracketsContext extends PotentiallyComplicatedFactorContext {
		public PotentiallyComplicatedProductContext potentiallyComplicatedProduct() {
			return getRuleContext(PotentiallyComplicatedProductContext.class,0);
		}
		public PotentiallyComplicatedProductInBracketsContext(PotentiallyComplicatedFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterPotentiallyComplicatedProductInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitPotentiallyComplicatedProductInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitPotentiallyComplicatedProductInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotentiallyComplicatedFactorEIBWPPContext extends PotentiallyComplicatedFactorContext {
		public ExpressionInBracketsWithPotentialPowerContext expressionInBracketsWithPotentialPower() {
			return getRuleContext(ExpressionInBracketsWithPotentialPowerContext.class,0);
		}
		public PotentiallyComplicatedFactorEIBWPPContext(PotentiallyComplicatedFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterPotentiallyComplicatedFactorEIBWPP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitPotentiallyComplicatedFactorEIBWPP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitPotentiallyComplicatedFactorEIBWPP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlgebraicExpressionInBracketsContext extends PotentiallyComplicatedFactorContext {
		public AlgebraicExpressionContext algebraicExpression() {
			return getRuleContext(AlgebraicExpressionContext.class,0);
		}
		public AlgebraicExpressionInBracketsContext(PotentiallyComplicatedFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterAlgebraicExpressionInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitAlgebraicExpressionInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitAlgebraicExpressionInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotentiallyComplicatedFactorSFFEContext extends PotentiallyComplicatedFactorContext {
		public SimpleFullyFactorisedExpressionContext simpleFullyFactorisedExpression() {
			return getRuleContext(SimpleFullyFactorisedExpressionContext.class,0);
		}
		public PotentiallyComplicatedFactorSFFEContext(PotentiallyComplicatedFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterPotentiallyComplicatedFactorSFFE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitPotentiallyComplicatedFactorSFFE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitPotentiallyComplicatedFactorSFFE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotentiallyComplicatedFactorContext potentiallyComplicatedFactor() throws RecognitionException {
		PotentiallyComplicatedFactorContext _localctx = new PotentiallyComplicatedFactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_potentiallyComplicatedFactor);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PotentiallyComplicatedFactorSFFEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				simpleFullyFactorisedExpression();
				}
				break;
			case 2:
				_localctx = new PotentiallyComplicatedProductInBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__1);
				setState(60);
				potentiallyComplicatedProduct();
				setState(61);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new AlgebraicExpressionInBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__1);
				setState(64);
				algebraicExpression();
				setState(65);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new PotentiallyComplicatedFactorEIBWPPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				expressionInBracketsWithPotentialPower();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionInBracketsWithPotentialPowerContext extends ParserRuleContext {
		public ExpressionInBracketsWithPotentialPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInBracketsWithPotentialPower; }
	 
		public ExpressionInBracketsWithPotentialPowerContext() { }
		public void copyFrom(ExpressionInBracketsWithPotentialPowerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionInBracketsWONestedContext extends ExpressionInBracketsWithPotentialPowerContext {
		public ExpressionWithoutNestedBracketsContext expressionWithoutNestedBrackets() {
			return getRuleContext(ExpressionWithoutNestedBracketsContext.class,0);
		}
		public ExpressionInBracketsWONestedContext(ExpressionInBracketsWithPotentialPowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionInBracketsWONested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionInBracketsWONested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionInBracketsWONested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionInBracketsPositivePowerWONestedContext extends ExpressionInBracketsWithPotentialPowerContext {
		public ExpressionWithoutNestedBracketsContext expressionWithoutNestedBrackets() {
			return getRuleContext(ExpressionWithoutNestedBracketsContext.class,0);
		}
		public TerminalNode POSITIVE_INT() { return getToken(AlgebraParser.POSITIVE_INT, 0); }
		public ExpressionInBracketsPositivePowerWONestedContext(ExpressionInBracketsWithPotentialPowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionInBracketsPositivePowerWONested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionInBracketsPositivePowerWONested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionInBracketsPositivePowerWONested(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInBracketsWithPotentialPowerContext expressionInBracketsWithPotentialPower() throws RecognitionException {
		ExpressionInBracketsWithPotentialPowerContext _localctx = new ExpressionInBracketsWithPotentialPowerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionInBracketsWithPotentialPower);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ExpressionInBracketsWONestedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__1);
				setState(71);
				expressionWithoutNestedBrackets();
				setState(72);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new ExpressionInBracketsPositivePowerWONestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__1);
				setState(75);
				expressionWithoutNestedBrackets();
				setState(76);
				match(T__2);
				{
				setState(77);
				match(T__3);
				setState(78);
				match(POSITIVE_INT);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionWithoutNestedBracketsContext extends ParserRuleContext {
		public ExpressionWithoutNestedBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithoutNestedBrackets; }
	 
		public ExpressionWithoutNestedBracketsContext() { }
		public void copyFrom(ExpressionWithoutNestedBracketsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionWONestedStartingWithNegativeSFFEContext extends ExpressionWithoutNestedBracketsContext {
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public SimpleFullyFactorisedExpressionContext simpleFullyFactorisedExpression() {
			return getRuleContext(SimpleFullyFactorisedExpressionContext.class,0);
		}
		public List<TermInExprWithoutNestedBracketsContext> termInExprWithoutNestedBrackets() {
			return getRuleContexts(TermInExprWithoutNestedBracketsContext.class);
		}
		public TermInExprWithoutNestedBracketsContext termInExprWithoutNestedBrackets(int i) {
			return getRuleContext(TermInExprWithoutNestedBracketsContext.class,i);
		}
		public ExpressionWONestedStartingWithNegativeSFFEContext(ExpressionWithoutNestedBracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionWONestedStartingWithNegativeSFFE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionWONestedStartingWithNegativeSFFE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionWONestedStartingWithNegativeSFFE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionWONestedStartingWithSFFEContext extends ExpressionWithoutNestedBracketsContext {
		public SimpleFullyFactorisedExpressionContext simpleFullyFactorisedExpression() {
			return getRuleContext(SimpleFullyFactorisedExpressionContext.class,0);
		}
		public List<TermInExprWithoutNestedBracketsContext> termInExprWithoutNestedBrackets() {
			return getRuleContexts(TermInExprWithoutNestedBracketsContext.class);
		}
		public TermInExprWithoutNestedBracketsContext termInExprWithoutNestedBrackets(int i) {
			return getRuleContext(TermInExprWithoutNestedBracketsContext.class,i);
		}
		public ExpressionWONestedStartingWithSFFEContext(ExpressionWithoutNestedBracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionWONestedStartingWithSFFE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionWONestedStartingWithSFFE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionWONestedStartingWithSFFE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionWONestedStartingWithCTContext extends ExpressionWithoutNestedBracketsContext {
		public CompositetermContext compositeterm() {
			return getRuleContext(CompositetermContext.class,0);
		}
		public List<TermInExprWithoutNestedBracketsContext> termInExprWithoutNestedBrackets() {
			return getRuleContexts(TermInExprWithoutNestedBracketsContext.class);
		}
		public TermInExprWithoutNestedBracketsContext termInExprWithoutNestedBrackets(int i) {
			return getRuleContext(TermInExprWithoutNestedBracketsContext.class,i);
		}
		public ExpressionWONestedStartingWithCTContext(ExpressionWithoutNestedBracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionWONestedStartingWithCT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionWONestedStartingWithCT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionWONestedStartingWithCT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionWONestedStartingWithSOTContext extends ExpressionWithoutNestedBracketsContext {
		public SumoftermsContext sumofterms() {
			return getRuleContext(SumoftermsContext.class,0);
		}
		public List<TermInExprWithoutNestedBracketsContext> termInExprWithoutNestedBrackets() {
			return getRuleContexts(TermInExprWithoutNestedBracketsContext.class);
		}
		public TermInExprWithoutNestedBracketsContext termInExprWithoutNestedBrackets(int i) {
			return getRuleContext(TermInExprWithoutNestedBracketsContext.class,i);
		}
		public ExpressionWONestedStartingWithSOTContext(ExpressionWithoutNestedBracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionWONestedStartingWithSOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionWONestedStartingWithSOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionWONestedStartingWithSOT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithoutNestedBracketsContext expressionWithoutNestedBrackets() throws RecognitionException {
		ExpressionWithoutNestedBracketsContext _localctx = new ExpressionWithoutNestedBracketsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionWithoutNestedBrackets);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ExpressionWONestedStartingWithNegativeSFFEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(SUB);
				setState(83);
				simpleFullyFactorisedExpression();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(84);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ExpressionWONestedStartingWithSOTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				sumofterms();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(91);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ExpressionWONestedStartingWithSFFEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				simpleFullyFactorisedExpression();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(98);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new ExpressionWONestedStartingWithCTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				compositeterm();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(105);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermInExprWithoutNestedBracketsContext extends ParserRuleContext {
		public TermInExprWithoutNestedBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termInExprWithoutNestedBrackets; }
	 
		public TermInExprWithoutNestedBracketsContext() { }
		public void copyFrom(TermInExprWithoutNestedBracketsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SffeInExprWithoutNestedBracketsContext extends TermInExprWithoutNestedBracketsContext {
		public Token op;
		public SimpleFullyFactorisedExpressionContext simpleFullyFactorisedExpression() {
			return getRuleContext(SimpleFullyFactorisedExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(AlgebraParser.PLUS, 0); }
		public SffeInExprWithoutNestedBracketsContext(TermInExprWithoutNestedBracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSffeInExprWithoutNestedBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSffeInExprWithoutNestedBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSffeInExprWithoutNestedBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtInExprWithoutNestedBracketsContext extends TermInExprWithoutNestedBracketsContext {
		public TerminalNode PLUS() { return getToken(AlgebraParser.PLUS, 0); }
		public CompositetermContext compositeterm() {
			return getRuleContext(CompositetermContext.class,0);
		}
		public CtInExprWithoutNestedBracketsContext(TermInExprWithoutNestedBracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterCtInExprWithoutNestedBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitCtInExprWithoutNestedBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitCtInExprWithoutNestedBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SotInExprWithoutNestedBracketsContext extends TermInExprWithoutNestedBracketsContext {
		public TerminalNode PLUS() { return getToken(AlgebraParser.PLUS, 0); }
		public SumoftermsContext sumofterms() {
			return getRuleContext(SumoftermsContext.class,0);
		}
		public SotInExprWithoutNestedBracketsContext(TermInExprWithoutNestedBracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSotInExprWithoutNestedBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSotInExprWithoutNestedBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSotInExprWithoutNestedBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermInExprWithoutNestedBracketsContext termInExprWithoutNestedBrackets() throws RecognitionException {
		TermInExprWithoutNestedBracketsContext _localctx = new TermInExprWithoutNestedBracketsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termInExprWithoutNestedBrackets);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SffeInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(113);
				((SffeInExprWithoutNestedBracketsContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==PLUS) ) {
					((SffeInExprWithoutNestedBracketsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(114);
				simpleFullyFactorisedExpression();
				}
				break;
			case 2:
				_localctx = new SotInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(PLUS);
				setState(116);
				sumofterms();
				}
				break;
			case 3:
				_localctx = new CtInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(PLUS);
				setState(118);
				compositeterm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleFullyFactorisedExpressionContext extends ParserRuleContext {
		public List<SumInBracketsPossiblyWithPowerContext> sumInBracketsPossiblyWithPower() {
			return getRuleContexts(SumInBracketsPossiblyWithPowerContext.class);
		}
		public SumInBracketsPossiblyWithPowerContext sumInBracketsPossiblyWithPower(int i) {
			return getRuleContext(SumInBracketsPossiblyWithPowerContext.class,i);
		}
		public CompositetermContext compositeterm() {
			return getRuleContext(CompositetermContext.class,0);
		}
		public SimpleFullyFactorisedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFullyFactorisedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSimpleFullyFactorisedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSimpleFullyFactorisedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSimpleFullyFactorisedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleFullyFactorisedExpressionContext simpleFullyFactorisedExpression() throws RecognitionException {
		SimpleFullyFactorisedExpressionContext _localctx = new SimpleFullyFactorisedExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleFullyFactorisedExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(121);
				sumInBracketsPossiblyWithPower();
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				{
				setState(122);
				compositeterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					sumInBracketsPossiblyWithPower();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumInBracketsPossiblyWithPowerContext extends ParserRuleContext {
		public SumInBracketsPossiblyWithPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumInBracketsPossiblyWithPower; }
	 
		public SumInBracketsPossiblyWithPowerContext() { }
		public void copyFrom(SumInBracketsPossiblyWithPowerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumInBracketsWithPowerContext extends SumInBracketsPossiblyWithPowerContext {
		public SumoftermsContext sumofterms() {
			return getRuleContext(SumoftermsContext.class,0);
		}
		public TerminalNode POSITIVE_INT() { return getToken(AlgebraParser.POSITIVE_INT, 0); }
		public SumInBracketsWithPowerContext(SumInBracketsPossiblyWithPowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSumInBracketsWithPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSumInBracketsWithPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSumInBracketsWithPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumInBracketsWithoutPowerContext extends SumInBracketsPossiblyWithPowerContext {
		public SumoftermsContext sumofterms() {
			return getRuleContext(SumoftermsContext.class,0);
		}
		public SumInBracketsWithoutPowerContext(SumInBracketsPossiblyWithPowerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSumInBracketsWithoutPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSumInBracketsWithoutPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSumInBracketsWithoutPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumInBracketsPossiblyWithPowerContext sumInBracketsPossiblyWithPower() throws RecognitionException {
		SumInBracketsPossiblyWithPowerContext _localctx = new SumInBracketsPossiblyWithPowerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sumInBracketsPossiblyWithPower);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new SumInBracketsWithPowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__1);
				setState(132);
				sumofterms();
				setState(133);
				match(T__2);
				setState(134);
				match(T__3);
				setState(135);
				match(POSITIVE_INT);
				}
				break;
			case 2:
				_localctx = new SumInBracketsWithoutPowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__1);
				setState(138);
				sumofterms();
				setState(139);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumoftermsContext extends ParserRuleContext {
		public SumoftermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumofterms; }
	 
		public SumoftermsContext() { }
		public void copyFrom(SumoftermsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumOfTermsFirstTermPositiveContext extends SumoftermsContext {
		public CompositetermContext startTerm;
		public CompositetermContext compositeterm() {
			return getRuleContext(CompositetermContext.class,0);
		}
		public List<TermInSumContext> termInSum() {
			return getRuleContexts(TermInSumContext.class);
		}
		public TermInSumContext termInSum(int i) {
			return getRuleContext(TermInSumContext.class,i);
		}
		public SumOfTermsFirstTermPositiveContext(SumoftermsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSumOfTermsFirstTermPositive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSumOfTermsFirstTermPositive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSumOfTermsFirstTermPositive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumOfTermsFirstTermNegativeContext extends SumoftermsContext {
		public CompositetermContext startTerm;
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public CompositetermContext compositeterm() {
			return getRuleContext(CompositetermContext.class,0);
		}
		public List<TermInSumContext> termInSum() {
			return getRuleContexts(TermInSumContext.class);
		}
		public TermInSumContext termInSum(int i) {
			return getRuleContext(TermInSumContext.class,i);
		}
		public SumOfTermsFirstTermNegativeContext(SumoftermsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSumOfTermsFirstTermNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSumOfTermsFirstTermNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSumOfTermsFirstTermNegative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumoftermsContext sumofterms() throws RecognitionException {
		SumoftermsContext _localctx = new SumoftermsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sumofterms);
		try {
			int _alt;
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new SumOfTermsFirstTermNegativeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(SUB);
				{
				setState(144);
				((SumOfTermsFirstTermNegativeContext)_localctx).startTerm = compositeterm();
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(145);
						termInSum();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(148); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				_localctx = new SumOfTermsFirstTermPositiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(150);
				((SumOfTermsFirstTermPositiveContext)_localctx).startTerm = compositeterm();
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(151);
						termInSum();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(154); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermInSumContext extends ParserRuleContext {
		public Token op;
		public CompositetermContext compositeterm() {
			return getRuleContext(CompositetermContext.class,0);
		}
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(AlgebraParser.PLUS, 0); }
		public TermInSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termInSum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterTermInSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitTermInSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitTermInSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermInSumContext termInSum() throws RecognitionException {
		TermInSumContext _localctx = new TermInSumContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termInSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(158);
			((TermInSumContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SUB || _la==PLUS) ) {
				((TermInSumContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(159);
			compositeterm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositetermContext extends ParserRuleContext {
		public CompositetermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeterm; }
	 
		public CompositetermContext() { }
		public void copyFrom(CompositetermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithoutCoefficientContext extends CompositetermContext {
		public List<SimpletermContext> simpleterm() {
			return getRuleContexts(SimpletermContext.class);
		}
		public SimpletermContext simpleterm(int i) {
			return getRuleContext(SimpletermContext.class,i);
		}
		public WithoutCoefficientContext(CompositetermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterWithoutCoefficient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitWithoutCoefficient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitWithoutCoefficient(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithCoefficientContext extends CompositetermContext {
		public CoefficientContext coefficient() {
			return getRuleContext(CoefficientContext.class,0);
		}
		public List<SimpletermContext> simpleterm() {
			return getRuleContexts(SimpletermContext.class);
		}
		public SimpletermContext simpleterm(int i) {
			return getRuleContext(SimpletermContext.class,i);
		}
		public WithCoefficientContext(CompositetermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterWithCoefficient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitWithCoefficient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitWithCoefficient(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleNumberContext extends CompositetermContext {
		public CoefficientContext coefficient() {
			return getRuleContext(CoefficientContext.class,0);
		}
		public SimpleNumberContext(CompositetermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSimpleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSimpleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSimpleNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositetermContext compositeterm() throws RecognitionException {
		CompositetermContext _localctx = new CompositetermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compositeterm);
		int _la;
		try {
			int _alt;
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new WithCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				coefficient();
				setState(162);
				simpleterm();
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(163);
							match(T__0);
							}
						}

						setState(166);
						simpleterm();
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				coefficient();
				}
				break;
			case 3:
				_localctx = new WithoutCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				simpleterm();
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(174);
							match(T__0);
							}
						}

						setState(177);
						simpleterm();
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoefficientContext extends ParserRuleContext {
		public TerminalNode POSITIVE_INT() { return getToken(AlgebraParser.POSITIVE_INT, 0); }
		public CoefficientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coefficient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterCoefficient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitCoefficient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitCoefficient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoefficientContext coefficient() throws RecognitionException {
		CoefficientContext _localctx = new CoefficientContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_coefficient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(POSITIVE_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletermContext extends ParserRuleContext {
		public SimpletermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleterm; }
	 
		public SimpletermContext() { }
		public void copyFrom(SimpletermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithNegativeExponentContext extends SimpletermContext {
		public TerminalNode CHAR() { return getToken(AlgebraParser.CHAR, 0); }
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(AlgebraParser.POSITIVE_INT, 0); }
		public WithNegativeExponentContext(SimpletermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterWithNegativeExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitWithNegativeExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitWithNegativeExponent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithPositiveExponentContext extends SimpletermContext {
		public TerminalNode CHAR() { return getToken(AlgebraParser.CHAR, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(AlgebraParser.POSITIVE_INT, 0); }
		public WithPositiveExponentContext(SimpletermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterWithPositiveExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitWithPositiveExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitWithPositiveExponent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithoutExponentContext extends SimpletermContext {
		public TerminalNode CHAR() { return getToken(AlgebraParser.CHAR, 0); }
		public WithoutExponentContext(SimpletermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterWithoutExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitWithoutExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitWithoutExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletermContext simpleterm() throws RecognitionException {
		SimpletermContext _localctx = new SimpletermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleterm);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new WithoutExponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(CHAR);
				}
				break;
			case 2:
				_localctx = new WithPositiveExponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(CHAR);
				setState(189);
				match(T__3);
				setState(190);
				match(POSITIVE_INT);
				}
				break;
			case 3:
				_localctx = new WithNegativeExponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(CHAR);
				setState(192);
				match(T__3);
				setState(193);
				match(SUB);
				setState(194);
				match(POSITIVE_INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\5\2.\n\2\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\65\n\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3"+
		"\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7"+
		"\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\5\7r\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\5\t~\n\t\3\t\7\t\u0081\n\t\f"+
		"\t\16\t\u0084\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n"+
		"\n\3\13\3\13\3\13\6\13\u0095\n\13\r\13\16\13\u0096\3\13\3\13\6\13\u009b"+
		"\n\13\r\13\16\13\u009c\5\13\u009f\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a7"+
		"\n\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3\r\3\r\3\r\5\r\u00b2\n\r\3"+
		"\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\5\r\u00ba\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c6\n\17\3\17\2\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\3\3\2\7\b\2\u00d9\2-\3\2\2\2\4/\3\2\2\2\6\62"+
		"\3\2\2\2\bF\3\2\2\2\nR\3\2\2\2\fq\3\2\2\2\16y\3\2\2\2\20}\3\2\2\2\22\u008f"+
		"\3\2\2\2\24\u009e\3\2\2\2\26\u00a0\3\2\2\2\30\u00b9\3\2\2\2\32\u00bb\3"+
		"\2\2\2\34\u00c5\3\2\2\2\36\37\7\7\2\2\37#\5\6\4\2 \"\5\4\3\2! \3\2\2\2"+
		"\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$.\3\2\2\2%#\3\2\2\2&*\5\6\4\2\')\5\4\3"+
		"\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-\36\3"+
		"\2\2\2-&\3\2\2\2.\3\3\2\2\2/\60\t\2\2\2\60\61\5\6\4\2\61\5\3\2\2\2\62"+
		"9\5\b\5\2\63\65\7\3\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\668"+
		"\5\b\5\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\7\3\2\2\2;9\3"+
		"\2\2\2<G\5\20\t\2=>\7\4\2\2>?\5\6\4\2?@\7\5\2\2@G\3\2\2\2AB\7\4\2\2BC"+
		"\5\2\2\2CD\7\5\2\2DG\3\2\2\2EG\5\n\6\2F<\3\2\2\2F=\3\2\2\2FA\3\2\2\2F"+
		"E\3\2\2\2G\t\3\2\2\2HI\7\4\2\2IJ\5\f\7\2JK\7\5\2\2KS\3\2\2\2LM\7\4\2\2"+
		"MN\5\f\7\2NO\7\5\2\2OP\7\6\2\2PQ\7\t\2\2QS\3\2\2\2RH\3\2\2\2RL\3\2\2\2"+
		"S\13\3\2\2\2TU\7\7\2\2UY\5\20\t\2VX\5\16\b\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Zr\3\2\2\2[Y\3\2\2\2\\`\5\24\13\2]_\5\16\b\2^]\3\2\2\2_"+
		"b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ar\3\2\2\2b`\3\2\2\2cg\5\20\t\2df\5\16\b"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hr\3\2\2\2ig\3\2\2\2jn\5\30"+
		"\r\2km\5\16\b\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2qT\3\2\2\2q\\\3\2\2\2qc\3\2\2\2qj\3\2\2\2r\r\3\2\2\2st\t\2\2\2t"+
		"z\5\20\t\2uv\7\b\2\2vz\5\24\13\2wx\7\b\2\2xz\5\30\r\2ys\3\2\2\2yu\3\2"+
		"\2\2yw\3\2\2\2z\17\3\2\2\2{~\5\22\n\2|~\5\30\r\2}{\3\2\2\2}|\3\2\2\2~"+
		"\u0082\3\2\2\2\177\u0081\5\22\n\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5\24\13\2\u0087\u0088\7\5\2\2"+
		"\u0088\u0089\7\6\2\2\u0089\u008a\7\t\2\2\u008a\u0090\3\2\2\2\u008b\u008c"+
		"\7\4\2\2\u008c\u008d\5\24\13\2\u008d\u008e\7\5\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u0085\3\2\2\2\u008f\u008b\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092"+
		"\7\7\2\2\u0092\u0094\5\30\r\2\u0093\u0095\5\26\f\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009f"+
		"\3\2\2\2\u0098\u009a\5\30\r\2\u0099\u009b\5\26\f\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0098\3\2\2\2\u009f\25\3\2\2\2\u00a0"+
		"\u00a1\t\2\2\2\u00a1\u00a2\5\30\r\2\u00a2\27\3\2\2\2\u00a3\u00a4\5\32"+
		"\16\2\u00a4\u00ab\5\34\17\2\u00a5\u00a7\7\3\2\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\5\34\17\2\u00a9\u00a6\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ba\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00ba\5\32\16\2\u00af\u00b6\5"+
		"\34\17\2\u00b0\u00b2\7\3\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\5\34\17\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00a3\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00af\3\2"+
		"\2\2\u00ba\31\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc\33\3\2\2\2\u00bd\u00c6"+
		"\7\n\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c6\7\t\2\2\u00c1"+
		"\u00c2\7\n\2\2\u00c2\u00c3\7\6\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c6\7\t"+
		"\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6"+
		"\35\3\2\2\2\33#*-\649FRY`gnqy}\u0082\u008f\u0096\u009c\u009e\u00a6\u00ab"+
		"\u00b1\u00b6\u00b9\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}