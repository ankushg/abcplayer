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
		WHITESPACE=1, BASENOTE=2, REST=3, INTEGER=4, NEWLINE=5, STRING=6, EQUALS=7, 
		OVER=8, TRACK_NUMBER_START=9, TITLE_START=10, KEY_START=11, COMPOSER_START=12, 
		DEFAULT_LENGTH_START=13, METER_START=14, TEMPO_START=15, VOICE_START=16, 
		KEY_ACCIDENTAL=17, MODEMINOR=18, NON_FRACTION_METER=19, OCTAVE=20, ACCIDENTAL_TYPE=21, 
		TUPLET_START=22, OPEN_CHORD=23, CLOSE_CHORD=24, BAR_LINE=25, OPEN_REPEAT=26, 
		CLOSE_REPEAT=27, NTH_REPEAT=28, COMMENT_START=29, LYRIC=30, LYRIC_START=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WHITESPACE", "BASENOTE", "'z'", "INTEGER", "NEWLINE", "STRING", "'='", 
		"'/'", "'X:'", "'T:'", "'K:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", 
		"KEY_ACCIDENTAL", "'m'", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", 
		"'('", "'['", "']'", "BAR_LINE", "'|:'", "':|'", "NTH_REPEAT", "'%'", 
		"LYRIC", "'w:'"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "BASENOTE", "REST", "DIGIT", "INTEGER", "NEWLINE", "STRING", 
		"EQUALS", "OVER", "TRACK_NUMBER_START", "TITLE_START", "KEY_START", "COMPOSER_START", 
		"DEFAULT_LENGTH_START", "METER_START", "TEMPO_START", "VOICE_START", "KEY_ACCIDENTAL", 
		"MODEMINOR", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", "TUPLET_START", 
		"OPEN_CHORD", "CLOSE_CHORD", "BAR_LINE", "OPEN_REPEAT", "CLOSE_REPEAT", 
		"NTH_REPEAT", "COMMENT_START", "LYRIC", "LYRIC_START", "LYRICAL_ELEMENT"
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
		"\2\4!\u00d1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\6\6T\n\6\r\6\16\6U\3\7\6\7Y\n\7\r\7\16\7Z\3\b"+
		"\3\b\3\b\6\b`\n\b\r\b\16\ba\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u0087\n\25"+
		"\3\26\6\26\u008a\n\26\r\26\16\26\u008b\3\26\6\26\u008f\n\26\r\26\16\26"+
		"\u0090\5\26\u0093\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u009b\n\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u00ac\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u00b8\n\36\3\37\3\37\3 \3 \7 \u00be\n \f \16 \u00c1\13 \3!\3!\3"+
		"!\3\"\6\"\u00c7\n\"\r\"\16\"\u00c8\3\"\3\"\3\"\3\"\3\"\5\"\u00d0\n\"\2"+
		"#\3\3\2\5\4\1\7\5\1\t\2\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25\13\1\27"+
		"\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23\1\'\24\1)\25\1+\26"+
		"\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35\1;\36\1=\37\1? \1A"+
		"!\1C\2\1\3\2\n\4\13\13\"\"\4CIci\3\62;\4\f\f\17\17\5\60\60J\\j{\4%%dd"+
		"\4??aa\6,,//aa\u0080\u0080\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3F\3\2\2\2"+
		"\5L\3\2\2\2\7N\3\2\2\2\tP\3\2\2\2\13S\3\2\2\2\rX\3\2\2\2\17_\3\2\2\2\21"+
		"c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31m\3\2\2\2\33p\3\2\2\2"+
		"\35s\3\2\2\2\37v\3\2\2\2!y\3\2\2\2#|\3\2\2\2%\177\3\2\2\2\'\u0081\3\2"+
		"\2\2)\u0086\3\2\2\2+\u0092\3\2\2\2-\u009a\3\2\2\2/\u009c\3\2\2\2\61\u009e"+
		"\3\2\2\2\63\u00a0\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00b0\3\2"+
		"\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00c2\3\2\2\2C\u00cf"+
		"\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2J"+
		"K\b\2\2\2K\4\3\2\2\2LM\t\3\2\2M\6\3\2\2\2NO\7|\2\2O\b\3\2\2\2PQ\t\4\2"+
		"\2Q\n\3\2\2\2RT\5\t\5\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\f\3\2"+
		"\2\2WY\t\5\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\16\3\2\2\2\\`"+
		"\5\5\3\2]`\5\7\4\2^`\t\6\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`a\3\2\2\2"+
		"a_\3\2\2\2ab\3\2\2\2b\20\3\2\2\2cd\7?\2\2d\22\3\2\2\2ef\7\61\2\2f\24\3"+
		"\2\2\2gh\7Z\2\2hi\7<\2\2i\26\3\2\2\2jk\7V\2\2kl\7<\2\2l\30\3\2\2\2mn\7"+
		"M\2\2no\7<\2\2o\32\3\2\2\2pq\7E\2\2qr\7<\2\2r\34\3\2\2\2st\7N\2\2tu\7"+
		"<\2\2u\36\3\2\2\2vw\7O\2\2wx\7<\2\2x \3\2\2\2yz\7S\2\2z{\7<\2\2{\"\3\2"+
		"\2\2|}\7X\2\2}~\7<\2\2~$\3\2\2\2\177\u0080\t\7\2\2\u0080&\3\2\2\2\u0081"+
		"\u0082\7o\2\2\u0082(\3\2\2\2\u0083\u0087\7E\2\2\u0084\u0085\7E\2\2\u0085"+
		"\u0087\7~\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0087*\3\2\2\2\u0088"+
		"\u008a\7)\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008f\7.\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008e\3\2\2\2\u0093"+
		",\3\2\2\2\u0094\u009b\7`\2\2\u0095\u0096\7`\2\2\u0096\u009b\7`\2\2\u0097"+
		"\u009b\t\b\2\2\u0098\u0099\7a\2\2\u0099\u009b\7a\2\2\u009a\u0094\3\2\2"+
		"\2\u009a\u0095\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009b."+
		"\3\2\2\2\u009c\u009d\7*\2\2\u009d\60\3\2\2\2\u009e\u009f\7]\2\2\u009f"+
		"\62\3\2\2\2\u00a0\u00a1\7_\2\2\u00a1\64\3\2\2\2\u00a2\u00ac\7~\2\2\u00a3"+
		"\u00a4\7~\2\2\u00a4\u00ac\7~\2\2\u00a5\u00a6\7]\2\2\u00a6\u00ac\7~\2\2"+
		"\u00a7\u00a8\7~\2\2\u00a8\u00ac\7_\2\2\u00a9\u00ac\5\67\34\2\u00aa\u00ac"+
		"\59\35\2\u00ab\u00a2\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\66\3\2\2"+
		"\2\u00ad\u00ae\7~\2\2\u00ae\u00af\7<\2\2\u00af8\3\2\2\2\u00b0\u00b1\7"+
		"<\2\2\u00b1\u00b2\7~\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7]\2\2\u00b4\u00b8"+
		"\7\63\2\2\u00b5\u00b6\7]\2\2\u00b6\u00b8\7\64\2\2\u00b7\u00b3\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba>\3\2\2\2"+
		"\u00bb\u00bf\5A!\2\u00bc\u00be\5C\"\2\u00bd\u00bc\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0@\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7<\2\2\u00c4B\3\2\2\2\u00c5"+
		"\u00c7\7\"\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00d0\t\t\2\2\u00cb"+
		"\u00cc\7^\2\2\u00cc\u00d0\7/\2\2\u00cd\u00d0\7~\2\2\u00ce\u00d0\5\17\b"+
		"\2\u00cf\u00c6\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0D\3\2\2\2\22\2HUZ_a\u0086\u008b\u0090"+
		"\u0092\u009a\u00ab\u00b7\u00bf\u00c8\u00cf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}