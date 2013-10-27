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
		WHITESPACE=1, BASENOTE=2, REST=3, INTEGER=4, NEWLINE=5, EQUALS=6, OVER=7, 
		TRACK_NUMBER_START=8, TITLE_START=9, KEY_START=10, COMPOSER_START=11, 
		DEFAULT_LENGTH_START=12, METER_START=13, TEMPO_START=14, VOICE_START=15, 
		KEY_ACCIDENTAL=16, MODEMINOR=17, NON_FRACTION_METER=18, OCTAVE=19, ACCIDENTAL_TYPE=20, 
		DUPLET_START=21, TRIPLET_START=22, QUADRUPLET_START=23, OPEN_CHORD=24, 
		CLOSE_CHORD=25, BAR_LINE=26, OPEN_REPEAT=27, CLOSE_REPEAT=28, NTH_REPEAT=29, 
		COMMENT_START=30, LYRIC_START=31, LYRIC_MODIFIER=32, LYRIC_SEPARATOR=33, 
		NONBASENOTE=34, PUNCTUATION=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WHITESPACE", "BASENOTE", "'z'", "INTEGER", "NEWLINE", "'='", "'/'", "'X:'", 
		"'T:'", "'K:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "KEY_ACCIDENTAL", 
		"'m'", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", "'(2'", "'(3'", 
		"'(4'", "'['", "']'", "BAR_LINE", "'|:'", "':|'", "NTH_REPEAT", "'%'", 
		"'w:'", "LYRIC_MODIFIER", "LYRIC_SEPARATOR", "NONBASENOTE", "'.'"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "BASENOTE", "REST", "DIGIT", "INTEGER", "NEWLINE", "EQUALS", 
		"OVER", "TRACK_NUMBER_START", "TITLE_START", "KEY_START", "COMPOSER_START", 
		"DEFAULT_LENGTH_START", "METER_START", "TEMPO_START", "VOICE_START", "KEY_ACCIDENTAL", 
		"MODEMINOR", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", "DUPLET_START", 
		"TRIPLET_START", "QUADRUPLET_START", "OPEN_CHORD", "CLOSE_CHORD", "BAR_LINE", 
		"OPEN_REPEAT", "CLOSE_REPEAT", "NTH_REPEAT", "COMMENT_START", "LYRIC_START", 
		"LYRIC_MODIFIER", "LYRIC_SEPARATOR", "NONBASENOTE", "PUNCTUATION"
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
		case 0: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4%\u00d0\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2M\n\2\r\2"+
		"\16\2N\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6Z\n\6\r\6\16\6[\3\7\6\7"+
		"_\n\7\r\7\16\7`\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u0086\n\24\3\25\6\25\u0089"+
		"\n\25\r\25\16\25\u008a\3\25\6\25\u008e\n\25\r\25\16\25\u008f\5\25\u0092"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u009a\n\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00b2\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\5\37\u00be\n\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u00c9"+
		"\n\"\3#\3#\3$\3$\3%\3%\2&\3\3\2\5\4\1\7\5\1\t\2\1\13\6\1\r\7\1\17\b\1"+
		"\21\t\1\23\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22"+
		"\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34"+
		"\19\35\1;\36\1=\37\1? \1A!\1C\"\1E#\1G$\1I%\1\3\2\13\4\13\13\"\"\4CIc"+
		"i\3\62;\4\f\f\17\17\4%%dd\4??aa\5,,aa\u0080\u0080\4\"\"//\4J\\j{\u00e0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\3L\3\2\2\2\5R\3\2\2\2\7T\3\2\2\2\tV\3\2\2\2\13Y\3\2\2\2\r^\3\2\2\2\17"+
		"b\3\2\2\2\21d\3\2\2\2\23f\3\2\2\2\25i\3\2\2\2\27l\3\2\2\2\31o\3\2\2\2"+
		"\33r\3\2\2\2\35u\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#~\3\2\2\2%\u0080\3\2\2"+
		"\2\'\u0085\3\2\2\2)\u0091\3\2\2\2+\u0099\3\2\2\2-\u009b\3\2\2\2/\u009e"+
		"\3\2\2\2\61\u00a1\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00b1\3"+
		"\2\2\29\u00b3\3\2\2\2;\u00b6\3\2\2\2=\u00bd\3\2\2\2?\u00bf\3\2\2\2A\u00c1"+
		"\3\2\2\2C\u00c8\3\2\2\2E\u00ca\3\2\2\2G\u00cc\3\2\2\2I\u00ce\3\2\2\2K"+
		"M\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\2\2\2"+
		"Q\4\3\2\2\2RS\t\3\2\2S\6\3\2\2\2TU\7|\2\2U\b\3\2\2\2VW\t\4\2\2W\n\3\2"+
		"\2\2XZ\5\t\5\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\f\3\2\2\2]_"+
		"\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\16\3\2\2\2bc\7?\2\2"+
		"c\20\3\2\2\2de\7\61\2\2e\22\3\2\2\2fg\7Z\2\2gh\7<\2\2h\24\3\2\2\2ij\7"+
		"V\2\2jk\7<\2\2k\26\3\2\2\2lm\7M\2\2mn\7<\2\2n\30\3\2\2\2op\7E\2\2pq\7"+
		"<\2\2q\32\3\2\2\2rs\7N\2\2st\7<\2\2t\34\3\2\2\2uv\7O\2\2vw\7<\2\2w\36"+
		"\3\2\2\2xy\7S\2\2yz\7<\2\2z \3\2\2\2{|\7X\2\2|}\7<\2\2}\"\3\2\2\2~\177"+
		"\t\6\2\2\177$\3\2\2\2\u0080\u0081\7o\2\2\u0081&\3\2\2\2\u0082\u0086\7"+
		"E\2\2\u0083\u0084\7E\2\2\u0084\u0086\7~\2\2\u0085\u0082\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086(\3\2\2\2\u0087\u0089\7)\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0092\3\2"+
		"\2\2\u008c\u008e\7.\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0088\3\2"+
		"\2\2\u0091\u008d\3\2\2\2\u0092*\3\2\2\2\u0093\u009a\7`\2\2\u0094\u0095"+
		"\7`\2\2\u0095\u009a\7`\2\2\u0096\u009a\t\7\2\2\u0097\u0098\7a\2\2\u0098"+
		"\u009a\7a\2\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0096\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a,\3\2\2\2\u009b\u009c\7*\2\2\u009c\u009d"+
		"\7\64\2\2\u009d.\3\2\2\2\u009e\u009f\7*\2\2\u009f\u00a0\7\65\2\2\u00a0"+
		"\60\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\u00a3\7\66\2\2\u00a3\62\3\2\2\2\u00a4"+
		"\u00a5\7]\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7_\2\2\u00a7\66\3\2\2\2\u00a8"+
		"\u00b2\7~\2\2\u00a9\u00aa\7~\2\2\u00aa\u00b2\7~\2\2\u00ab\u00ac\7]\2\2"+
		"\u00ac\u00b2\7~\2\2\u00ad\u00ae\7~\2\2\u00ae\u00b2\7_\2\2\u00af\u00b2"+
		"\59\35\2\u00b0\u00b2\5;\36\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b28\3\2\2\2\u00b3\u00b4\7~\2\2\u00b4\u00b5\7<\2\2\u00b5:\3\2\2"+
		"\2\u00b6\u00b7\7<\2\2\u00b7\u00b8\7~\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7"+
		"]\2\2\u00ba\u00be\7\63\2\2\u00bb\u00bc\7]\2\2\u00bc\u00be\7\64\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be>\3\2\2\2\u00bf\u00c0\7\'\2\2"+
		"\u00c0@\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7<\2\2\u00c3B\3\2\2\2\u00c4"+
		"\u00c9\t\b\2\2\u00c5\u00c6\7^\2\2\u00c6\u00c9\7/\2\2\u00c7\u00c9\7~\2"+
		"\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9D"+
		"\3\2\2\2\u00ca\u00cb\t\t\2\2\u00cbF\3\2\2\2\u00cc\u00cd\t\n\2\2\u00cd"+
		"H\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cfJ\3\2\2\2\16\2N[`\u0085\u008a\u008f"+
		"\u0091\u0099\u00b1\u00bd\u00c8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}