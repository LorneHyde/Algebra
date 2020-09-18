// Generated from C:/Users/lorni/IdeaProjects/Algebra/src/main/antlr4\algebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class algebraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, POSITIVE_INT=7, CHAR=8, 
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
			null, "'-'", "'+'", "'('", "')'", "'^'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "POSITIVE_INT", "CHAR", "WS"
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
	public String getGrammarFileName() { return "algebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public algebraParser(TokenStream input) {
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
		public AlgebraicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algebraicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterAlgebraicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitAlgebraicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitAlgebraicExpression(this);
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
			setState(20);
			potentiallyComplicatedProduct();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(21);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(22);
				potentiallyComplicatedProduct();
				}
				}
				setState(27);
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
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterPotentiallyComplicatedProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitPotentiallyComplicatedProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitPotentiallyComplicatedProduct(this);
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
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(28);
					simpleFullyFactorisedExpression();
					}
					break;
				case 2:
					{
					setState(29);
					match(T__2);
					setState(30);
					potentiallyComplicatedProduct();
					setState(31);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(33);
					match(T__2);
					setState(34);
					algebraicExpression();
					setState(35);
					match(T__3);
					}
					break;
				case 4:
					{
					setState(37);
					expressionInBracketsWithPotentialPower();
					}
					break;
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << POSITIVE_INT) | (1L << CHAR))) != 0) );
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
		public TerminalNode POSITIVE_INT() { return getToken(algebraParser.POSITIVE_INT, 0); }
		public ExpressionInBracketsWithPotentialPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInBracketsWithPotentialPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterExpressionInBracketsWithPotentialPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitExpressionInBracketsWithPotentialPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitExpressionInBracketsWithPotentialPower(this);
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
			setState(42);
			match(T__2);
			setState(43);
			expressionWithoutNestedBrackets();
			setState(44);
			match(T__3);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(45);
				match(T__4);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(46);
					match(T__0);
					}
				}

				setState(49);
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
		public ExpressionWithoutNestedBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithoutNestedBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterExpressionWithoutNestedBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitExpressionWithoutNestedBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitExpressionWithoutNestedBrackets(this);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(52);
				sumofterms();
				}
				break;
			case 2:
				{
				setState(53);
				simpleFullyFactorisedExpression();
				}
				break;
			case 3:
				{
				setState(54);
				compositeterm();
				}
				break;
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
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
				}
				}
				setState(67);
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
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterSimpleFullyFactorisedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitSimpleFullyFactorisedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitSimpleFullyFactorisedExpression(this);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(68);
				sumInBracketsPossiblyWithPower();
				}
				break;
			case POSITIVE_INT:
			case CHAR:
				{
				setState(69);
				compositeterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					sumInBracketsPossiblyWithPower();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode POSITIVE_INT() { return getToken(algebraParser.POSITIVE_INT, 0); }
		public SumInBracketsPossiblyWithPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumInBracketsPossiblyWithPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterSumInBracketsPossiblyWithPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitSumInBracketsPossiblyWithPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitSumInBracketsPossiblyWithPower(this);
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
			setState(78);
			match(T__2);
			setState(79);
			sumofterms();
			setState(80);
			match(T__3);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(81);
				match(T__4);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(82);
					match(T__0);
					}
				}

				setState(85);
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
		public List<CompositetermContext> compositeterm() {
			return getRuleContexts(CompositetermContext.class);
		}
		public CompositetermContext compositeterm(int i) {
			return getRuleContext(CompositetermContext.class,i);
		}
		public SumoftermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumofterms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterSumofterms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitSumofterms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitSumofterms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumoftermsContext sumofterms() throws RecognitionException {
		SumoftermsContext _localctx = new SumoftermsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sumofterms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			compositeterm();
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(89);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(90);
					compositeterm();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public CoefficientContext coefficient() {
			return getRuleContext(CoefficientContext.class,0);
		}
		public List<SimpletermContext> simpleterm() {
			return getRuleContexts(SimpletermContext.class);
		}
		public SimpletermContext simpleterm(int i) {
			return getRuleContext(SimpletermContext.class,i);
		}
		public CompositetermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterCompositeterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitCompositeterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitCompositeterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositetermContext compositeterm() throws RecognitionException {
		CompositetermContext _localctx = new CompositetermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compositeterm);
		int _la;
		try {
			int _alt;
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				coefficient();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POSITIVE_INT) {
					{
					setState(96);
					coefficient();
					}
				}

				setState(99);
				simpleterm();
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(100);
							match(T__5);
							}
						}

						setState(103);
						simpleterm();
						}
						} 
					}
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
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
		public TerminalNode POSITIVE_INT() { return getToken(algebraParser.POSITIVE_INT, 0); }
		public CoefficientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coefficient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterCoefficient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitCoefficient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitCoefficient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoefficientContext coefficient() throws RecognitionException {
		CoefficientContext _localctx = new CoefficientContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coefficient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		public TerminalNode CHAR() { return getToken(algebraParser.CHAR, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(algebraParser.POSITIVE_INT, 0); }
		public SimpletermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).enterSimpleterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algebraListener ) ((algebraListener)listener).exitSimpleterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algebraVisitor ) return ((algebraVisitor<? extends T>)visitor).visitSimpleterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletermContext simpleterm() throws RecognitionException {
		SimpletermContext _localctx = new SimpletermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(CHAR);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(114);
				match(T__4);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(115);
					match(T__0);
					}
				}

				setState(118);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\5\4\65"+
		"\n\4\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\5\5\5@\n\5\7\5B\n\5\f\5\16\5E"+
		"\13\5\3\6\3\6\5\6I\n\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7V\n\7\3\7\5\7Y\n\7\3\b\3\b\3\b\6\b^\n\b\r\b\16\b_\3\t\3\t\5\td\n\t"+
		"\3\t\3\t\5\th\n\t\3\t\7\tk\n\t\f\t\16\tn\13\t\5\tp\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\5\13w\n\13\3\13\5\13z\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\3\3\2\3\4\2\u0088\2\26\3\2\2\2\4(\3\2\2\2\6,\3\2\2\2\b9\3\2\2\2\nH"+
		"\3\2\2\2\fP\3\2\2\2\16Z\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24s\3\2\2\2\26"+
		"\33\5\4\3\2\27\30\t\2\2\2\30\32\5\4\3\2\31\27\3\2\2\2\32\35\3\2\2\2\33"+
		"\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36)\5\n\6\2\37 \7"+
		"\5\2\2 !\5\4\3\2!\"\7\6\2\2\")\3\2\2\2#$\7\5\2\2$%\5\2\2\2%&\7\6\2\2&"+
		")\3\2\2\2\')\5\6\4\2(\36\3\2\2\2(\37\3\2\2\2(#\3\2\2\2(\'\3\2\2\2)*\3"+
		"\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,-\7\5\2\2-.\5\b\5\2.\64\7\6\2\2"+
		"/\61\7\7\2\2\60\62\7\3\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63"+
		"\65\7\t\2\2\64/\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66:\5\16\b\2\67:\5"+
		"\n\6\28:\5\20\t\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:C\3\2\2\2;?\t\2\2"+
		"\2<@\5\16\b\2=@\5\n\6\2>@\5\20\t\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@B\3\2"+
		"\2\2A;\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EC\3\2\2\2FI\5"+
		"\f\7\2GI\5\20\t\2HF\3\2\2\2HG\3\2\2\2IM\3\2\2\2JL\5\f\7\2KJ\3\2\2\2LO"+
		"\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OM\3\2\2\2PQ\7\5\2\2QR\5\16\b"+
		"\2RX\7\6\2\2SU\7\7\2\2TV\7\3\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\t\2"+
		"\2XS\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2Z]\5\20\t\2[\\\t\2\2\2\\^\5\20\t\2]["+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2ap\5\22\n\2bd\5\22\n"+
		"\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2el\5\24\13\2fh\7\b\2\2gf\3\2\2\2gh\3\2"+
		"\2\2hi\3\2\2\2ik\5\24\13\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3"+
		"\2\2\2nl\3\2\2\2oa\3\2\2\2oc\3\2\2\2p\21\3\2\2\2qr\7\t\2\2r\23\3\2\2\2"+
		"sy\7\n\2\2tv\7\7\2\2uw\7\3\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7\t\2\2"+
		"yt\3\2\2\2yz\3\2\2\2z\25\3\2\2\2\25\33(*\61\649?CHMUX_cglovy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}