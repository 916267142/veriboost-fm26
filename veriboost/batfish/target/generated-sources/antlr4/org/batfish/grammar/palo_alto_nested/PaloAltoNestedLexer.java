// Generated from org/batfish/grammar/palo_alto_nested/PaloAltoNestedLexer.g4 by ANTLR 4.7.2
package org.batfish.grammar.palo_alto_nested;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PaloAltoNestedLexer extends org.batfish.grammar.palo_alto_nested.parsing.PaloAltoNestedBaseLexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSE_BRACE=1, CLOSE_BRACKET=2, CLOSE_PAREN=3, COMMENT_LINE=4, OPEN_BRACE=5, 
		OPEN_BRACKET=6, OPEN_PAREN=7, SEMICOLON=8, SHOW_CONFIG_LINE=9, WORD=10, 
		NEWLINE=11, WS=12, F_WordFinalChar=13, F_WordInteriorChar=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PAREN", "COMMENT_LINE", "OPEN_BRACE", 
			"OPEN_BRACKET", "OPEN_PAREN", "SEMICOLON", "SHOW_CONFIG_LINE", "WORD", 
			"NEWLINE", "WS", "F_NewlineChar", "F_NonNewlineChar", "F_QuotedString", 
			"F_WhitespaceChar", "F_Word", "F_WordFinalChar", "F_WordInteriorChar", 
			"F_WordStart"
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


	boolean enableIPV6_ADDRESS = true;
	boolean enableIP_ADDRESS = true;
	boolean enableDEC = true;

	@Override
	public String printStateVariables() {
	   StringBuilder sb = new StringBuilder();
	   sb.append("enableIPV6_ADDRESS: " + enableIPV6_ADDRESS + "\n");
	   sb.append("enableIP_ADDRESS: " + enableIP_ADDRESS + "\n");
	   sb.append("enableDEC: " + enableDEC + "\n");
	   return sb.toString();
	}



	public PaloAltoNestedLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PaloAltoNestedLexer.g4"; }

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
		case 3:
			return COMMENT_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean COMMENT_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return lastTokenType() == -1 || lastTokenType() == NEWLINE || lastTokenType() == SHOW_CONFIG_LINE;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\7\5\63"+
		"\n\5\f\5\16\5\66\13\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\6\5A\n\5"+
		"\r\5\16\5B\3\5\5\5F\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\7"+
		"\nS\n\n\f\n\16\nV\13\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n^\n\n\r\n\16\n_\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nj\n\n\f\n\16\nm\13\n\3\n\6\np\n\n\r\n"+
		"\16\nq\3\n\3\n\3\13\3\13\5\13x\n\13\3\f\6\f{\n\f\r\f\16\f|\3\f\3\f\3\r"+
		"\6\r\u0082\n\r\r\r\16\r\u0083\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7"+
		"\20\u008e\n\20\f\20\16\20\u0091\13\20\3\20\3\20\3\21\3\21\3\22\3\22\7"+
		"\22\u0099\n\22\f\22\16\22\u009c\13\22\3\22\5\22\u009f\n\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\17\'\20)\2\3\2\t\4\2##%%\4\2\f\f\17"+
		"\17\3\2$$\5\2\13\13\16\16\"\"\b\2\13\f\16\17\"\"==__\177\177\5\2\13\f"+
		"\16\17\"\"\13\2\13\f\16\17\"\"*+==]]__}}\177\177\2\u00ad\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\64\3\2\2\2\13"+
		"I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23T\3\2\2\2\25w\3\2\2\2\27"+
		"z\3\2\2\2\31\u0081\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b"+
		"\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2"+
		")\u00a4\3\2\2\2+,\7\177\2\2,\4\3\2\2\2-.\7_\2\2.\6\3\2\2\2/\60\7+\2\2"+
		"\60\b\3\2\2\2\61\63\5!\21\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\t\2\2\28<\6\5\2\29;\5\35"+
		"\17\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=E\3\2\2\2><\3\2\2\2?A\5"+
		"\33\16\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DF\7\2\2\3E"+
		"@\3\2\2\2ED\3\2\2\2FG\3\2\2\2GH\b\5\2\2H\n\3\2\2\2IJ\7}\2\2J\f\3\2\2\2"+
		"KL\7]\2\2L\16\3\2\2\2MN\7*\2\2N\20\3\2\2\2OP\7=\2\2P\22\3\2\2\2QS\5\35"+
		"\17\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7"+
		"u\2\2XY\7j\2\2YZ\7q\2\2Z[\7y\2\2[]\3\2\2\2\\^\5!\21\2]\\\3\2\2\2^_\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7e\2\2bc\7q\2\2cd\7p\2\2de\7h\2\2"+
		"ef\7k\2\2fg\7i\2\2gk\3\2\2\2hj\5\35\17\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5\33\16\2on\3\2\2\2pq\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2rs\3\2\2\2st\b\n\3\2t\24\3\2\2\2ux\5\37\20\2vx\5#\22\2wu\3"+
		"\2\2\2wv\3\2\2\2x\26\3\2\2\2y{\5\33\16\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}~\3\2\2\2~\177\b\f\3\2\177\30\3\2\2\2\u0080\u0082\5!\21\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\r\2\2\u0086\32\3\2\2\2\u0087\u0088"+
		"\t\3\2\2\u0088\34\3\2\2\2\u0089\u008a\n\3\2\2\u008a\36\3\2\2\2\u008b\u008f"+
		"\7$\2\2\u008c\u008e\n\4\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\7$\2\2\u0093 \3\2\2\2\u0094\u0095\t\5\2\2\u0095\"\3\2"+
		"\2\2\u0096\u009e\5)\25\2\u0097\u0099\5\'\24\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5%\23\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f$\3\2\2\2\u00a0\u00a1\n\6\2\2\u00a1&\3\2\2\2\u00a2"+
		"\u00a3\n\7\2\2\u00a3(\3\2\2\2\u00a4\u00a5\n\b\2\2\u00a5*\3\2\2\2\21\2"+
		"\64<BET_kqw|\u0083\u008f\u009a\u009e\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}