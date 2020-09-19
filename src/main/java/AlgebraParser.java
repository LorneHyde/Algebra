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
		RULE_sumofterms = 6, RULE_termInSum = 7, RULE_compositeterm = 8, RULE_coefficient = 9, 
		RULE_simpleterm = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"algebraicExpression", "potentiallyComplicatedProduct", "expressionInBracketsWithPotentialPower", 
			"expressionWithoutNestedBrackets", "simpleFullyFactorisedExpression", 
			"sumInBracketsPossiblyWithPower", "sumofterms", "termInSum", "compositeterm", 
			"coefficient", "simpleterm"
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(22);
				match(SUB);
				}
			}

			setState(25);
			potentiallyComplicatedProduct();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(27);
				potentiallyComplicatedProduct();
				}
				}
				setState(32);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(33);
					simpleFullyFactorisedExpression();
					}
					break;
				case 2:
					{
					setState(34);
					match(T__0);
					setState(35);
					potentiallyComplicatedProduct();
					setState(36);
					match(T__1);
					}
					break;
				case 3:
					{
					setState(38);
					match(T__0);
					setState(39);
					algebraicExpression();
					setState(40);
					match(T__1);
					}
					break;
				case 4:
					{
					setState(42);
					expressionInBracketsWithPotentialPower();
					}
					break;
				}
				}
				setState(45); 
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
			setState(47);
			match(T__0);
			setState(48);
			expressionWithoutNestedBrackets();
			setState(49);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(50);
				match(POWER);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(51);
					match(SUB);
					}
				}

				setState(54);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(57);
				match(SUB);
				}
				break;
			}
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(60);
				sumofterms();
				}
				break;
			case 2:
				{
				setState(61);
				simpleFullyFactorisedExpression();
				}
				break;
			case 3:
				{
				setState(62);
				compositeterm();
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(65);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(66);
					sumofterms();
					}
					break;
				case 2:
					{
					setState(67);
					simpleFullyFactorisedExpression();
					}
					break;
				case 3:
					{
					setState(68);
					compositeterm();
					}
					break;
				}
				}
				}
				setState(75);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(76);
				sumInBracketsPossiblyWithPower();
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				{
				setState(77);
				compositeterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					sumInBracketsPossiblyWithPower();
					}
					} 
				}
				setState(85);
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
			setState(86);
			match(T__0);
			setState(87);
			sumofterms();
			setState(88);
			match(T__1);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(89);
				match(POWER);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(90);
					match(SUB);
					}
				}

				setState(93);
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
		enterRule(_localctx, 12, RULE_sumofterms);
		try {
			int _alt;
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new SumOfTermsFirstTermNegativeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(SUB);
				{
				setState(97);
				((SumOfTermsFirstTermNegativeContext)_localctx).startTerm = compositeterm();
				}
				setState(99); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(98);
						termInSum();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(101); 
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
				{
				setState(103);
				((SumOfTermsFirstTermPositiveContext)_localctx).startTerm = compositeterm();
				}
				setState(105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(104);
						termInSum();
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
		enterRule(_localctx, 14, RULE_termInSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
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
			setState(112);
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
		enterRule(_localctx, 16, RULE_compositeterm);
		int _la;
		try {
			int _alt;
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new WithCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				coefficient();
				setState(115);
				simpleterm();
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(116);
							match(MUL);
							}
						}

						setState(119);
						simpleterm();
						}
						} 
					}
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				coefficient();
				}
				break;
			case 3:
				_localctx = new WithoutCoefficientContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				simpleterm();
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(127);
							match(MUL);
							}
						}

						setState(130);
						simpleterm();
						}
						} 
					}
					setState(135);
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
		enterRule(_localctx, 18, RULE_coefficient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 20, RULE_simpleterm);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new WithoutExponentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(CHAR);
				}
				break;
			case 2:
				_localctx = new WithPositiveExponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(CHAR);
				setState(142);
				match(POWER);
				setState(143);
				match(POSITIVE_INT);
				}
				break;
			case 3:
				_localctx = new WithNegativeExponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(CHAR);
				setState(145);
				match(POWER);
				setState(146);
				match(SUB);
				setState(147);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\5\2\32\n\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\67\n\4\3\4\5\4:\n\4\3\5\5\5=\n\5\3\5\3\5\3\5\5\5B\n\5\3\5"+
		"\3\5\3\5\3\5\5\5H\n\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\5\6Q\n\6\3\6\7\6"+
		"T\n\6\f\6\16\6W\13\6\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\5\7a\n\7\3\b\3\b"+
		"\3\b\6\bf\n\b\r\b\16\bg\3\b\3\b\6\bl\n\b\r\b\16\bm\5\bp\n\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\5\nx\n\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\n\5\n\u0083"+
		"\n\n\3\n\7\n\u0086\n\n\f\n\16\n\u0089\13\n\5\n\u008b\n\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\3\4\2\6\6\b\b\2\u00aa\2\31\3\2\2\2\4-\3\2\2\2\6\61\3\2\2\2"+
		"\b<\3\2\2\2\nP\3\2\2\2\fX\3\2\2\2\16o\3\2\2\2\20q\3\2\2\2\22\u008a\3\2"+
		"\2\2\24\u008c\3\2\2\2\26\u0096\3\2\2\2\30\32\7\b\2\2\31\30\3\2\2\2\31"+
		"\32\3\2\2\2\32\33\3\2\2\2\33 \5\4\3\2\34\35\t\2\2\2\35\37\5\4\3\2\36\34"+
		"\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\" \3\2\2\2#.\5"+
		"\n\6\2$%\7\3\2\2%&\5\4\3\2&\'\7\4\2\2\'.\3\2\2\2()\7\3\2\2)*\5\2\2\2*"+
		"+\7\4\2\2+.\3\2\2\2,.\5\6\4\2-#\3\2\2\2-$\3\2\2\2-(\3\2\2\2-,\3\2\2\2"+
		"./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61\62\7\3\2\2\62\63\5\b"+
		"\5\2\639\7\4\2\2\64\66\7\7\2\2\65\67\7\b\2\2\66\65\3\2\2\2\66\67\3\2\2"+
		"\2\678\3\2\2\28:\7\t\2\29\64\3\2\2\29:\3\2\2\2:\7\3\2\2\2;=\7\b\2\2<;"+
		"\3\2\2\2<=\3\2\2\2=A\3\2\2\2>B\5\16\b\2?B\5\n\6\2@B\5\22\n\2A>\3\2\2\2"+
		"A?\3\2\2\2A@\3\2\2\2BK\3\2\2\2CG\t\2\2\2DH\5\16\b\2EH\5\n\6\2FH\5\22\n"+
		"\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HJ\3\2\2\2IC\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NQ\5\f\7\2OQ\5\22\n\2PN\3\2\2\2PO\3\2"+
		"\2\2QU\3\2\2\2RT\5\f\7\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3"+
		"\2\2\2WU\3\2\2\2XY\7\3\2\2YZ\5\16\b\2Z`\7\4\2\2[]\7\7\2\2\\^\7\b\2\2]"+
		"\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\7\t\2\2`[\3\2\2\2`a\3\2\2\2a\r\3\2\2"+
		"\2bc\7\b\2\2ce\5\22\n\2df\5\20\t\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2"+
		"\2\2hp\3\2\2\2ik\5\22\n\2jl\5\20\t\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2np\3\2\2\2ob\3\2\2\2oi\3\2\2\2p\17\3\2\2\2qr\t\2\2\2rs\5\22\n\2"+
		"s\21\3\2\2\2tu\5\24\13\2u|\5\26\f\2vx\7\5\2\2wv\3\2\2\2wx\3\2\2\2xy\3"+
		"\2\2\2y{\5\26\f\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u008b\3\2\2"+
		"\2~|\3\2\2\2\177\u008b\5\24\13\2\u0080\u0087\5\26\f\2\u0081\u0083\7\5"+
		"\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\5\26\f\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"t\3\2\2\2\u008a\177\3\2\2\2\u008a\u0080\3\2\2\2\u008b\23\3\2\2\2\u008c"+
		"\u008d\7\t\2\2\u008d\25\3\2\2\2\u008e\u0097\7\n\2\2\u008f\u0090\7\n\2"+
		"\2\u0090\u0091\7\7\2\2\u0091\u0097\7\t\2\2\u0092\u0093\7\n\2\2\u0093\u0094"+
		"\7\7\2\2\u0094\u0095\7\b\2\2\u0095\u0097\7\t\2\2\u0096\u008e\3\2\2\2\u0096"+
		"\u008f\3\2\2\2\u0096\u0092\3\2\2\2\u0097\27\3\2\2\2\31\31 -/\669<AGKP"+
		"U]`gmow|\u0082\u0087\u008a\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}