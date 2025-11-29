// Generated from org/batfish/grammar/cumulus_ports/CumulusPortsParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.cumulus_ports;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CumulusPortsParser extends org.batfish.grammar.cumulus_ports.parsing.CumulusPortsBaseParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DISABLED=1, EQUALSIGN=2, BLANK_LINE=3, BREAKOUT=4, PORT=5, SPEED=6, COMMENT_LINE=7, 
		NEWLINE=8, WS=9;
	public static final int
		RULE_cumulus_ports_configuration = 0, RULE_port_definition = 1, RULE_breakout = 2, 
		RULE_disabled = 3, RULE_speed = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"cumulus_ports_configuration", "port_definition", "breakout", "disabled", 
			"speed"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'disabled'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DISABLED", "EQUALSIGN", "BLANK_LINE", "BREAKOUT", "PORT", "SPEED", 
			"COMMENT_LINE", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "CumulusPortsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CumulusPortsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Cumulus_ports_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CumulusPortsParser.EOF, 0); }
		public List<Port_definitionContext> port_definition() {
			return getRuleContexts(Port_definitionContext.class);
		}
		public Port_definitionContext port_definition(int i) {
			return getRuleContext(Port_definitionContext.class,i);
		}
		public Cumulus_ports_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cumulus_ports_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).enterCumulus_ports_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).exitCumulus_ports_configuration(this);
		}
	}

	public final Cumulus_ports_configurationContext cumulus_ports_configuration() throws RecognitionException {
		Cumulus_ports_configurationContext _localctx = new Cumulus_ports_configurationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cumulus_ports_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PORT) {
				{
				{
				setState(10);
				port_definition();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class Port_definitionContext extends ParserRuleContext {
		public TerminalNode PORT() { return getToken(CumulusPortsParser.PORT, 0); }
		public TerminalNode EQUALSIGN() { return getToken(CumulusPortsParser.EQUALSIGN, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusPortsParser.NEWLINE, 0); }
		public BreakoutContext breakout() {
			return getRuleContext(BreakoutContext.class,0);
		}
		public DisabledContext disabled() {
			return getRuleContext(DisabledContext.class,0);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public Port_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).enterPort_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).exitPort_definition(this);
		}
	}

	public final Port_definitionContext port_definition() throws RecognitionException {
		Port_definitionContext _localctx = new Port_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_port_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(PORT);
			setState(19);
			match(EQUALSIGN);
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAKOUT:
				{
				setState(20);
				breakout();
				}
				break;
			case DISABLED:
				{
				setState(21);
				disabled();
				}
				break;
			case SPEED:
				{
				setState(22);
				speed();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(25);
			match(NEWLINE);
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

	public static class BreakoutContext extends ParserRuleContext {
		public TerminalNode BREAKOUT() { return getToken(CumulusPortsParser.BREAKOUT, 0); }
		public BreakoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).enterBreakout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).exitBreakout(this);
		}
	}

	public final BreakoutContext breakout() throws RecognitionException {
		BreakoutContext _localctx = new BreakoutContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_breakout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(BREAKOUT);
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

	public static class DisabledContext extends ParserRuleContext {
		public TerminalNode DISABLED() { return getToken(CumulusPortsParser.DISABLED, 0); }
		public DisabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disabled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).enterDisabled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).exitDisabled(this);
		}
	}

	public final DisabledContext disabled() throws RecognitionException {
		DisabledContext _localctx = new DisabledContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_disabled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(DISABLED);
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

	public static class SpeedContext extends ParserRuleContext {
		public TerminalNode SPEED() { return getToken(CumulusPortsParser.SPEED, 0); }
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).enterSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusPortsParserListener ) ((CumulusPortsParserListener)listener).exitSpeed(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(SPEED);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\2\2!\2\17\3\2\2\2\4\24\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2"+
		"\n!\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\25"+
		"\7\7\2\2\25\31\7\4\2\2\26\32\5\6\4\2\27\32\5\b\5\2\30\32\5\n\6\2\31\26"+
		"\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\34\7\n\2\2\34\5"+
		"\3\2\2\2\35\36\7\6\2\2\36\7\3\2\2\2\37 \7\3\2\2 \t\3\2\2\2!\"\7\b\2\2"+
		"\"\13\3\2\2\2\4\17\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}