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
			null, "'('", "')'", "'^'", "'*'", "'-'", "'+'"
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
			case T__0:
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				potentiallyComplicatedFactor();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << POSITIVE_INT) | (1L << CHAR))) != 0) );
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PotentiallyComplicatedFactorSFFEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				simpleFullyFactorisedExpression();
				}
				break;
			case 2:
				_localctx = new PotentiallyComplicatedProductInBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__0);
				setState(55);
				potentiallyComplicatedProduct();
				setState(56);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new AlgebraicExpressionInBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(T__0);
				setState(59);
				algebraicExpression();
				setState(60);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new PotentiallyComplicatedFactorEIBWPPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ExpressionInBracketsWONestedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__0);
				setState(66);
				expressionWithoutNestedBrackets();
				setState(67);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ExpressionInBracketsPositivePowerWONestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__0);
				setState(70);
				expressionWithoutNestedBrackets();
				setState(71);
				match(T__1);
				{
				setState(72);
				match(T__2);
				setState(73);
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExpressionWONestedStartingWithNegativeSFFEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(SUB);
				setState(78);
				simpleFullyFactorisedExpression();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(79);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ExpressionWONestedStartingWithSOTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				sumofterms();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(86);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ExpressionWONestedStartingWithSFFEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				simpleFullyFactorisedExpression();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(93);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new ExpressionWONestedStartingWithCTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				compositeterm();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB || _la==PLUS) {
					{
					{
					setState(100);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(105);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SffeInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
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
				setState(109);
				simpleFullyFactorisedExpression();
				}
				break;
			case 2:
				_localctx = new SotInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(PLUS);
				setState(111);
				sumofterms();
				}
				break;
			case 3:
				_localctx = new CtInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(PLUS);
				setState(113);
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(116);
				sumInBracketsPossiblyWithPower();
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				{
				setState(117);
				compositeterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					sumInBracketsPossiblyWithPower();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SumInBracketsWithPowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__0);
				setState(127);
				sumofterms();
				setState(128);
				match(T__1);
				setState(129);
				match(T__2);
				setState(130);
				match(POSITIVE_INT);
				}
				break;
			case 2:
				_localctx = new SumInBracketsWithoutPowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__0);
				setState(133);
				sumofterms();
				setState(134);
				match(T__1);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new SumOfTermsFirstTermNegativeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(SUB);
				{
				setState(139);
				((SumOfTermsFirstTermNegativeContext)_localctx).startTerm = compositeterm();
				}
				setState(141); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140);
						termInSum();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(143); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				_localctx = new SumOfTermsFirstTermPositiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				((SumOfTermsFirstTermPositiveContext)_localctx).startTerm = compositeterm();
				}
				setState(147); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(146);
						termInSum();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(149); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(153);
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
			setState(154);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new WithCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				coefficient();
				setState(157);
				simpleterm();
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(158);
							match(T__3);
							}
						}

						setState(161);
						simpleterm();
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				coefficient();
				}
				break;
			case 3:
				_localctx = new WithoutCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				simpleterm();
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(169);
							match(T__3);
							}
						}

						setState(172);
						simpleterm();
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			setState(180);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new WithoutExponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(CHAR);
				}
				break;
			case 2:
				_localctx = new WithPositiveExponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(CHAR);
				setState(184);
				match(T__2);
				setState(185);
				match(POSITIVE_INT);
				}
				break;
			case 3:
				_localctx = new WithNegativeExponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(CHAR);
				setState(187);
				match(T__2);
				setState(188);
				match(SUB);
				setState(189);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u00c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\5\2.\n\2\3\3\3\3\3\3\3\4\6\4"+
		"\64\n\4\r\4\16\4\65\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\7\7S\n\7\f"+
		"\7\16\7V\13\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\7\7a\n\7\f\7\16"+
		"\7d\13\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bu\n\b\3\t\3\t\5\ty\n\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\6\13\u0090"+
		"\n\13\r\13\16\13\u0091\3\13\3\13\6\13\u0096\n\13\r\13\16\13\u0097\5\13"+
		"\u009a\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a2\n\r\3\r\7\r\u00a5\n\r\f"+
		"\r\16\r\u00a8\13\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\r\7\r\u00b0\n\r\f\r\16"+
		"\r\u00b3\13\r\5\r\u00b5\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00c1\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\3\3\2\7\b\2\u00d3\2-\3\2\2\2\4/\3\2\2\2\6\63\3\2\2\2\bA\3\2\2\2"+
		"\nM\3\2\2\2\fl\3\2\2\2\16t\3\2\2\2\20x\3\2\2\2\22\u008a\3\2\2\2\24\u0099"+
		"\3\2\2\2\26\u009b\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\u00c0\3"+
		"\2\2\2\36\37\7\7\2\2\37#\5\6\4\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$.\3\2\2\2%#\3\2\2\2&*\5\6\4\2\')\5\4\3\2(\'\3\2\2\2),\3"+
		"\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-\36\3\2\2\2-&\3\2\2\2."+
		"\3\3\2\2\2/\60\t\2\2\2\60\61\5\6\4\2\61\5\3\2\2\2\62\64\5\b\5\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67B\5"+
		"\20\t\289\7\3\2\29:\5\6\4\2:;\7\4\2\2;B\3\2\2\2<=\7\3\2\2=>\5\2\2\2>?"+
		"\7\4\2\2?B\3\2\2\2@B\5\n\6\2A\67\3\2\2\2A8\3\2\2\2A<\3\2\2\2A@\3\2\2\2"+
		"B\t\3\2\2\2CD\7\3\2\2DE\5\f\7\2EF\7\4\2\2FN\3\2\2\2GH\7\3\2\2HI\5\f\7"+
		"\2IJ\7\4\2\2JK\7\5\2\2KL\7\t\2\2LN\3\2\2\2MC\3\2\2\2MG\3\2\2\2N\13\3\2"+
		"\2\2OP\7\7\2\2PT\5\20\t\2QS\5\16\b\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2Um\3\2\2\2VT\3\2\2\2W[\5\24\13\2XZ\5\16\b\2YX\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\m\3\2\2\2][\3\2\2\2^b\5\20\t\2_a\5\16\b\2`_\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cm\3\2\2\2db\3\2\2\2ei\5\30\r\2fh\5"+
		"\16\b\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2lO"+
		"\3\2\2\2lW\3\2\2\2l^\3\2\2\2le\3\2\2\2m\r\3\2\2\2no\t\2\2\2ou\5\20\t\2"+
		"pq\7\b\2\2qu\5\24\13\2rs\7\b\2\2su\5\30\r\2tn\3\2\2\2tp\3\2\2\2tr\3\2"+
		"\2\2u\17\3\2\2\2vy\5\22\n\2wy\5\30\r\2xv\3\2\2\2xw\3\2\2\2y}\3\2\2\2z"+
		"|\5\22\n\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\7\3\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\4\2"+
		"\2\u0083\u0084\7\5\2\2\u0084\u0085\7\t\2\2\u0085\u008b\3\2\2\2\u0086\u0087"+
		"\7\3\2\2\u0087\u0088\5\24\13\2\u0088\u0089\7\4\2\2\u0089\u008b\3\2\2\2"+
		"\u008a\u0080\3\2\2\2\u008a\u0086\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d"+
		"\7\7\2\2\u008d\u008f\5\30\r\2\u008e\u0090\5\26\f\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009a"+
		"\3\2\2\2\u0093\u0095\5\30\r\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u008c\3\2\2\2\u0099\u0093\3\2\2\2\u009a\25\3\2\2\2\u009b"+
		"\u009c\t\2\2\2\u009c\u009d\5\30\r\2\u009d\27\3\2\2\2\u009e\u009f\5\32"+
		"\16\2\u009f\u00a6\5\34\17\2\u00a0\u00a2\7\6\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\5\34\17\2\u00a4\u00a1\3"+
		"\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00b5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b5\5\32\16\2\u00aa\u00b1\5"+
		"\34\17\2\u00ab\u00ad\7\6\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\5\34\17\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u009e\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00aa\3\2"+
		"\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7\t\2\2\u00b7\33\3\2\2\2\u00b8\u00c1"+
		"\7\n\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00c1\7\t\2\2\u00bc"+
		"\u00bd\7\n\2\2\u00bd\u00be\7\5\2\2\u00be\u00bf\7\7\2\2\u00bf\u00c1\7\t"+
		"\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1"+
		"\35\3\2\2\2\32#*-\65AMT[biltx}\u008a\u0091\u0097\u0099\u00a1\u00a6\u00ac"+
		"\u00b1\u00b4\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}