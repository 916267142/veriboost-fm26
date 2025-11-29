// Generated from org/batfish/grammar/palo_alto_nested/PaloAltoNestedParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.palo_alto_nested;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PaloAltoNestedParser extends org.batfish.grammar.BatfishParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSE_BRACE=1, CLOSE_BRACKET=2, CLOSE_PAREN=3, COMMENT_LINE=4, OPEN_BRACE=5, 
		OPEN_BRACKET=6, OPEN_PAREN=7, SEMICOLON=8, SHOW_CONFIG_LINE=9, WORD=10, 
		NEWLINE=11, WS=12, F_WordFinalChar=13, F_WordInteriorChar=14;
	public static final int
		RULE_braced_clause = 0, RULE_bracketed_clause = 1, RULE_palo_alto_nested_configuration = 2, 
		RULE_statement = 3, RULE_terminator = 4, RULE_word = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"braced_clause", "bracketed_clause", "palo_alto_nested_configuration", 
			"statement", "terminator", "word"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'}'", "']'", "')'", null, "'{'", "'['", "'('", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PAREN", "COMMENT_LINE", 
			"OPEN_BRACE", "OPEN_BRACKET", "OPEN_PAREN", "SEMICOLON", "SHOW_CONFIG_LINE", 
			"WORD", "NEWLINE", "WS", "F_WordFinalChar", "F_WordInteriorChar"
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
	public String getGrammarFileName() { return "PaloAltoNestedParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PaloAltoNestedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Braced_clauseContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PaloAltoNestedParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PaloAltoNestedParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Braced_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braced_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).enterBraced_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).exitBraced_clause(this);
		}
	}

	public final Braced_clauseContext braced_clause() throws RecognitionException {
		Braced_clauseContext _localctx = new Braced_clauseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_braced_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(OPEN_BRACE);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(13);
				statement();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(CLOSE_BRACE);
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

	public static class Bracketed_clauseContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(PaloAltoNestedParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PaloAltoNestedParser.CLOSE_BRACKET, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Bracketed_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).enterBracketed_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).exitBracketed_clause(this);
		}
	}

	public final Bracketed_clauseContext bracketed_clause() throws RecognitionException {
		Bracketed_clauseContext _localctx = new Bracketed_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bracketed_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(OPEN_BRACKET);
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				word();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(27);
			match(CLOSE_BRACKET);
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

	public static class Palo_alto_nested_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PaloAltoNestedParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Palo_alto_nested_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palo_alto_nested_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).enterPalo_alto_nested_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).exitPalo_alto_nested_configuration(this);
		}
	}

	public final Palo_alto_nested_configurationContext palo_alto_nested_configuration() throws RecognitionException {
		Palo_alto_nested_configurationContext _localctx = new Palo_alto_nested_configurationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_palo_alto_nested_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				statement();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(34);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public WordContext word;
		public List<WordContext> words = new ArrayList<WordContext>();
		public Braced_clauseContext braced_clause() {
			return getRuleContext(Braced_clauseContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Bracketed_clauseContext bracketed_clause() {
			return getRuleContext(Bracketed_clauseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((StatementContext)_localctx).word = word();
				((StatementContext)_localctx).words.add(((StatementContext)_localctx).word);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(41);
				braced_clause();
				}
				break;
			case OPEN_BRACKET:
				{
				{
				setState(42);
				bracketed_clause();
				setState(43);
				terminator();
				}
				}
				break;
			case SEMICOLON:
				{
				setState(45);
				terminator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(PaloAltoNestedParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(SEMICOLON);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PaloAltoNestedParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PaloAltoNestedParserListener ) ((PaloAltoNestedParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(WORD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\2\3\2\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\3\3\3\4\6\4!\n\4\r\4\16"+
		"\4\"\3\4\3\4\3\5\6\5(\n\5\r\5\16\5)\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6"+
		"\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2\66\2\16\3\2\2\2\4\27\3\2\2\2"+
		"\6 \3\2\2\2\b\'\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16\22\7\7\2\2\17\21"+
		"\5\b\5\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25"+
		"\3\2\2\2\24\22\3\2\2\2\25\26\7\3\2\2\26\3\3\2\2\2\27\31\7\b\2\2\30\32"+
		"\5\f\7\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35"+
		"\3\2\2\2\35\36\7\4\2\2\36\5\3\2\2\2\37!\5\b\5\2 \37\3\2\2\2!\"\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%\7\3\2\2\2&(\5\f\7\2\'&\3\2"+
		"\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\60\3\2\2\2+\61\5\2\2\2,-\5\4\3\2"+
		"-.\5\n\6\2.\61\3\2\2\2/\61\5\n\6\2\60+\3\2\2\2\60,\3\2\2\2\60/\3\2\2\2"+
		"\61\t\3\2\2\2\62\63\7\n\2\2\63\13\3\2\2\2\64\65\7\f\2\2\65\r\3\2\2\2\7"+
		"\22\33\")\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}