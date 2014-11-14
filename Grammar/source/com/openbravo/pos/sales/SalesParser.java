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
		RULE_lines = 0, RULE_line = 1, RULE_amount = 2, RULE_article = 3, RULE_price = 4;
	public static final String[] ruleNames = {
		"lines", "line", "amount", "article", "price"
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
	public static class LinesContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitLines(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); line();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
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

	public static class LineContext extends ParserRuleContext {
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
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(15); amount();
					}
					break;
				}
				setState(18); price();
				setState(19); match(ArticleKey);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); article();
				setState(23);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(22); amount();
					}
					break;
				}
				setState(25); price();
				setState(26); match(Enter);
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
			setState(30); match(INT);
			setState(31); match(T__0);
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
			setState(33); match(INT);
			setState(34); match(T__1);
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
			setState(36); ((PriceContext)_localctx).INT = match(INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\5\3\23\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2(\2\r\3\2\2\2\4\36\3\2\2\2\6"+
		" \3\2\2\2\b#\3\2\2\2\n&\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2"+
		"\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\23\5\6\4\2\22\21\3\2\2\2\22"+
		"\23\3\2\2\2\23\24\3\2\2\2\24\25\5\n\6\2\25\26\7\7\2\2\26\37\3\2\2\2\27"+
		"\31\5\b\5\2\30\32\5\6\4\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33"+
		"\34\5\n\6\2\34\35\7\6\2\2\35\37\3\2\2\2\36\22\3\2\2\2\36\27\3\2\2\2\37"+
		"\5\3\2\2\2 !\7\5\2\2!\"\7\4\2\2\"\7\3\2\2\2#$\7\5\2\2$%\7\3\2\2%\t\3\2"+
		"\2\2&\'\7\5\2\2\'(\b\6\1\2(\13\3\2\2\2\6\17\22\31\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}