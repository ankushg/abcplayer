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
		BASENOTE=1, REST=2, SPACE=3, NEWLINE=4, COMMENT=5, FIELD_TRACK_NUMBER=6, 
		FIELD_TITLE=7, FIELD_KEY=8, OTHER_FIELD=9, FIELD_COMPOSER=10, FIELD_DEFAULT_LENGTH=11, 
		FIELD_METER=12, FIELD_TEMPO=13, FIELD_VOICE=14, WHITESPACE=15, KEY=16, 
		KEYNOTE=17, KEY_ACCIDENTAL=18, MODEMINOR=19, METER=20, METER_FRACTION=21, 
		TEMPO=22, NOTE_ELEMENT=23, NOTE=24, NOTE_OR_REST=25, PITCH=26, OCTAVE=27, 
		NOTE_LENGTH_STRICT=28, ACCIDENTAL=29, TUPLET_ELEMENT=30, TUPLET_SPEC=31, 
		MULTI_NOTE=32, BAR_LINE=33, NTH_REPEAT=34, LYRIC=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"BASENOTE", "'z'", "SPACE", "NEWLINE", "COMMENT", "FIELD_TRACK_NUMBER", 
		"FIELD_TITLE", "FIELD_KEY", "OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "WHITESPACE", "KEY", "KEYNOTE", 
		"KEY_ACCIDENTAL", "'m'", "METER", "METER_FRACTION", "TEMPO", "NOTE_ELEMENT", 
		"NOTE", "NOTE_OR_REST", "PITCH", "OCTAVE", "NOTE_LENGTH_STRICT", "ACCIDENTAL", 
		"TUPLET_ELEMENT", "TUPLET_SPEC", "MULTI_NOTE", "BAR_LINE", "NTH_REPEAT", 
		"LYRIC"
	};
	public static final String[] ruleNames = {
		"BASENOTE", "REST", "SPACE", "DIGIT", "INTEGER", "STRING", "NEWLINE", 
		"COMMENT", "EOL", "FIELD_TRACK_NUMBER", "FIELD_TITLE", "FIELD_KEY", "OTHER_FIELD", 
		"FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", "FIELD_METER", "FIELD_TEMPO", 
		"FIELD_VOICE", "WHITESPACE", "KEY", "KEYNOTE", "KEY_ACCIDENTAL", "MODEMINOR", 
		"METER", "METER_FRACTION", "TEMPO", "NOTE_ELEMENT", "NOTE", "NOTE_OR_REST", 
		"PITCH", "OCTAVE", "NOTE_LENGTH", "NOTE_LENGTH_STRICT", "ACCIDENTAL", 
		"TUPLET_ELEMENT", "TUPLET_SPEC", "MULTI_NOTE", "BAR_LINE", "NTH_REPEAT", 
		"LYRIC", "LYRICAL_ELEMENT", "LYRIC_TEXT"
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
		case 18: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4%\u0161\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\3\2\3\2\3\3\3\3\3\4\6\4]\n\4\r\4\16\4^\3\5\3\5"+
		"\3\6\6\6d\n\6\r\6\16\6e\3\7\3\7\3\7\3\7\3\7\6\7m\n\7\r\7\16\7n\3\b\6\b"+
		"r\n\b\r\b\16\bs\3\t\3\t\3\t\3\t\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\5"+
		"\13\u0082\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\5\r\u0094\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u009f\n\16\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00ae\n\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00b7\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00c0\n"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\23\3\23\3\23"+
		"\3\24\6\24\u00cf\n\24\r\24\16\24\u00d0\3\24\3\24\3\25\3\25\5\25\u00d7"+
		"\n\25\3\26\3\26\5\26\u00db\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\5\31\u00e5\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\5\34"+
		"\u00f1\n\34\3\35\3\35\5\35\u00f5\n\35\3\36\3\36\5\36\u00f9\n\36\3\37\5"+
		"\37\u00fc\n\37\3\37\3\37\5\37\u0100\n\37\3 \6 \u0103\n \r \16 \u0104\3"+
		" \6 \u0108\n \r \16 \u0109\5 \u010c\n \3!\5!\u010f\n!\3!\3!\5!\u0113\n"+
		"!\5!\u0115\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0121\n#\3$\3$\6$\u0125"+
		"\n$\r$\16$\u0126\3%\3%\3%\3&\3&\6&\u012e\n&\r&\16&\u012f\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u013f\n\'\3(\3(\3(\3(\5(\u0145"+
		"\n(\3)\3)\3)\3)\3)\7)\u014c\n)\f)\16)\u014f\13)\3*\6*\u0152\n*\r*\16*"+
		"\u0153\3*\3*\3*\3*\3*\5*\u015b\n*\3+\6+\u015e\n+\r+\16+\u015f\2,\3\3\1"+
		"\5\4\1\7\5\1\t\2\1\13\2\1\r\2\1\17\6\1\21\7\1\23\2\1\25\b\1\27\t\1\31"+
		"\n\1\33\13\1\35\f\1\37\r\1!\16\1#\17\1%\20\1\'\21\2)\22\1+\23\1-\24\1"+
		"/\25\1\61\26\1\63\27\1\65\30\1\67\31\19\32\1;\33\1=\34\1?\35\1A\2\1C\36"+
		"\1E\37\1G \1I!\1K\"\1M#\1O$\1Q%\1S\2\1U\2\1\3\2\n\4CIci\3\62;\5\60\60"+
		"J\\j{\4\f\f\17\17\4%%dd\4??aa\6,,//aa\u0080\u0080\13CCEEGGKKNPTTVV[[a"+
		"a\u0191\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\3W\3\2\2\2\5Y\3\2\2\2\7\\\3\2\2\2\t`\3\2\2\2\13c\3\2\2\2\rl\3\2\2"+
		"\2\17q\3\2\2\2\21u\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\u0086\3\2\2\2\31"+
		"\u008f\3\2\2\2\33\u009e\3\2\2\2\35\u00a0\3\2\2\2\37\u00a9\3\2\2\2!\u00b2"+
		"\3\2\2\2#\u00bb\3\2\2\2%\u00c4\3\2\2\2\'\u00ce\3\2\2\2)\u00d4\3\2\2\2"+
		"+\u00d8\3\2\2\2-\u00dc\3\2\2\2/\u00de\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6"+
		"\3\2\2\2\65\u00ea\3\2\2\2\67\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f8\3\2\2"+
		"\2=\u00fb\3\2\2\2?\u010b\3\2\2\2A\u010e\3\2\2\2C\u0116\3\2\2\2E\u0120"+
		"\3\2\2\2G\u0122\3\2\2\2I\u0128\3\2\2\2K\u012b\3\2\2\2M\u013e\3\2\2\2O"+
		"\u0144\3\2\2\2Q\u0146\3\2\2\2S\u015a\3\2\2\2U\u015d\3\2\2\2WX\t\2\2\2"+
		"X\4\3\2\2\2YZ\7|\2\2Z\6\3\2\2\2[]\7\"\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_\b\3\2\2\2`a\t\3\2\2a\n\3\2\2\2bd\5\t\5\2cb\3\2\2\2de\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2f\f\3\2\2\2gm\5\3\2\2hm\5\5\3\2im\t\4\2\2jm"+
		"\5\7\4\2km\5\13\6\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2"+
		"mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\16\3\2\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2t\20\3\2\2\2uv\7\'\2\2vw\5\r\7\2wx\5\17\b\2x\22"+
		"\3\2\2\2y|\5\21\t\2z|\5\17\b\2{y\3\2\2\2{z\3\2\2\2|\24\3\2\2\2}~\7Z\2"+
		"\2~\177\7<\2\2\177\u0081\3\2\2\2\u0080\u0082\5\7\4\2\u0081\u0080\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\13\6\2\u0084"+
		"\u0085\5\23\n\2\u0085\26\3\2\2\2\u0086\u0087\7V\2\2\u0087\u0088\7<\2\2"+
		"\u0088\u008a\3\2\2\2\u0089\u008b\5\7\4\2\u008a\u0089\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\5\r\7\2\u008d\u008e\5\23\n\2"+
		"\u008e\30\3\2\2\2\u008f\u0090\7M\2\2\u0090\u0091\7<\2\2\u0091\u0093\3"+
		"\2\2\2\u0092\u0094\5\7\4\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\5)\25\2\u0096\u0097\5\23\n\2\u0097\32\3\2\2"+
		"\2\u0098\u009f\5\35\17\2\u0099\u009f\5\37\20\2\u009a\u009f\5!\21\2\u009b"+
		"\u009f\5#\22\2\u009c\u009f\5%\23\2\u009d\u009f\5\21\t\2\u009e\u0098\3"+
		"\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7E\2\2"+
		"\u00a1\u00a2\7<\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\5\7\4\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\r\7\2\u00a7"+
		"\u00a8\5\23\n\2\u00a8\36\3\2\2\2\u00a9\u00aa\7N\2\2\u00aa\u00ab\7<\2\2"+
		"\u00ab\u00ad\3\2\2\2\u00ac\u00ae\5\7\4\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5C\"\2\u00b0\u00b1\5\23\n\2\u00b1"+
		" \3\2\2\2\u00b2\u00b3\7O\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b7\5\7\4\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\5\61\31\2\u00b9\u00ba\5\23\n\2\u00ba\"\3\2\2\2\u00bb"+
		"\u00bc\7S\2\2\u00bc\u00bd\7<\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\5\7\4"+
		"\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\5\65\33\2\u00c2\u00c3\5\23\n\2\u00c3$\3\2\2\2\u00c4\u00c5\7X\2\2\u00c5"+
		"\u00c6\7<\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\5\7\4\2\u00c8\u00c7\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5\r\7\2\u00cb"+
		"\u00cc\5\23\n\2\u00cc&\3\2\2\2\u00cd\u00cf\7\"\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\b\24\2\2\u00d3(\3\2\2\2\u00d4\u00d6\5+\26\2\u00d5"+
		"\u00d7\5/\30\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7*\3\2\2\2"+
		"\u00d8\u00da\5\3\2\2\u00d9\u00db\5-\27\2\u00da\u00d9\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db,\3\2\2\2\u00dc\u00dd\t\6\2\2\u00dd.\3\2\2\2\u00de\u00df"+
		"\7o\2\2\u00df\60\3\2\2\2\u00e0\u00e5\7E\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e5"+
		"\7~\2\2\u00e3\u00e5\5\63\32\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\5\13\6\2\u00e7\u00e8"+
		"\7\61\2\2\u00e8\u00e9\5\13\6\2\u00e9\64\3\2\2\2\u00ea\u00eb\5\63\32\2"+
		"\u00eb\u00ec\7?\2\2\u00ec\u00ed\5\13\6\2\u00ed\66\3\2\2\2\u00ee\u00f1"+
		"\59\35\2\u00ef\u00f1\5K&\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"8\3\2\2\2\u00f2\u00f4\5;\36\2\u00f3\u00f5\5A!\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5:\3\2\2\2\u00f6\u00f9\5=\37\2\u00f7\u00f9\5\5\3\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9<\3\2\2\2\u00fa\u00fc\5"+
		"E#\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\5\3\2\2\u00fe\u0100\5? \2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2"+
		"\2\u0100>\3\2\2\2\u0101\u0103\7)\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010c\3\2\2\2\u0106"+
		"\u0108\7.\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0102\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010c@\3\2\2\2\u010d\u010f\5\13\6\2\u010e\u010d\3\2\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\u0114\3\2\2\2\u0110\u0112\7\61\2\2\u0111\u0113"+
		"\5\13\6\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2"+
		"\u0114\u0110\3\2\2\2\u0114\u0115\3\2\2\2\u0115B\3\2\2\2\u0116\u0117\5"+
		"\13\6\2\u0117\u0118\7\61\2\2\u0118\u0119\5\13\6\2\u0119D\3\2\2\2\u011a"+
		"\u0121\7`\2\2\u011b\u011c\7`\2\2\u011c\u0121\7`\2\2\u011d\u0121\t\7\2"+
		"\2\u011e\u011f\7a\2\2\u011f\u0121\7a\2\2\u0120\u011a\3\2\2\2\u0120\u011b"+
		"\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0121F\3\2\2\2\u0122"+
		"\u0124\5I%\2\u0123\u0125\5\67\34\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127H\3\2\2\2\u0128\u0129"+
		"\7*\2\2\u0129\u012a\5\t\5\2\u012aJ\3\2\2\2\u012b\u012d\7]\2\2\u012c\u012e"+
		"\59\35\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7_\2\2\u0132L\3\2\2\2\u0133"+
		"\u013f\7~\2\2\u0134\u0135\7~\2\2\u0135\u013f\7~\2\2\u0136\u0137\7]\2\2"+
		"\u0137\u013f\7~\2\2\u0138\u0139\7~\2\2\u0139\u013f\7_\2\2\u013a\u013b"+
		"\7<\2\2\u013b\u013f\7~\2\2\u013c\u013d\7~\2\2\u013d\u013f\7<\2\2\u013e"+
		"\u0133\3\2\2\2\u013e\u0134\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u0138\3\2"+
		"\2\2\u013e\u013a\3\2\2\2\u013e\u013c\3\2\2\2\u013fN\3\2\2\2\u0140\u0141"+
		"\7]\2\2\u0141\u0145\7\63\2\2\u0142\u0143\7]\2\2\u0143\u0145\7\64\2\2\u0144"+
		"\u0140\3\2\2\2\u0144\u0142\3\2\2\2\u0145P\3\2\2\2\u0146\u0147\7y\2\2\u0147"+
		"\u0148\7<\2\2\u0148\u0149\3\2\2\2\u0149\u014d\5\7\4\2\u014a\u014c\5S*"+
		"\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014eR\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\7\"\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u015b\3\2\2\2\u0155\u015b\t\b\2\2\u0156\u0157\7^\2\2\u0157"+
		"\u015b\7/\2\2\u0158\u015b\7~\2\2\u0159\u015b\5U+\2\u015a\u0151\3\2\2\2"+
		"\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159"+
		"\3\2\2\2\u015bT\3\2\2\2\u015c\u015e\n\t\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160V\3\2\2\2"+
		"*\2^elns{\u0081\u008a\u0093\u009e\u00a4\u00ad\u00b6\u00bf\u00c8\u00d0"+
		"\u00d6\u00da\u00e4\u00f0\u00f4\u00f8\u00fb\u00ff\u0104\u0109\u010b\u010e"+
		"\u0112\u0114\u0120\u0126\u012f\u013e\u0144\u014d\u0153\u015a\u015f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}