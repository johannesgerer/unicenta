// Generated from Sales.g4 by ANTLR 4.4
package com.openbravo.pos.sales;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SalesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, INT=3, Enter=4, ArticleKey=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'*'", "INT", "Enter", "ArticleKey"
	};
	public static final int
		RULE_line = 0, RULE_completeLine = 1, RULE_amount = 2, RULE_article = 3, 
		RULE_price = 4;
	public static final String[] ruleNames = {
		"line", "completeLine", "amount", "article", "price"
	};

	@Override
	public String getGrammarFileName() { return "Sales.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SalesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public CompleteLineContext completeLine() {
			return getRuleContext(CompleteLineContext.class,0);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		int _la;
		try {
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10); completeLine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11); article();
				setState(13);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(12); amount();
					}
					break;
				}
				setState(16);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(15); price();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(18); amount();
					}
					break;
				}
				setState(21); price();
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

	public static class CompleteLineContext extends ParserRuleContext {
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public TerminalNode Enter() { return getToken(SalesParser.Enter, 0); }
		public TerminalNode ArticleKey() { return getToken(SalesParser.ArticleKey, 0); }
		public CompleteLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completeLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterCompleteLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitCompleteLine(this);
		}
	}

	public final CompleteLineContext completeLine() throws RecognitionException {
		CompleteLineContext _localctx = new CompleteLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_completeLine);
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(24); amount();
					}
					break;
				}
				setState(27); price();
				setState(28); match(ArticleKey);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); article();
				setState(32);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(31); amount();
					}
					break;
				}
				setState(34); price();
				setState(35); match(Enter);
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

	public static class AmountContext extends ParserRuleContext {
		public int result;
		public Token INT;
		public TerminalNode INT() { return getToken(SalesParser.INT, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitAmount(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); ((AmountContext)_localctx).INT = match(INT);
			setState(40); match(T__0);
			((AmountContext)_localctx).result =  (((AmountContext)_localctx).INT!=null?Integer.valueOf(((AmountContext)_localctx).INT.getText()):0);
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

	public static class ArticleContext extends ParserRuleContext {
		public int result;
		public Token INT;
		public TerminalNode INT() { return getToken(SalesParser.INT, 0); }
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitArticle(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_article);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); ((ArticleContext)_localctx).INT = match(INT);
			setState(44); match(T__1);
			((ArticleContext)_localctx).result =  (((ArticleContext)_localctx).INT!=null?Integer.valueOf(((ArticleContext)_localctx).INT.getText()):0);
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

	public static class PriceContext extends ParserRuleContext {
		public int result;
		public Token INT;
		public TerminalNode INT() { return getToken(SalesParser.INT, 0); }
		public PriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_price; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitPrice(this);
		}
	}

	public final PriceContext price() throws RecognitionException {
		PriceContext _localctx = new PriceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_price);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); ((PriceContext)_localctx).INT = match(INT);
			((PriceContext)_localctx).result =  (((PriceContext)_localctx).INT!=null?Integer.valueOf(((PriceContext)_localctx).INT.getText()):0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\5\2\20\n\2\3\2\5\2\23\n\2\3\2"+
		"\5\2\26\n\2\3\2\5\2\31\n\2\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\2\2\7\2\4\6\b\n\2\2\67\2\30\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2"+
		"\n\61\3\2\2\2\f\31\5\4\3\2\r\17\5\b\5\2\16\20\5\6\4\2\17\16\3\2\2\2\17"+
		"\20\3\2\2\2\20\22\3\2\2\2\21\23\5\n\6\2\22\21\3\2\2\2\22\23\3\2\2\2\23"+
		"\31\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27"+
		"\31\5\n\6\2\30\f\3\2\2\2\30\r\3\2\2\2\30\25\3\2\2\2\31\3\3\2\2\2\32\34"+
		"\5\6\4\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\5\n\6\2\36\37"+
		"\7\7\2\2\37(\3\2\2\2 \"\5\b\5\2!#\5\6\4\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2"+
		"\2\2$%\5\n\6\2%&\7\6\2\2&(\3\2\2\2\'\33\3\2\2\2\' \3\2\2\2(\5\3\2\2\2"+
		")*\7\5\2\2*+\7\4\2\2+,\b\4\1\2,\7\3\2\2\2-.\7\5\2\2./\7\3\2\2/\60\b\5"+
		"\1\2\60\t\3\2\2\2\61\62\7\5\2\2\62\63\b\6\1\2\63\13\3\2\2\2\t\17\22\25"+
		"\30\33\"\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}