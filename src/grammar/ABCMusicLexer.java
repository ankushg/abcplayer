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
		TRIPLET_START=21, QUADRUPLET_START=22, BAR_LINE=23, OPEN_BRACKET=24, CLOSE_BRACKET=25, 
		SINGLE_BAR=26, COMMENT_START=27, LYRIC_START=28, BLANK_SYLLABLE=29, SYLLABLE_JOINER=30, 
		SYLLABLE_EXTENDER=31, LYRIC_HYPHEN=32, LYRIC_BARLINE=33, NONBASENOTE=34, 
		PUNCTUATION=35, OTHER_CHAR=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WHITESPACE", "BASE", "'z'", "INTEGER", "NEWLINE", "'='", "'/'", "'X:'", 
		"'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "KEY_TOKEN", "NON_FRACTION_METER", 
		"OCTAVE", "ACCIDENTAL_TYPE", "'(2'", "'(3'", "'(4'", "BAR_LINE", "'['", 
		"']'", "SINGLE_BAR", "'%'", "'w:'", "BLANK_SYLLABLE", "SYLLABLE_JOINER", 
		"SYLLABLE_EXTENDER", "LYRIC_HYPHEN", "LYRIC_BARLINE", "NONBASENOTE", "PUNCTUATION", 
		"OTHER_CHAR"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "BASE", "BASENOTE", "REST", "DIGIT", "INTEGER", "NEWLINE", 
		"EQUALS", "OVER", "TRACK_NUMBER_START", "TITLE_START", "COMPOSER_START", 
		"DEFAULT_LENGTH_START", "METER_START", "TEMPO_START", "VOICE_START", "KEY_START", 
		"KEY_TOKEN", "MINOR_MOD", "KEY_ACCIDENTAL", "NON_FRACTION_METER", "OCTAVE", 
		"ACCIDENTAL_TYPE", "DUPLET_START", "TRIPLET_START", "QUADRUPLET_START", 
		"BAR_LINE", "OPEN_BRACKET", "CLOSE_BRACKET", "SINGLE_BAR", "COMMENT_START", 
		"LYRIC_START", "BLANK_SYLLABLE", "SYLLABLE_JOINER", "SYLLABLE_EXTENDER", 
		"LYRIC_HYPHEN", "LYRIC_BARLINE", "NONBASENOTE", "PUNCTUATION", "OTHER_CHAR"
	};


	    public boolean inKey, inHeader, inMeter, inLyric, inVoice;
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

		case 6: NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 9: TRACK_NUMBER_START_action((RuleContext)_localctx, actionIndex); break;

		case 13: METER_START_action((RuleContext)_localctx, actionIndex); break;

		case 15: VOICE_START_action((RuleContext)_localctx, actionIndex); break;

		case 16: KEY_START_action((RuleContext)_localctx, actionIndex); break;

		case 17: KEY_TOKEN_action((RuleContext)_localctx, actionIndex); break;

		case 20: NON_FRACTION_METER_action((RuleContext)_localctx, actionIndex); break;

		case 22: ACCIDENTAL_TYPE_action((RuleContext)_localctx, actionIndex); break;

		case 29: SINGLE_BAR_action((RuleContext)_localctx, actionIndex); break;

		case 31: LYRIC_START_action((RuleContext)_localctx, actionIndex); break;

		case 32: BLANK_SYLLABLE_action((RuleContext)_localctx, actionIndex); break;

		case 33: SYLLABLE_JOINER_action((RuleContext)_localctx, actionIndex); break;

		case 34: SYLLABLE_EXTENDER_action((RuleContext)_localctx, actionIndex); break;

		case 35: LYRIC_HYPHEN_action((RuleContext)_localctx, actionIndex); break;

		case 36: LYRIC_BARLINE_action((RuleContext)_localctx, actionIndex); break;

		case 37: NONBASENOTE_action((RuleContext)_localctx, actionIndex); break;

		case 39: OTHER_CHAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void INTEGER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: inMeter = false; break;
		}
	}
	private void OTHER_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void KEY_TOKEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: inKey = false; inHeader = false; break;
		}
	}
	private void LYRIC_HYPHEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: inLyric = false; inVoice = false; break;
		}
	}
	private void SYLLABLE_JOINER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void VOICE_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: inVoice = true; break;
		}
	}
	private void KEY_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: inKey = true; break;
		}
	}
	private void LYRIC_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: inLyric = true; break;
		}
	}
	private void BASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void METER_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: inMeter = true; break;
		}
	}
	private void SYLLABLE_EXTENDER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void BLANK_SYLLABLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void NONBASENOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void LYRIC_BARLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void NON_FRACTION_METER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: inMeter = false; break;
		}
	}
	private void TRACK_NUMBER_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: inHeader = true; break;
		}
	}
	private void SINGLE_BAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	private void ACCIDENTAL_TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return BASE_sempred((RuleContext)_localctx, predIndex);

		case 17: return KEY_TOKEN_sempred((RuleContext)_localctx, predIndex);

		case 20: return NON_FRACTION_METER_sempred((RuleContext)_localctx, predIndex);

		case 22: return ACCIDENTAL_TYPE_sempred((RuleContext)_localctx, predIndex);

		case 29: return SINGLE_BAR_sempred((RuleContext)_localctx, predIndex);

		case 32: return BLANK_SYLLABLE_sempred((RuleContext)_localctx, predIndex);

		case 33: return SYLLABLE_JOINER_sempred((RuleContext)_localctx, predIndex);

		case 34: return SYLLABLE_EXTENDER_sempred((RuleContext)_localctx, predIndex);

		case 35: return LYRIC_HYPHEN_sempred((RuleContext)_localctx, predIndex);

		case 36: return LYRIC_BARLINE_sempred((RuleContext)_localctx, predIndex);

		case 37: return NONBASENOTE_sempred((RuleContext)_localctx, predIndex);

		case 39: return OTHER_CHAR_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean OTHER_CHAR_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return !inKey && (inHeader || inVoice);
		}
		return true;
	}
	private boolean BASE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !inMeter && !inKey;
		}
		return true;
	}
	private boolean SYLLABLE_EXTENDER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return inLyric;
		}
		return true;
	}
	private boolean BLANK_SYLLABLE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return inLyric;
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
		case 10: return !inKey;
		}
		return true;
	}
	private boolean LYRIC_BARLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return inLyric;
		}
		return true;
	}
	private boolean LYRIC_HYPHEN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return inLyric;
		}
		return true;
	}
	private boolean NON_FRACTION_METER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return inMeter;
		}
		return true;
	}
	private boolean SINGLE_BAR_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return !inLyric;
		}
		return true;
	}
	private boolean ACCIDENTAL_TYPE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return !inLyric;
		}
		return true;
	}
	private boolean SYLLABLE_JOINER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return inLyric;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\4&\u00f8\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\3\2\6\2U\n\2\r\2\16\2V\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\6\7c\n\7\r\7\16\7d\3\7\3\7\3\b\6\bj\n\b\r\b\16\bk\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0097\n\23\3\23\5\23\u009a"+
		"\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00a6\n\26"+
		"\3\26\3\26\3\27\6\27\u00ab\n\27\r\27\16\27\u00ac\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u00b6\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u00cf\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u00e6\n#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3)\3)\3)\2*\3\3\1\5\4\1\7\2\1\t\5\1\13\2\1\r\6\2\17"+
		"\7\3\21\b\1\23\t\1\25\n\4\27\13\1\31\f\1\33\r\1\35\16\5\37\17\1!\20\6"+
		"#\21\7%\22\b\'\2\1)\2\1+\23\t-\24\1/\25\1\61\26\1\63\27\1\65\30\1\67\31"+
		"\19\32\1;\33\1=\34\1?\35\1A\36\nC\37\1E \1G!\1I\"\1K#\1M$\1O%\1Q&\1\3"+
		"\2\13\4\13\13\"\"\4CIci\3\62;\4\f\f\17\17\4%%dd\4))..\4??aa\4J\\j{\5*"+
		"+\60\60AA\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\3T\3\2\2\2\5X\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13"+
		"_\3\2\2\2\rb\3\2\2\2\17i\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25s\3\2\2\2\27"+
		"x\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0081\3\2\2\2\37\u0086\3\2\2\2!\u0089"+
		"\3\2\2\2#\u008e\3\2\2\2%\u0093\3\2\2\2\'\u009d\3\2\2\2)\u009f\3\2\2\2"+
		"+\u00a1\3\2\2\2-\u00aa\3\2\2\2/\u00ae\3\2\2\2\61\u00b7\3\2\2\2\63\u00ba"+
		"\3\2\2\2\65\u00bd\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2"+
		"\2=\u00d4\3\2\2\2?\u00d7\3\2\2\2A\u00d9\3\2\2\2C\u00de\3\2\2\2E\u00e1"+
		"\3\2\2\2G\u00e7\3\2\2\2I\u00ea\3\2\2\2K\u00ed\3\2\2\2M\u00f0\3\2\2\2O"+
		"\u00f3\3\2\2\2Q\u00f5\3\2\2\2SU\t\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2W\4\3\2\2\2XY\6\3\2\2YZ\5\7\4\2Z\6\3\2\2\2[\\\t\3\2\2\\\b\3"+
		"\2\2\2]^\7|\2\2^\n\3\2\2\2_`\t\4\2\2`\f\3\2\2\2ac\5\13\6\2ba\3\2\2\2c"+
		"d\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\7\2\2g\16\3\2\2\2hj\t\5\2"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\b\3\2n\20\3\2"+
		"\2\2op\7?\2\2p\22\3\2\2\2qr\7\61\2\2r\24\3\2\2\2st\7Z\2\2tu\7<\2\2uv\3"+
		"\2\2\2vw\b\13\4\2w\26\3\2\2\2xy\7V\2\2yz\7<\2\2z\30\3\2\2\2{|\7E\2\2|"+
		"}\7<\2\2}\32\3\2\2\2~\177\7N\2\2\177\u0080\7<\2\2\u0080\34\3\2\2\2\u0081"+
		"\u0082\7O\2\2\u0082\u0083\7<\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\17"+
		"\5\2\u0085\36\3\2\2\2\u0086\u0087\7S\2\2\u0087\u0088\7<\2\2\u0088 \3\2"+
		"\2\2\u0089\u008a\7X\2\2\u008a\u008b\7<\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\b\21\6\2\u008d\"\3\2\2\2\u008e\u008f\7M\2\2\u008f\u0090\7<\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\b\22\7\2\u0092$\3\2\2\2\u0093\u0094\6\23\3"+
		"\2\u0094\u0096\5\7\4\2\u0095\u0097\5)\25\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5\'\24\2\u0099\u0098\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\23\b\2\u009c&\3"+
		"\2\2\2\u009d\u009e\7o\2\2\u009e(\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0*\3"+
		"\2\2\2\u00a1\u00a5\6\26\4\2\u00a2\u00a6\7E\2\2\u00a3\u00a4\7E\2\2\u00a4"+
		"\u00a6\7~\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\b\26\t\2\u00a8,\3\2\2\2\u00a9\u00ab\t\7\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		".\3\2\2\2\u00ae\u00b5\6\30\5\2\u00af\u00b6\7`\2\2\u00b0\u00b1\7`\2\2\u00b1"+
		"\u00b6\7`\2\2\u00b2\u00b6\t\b\2\2\u00b3\u00b4\7a\2\2\u00b4\u00b6\7a\2"+
		"\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9\7\64\2\2\u00b9"+
		"\62\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb\u00bc\7\65\2\2\u00bc\64\3\2\2\2\u00bd"+
		"\u00be\7*\2\2\u00be\u00bf\7\66\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7~\2\2"+
		"\u00c1\u00cf\7~\2\2\u00c2\u00c3\7]\2\2\u00c3\u00cf\7~\2\2\u00c4\u00c5"+
		"\7~\2\2\u00c5\u00cf\7_\2\2\u00c6\u00c7\7~\2\2\u00c7\u00cf\7<\2\2\u00c8"+
		"\u00c9\7<\2\2\u00c9\u00cf\7~\2\2\u00ca\u00cb\7]\2\2\u00cb\u00cf\7\63\2"+
		"\2\u00cc\u00cd\7]\2\2\u00cd\u00cf\7\64\2\2\u00ce\u00c0\3\2\2\2\u00ce\u00c2"+
		"\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7]\2\2\u00d1"+
		":\3\2\2\2\u00d2\u00d3\7_\2\2\u00d3<\3\2\2\2\u00d4\u00d5\6\37\6\2\u00d5"+
		"\u00d6\7~\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7\'\2\2\u00d8@\3\2\2\2\u00d9"+
		"\u00da\7y\2\2\u00da\u00db\7<\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b!\n"+
		"\2\u00ddB\3\2\2\2\u00de\u00df\6\"\7\2\u00df\u00e0\7,\2\2\u00e0D\3\2\2"+
		"\2\u00e1\u00e5\6#\b\2\u00e2\u00e6\7\u0080\2\2\u00e3\u00e4\7^\2\2\u00e4"+
		"\u00e6\7/\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6F\3\2\2\2\u00e7"+
		"\u00e8\6$\t\2\u00e8\u00e9\7a\2\2\u00e9H\3\2\2\2\u00ea\u00eb\6%\n\2\u00eb"+
		"\u00ec\7/\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\6&\13\2\u00ee\u00ef\7~\2\2\u00ef"+
		"L\3\2\2\2\u00f0\u00f1\6\'\f\2\u00f1\u00f2\t\t\2\2\u00f2N\3\2\2\2\u00f3"+
		"\u00f4\t\n\2\2\u00f4P\3\2\2\2\u00f5\u00f6\6)\r\2\u00f6\u00f7\13\2\2\2"+
		"\u00f7R\3\2\2\2\r\2Vdk\u0096\u0099\u00a5\u00ac\u00b5\u00ce\u00e5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}