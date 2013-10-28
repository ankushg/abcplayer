// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, BASE=2, REST=3, INTEGER=4, NEWLINE=5, EQUALS=6, OVER=7, 
		TRACK_NUMBER_START=8, TITLE_START=9, COMPOSER_START=10, DEFAULT_LENGTH_START=11, 
		METER_START=12, TEMPO_START=13, VOICE_START=14, KEY_START=15, KEY_TOKEN=16, 
		NON_FRACTION_METER=17, OCTAVE=18, ACCIDENTAL_TYPE=19, DUPLET_START=20, 
		TRIPLET_START=21, QUADRUPLET_START=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, 
		BAR_LINE=25, COMMENT_START=26, LYRIC_START=27, LYRIC_MODIFIER=28, LYRIC_SEPARATOR=29, 
		NONBASENOTE=30, PUNCTUATION=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WHITESPACE", "BASE", "'z'", "INTEGER", "NEWLINE", "'='", "'/'", "TRACK_NUMBER_START", 
		"TITLE_START", "COMPOSER_START", "DEFAULT_LENGTH_START", "'M:'", "TEMPO_START", 
		"VOICE_START", "KEY_START", "KEY_TOKEN", "NON_FRACTION_METER", "OCTAVE", 
		"ACCIDENTAL_TYPE", "'(2'", "'(3'", "'(4'", "'['", "']'", "BAR_LINE", "'%'", 
		"'w:'", "LYRIC_MODIFIER", "'-'", "NONBASENOTE", "PUNCTUATION"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "BASE", "BASENOTE", "REST", "DIGIT", "INTEGER", "NEWLINE", 
		"EQUALS", "OVER", "TRACK_NUMBER_START", "TITLE_START", "COMPOSER_START", 
		"DEFAULT_LENGTH_START", "METER_START", "TEMPO_START", "VOICE_START", "KEY_START", 
		"KEY_TOKEN", "MINOR_MOD", "KEY_ACCIDENTAL", "NON_FRACTION_METER", "OCTAVE", 
		"ACCIDENTAL_TYPE", "DUPLET_START", "TRIPLET_START", "QUADRUPLET_START", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "BAR_LINE", "OPEN_REPEAT", "CLOSE_REPEAT", 
		"NTH_REPEAT", "COMMENT_START", "LYRIC_START", "LYRIC_MODIFIER", "LYRIC_SEPARATOR", 
		"NONBASENOTE", "PUNCTUATION"
	};


	    public boolean inKey = false;
	    public boolean inHeader = true;
	    public boolean inMeter = false; 
	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1: BASE_action((RuleContext)_localctx, actionIndex); break;

		case 5: INTEGER_action((RuleContext)_localctx, actionIndex); break;

		case 9: TRACK_NUMBER_START_action((RuleContext)_localctx, actionIndex); break;

		case 10: TITLE_START_action((RuleContext)_localctx, actionIndex); break;

		case 11: COMPOSER_START_action((RuleContext)_localctx, actionIndex); break;

		case 12: DEFAULT_LENGTH_START_action((RuleContext)_localctx, actionIndex); break;

		case 13: METER_START_action((RuleContext)_localctx, actionIndex); break;

		case 14: TEMPO_START_action((RuleContext)_localctx, actionIndex); break;

		case 15: VOICE_START_action((RuleContext)_localctx, actionIndex); break;

		case 16: KEY_START_action((RuleContext)_localctx, actionIndex); break;

		case 17: KEY_TOKEN_action((RuleContext)_localctx, actionIndex); break;

		case 20: NON_FRACTION_METER_action((RuleContext)_localctx, actionIndex); break;

		case 36: NONBASENOTE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void INTEGER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: inMeter = false; break;
		}
	}
	private void TEMPO_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: inHeader = false; break;
		}
	}
	private void DEFAULT_LENGTH_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: inHeader = false; break;
		}
	}
	private void TITLE_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: inHeader = false; break;
		}
	}
	private void BASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void METER_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: inMeter = true; break;
		}
	}
	private void KEY_TOKEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: inKey = false; inHeader = false; break;
		}
	}
	private void NONBASENOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void NON_FRACTION_METER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: inMeter = false; break;
		}
	}
	private void TRACK_NUMBER_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: inHeader = false; break;

		case 2: inHeader = true; break;
		}
	}
	private void COMPOSER_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: inHeader = false; break;
		}
	}
	private void KEY_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: inHeader = false; break;

		case 10: inHeader = false; inKey = true; break;
		}
	}
	private void VOICE_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: inHeader = false; break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return BASE_sempred((RuleContext)_localctx, predIndex);

		case 17: return KEY_TOKEN_sempred((RuleContext)_localctx, predIndex);

		case 20: return NON_FRACTION_METER_sempred((RuleContext)_localctx, predIndex);

		case 36: return NONBASENOTE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean BASE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !inMeter && !inKey;
		}
		return true;
	}
	private boolean KEY_TOKEN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return inKey;
		}
		return true;
	}
	private boolean NONBASENOTE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return !inKey;
		}
		return true;
	}
	private boolean NON_FRACTION_METER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return inMeter;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\4!\u00f3\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3"+
		"\2\6\2Q\n\2\r\2\16\2R\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7_\n\7"+
		"\r\7\16\7`\3\7\3\7\3\b\6\bf\n\b\r\b\16\bg\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0096\n\23\3\23\5\23\u0099"+
		"\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00a5\n\26"+
		"\3\26\3\26\3\27\6\27\u00aa\n\27\r\27\16\27\u00ab\3\27\6\27\u00af\n\27"+
		"\r\27\16\27\u00b0\5\27\u00b3\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00bb"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00d4\n\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\5!\u00e0\n!\3\"\3\"\3#\3#\3#\3$\3$\3$"+
		"\3$\5$\u00eb\n$\3%\3%\3&\3&\3&\3\'\3\'\2(\3\3\1\5\4\1\7\2\1\t\5\1\13\2"+
		"\1\r\6\2\17\7\1\21\b\1\23\t\1\25\n\4\27\13\5\31\f\6\33\r\7\35\16\b\37"+
		"\17\t!\20\n#\21\f%\22\r\'\2\1)\2\1+\23\16-\24\1/\25\1\61\26\1\63\27\1"+
		"\65\30\1\67\31\19\32\1;\33\1=\2\1?\2\1A\2\1C\34\1E\35\1G\36\1I\37\1K "+
		"\1M!\1\3\2\13\4\13\13\"\"\4CIci\3\62;\4\f\f\17\17\4%%dd\4??aa\5,,aa\u0080"+
		"\u0080\4J\\j{\5*+\60\60AA\u0100\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3P\3\2\2\2\5T"+
		"\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r^\3\2\2\2\17e\3\2\2\2\21i"+
		"\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27s\3\2\2\2\31w\3\2\2\2\33{\3\2\2\2\35"+
		"\177\3\2\2\2\37\u0084\3\2\2\2!\u0088\3\2\2\2#\u008c\3\2\2\2%\u0092\3\2"+
		"\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00b2\3\2\2\2/\u00ba"+
		"\3\2\2\2\61\u00bc\3\2\2\2\63\u00bf\3\2\2\2\65\u00c2\3\2\2\2\67\u00c5\3"+
		"\2\2\29\u00c7\3\2\2\2;\u00d3\3\2\2\2=\u00d5\3\2\2\2?\u00d8\3\2\2\2A\u00df"+
		"\3\2\2\2C\u00e1\3\2\2\2E\u00e3\3\2\2\2G\u00ea\3\2\2\2I\u00ec\3\2\2\2K"+
		"\u00ee\3\2\2\2M\u00f1\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\4\3\2\2\2TU\6\3\2\2UV\5\7\4\2V\6\3\2\2\2WX\t\3\2\2X\b\3\2"+
		"\2\2YZ\7|\2\2Z\n\3\2\2\2[\\\t\4\2\2\\\f\3\2\2\2]_\5\13\6\2^]\3\2\2\2_"+
		"`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\7\2\2c\16\3\2\2\2df\t\5\2"+
		"\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\20\3\2\2\2ij\7?\2\2j\22\3"+
		"\2\2\2kl\7\61\2\2l\24\3\2\2\2mn\b\13\3\2no\7Z\2\2op\7<\2\2pq\3\2\2\2q"+
		"r\b\13\4\2r\26\3\2\2\2st\b\f\5\2tu\7V\2\2uv\7<\2\2v\30\3\2\2\2wx\b\r\6"+
		"\2xy\7E\2\2yz\7<\2\2z\32\3\2\2\2{|\b\16\7\2|}\7N\2\2}~\7<\2\2~\34\3\2"+
		"\2\2\177\u0080\7O\2\2\u0080\u0081\7<\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\b\17\b\2\u0083\36\3\2\2\2\u0084\u0085\b\20\t\2\u0085\u0086\7S\2\2\u0086"+
		"\u0087\7<\2\2\u0087 \3\2\2\2\u0088\u0089\b\21\n\2\u0089\u008a\7X\2\2\u008a"+
		"\u008b\7<\2\2\u008b\"\3\2\2\2\u008c\u008d\b\22\13\2\u008d\u008e\7M\2\2"+
		"\u008e\u008f\7<\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\22\f\2\u0091$\3"+
		"\2\2\2\u0092\u0093\6\23\3\2\u0093\u0095\5\7\4\2\u0094\u0096\5)\25\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\'"+
		"\24\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\23\r\2\u009b&\3\2\2\2\u009c\u009d\7o\2\2\u009d(\3\2\2\2\u009e"+
		"\u009f\t\6\2\2\u009f*\3\2\2\2\u00a0\u00a4\6\26\4\2\u00a1\u00a5\7E\2\2"+
		"\u00a2\u00a3\7E\2\2\u00a3\u00a5\7~\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\26\16\2\u00a7,\3\2\2\2\u00a8"+
		"\u00aa\7)\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00af\7.\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		".\3\2\2\2\u00b4\u00bb\7`\2\2\u00b5\u00b6\7`\2\2\u00b6\u00bb\7`\2\2\u00b7"+
		"\u00bb\t\7\2\2\u00b8\u00b9\7a\2\2\u00b9\u00bb\7a\2\2\u00ba\u00b4\3\2\2"+
		"\2\u00ba\u00b5\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\60"+
		"\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\u00be\7\64\2\2\u00be\62\3\2\2\2\u00bf"+
		"\u00c0\7*\2\2\u00c0\u00c1\7\65\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7*\2\2"+
		"\u00c3\u00c4\7\66\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7]\2\2\u00c68\3\2\2"+
		"\2\u00c7\u00c8\7_\2\2\u00c8:\3\2\2\2\u00c9\u00d4\7~\2\2\u00ca\u00cb\7"+
		"~\2\2\u00cb\u00d4\7~\2\2\u00cc\u00cd\7]\2\2\u00cd\u00d4\7~\2\2\u00ce\u00cf"+
		"\7~\2\2\u00cf\u00d4\7_\2\2\u00d0\u00d4\5=\37\2\u00d1\u00d4\5? \2\u00d2"+
		"\u00d4\5A!\2\u00d3\u00c9\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3\u00cc\3\2\2"+
		"\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7~\2\2\u00d6\u00d7\7<\2\2\u00d7>\3"+
		"\2\2\2\u00d8\u00d9\7<\2\2\u00d9\u00da\7~\2\2\u00da@\3\2\2\2\u00db\u00dc"+
		"\7]\2\2\u00dc\u00e0\7\63\2\2\u00dd\u00de\7]\2\2\u00de\u00e0\7\64\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7\'\2\2"+
		"\u00e2D\3\2\2\2\u00e3\u00e4\7y\2\2\u00e4\u00e5\7<\2\2\u00e5F\3\2\2\2\u00e6"+
		"\u00eb\t\b\2\2\u00e7\u00e8\7^\2\2\u00e8\u00eb\7/\2\2\u00e9\u00eb\7~\2"+
		"\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e9\3\2\2\2\u00ebH"+
		"\3\2\2\2\u00ec\u00ed\7/\2\2\u00edJ\3\2\2\2\u00ee\u00ef\6&\5\2\u00ef\u00f0"+
		"\t\t\2\2\u00f0L\3\2\2\2\u00f1\u00f2\t\n\2\2\u00f2N\3\2\2\2\20\2R`g\u0095"+
		"\u0098\u00a4\u00ab\u00b0\u00b2\u00ba\u00d3\u00df\u00ea";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}