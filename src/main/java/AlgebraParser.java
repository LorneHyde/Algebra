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
		RULE_simpleFullyFactorisedExpression = 4, RULE_sumInBracketsPossiblyWithPower = 5, 
		RULE_sumofterms = 6, RULE_compositeterm = 7, RULE_coefficient = 8, RULE_simpleterm = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"algebraicExpression", "potentiallyComplicatedProduct", "expressionInBracketsWithPotentialPower", 
			"expressionWithoutNestedBrackets", "simpleFullyFactorisedExpression", 
			"sumInBracketsPossiblyWithPower", "sumofterms", "compositeterm", "coefficient", 
			"simpleterm"
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(20);
				match(SUB);
				}
			}

			setState(23);
			potentiallyComplicatedProduct();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(25);
				potentiallyComplicatedProduct();
				}
				}
				setState(30);
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(31);
					simpleFullyFactorisedExpression();
					}
					break;
				case 2:
					{
					setState(32);
					match(T__0);
					setState(33);
					potentiallyComplicatedProduct();
					setState(34);
					match(T__1);
					}
					break;
				case 3:
					{
					setState(36);
					match(T__0);
					setState(37);
					algebraicExpression();
					setState(38);
					match(T__1);
					}
					break;
				case 4:
					{
					setState(40);
					expressionInBracketsWithPotentialPower();
					}
					break;
				}
				}
				setState(43); 
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
			setState(45);
			match(T__0);
			setState(46);
			expressionWithoutNestedBrackets();
			setState(47);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(48);
				match(POWER);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(49);
					match(SUB);
					}
				}

				setState(52);
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
		public List<SumoftermsContext> sumofterms() {
			return getRuleContexts(SumoftermsContext.class);
		}
		public SumoftermsContext sumofterms(int i) {
			return getRuleContext(SumoftermsContext.class,i);
		}
		public List<SimpleFullyFactorisedExpressionContext> simpleFullyFactorisedExpression() {
			return getRuleContexts(SimpleFullyFactorisedExpressionContext.class);
		}
		public SimpleFullyFactorisedExpressionContext simpleFullyFactorisedExpression(int i) {
			return getRuleContext(SimpleFullyFactorisedExpressionContext.class,i);
		}
		public List<CompositetermContext> compositeterm() {
			return getRuleContexts(CompositetermContext.class);
		}
		public CompositetermContext compositeterm(int i) {
			return getRuleContext(CompositetermContext.class,i);
		}
		public List<TerminalNode> SUB() { return getTokens(AlgebraParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(AlgebraParser.SUB, i);
		}
		public List<TerminalNode> ADD() { return getTokens(AlgebraParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(AlgebraParser.ADD, i);
		}
		public ExpressionWithoutNestedBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithoutNestedBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpressionWithoutNestedBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpressionWithoutNestedBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitExpressionWithoutNestedBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithoutNestedBracketsContext expressionWithoutNestedBrackets() throws RecognitionException {
		ExpressionWithoutNestedBracketsContext _localctx = new ExpressionWithoutNestedBracketsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionWithoutNestedBrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(55);
				match(SUB);
				}
				break;
			}
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(58);
				sumofterms();
				}
				break;
			case 2:
				{
				setState(59);
				simpleFullyFactorisedExpression();
				}
				break;
			case 3:
				{
				setState(60);
				compositeterm();
				}
				break;
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(64);
					sumofterms();
					}
					break;
				case 2:
					{
					setState(65);
					simpleFullyFactorisedExpression();
					}
					break;
				case 3:
					{
					setState(66);
					compositeterm();
					}
					break;
				}
				}
				}
				setState(73);
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
		enterRule(_localctx, 8, RULE_simpleFullyFactorisedExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(74);
				sumInBracketsPossiblyWithPower();
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				{
				setState(75);
				compositeterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					sumInBracketsPossiblyWithPower();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public SumoftermsContext sumofterms() {
			return getRuleContext(SumoftermsContext.class,0);
		}
		public TerminalNode POWER() { return getToken(AlgebraParser.POWER, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(AlgebraParser.POSITIVE_INT, 0); }
		public TerminalNode SUB() { return getToken(AlgebraParser.SUB, 0); }
		public SumInBracketsPossiblyWithPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumInBracketsPossiblyWithPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterSumInBracketsPossiblyWithPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitSumInBracketsPossiblyWithPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraVisitor ) return ((AlgebraVisitor<? extends T>)visitor).visitSumInBracketsPossiblyWithPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumInBracketsPossiblyWithPowerContext sumInBracketsPossiblyWithPower() throws RecognitionException {
		SumInBracketsPossiblyWithPowerContext _localctx = new SumInBracketsPossiblyWithPowerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sumInBracketsPossiblyWithPower);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			sumofterms();
			setState(86);
			match(T__1);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(87);
				match(POWER);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(88);
					match(SUB);
					}
				}

				setState(91);
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
		public List<CompositetermContext> compositeterm() {
			return getRuleContexts(CompositetermContext.class);
		}
		public CompositetermContext compositeterm(int i) {
			return getRuleContext(CompositetermContext.class,i);
		}
		public List<TerminalNode> SUB() { return getTokens(AlgebraParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(AlgebraParser.SUB, i);
		}
		public List<TerminalNode> ADD() { return getTokens(AlgebraParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(AlgebraParser.ADD, i);
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
		public Token op;
		public List<TerminalNode> SUB() { return getTokens(AlgebraParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(AlgebraParser.SUB, i);
		}
		public List<CompositetermContext> compositeterm() {
			return getRuleContexts(CompositetermContext.class);
		}
		public CompositetermContext compositeterm(int i) {
			return getRuleContext(CompositetermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(AlgebraParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(AlgebraParser.ADD, i);
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
		enterRule(_localctx, 12, RULE_sumofterms);
		int _la;
		try {
			int _alt;
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new SumOfTermsFirstTermNegativeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(SUB);
				setState(95);
				compositeterm();
				setState(98); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(96);
						((SumOfTermsFirstTermNegativeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((SumOfTermsFirstTermNegativeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						compositeterm();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(100); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				_localctx = new SumOfTermsFirstTermPositiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				compositeterm();
				setState(105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(103);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						compositeterm();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(107); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 14, RULE_compositeterm);
		int _la;
		try {
			int _alt;
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new WithCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				coefficient();
				setState(112);
				simpleterm();
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(113);
							match(MUL);
							}
						}

						setState(116);
						simpleterm();
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				coefficient();
				}
				break;
			case 3:
				_localctx = new WithoutCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				simpleterm();
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(124);
							match(MUL);
							}
						}

						setState(127);
						simpleterm();
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 16, RULE_coefficient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		enterRule(_localctx, 18, RULE_simpleterm);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new WithoutExponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(CHAR);
				}
				break;
			case 2:
				_localctx = new WithPositiveExponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(CHAR);
				setState(139);
				match(POWER);
				setState(140);
				match(POSITIVE_INT);
				}
				break;
			case 3:
				_localctx = new WithNegativeExponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(CHAR);
				setState(142);
				match(POWER);
				setState(143);
				match(SUB);
				setState(144);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\5\2\30\n\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\3\4\5\48\n\4\3\5\5\5;\n\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\3"+
		"\5\5\5F\n\5\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\5\6O\n\6\3\6\7\6R\n\6\f\6"+
		"\16\6U\13\6\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\7\5\7_\n\7\3\b\3\b\3\b\3\b"+
		"\6\be\n\b\r\b\16\bf\3\b\3\b\3\b\6\bl\n\b\r\b\16\bm\5\bp\n\b\3\t\3\t\3"+
		"\t\5\tu\n\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\3\t\3\t\5\t\u0080\n\t\3\t"+
		"\7\t\u0083\n\t\f\t\16\t\u0086\13\t\5\t\u0088\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0094\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\3\4\2\6\6\b\b\2\u00a8\2\27\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\b:\3"+
		"\2\2\2\nN\3\2\2\2\fV\3\2\2\2\16o\3\2\2\2\20\u0087\3\2\2\2\22\u0089\3\2"+
		"\2\2\24\u0093\3\2\2\2\26\30\7\b\2\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31"+
		"\3\2\2\2\31\36\5\4\3\2\32\33\t\2\2\2\33\35\5\4\3\2\34\32\3\2\2\2\35 \3"+
		"\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 \36\3\2\2\2!,\5\n\6\2"+
		"\"#\7\3\2\2#$\5\4\3\2$%\7\4\2\2%,\3\2\2\2&\'\7\3\2\2\'(\5\2\2\2()\7\4"+
		"\2\2),\3\2\2\2*,\5\6\4\2+!\3\2\2\2+\"\3\2\2\2+&\3\2\2\2+*\3\2\2\2,-\3"+
		"\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/\60\7\3\2\2\60\61\5\b\5\2\61\67"+
		"\7\4\2\2\62\64\7\7\2\2\63\65\7\b\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\3\2\2\2\668\7\t\2\2\67\62\3\2\2\2\678\3\2\2\28\7\3\2\2\29;\7\b\2\2:9"+
		"\3\2\2\2:;\3\2\2\2;?\3\2\2\2<@\5\16\b\2=@\5\n\6\2>@\5\20\t\2?<\3\2\2\2"+
		"?=\3\2\2\2?>\3\2\2\2@I\3\2\2\2AE\t\2\2\2BF\5\16\b\2CF\5\n\6\2DF\5\20\t"+
		"\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GA\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\t\3\2\2\2KI\3\2\2\2LO\5\f\7\2MO\5\20\t\2NL\3\2\2\2NM\3\2"+
		"\2\2OS\3\2\2\2PR\5\f\7\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\13\3"+
		"\2\2\2US\3\2\2\2VW\7\3\2\2WX\5\16\b\2X^\7\4\2\2Y[\7\7\2\2Z\\\7\b\2\2["+
		"Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\t\2\2^Y\3\2\2\2^_\3\2\2\2_\r\3\2\2"+
		"\2`a\7\b\2\2ad\5\20\t\2bc\t\2\2\2ce\5\20\t\2db\3\2\2\2ef\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2gp\3\2\2\2hk\5\20\t\2ij\t\2\2\2jl\5\20\t\2ki\3\2\2\2lm\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2o`\3\2\2\2oh\3\2\2\2p\17\3\2\2\2q"+
		"r\5\22\n\2ry\5\24\13\2su\7\5\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5\24"+
		"\13\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0088\3\2\2\2{y\3\2\2\2"+
		"|\u0088\5\22\n\2}\u0084\5\24\13\2~\u0080\7\5\2\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\5\24\13\2\u0082\177\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087q\3\2\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2"+
		"\u0088\21\3\2\2\2\u0089\u008a\7\t\2\2\u008a\23\3\2\2\2\u008b\u0094\7\n"+
		"\2\2\u008c\u008d\7\n\2\2\u008d\u008e\7\7\2\2\u008e\u0094\7\t\2\2\u008f"+
		"\u0090\7\n\2\2\u0090\u0091\7\7\2\2\u0091\u0092\7\b\2\2\u0092\u0094\7\t"+
		"\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008f\3\2\2\2\u0094"+
		"\25\3\2\2\2\31\27\36+-\64\67:?EINS[^fmoty\177\u0084\u0087\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}