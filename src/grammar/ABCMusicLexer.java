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
		"WHITESPACE", "BASE", "'z'", "INTEGER", "NEWLINE", "'='", "'/'", "'X:'", 
		"'T:'", "'K:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "KEY_ACCIDENTAL", 
		"'m'", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", "'(2'", "'(3'", 
		"'(4'", "'['", "']'", "BAR_LINE", "'|:'", "':|'", "NTH_REPEAT", "'%'", 
		"'w:'", "LYRIC_MODIFIER", "'-'", "NONBASENOTE", "PUNCTUATION"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "BASE", "REST", "DIGIT", "INTEGER", "NEWLINE", "EQUALS", 
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

	public static final String _serializedATN =
		"\2\4%\u00ce\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2M\n\2\r\2"+
		"\16\2N\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6X\n\6\r\6\16\6Y\3\7\6\7]\n\7\r\7"+
		"\16\7^\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u0084\n\24\3\25\6\25\u0087\n\25\r"+
		"\25\16\25\u0088\3\25\6\25\u008c\n\25\r\25\16\25\u008d\5\25\u0090\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0098\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u00b0\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\5\37\u00bc\n\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u00c7\n"+
		"\"\3#\3#\3$\3$\3%\3%\2&\3\3\1\5\4\1\7\5\1\t\2\1\13\6\1\r\7\1\17\b\1\21"+
		"\t\1\23\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1"+
		"%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\1"+
		"9\35\1;\36\1=\37\1? \1A!\1C\"\1E#\1G$\1I%\1\3\2\13\4\13\13\"\"\4CIci\3"+
		"\62;\4\f\f\17\17\4%%dd\4??aa\5,,aa\u0080\u0080\4J\\j{\5*+\60\60AA\u00de"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\3L\3\2\2\2\5P\3\2\2\2\7R\3\2\2\2\tT\3\2\2\2\13W\3\2\2\2\r\\\3\2\2\2\17"+
		"`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31m\3\2\2\2"+
		"\33p\3\2\2\2\35s\3\2\2\2\37v\3\2\2\2!y\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0083"+
		"\3\2\2\2)\u008f\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61"+
		"\u009f\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00af\3\2\2\29\u00b1"+
		"\3\2\2\2;\u00b4\3\2\2\2=\u00bb\3\2\2\2?\u00bd\3\2\2\2A\u00bf\3\2\2\2C"+
		"\u00c6\3\2\2\2E\u00c8\3\2\2\2G\u00ca\3\2\2\2I\u00cc\3\2\2\2KM\t\2\2\2"+
		"LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\4\3\2\2\2PQ\t\3\2\2Q\6\3\2\2"+
		"\2RS\7|\2\2S\b\3\2\2\2TU\t\4\2\2U\n\3\2\2\2VX\5\t\5\2WV\3\2\2\2XY\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\f\3\2\2\2[]\t\5\2\2\\[\3\2\2\2]^\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_\16\3\2\2\2`a\7?\2\2a\20\3\2\2\2bc\7\61\2\2c\22\3\2"+
		"\2\2de\7Z\2\2ef\7<\2\2f\24\3\2\2\2gh\7V\2\2hi\7<\2\2i\26\3\2\2\2jk\7M"+
		"\2\2kl\7<\2\2l\30\3\2\2\2mn\7E\2\2no\7<\2\2o\32\3\2\2\2pq\7N\2\2qr\7<"+
		"\2\2r\34\3\2\2\2st\7O\2\2tu\7<\2\2u\36\3\2\2\2vw\7S\2\2wx\7<\2\2x \3\2"+
		"\2\2yz\7X\2\2z{\7<\2\2{\"\3\2\2\2|}\t\6\2\2}$\3\2\2\2~\177\7o\2\2\177"+
		"&\3\2\2\2\u0080\u0084\7E\2\2\u0081\u0082\7E\2\2\u0082\u0084\7~\2\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0084(\3\2\2\2\u0085\u0087\7)\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u0090\3\2\2\2\u008a\u008c\7.\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0086\3\2\2\2\u008f\u008b\3\2\2\2\u0090*\3\2\2\2\u0091\u0098"+
		"\7`\2\2\u0092\u0093\7`\2\2\u0093\u0098\7`\2\2\u0094\u0098\t\7\2\2\u0095"+
		"\u0096\7a\2\2\u0096\u0098\7a\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2"+
		"\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0098,\3\2\2\2\u0099\u009a"+
		"\7*\2\2\u009a\u009b\7\64\2\2\u009b.\3\2\2\2\u009c\u009d\7*\2\2\u009d\u009e"+
		"\7\65\2\2\u009e\60\3\2\2\2\u009f\u00a0\7*\2\2\u00a0\u00a1\7\66\2\2\u00a1"+
		"\62\3\2\2\2\u00a2\u00a3\7]\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5"+
		"\66\3\2\2\2\u00a6\u00b0\7~\2\2\u00a7\u00a8\7~\2\2\u00a8\u00b0\7~\2\2\u00a9"+
		"\u00aa\7]\2\2\u00aa\u00b0\7~\2\2\u00ab\u00ac\7~\2\2\u00ac\u00b0\7_\2\2"+
		"\u00ad\u00b0\59\35\2\u00ae\u00b0\5;\36\2\u00af\u00a6\3\2\2\2\u00af\u00a7"+
		"\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b08\3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b3\7<\2\2\u00b3"+
		":\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7~\2\2\u00b6<\3\2\2\2\u00b7\u00b8"+
		"\7]\2\2\u00b8\u00bc\7\63\2\2\u00b9\u00ba\7]\2\2\u00ba\u00bc\7\64\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc>\3\2\2\2\u00bd\u00be\7\'\2\2"+
		"\u00be@\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7<\2\2\u00c1B\3\2\2\2\u00c2"+
		"\u00c7\t\b\2\2\u00c3\u00c4\7^\2\2\u00c4\u00c7\7/\2\2\u00c5\u00c7\7~\2"+
		"\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7D"+
		"\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9F\3\2\2\2\u00ca\u00cb\t\t\2\2\u00cbH"+
		"\3\2\2\2\u00cc\u00cd\t\n\2\2\u00cdJ\3\2\2\2\16\2NY^\u0083\u0088\u008d"+
		"\u008f\u0097\u00af\u00bb\u00c6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}