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
		T__0=1, T__1=2, MUL=3, ADD=4, POWER=5, SUB=6, POSITIVE_INT=7, CHAR=8, 
		WS=9;
	public static final int
		RULE_algebraicExpression = 0, RULE_potentiallyComplicatedProduct = 1, 
		RULE_expressionInBracketsWithPotentialPower = 2, RULE_expressionWithoutNestedBrackets = 3, 
		RULE_termInExprWithoutNestedBrackets = 4, RULE_simpleFullyFactorisedExpression = 5, 
		RULE_sumInBracketsPossiblyWithPower = 6, RULE_sumofterms = 7, RULE_termInSum = 8, 
		RULE_compositeterm = 9, RULE_coefficient = 10, RULE_simpleterm = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"algebraicExpression", "potentiallyComplicatedProduct", "expressionInBracketsWithPotentialPower", 
			"expressionWithoutNestedBrackets", "termInExprWithoutNestedBrackets", 
			"simpleFullyFactorisedExpression", "sumInBracketsPossiblyWithPower", 
			"sumofterms", "termInSum", "compositeterm", "coefficient", "simpleterm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'+'", "'^'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MUL", "ADD", "POWER", "SUB", "POSITIVE_INT", "CHAR", 
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
		public List<PotentiallyComplicatedProductContext> potentiallyComplicatedProduct() {
			return getRuleContexts(PotentiallyComplicatedProductContext.class);
		}
		public PotentiallyComplicatedProductContext potentiallyComplicatedProduct(int i) {
			return getRuleContext(PotentiallyComplicatedProductContext.class,i);
		}
		public List<TerminalNode> SUB() { return getTokens(AlgebraParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(AlgebraParser.SUB, i);
		}
		public List<TerminalNode> ADD() { return getTokens(AlgebraParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(AlgebraParser.ADD, i);
		}
		public AlgebraicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algebraicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterAlgebraicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitAlgebraicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitAlgebraicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgebraicExpressionContext algebraicExpression() throws RecognitionException {
		AlgebraicExpressionContext _localctx = new AlgebraicExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_algebraicExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(24);
				match(SUB);
				}
			}

			setState(27);
			potentiallyComplicatedProduct();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				potentiallyComplicatedProduct();
				}
				}
				setState(34);
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

	public static class PotentiallyComplicatedProductContext extends ParserRuleContext {
		public List<SimpleFullyFactorisedExpressionContext> simpleFullyFactorisedExpression() {
			return getRuleContexts(SimpleFullyFactorisedExpressionContext.class);
		}
		public SimpleFullyFactorisedExpressionContext simpleFullyFactorisedExpression(int i) {
			return getRuleContext(SimpleFullyFactorisedExpressionContext.class,i);
		}
		public List<PotentiallyComplicatedProductContext> potentiallyComplicatedProduct() {
			return getRuleContexts(PotentiallyComplicatedProductContext.class);
		}
		public PotentiallyComplicatedProductContext potentiallyComplicatedProduct(int i) {
			return getRuleContext(PotentiallyComplicatedProductContext.class,i);
		}
		public List<AlgebraicExpressionContext> algebraicExpression() {
			return getRuleContexts(AlgebraicExpressionContext.class);
		}
		public AlgebraicExpressionContext algebraicExpression(int i) {
			return getRuleContext(AlgebraicExpressionContext.class,i);
		}
		public List<ExpressionInBracketsWithPotentialPowerContext> expressionInBracketsWithPotentialPower() {
			return getRuleContexts(ExpressionInBracketsWithPotentialPowerContext.class);
		}
		public ExpressionInBracketsWithPotentialPowerContext expressionInBracketsWithPotentialPower(int i) {
			return getRuleContext(ExpressionInBracketsWithPotentialPowerContext.class,i);
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
		enterRule(_localctx, 2, RULE_potentiallyComplicatedProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(35);
					simpleFullyFactorisedExpression();
					}
					break;
				case 2:
					{
					setState(36);
					match(T__0);
					setState(37);
					potentiallyComplicatedProduct();
					setState(38);
					match(T__1);
					}
					break;
				case 3:
					{
					setState(40);
					match(T__0);
					setState(41);
					algebraicExpression();
					setState(42);
					match(T__1);
					}
					break;
				case 4:
					{
					setState(44);
					expressionInBracketsWithPotentialPower();
					}
					break;
				}
				}
				setState(47); 
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

	public static class ExpressionInBracketsWithPotentialPowerContext extends ParserRuleContext {
		public ExpressionWithoutNestedBracketsContext expressionWithoutNestedBrackets() {
			return getRuleContext(ExpressionWithoutNestedBracketsContext.class,0);
		}
		public TerminalNode POWER() { return getToken(AlgebraParser.POWER, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(AlgebraParser.POSITIVE_INT, 0); }
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public ExpressionInBracketsWithPotentialPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInBracketsWithPotentialPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionInBracketsWithPotentialPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionInBracketsWithPotentialPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionInBracketsWithPotentialPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInBracketsWithPotentialPowerContext expressionInBracketsWithPotentialPower() throws RecognitionException {
		ExpressionInBracketsWithPotentialPowerContext _localctx = new ExpressionInBracketsWithPotentialPowerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionInBracketsWithPotentialPower);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			expressionWithoutNestedBrackets();
			setState(51);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(52);
				match(POWER);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(53);
					match(SUB);
					}
				}

				setState(56);
				match(POSITIVE_INT);
				}
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
		enterRule(_localctx, 6, RULE_expressionWithoutNestedBrackets);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExpressionWONestedStartingWithNegativeSFFEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(SUB);
				setState(60);
				simpleFullyFactorisedExpression();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
					{
					setState(61);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ExpressionWONestedStartingWithSOTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				sumofterms();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
					{
					setState(68);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ExpressionWONestedStartingWithSFFEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				simpleFullyFactorisedExpression();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
					{
					setState(75);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new ExpressionWONestedStartingWithCTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				compositeterm();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
					{
					setState(82);
					termInExprWithoutNestedBrackets();
					}
					}
					setState(87);
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
		public TerminalNode ADD() { return getToken(AlgebraParser.ADD, 0); }
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
		public TerminalNode ADD() { return getToken(AlgebraParser.ADD, 0); }
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
		public TerminalNode ADD() { return getToken(AlgebraParser.ADD, 0); }
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
		enterRule(_localctx, 8, RULE_termInExprWithoutNestedBrackets);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SffeInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(90);
				((SffeInExprWithoutNestedBracketsContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((SffeInExprWithoutNestedBracketsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(91);
				simpleFullyFactorisedExpression();
				}
				break;
			case 2:
				_localctx = new SotInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ADD);
				setState(93);
				sumofterms();
				}
				break;
			case 3:
				_localctx = new CtInExprWithoutNestedBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(ADD);
				setState(95);
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
		enterRule(_localctx, 10, RULE_simpleFullyFactorisedExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(98);
				sumInBracketsPossiblyWithPower();
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				{
				setState(99);
				compositeterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					sumInBracketsPossiblyWithPower();
					}
					} 
				}
				setState(107);
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
		public TerminalNode POWER() { return getToken(AlgebraParser.POWER, 0); }
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
		enterRule(_localctx, 12, RULE_sumInBracketsPossiblyWithPower);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SumInBracketsWithPowerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__0);
				setState(109);
				sumofterms();
				setState(110);
				match(T__1);
				setState(111);
				match(POWER);
				setState(112);
				match(POSITIVE_INT);
				}
				break;
			case 2:
				_localctx = new SumInBracketsWithoutPowerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__0);
				setState(115);
				sumofterms();
				setState(116);
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
		enterRule(_localctx, 14, RULE_sumofterms);
		try {
			int _alt;
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new SumOfTermsFirstTermNegativeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(SUB);
				{
				setState(121);
				((SumOfTermsFirstTermNegativeContext)_localctx).startTerm = compositeterm();
				}
				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						termInSum();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
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
				setState(127);
				((SumOfTermsFirstTermPositiveContext)_localctx).startTerm = compositeterm();
				}
				setState(129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(128);
						termInSum();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(131); 
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
		public TerminalNode ADD() { return getToken(AlgebraParser.ADD, 0); }
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
		enterRule(_localctx, 16, RULE_termInSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			((TermInSumContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
				((TermInSumContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(136);
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
		public List<TerminalNode> MUL() { return getTokens(AlgebraParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(AlgebraParser.MUL, i);
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
		public List<TerminalNode> MUL() { return getTokens(AlgebraParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(AlgebraParser.MUL, i);
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
		enterRule(_localctx, 18, RULE_compositeterm);
		int _la;
		try {
			int _alt;
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new WithCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				coefficient();
				setState(139);
				simpleterm();
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(140);
							match(MUL);
							}
						}

						setState(143);
						simpleterm();
						}
						} 
					}
					setState(148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				coefficient();
				}
				break;
			case 3:
				_localctx = new WithoutCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				simpleterm();
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(151);
							match(MUL);
							}
						}

						setState(154);
						simpleterm();
						}
						} 
					}
					setState(159);
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
		enterRule(_localctx, 20, RULE_coefficient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public TerminalNode POWER() { return getToken(AlgebraParser.POWER, 0); }
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
		public TerminalNode POWER() { return getToken(AlgebraParser.POWER, 0); }
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
		enterRule(_localctx, 22, RULE_simpleterm);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new WithoutExponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(CHAR);
				}
				break;
			case 2:
				_localctx = new WithPositiveExponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(CHAR);
				setState(166);
				match(POWER);
				setState(167);
				match(POSITIVE_INT);
				}
				break;
			case 3:
				_localctx = new WithNegativeExponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(CHAR);
				setState(169);
				match(POWER);
				setState(170);
				match(SUB);
				setState(171);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3\61\3\4"+
		"\3\4\3\4\3\4\3\4\5\49\n\4\3\4\5\4<\n\4\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D"+
		"\13\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5"+
		"\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"c\n\6\3\7\3\7\5\7g\n\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\t\6\t~\n\t\r\t\16\t\177\3\t\3"+
		"\t\6\t\u0084\n\t\r\t\16\t\u0085\5\t\u0088\n\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\5\13\u0090\n\13\3\13\7\13\u0093\n\13\f\13\16\13\u0096\13\13\3\13\3"+
		"\13\3\13\5\13\u009b\n\13\3\13\7\13\u009e\n\13\f\13\16\13\u00a1\13\13\5"+
		"\13\u00a3\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3"+
		"\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\6\6\b\b\2\u00c3\2\33\3"+
		"\2\2\2\4/\3\2\2\2\6\63\3\2\2\2\bZ\3\2\2\2\nb\3\2\2\2\ff\3\2\2\2\16x\3"+
		"\2\2\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2"+
		"\2\2\30\u00ae\3\2\2\2\32\34\7\b\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35"+
		"\3\2\2\2\35\"\5\4\3\2\36\37\t\2\2\2\37!\5\4\3\2 \36\3\2\2\2!$\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\"\3\2\2\2%\60\5\f\7\2&\'\7\3\2\2\'"+
		"(\5\4\3\2()\7\4\2\2)\60\3\2\2\2*+\7\3\2\2+,\5\2\2\2,-\7\4\2\2-\60\3\2"+
		"\2\2.\60\5\6\4\2/%\3\2\2\2/&\3\2\2\2/*\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\64\7\3\2\2\64\65\5\b\5\2\65"+
		";\7\4\2\2\668\7\7\2\2\679\7\b\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:<\7"+
		"\t\2\2;\66\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=>\7\b\2\2>B\5\f\7\2?A\5\n\6\2"+
		"@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C[\3\2\2\2DB\3\2\2\2EI\5\20\t"+
		"\2FH\5\n\6\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J[\3\2\2\2KI\3\2\2"+
		"\2LP\5\f\7\2MO\5\n\6\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q[\3\2\2"+
		"\2RP\3\2\2\2SW\5\24\13\2TV\5\n\6\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X[\3\2\2\2YW\3\2\2\2Z=\3\2\2\2ZE\3\2\2\2ZL\3\2\2\2ZS\3\2\2\2[\t\3"+
		"\2\2\2\\]\t\2\2\2]c\5\f\7\2^_\7\6\2\2_c\5\20\t\2`a\7\6\2\2ac\5\24\13\2"+
		"b\\\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\13\3\2\2\2dg\5\16\b\2eg\5\24\13\2fd\3"+
		"\2\2\2fe\3\2\2\2gk\3\2\2\2hj\5\16\b\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl"+
		"\3\2\2\2l\r\3\2\2\2mk\3\2\2\2no\7\3\2\2op\5\20\t\2pq\7\4\2\2qr\7\7\2\2"+
		"rs\7\t\2\2sy\3\2\2\2tu\7\3\2\2uv\5\20\t\2vw\7\4\2\2wy\3\2\2\2xn\3\2\2"+
		"\2xt\3\2\2\2y\17\3\2\2\2z{\7\b\2\2{}\5\24\13\2|~\5\22\n\2}|\3\2\2\2~\177"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0088\3\2\2\2\u0081\u0083"+
		"\5\24\13\2\u0082\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087z"+
		"\3\2\2\2\u0087\u0081\3\2\2\2\u0088\21\3\2\2\2\u0089\u008a\t\2\2\2\u008a"+
		"\u008b\5\24\13\2\u008b\23\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u0094\5\30"+
		"\r\2\u008e\u0090\7\5\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\5\30\r\2\u0092\u008f\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a3\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u00a3\5\26\f\2\u0098\u009f\5\30\r\2\u0099\u009b\7"+
		"\5\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\5\30\r\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u008c\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u0098\3\2\2\2\u00a3\25\3\2\2"+
		"\2\u00a4\u00a5\7\t\2\2\u00a5\27\3\2\2\2\u00a6\u00af\7\n\2\2\u00a7\u00a8"+
		"\7\n\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00af\7\t\2\2\u00aa\u00ab\7\n\2\2\u00ab"+
		"\u00ac\7\7\2\2\u00ac\u00ad\7\b\2\2\u00ad\u00af\7\t\2\2\u00ae\u00a6\3\2"+
		"\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\31\3\2\2\2\32\33\""+
		"/\618;BIPWZbfkx\177\u0085\u0087\u008f\u0094\u009a\u009f\u00a2\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}