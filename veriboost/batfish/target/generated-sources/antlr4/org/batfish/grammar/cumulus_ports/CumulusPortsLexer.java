// Generated from org/batfish/grammar/cumulus_ports/CumulusPortsLexer.g4 by ANTLR 4.7.2
package org.batfish.grammar.cumulus_ports;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CumulusPortsLexer extends org.batfish.grammar.cumulus_ports.parsing.CumulusPortsBaseLexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DISABLED=1, EQUALSIGN=2, BLANK_LINE=3, BREAKOUT=4, PORT=5, SPEED=6, COMMENT_LINE=7, 
		NEWLINE=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DISABLED", "EQUALSIGN", "BLANK_LINE", "BREAKOUT", "PORT", "SPEED", "COMMENT_LINE", 
			"NEWLINE", "WS", "F_Digit", "F_Newline", "F_NonNewline", "F_Whitespace"
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


	public CumulusPortsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CumulusPortsLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return BLANK_LINE_sempred((RuleContext)_localctx, predIndex);
		case 6:
			return COMMENT_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean BLANK_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return lastTokenType() == NEWLINE|| lastTokenType() == -1;
		}
		return true;
	}
	private boolean COMMENT_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return lastTokenType() == NEWLINE || lastTokenType() == -1;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65\13"+
		"\4\3\4\3\4\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\6\5@\n\5\r\5\16\5A\3\5\3\5\3"+
		"\6\6\6G\n\6\r\6\16\6H\3\7\6\7L\n\7\r\7\16\7M\3\7\3\7\3\b\7\bS\n\b\f\b"+
		"\16\bV\13\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\6\ba\n\b\r\b\16\b"+
		"b\3\b\5\bf\n\b\3\b\3\b\3\t\6\tk\n\t\r\t\16\tl\3\n\6\np\n\n\r\n\16\nq\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\3\2\6\3\2%%\3\2\62;\4\2\f\f\17"+
		"\17\6\2\13\13\16\16\"\"\u00a2\u00a2\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\3\35\3\2\2\2\5&\3\2\2\2\7+\3\2\2\2\t9\3\2\2\2\13F\3"+
		"\2\2\2\rK\3\2\2\2\17T\3\2\2\2\21j\3\2\2\2\23o\3\2\2\2\25u\3\2\2\2\27w"+
		"\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35\36\7f\2\2\36\37\7k\2\2\37 \7u\2\2"+
		" !\7c\2\2!\"\7d\2\2\"#\7n\2\2#$\7g\2\2$%\7f\2\2%\4\3\2\2\2&\'\7?\2\2\'"+
		"\6\3\2\2\2(*\5\33\16\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2"+
		"\2-+\3\2\2\2./\5\27\f\2/\63\6\4\2\2\60\62\5\27\f\2\61\60\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67"+
		"\b\4\2\2\67\b\3\2\2\28:\5\25\13\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<=\3\2\2\2=?\7z\2\2>@\5\25\13\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BC\3\2\2\2CD\7I\2\2D\n\3\2\2\2EG\5\25\13\2FE\3\2\2\2GH\3\2\2\2H"+
		"F\3\2\2\2HI\3\2\2\2I\f\3\2\2\2JL\5\25\13\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2NO\3\2\2\2OP\7I\2\2P\16\3\2\2\2QS\5\33\16\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\t\2\2\2X\\\6\b\3\2Y["+
		"\5\31\r\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]e\3\2\2\2^\\\3\2\2"+
		"\2_a\5\27\f\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2df\7\2"+
		"\2\3e`\3\2\2\2ed\3\2\2\2fg\3\2\2\2gh\b\b\2\2h\20\3\2\2\2ik\5\27\f\2ji"+
		"\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\22\3\2\2\2np\5\33\16\2on\3\2\2"+
		"\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\n\2\2t\24\3\2\2\2uv\t\3"+
		"\2\2v\26\3\2\2\2wx\t\4\2\2x\30\3\2\2\2yz\n\4\2\2z\32\3\2\2\2{|\t\5\2\2"+
		"|\34\3\2\2\2\17\2+\63;AHMT\\belq\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}