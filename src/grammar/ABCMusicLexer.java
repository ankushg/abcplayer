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
		NEWLINE=1, COMMENT=2, WHITESPACE=3, FIELD_TRACK_NUMBER=4, FIELD_TITLE=5, 
		FIELD_KEY=6, OTHER_FIELD=7, FIELD_COMPOSER=8, FIELD_DEFAULT_LENGTH=9, 
		FIELD_METER=10, FIELD_TEMPO=11, FIELD_VOICE=12, KEY_ACCIDENTAL=13, MODEMINOR=14, 
		TEMPO=15, MEASURE_ELEMENT=16, NOTE_ELEMENT=17, NOTE=18, NOTE_OR_REST=19, 
		PITCH=20, OCTAVE=21, NOTE_LENGTH_STRICT=22, ACCIDENTAL=23, TUPLET_ELEMENT=24, 
		TUPLET_SPEC=25, MULTI_NOTE=26, BAR_LINE=27, OPEN_REPEAT=28, CLOSE_REPEAT=29, 
		NTH_REPEAT=30, LYRIC=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NEWLINE", "COMMENT", "WHITESPACE", "FIELD_TRACK_NUMBER", "FIELD_TITLE", 
		"FIELD_KEY", "OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "KEY_ACCIDENTAL", "MODEMINOR", 
		"TEMPO", "MEASURE_ELEMENT", "NOTE_ELEMENT", "NOTE", "NOTE_OR_REST", "PITCH", 
		"OCTAVE", "NOTE_LENGTH_STRICT", "ACCIDENTAL", "TUPLET_ELEMENT", "TUPLET_SPEC", 
		"MULTI_NOTE", "BAR_LINE", "'|:'", "':|'", "NTH_REPEAT", "LYRIC"
	};
	public static final String[] ruleNames = {
		"BASENOTE", "REST", "SPACE", "DIGIT", "INTEGER", "STRING", "NEWLINE", 
		"COMMENT", "EOL", "WHITESPACE", "FIELD_TRACK_NUMBER", "FIELD_TITLE", "FIELD_KEY", 
		"OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", "FIELD_METER", 
		"FIELD_TEMPO", "FIELD_VOICE", "KEY", "KEYNOTE", "KEY_ACCIDENTAL", "MODEMINOR", 
		"METER", "METER_FRACTION", "TEMPO", "MEASURE_ELEMENT", "NOTE_ELEMENT", 
		"NOTE", "NOTE_OR_REST", "PITCH", "OCTAVE", "NOTE_LENGTH", "NOTE_LENGTH_STRICT", 
		"ACCIDENTAL", "TUPLET_ELEMENT", "TUPLET_SPEC", "MULTI_NOTE", "BAR_LINE", 
		"OPEN_REPEAT", "CLOSE_REPEAT", "NTH_REPEAT", "LYRIC", "LYRICAL_ELEMENT", 
		"LYRIC_TEXT"
	};

		
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
		case 9: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4!\u016f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\6\4c\n\4"+
		"\r\4\16\4d\3\5\3\5\3\6\6\6j\n\6\r\6\16\6k\3\7\3\7\3\7\3\7\3\7\6\7s\n\7"+
		"\r\7\16\7t\3\b\6\bx\n\b\r\b\16\by\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0082\n"+
		"\n\3\13\6\13\u0085\n\13\r\13\16\13\u0086\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u008f\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00a1\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00ac\n\17\3\20\3\20\3\20\3\20\5\20\u00b2\n\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\5\21\u00bb\n\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00c4\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00cd\n"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00d6\n\24\3\24\3\24\3\24"+
		"\3\25\3\25\5\25\u00dd\n\25\3\26\3\26\5\26\u00e1\n\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\5\31\u00eb\n\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\5\34\u00f7\n\34\3\35\3\35\5\35\u00fb\n\35\3\36\3"+
		"\36\5\36\u00ff\n\36\3\37\3\37\5\37\u0103\n\37\3 \5 \u0106\n \3 \3 \5 "+
		"\u010a\n \3!\6!\u010d\n!\r!\16!\u010e\3!\6!\u0112\n!\r!\16!\u0113\5!\u0116"+
		"\n!\3\"\5\"\u0119\n\"\3\"\3\"\5\"\u011d\n\"\5\"\u011f\n\"\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\5$\u012b\n$\3%\3%\6%\u012f\n%\r%\16%\u0130\3&\3&\3"+
		"&\3\'\3\'\6\'\u0138\n\'\r\'\16\'\u0139\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u0147\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\5+\u0153\n+\3,\3,\3,\3"+
		",\3,\7,\u015a\n,\f,\16,\u015d\13,\3-\6-\u0160\n-\r-\16-\u0161\3-\3-\3"+
		"-\3-\3-\5-\u0169\n-\3.\6.\u016c\n.\r.\16.\u016d\2/\3\2\1\5\2\1\7\2\1\t"+
		"\2\1\13\2\1\r\2\1\17\3\1\21\4\1\23\2\1\25\5\2\27\6\1\31\7\1\33\b\1\35"+
		"\t\1\37\n\1!\13\1#\f\1%\r\1\'\16\1)\2\1+\2\1-\17\1/\20\1\61\2\1\63\2\1"+
		"\65\21\1\67\22\19\23\1;\24\1=\25\1?\26\1A\27\1C\2\1E\30\1G\31\1I\32\1"+
		"K\33\1M\34\1O\35\1Q\36\1S\37\1U \1W!\1Y\2\1[\2\1\3\2\f\4CIci\4\13\13\""+
		"\"\3\62;\5\60\60J\\j{\4\f\f\17\17\4\13\13\"\"\4%%dd\4??aa\6,,//aa\u0080"+
		"\u0080\13CCEEGGKKNPTTVV[[aa\u0199\2\17\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7"+
		"b\3\2\2\2\tf\3\2\2\2\13i\3\2\2\2\rr\3\2\2\2\17w\3\2\2\2\21{\3\2\2\2\23"+
		"\u0081\3\2\2\2\25\u0084\3\2\2\2\27\u008a\3\2\2\2\31\u0093\3\2\2\2\33\u009c"+
		"\3\2\2\2\35\u00ab\3\2\2\2\37\u00ad\3\2\2\2!\u00b6\3\2\2\2#\u00bf\3\2\2"+
		"\2%\u00c8\3\2\2\2\'\u00d1\3\2\2\2)\u00da\3\2\2\2+\u00de\3\2\2\2-\u00e2"+
		"\3\2\2\2/\u00e4\3\2\2\2\61\u00ea\3\2\2\2\63\u00ec\3\2\2\2\65\u00f0\3\2"+
		"\2\2\67\u00f6\3\2\2\29\u00fa\3\2\2\2;\u00fc\3\2\2\2=\u0102\3\2\2\2?\u0105"+
		"\3\2\2\2A\u0115\3\2\2\2C\u0118\3\2\2\2E\u0120\3\2\2\2G\u012a\3\2\2\2I"+
		"\u012c\3\2\2\2K\u0132\3\2\2\2M\u0135\3\2\2\2O\u0146\3\2\2\2Q\u0148\3\2"+
		"\2\2S\u014b\3\2\2\2U\u0152\3\2\2\2W\u0154\3\2\2\2Y\u0168\3\2\2\2[\u016b"+
		"\3\2\2\2]^\t\2\2\2^\4\3\2\2\2_`\7|\2\2`\6\3\2\2\2ac\t\3\2\2ba\3\2\2\2"+
		"cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\b\3\2\2\2fg\t\4\2\2g\n\3\2\2\2hj\5\t\5"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\f\3\2\2\2ms\5\3\2\2ns\5\5"+
		"\3\2os\t\5\2\2ps\5\7\4\2qs\5\13\6\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3"+
		"\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\16\3\2\2\2vx\t\6\2\2w"+
		"v\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\20\3\2\2\2{|\7\'\2\2|}\5\r\7"+
		"\2}~\5\17\b\2~\22\3\2\2\2\177\u0082\5\21\t\2\u0080\u0082\5\17\b\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\24\3\2\2\2\u0083\u0085\t\7\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\13\2\2\u0089\26\3\2\2\2\u008a"+
		"\u008b\7Z\2\2\u008b\u008c\7<\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\7\4"+
		"\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\5\13\6\2\u0091\u0092\5\23\n\2\u0092\30\3\2\2\2\u0093\u0094\7V\2\2\u0094"+
		"\u0095\7<\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\7\4\2\u0097\u0096\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5\r\7\2\u009a"+
		"\u009b\5\23\n\2\u009b\32\3\2\2\2\u009c\u009d\7M\2\2\u009d\u009e\7<\2\2"+
		"\u009e\u00a0\3\2\2\2\u009f\u00a1\5\7\4\2\u00a0\u009f\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5)\25\2\u00a3\u00a4\5\23\n\2"+
		"\u00a4\34\3\2\2\2\u00a5\u00ac\5\37\20\2\u00a6\u00ac\5!\21\2\u00a7\u00ac"+
		"\5#\22\2\u00a8\u00ac\5%\23\2\u00a9\u00ac\5\'\24\2\u00aa\u00ac\5\21\t\2"+
		"\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7E\2\2\u00ae\u00af\7<\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5\7\4"+
		"\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\5\r\7\2\u00b4\u00b5\5\23\n\2\u00b5 \3\2\2\2\u00b6\u00b7\7N\2\2\u00b7"+
		"\u00b8\7<\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5\7\4\2\u00ba\u00b9\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5E#\2\u00bd\u00be"+
		"\5\23\n\2\u00be\"\3\2\2\2\u00bf\u00c0\7O\2\2\u00c0\u00c1\7<\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c4\5\7\4\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\5\61\31\2\u00c6\u00c7\5\23\n\2\u00c7"+
		"$\3\2\2\2\u00c8\u00c9\7S\2\2\u00c9\u00ca\7<\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\5\7\4\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cf\5\65\33\2\u00cf\u00d0\5\23\n\2\u00d0&\3\2\2\2\u00d1\u00d2"+
		"\7X\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\5\7\4\2\u00d5"+
		"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5\r"+
		"\7\2\u00d8\u00d9\5\23\n\2\u00d9(\3\2\2\2\u00da\u00dc\5+\26\2\u00db\u00dd"+
		"\5/\30\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd*\3\2\2\2\u00de"+
		"\u00e0\5\3\2\2\u00df\u00e1\5-\27\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1,\3\2\2\2\u00e2\u00e3\t\b\2\2\u00e3.\3\2\2\2\u00e4\u00e5\7o"+
		"\2\2\u00e5\60\3\2\2\2\u00e6\u00eb\7E\2\2\u00e7\u00e8\7E\2\2\u00e8\u00eb"+
		"\7~\2\2\u00e9\u00eb\5\63\32\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\62\3\2\2\2\u00ec\u00ed\5\13\6\2\u00ed\u00ee"+
		"\7\61\2\2\u00ee\u00ef\5\13\6\2\u00ef\64\3\2\2\2\u00f0\u00f1\5\63\32\2"+
		"\u00f1\u00f2\7?\2\2\u00f2\u00f3\5\13\6\2\u00f3\66\3\2\2\2\u00f4\u00f7"+
		"\59\35\2\u00f5\u00f7\5I%\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"8\3\2\2\2\u00f8\u00fb\5;\36\2\u00f9\u00fb\5M\'\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb:\3\2\2\2\u00fc\u00fe\5=\37\2\u00fd\u00ff\5C\"\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff<\3\2\2\2\u0100\u0103\5? \2\u0101"+
		"\u0103\5\5\3\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103>\3\2\2\2"+
		"\u0104\u0106\5G$\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0109\5\3\2\2\u0108\u010a\5A!\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a@\3\2\2\2\u010b\u010d\7)\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0116\3\2"+
		"\2\2\u0110\u0112\7.\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u010c\3\2"+
		"\2\2\u0115\u0111\3\2\2\2\u0116B\3\2\2\2\u0117\u0119\5\13\6\2\u0118\u0117"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011e\3\2\2\2\u011a\u011c\7\61\2\2"+
		"\u011b\u011d\5\13\6\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011f\3\2\2\2\u011fD\3\2\2\2\u0120"+
		"\u0121\5\13\6\2\u0121\u0122\7\61\2\2\u0122\u0123\5\13\6\2\u0123F\3\2\2"+
		"\2\u0124\u012b\7`\2\2\u0125\u0126\7`\2\2\u0126\u012b\7`\2\2\u0127\u012b"+
		"\t\t\2\2\u0128\u0129\7a\2\2\u0129\u012b\7a\2\2\u012a\u0124\3\2\2\2\u012a"+
		"\u0125\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012bH\3\2\2\2"+
		"\u012c\u012e\5K&\2\u012d\u012f\59\35\2\u012e\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131J\3\2\2\2\u0132"+
		"\u0133\7*\2\2\u0133\u0134\5\t\5\2\u0134L\3\2\2\2\u0135\u0137\7]\2\2\u0136"+
		"\u0138\5;\36\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7_\2\2\u013c"+
		"N\3\2\2\2\u013d\u0147\7~\2\2\u013e\u013f\7~\2\2\u013f\u0147\7~\2\2\u0140"+
		"\u0141\7]\2\2\u0141\u0147\7~\2\2\u0142\u0143\7~\2\2\u0143\u0147\7_\2\2"+
		"\u0144\u0147\5Q)\2\u0145\u0147\5S*\2\u0146\u013d\3\2\2\2\u0146\u013e\3"+
		"\2\2\2\u0146\u0140\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147P\3\2\2\2\u0148\u0149\7~\2\2\u0149\u014a\7<\2\2\u014a"+
		"R\3\2\2\2\u014b\u014c\7<\2\2\u014c\u014d\7~\2\2\u014dT\3\2\2\2\u014e\u014f"+
		"\7]\2\2\u014f\u0153\7\63\2\2\u0150\u0151\7]\2\2\u0151\u0153\7\64\2\2\u0152"+
		"\u014e\3\2\2\2\u0152\u0150\3\2\2\2\u0153V\3\2\2\2\u0154\u0155\7y\2\2\u0155"+
		"\u0156\7<\2\2\u0156\u0157\3\2\2\2\u0157\u015b\5\7\4\2\u0158\u015a\5Y-"+
		"\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015cX\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\7\"\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0169\3\2\2\2\u0163\u0169\t\n\2\2\u0164\u0165\7^\2\2\u0165"+
		"\u0169\7/\2\2\u0166\u0169\7~\2\2\u0167\u0169\5[.\2\u0168\u015f\3\2\2\2"+
		"\u0168\u0163\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167"+
		"\3\2\2\2\u0169Z\3\2\2\2\u016a\u016c\n\13\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\\\3\2\2\2"+
		"+\2dkrty\u0081\u0086\u008e\u0097\u00a0\u00ab\u00b1\u00ba\u00c3\u00cc\u00d5"+
		"\u00dc\u00e0\u00ea\u00f6\u00fa\u00fe\u0102\u0105\u0109\u010e\u0113\u0115"+
		"\u0118\u011c\u011e\u012a\u0130\u0139\u0146\u0152\u015b\u0161\u0168\u016d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}