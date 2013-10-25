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
		SPACE=1, NEWLINE=2, COMMENT=3, FIELD_TRACK_NUMBER=4, FIELD_TITLE=5, FIELD_KEY=6, 
		OTHER_FIELD=7, FIELD_COMPOSER=8, FIELD_DEFAULT_LENGTH=9, FIELD_METER=10, 
		FIELD_TEMPO=11, FIELD_VOICE=12, WHITESPACE=13, KEY=14, KEYNOTE=15, KEY_ACCIDENTAL=16, 
		MODEMINOR=17, METER=18, METER_FRACTION=19, TEMPO=20, NOTE_ELEMENT=21, 
		NOTE=22, NOTE_OR_REST=23, PITCH=24, OCTAVE=25, NOTE_LENGTH_STRICT=26, 
		ACCIDENTAL=27, TUPLET_ELEMENT=28, TUPLET_SPEC=29, MULTI_NOTE=30, BAR_LINE=31, 
		NTH_REPEAT=32, LYRIC=33, LYRICAL_ELEMENT=34, LYRIC_TEXT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SPACE", "NEWLINE", "COMMENT", "FIELD_TRACK_NUMBER", "FIELD_TITLE", "FIELD_KEY", 
		"OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", "FIELD_METER", 
		"FIELD_TEMPO", "FIELD_VOICE", "WHITESPACE", "KEY", "KEYNOTE", "KEY_ACCIDENTAL", 
		"'m'", "METER", "METER_FRACTION", "TEMPO", "NOTE_ELEMENT", "NOTE", "NOTE_OR_REST", 
		"PITCH", "OCTAVE", "NOTE_LENGTH_STRICT", "ACCIDENTAL", "TUPLET_ELEMENT", 
		"TUPLET_SPEC", "MULTI_NOTE", "BAR_LINE", "NTH_REPEAT", "LYRIC", "LYRICAL_ELEMENT", 
		"LYRIC_TEXT"
	};
	public static final String[] ruleNames = {
		"SPACE", "DIGIT", "INTEGER", "STRING", "NEWLINE", "COMMENT", "EOL", "FIELD_TRACK_NUMBER", 
		"FIELD_TITLE", "FIELD_KEY", "OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "WHITESPACE", "KEY", "KEYNOTE", 
		"KEY_ACCIDENTAL", "MODEMINOR", "METER", "METER_FRACTION", "TEMPO", "NOTE_ELEMENT", 
		"NOTE", "NOTE_OR_REST", "PITCH", "OCTAVE", "NOTE_LENGTH", "NOTE_LENGTH_STRICT", 
		"ACCIDENTAL", "BASENOTE", "REST", "TUPLET_ELEMENT", "TUPLET_SPEC", "MULTI_NOTE", 
		"BAR_LINE", "NTH_REPEAT", "LYRIC", "LYRICAL_ELEMENT", "LYRIC_TEXT"
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
		case 16: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4%\u0177\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\3\2\6\2Y\n\2\r\2\16\2Z\3\3\3\3\3\4\6\4`\n\4\r\4"+
		"\16\4a\3\5\3\5\3\5\6\5g\n\5\r\5\16\5h\3\6\6\6l\n\6\r\6\16\6m\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\5\bv\n\b\3\t\3\t\3\t\3\t\5\t|\n\t\3\t\3\t\6\t\u0080\n\t"+
		"\r\t\16\t\u0081\3\n\3\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\6\n\u008c\n\n\r"+
		"\n\16\n\u008d\3\13\3\13\3\13\3\13\5\13\u0094\n\13\3\13\3\13\6\13\u0098"+
		"\n\13\r\13\16\13\u0099\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r\3"+
		"\r\3\r\5\r\u00a8\n\r\3\r\3\r\6\r\u00ac\n\r\r\r\16\r\u00ad\3\16\3\16\3"+
		"\16\3\16\5\16\u00b4\n\16\3\16\3\16\6\16\u00b8\n\16\r\16\16\16\u00b9\3"+
		"\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\17\3\17\6\17\u00c4\n\17\r\17\16\17"+
		"\u00c5\3\20\3\20\3\20\3\20\5\20\u00cc\n\20\3\20\3\20\6\20\u00d0\n\20\r"+
		"\20\16\20\u00d1\3\21\3\21\3\21\3\21\5\21\u00d8\n\21\3\21\3\21\6\21\u00dc"+
		"\n\21\r\21\16\21\u00dd\3\22\6\22\u00e1\n\22\r\22\16\22\u00e2\3\22\3\22"+
		"\3\23\3\23\5\23\u00e9\n\23\3\24\3\24\5\24\u00ed\n\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\5\27\u00f7\n\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\5\32\u0103\n\32\3\33\3\33\5\33\u0107\n\33\3\34\3"+
		"\34\5\34\u010b\n\34\3\35\5\35\u010e\n\35\3\35\3\35\5\35\u0112\n\35\3\36"+
		"\6\36\u0115\n\36\r\36\16\36\u0116\3\36\6\36\u011a\n\36\r\36\16\36\u011b"+
		"\5\36\u011e\n\36\3\37\5\37\u0121\n\37\3\37\3\37\5\37\u0125\n\37\5\37\u0127"+
		"\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0133\n!\3\"\3\"\3#\3#\3$\3$\6"+
		"$\u013b\n$\r$\16$\u013c\3%\3%\3%\3&\3&\6&\u0144\n&\r&\16&\u0145\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0155\n\'\3(\3(\3(\3"+
		"(\5(\u015b\n(\3)\3)\3)\3)\3)\7)\u0162\n)\f)\16)\u0165\13)\3*\6*\u0168"+
		"\n*\r*\16*\u0169\3*\3*\3*\3*\3*\5*\u0171\n*\3+\6+\u0174\n+\r+\16+\u0175"+
		"\2,\3\3\1\5\2\1\7\2\1\t\2\1\13\4\1\r\5\1\17\2\1\21\6\1\23\7\1\25\b\1\27"+
		"\t\1\31\n\1\33\13\1\35\f\1\37\r\1!\16\1#\17\2%\20\1\'\21\1)\22\1+\23\1"+
		"-\24\1/\25\1\61\26\1\63\27\1\65\30\1\67\31\19\32\1;\33\1=\2\1?\34\1A\35"+
		"\1C\2\1E\2\1G\36\1I\37\1K \1M!\1O\"\1Q#\1S$\1U%\1\3\2\n\3\62;\5\60\60"+
		"C\\c|\4\f\f\17\17\4%%dd\4??aa\4CIci\6,,//aa\u0080\u0080\13CCEEGGKKNPT"+
		"TVV[[aa\u01ad\2\3\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\3X\3\2\2\2\5\\\3\2\2\2\7_\3\2\2\2\tf\3\2\2\2\13k\3\2\2\2\ro"+
		"\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23\u0083\3\2\2\2\25\u008f\3\2\2\2\27"+
		"\u00a1\3\2\2\2\31\u00a3\3\2\2\2\33\u00af\3\2\2\2\35\u00bb\3\2\2\2\37\u00c7"+
		"\3\2\2\2!\u00d3\3\2\2\2#\u00e0\3\2\2\2%\u00e6\3\2\2\2\'\u00ea\3\2\2\2"+
		")\u00ee\3\2\2\2+\u00f0\3\2\2\2-\u00f6\3\2\2\2/\u00f8\3\2\2\2\61\u00fc"+
		"\3\2\2\2\63\u0102\3\2\2\2\65\u0104\3\2\2\2\67\u010a\3\2\2\29\u010d\3\2"+
		"\2\2;\u011d\3\2\2\2=\u0120\3\2\2\2?\u0128\3\2\2\2A\u0132\3\2\2\2C\u0134"+
		"\3\2\2\2E\u0136\3\2\2\2G\u0138\3\2\2\2I\u013e\3\2\2\2K\u0141\3\2\2\2M"+
		"\u0154\3\2\2\2O\u015a\3\2\2\2Q\u015c\3\2\2\2S\u0170\3\2\2\2U\u0173\3\2"+
		"\2\2WY\7\"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\4\3\2\2\2\\]\t"+
		"\2\2\2]\6\3\2\2\2^`\5\5\3\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\b"+
		"\3\2\2\2cg\t\3\2\2dg\5\3\2\2eg\5\7\4\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g"+
		"h\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\n\3\2\2\2jl\t\4\2\2kj\3\2\2\2lm\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2n\f\3\2\2\2op\7\'\2\2pq\5\t\5\2qr\5\13\6\2r\16\3\2"+
		"\2\2sv\5\r\7\2tv\5\13\6\2us\3\2\2\2ut\3\2\2\2v\20\3\2\2\2wx\7Z\2\2xy\7"+
		"<\2\2y{\3\2\2\2z|\5\3\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\5\7\4\2~"+
		"\u0080\5\17\b\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\22\3\2\2\2\u0083\u0084\7V\2\2\u0084\u0085\7<\2\2"+
		"\u0085\u0087\3\2\2\2\u0086\u0088\5\3\2\2\u0087\u0086\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\5\t\5\2\u008a\u008c\5\17\b\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\24\3\2\2\2\u008f\u0090\7M\2\2\u0090\u0091\7<\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0094\5\3\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\5%\23\2\u0096\u0098\5\17\b\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\26\3\2\2\2\u009b\u00a2\5\31\r\2\u009c\u00a2\5\33\16\2\u009d"+
		"\u00a2\5\35\17\2\u009e\u00a2\5\37\20\2\u009f\u00a2\5!\21\2\u00a0\u00a2"+
		"\5\r\7\2\u00a1\u009b\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\30\3\2\2"+
		"\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7<\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8"+
		"\5\3\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\5\t\5\2\u00aa\u00ac\5\17\b\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\32\3\2\2\2\u00af"+
		"\u00b0\7N\2\2\u00b0\u00b1\7<\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b4\5\3\2"+
		"\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\5? \2\u00b6\u00b8\5\17\b\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7O\2\2"+
		"\u00bc\u00bd\7<\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\5\3\2\2\u00bf\u00be"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\5-\27\2\u00c2"+
		"\u00c4\5\17\b\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7S\2\2\u00c8\u00c9"+
		"\7<\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5\3\2\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5\61\31\2\u00ce\u00d0\5"+
		"\17\b\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2 \3\2\2\2\u00d3\u00d4\7X\2\2\u00d4\u00d5\7<\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d8\5\3\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\5\t\5\2\u00da\u00dc\5\17\b\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\"\3\2\2\2\u00df\u00e1\7\"\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b\22\2\2\u00e5$\3\2\2\2\u00e6\u00e8\5\'\24\2\u00e7\u00e9\5+\26"+
		"\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9&\3\2\2\2\u00ea\u00ec"+
		"\5C\"\2\u00eb\u00ed\5)\25\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"(\3\2\2\2\u00ee\u00ef\t\5\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7o\2\2\u00f1"+
		",\3\2\2\2\u00f2\u00f7\7E\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f7\7~\2\2\u00f5"+
		"\u00f7\5/\30\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7.\3\2\2\2\u00f8\u00f9\5\7\4\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb"+
		"\5\7\4\2\u00fb\60\3\2\2\2\u00fc\u00fd\5/\30\2\u00fd\u00fe\7?\2\2\u00fe"+
		"\u00ff\5\7\4\2\u00ff\62\3\2\2\2\u0100\u0103\5\65\33\2\u0101\u0103\5K&"+
		"\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\64\3\2\2\2\u0104\u0106"+
		"\5\67\34\2\u0105\u0107\5=\37\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\66\3\2\2\2\u0108\u010b\59\35\2\u0109\u010b\5E#\2\u010a\u0108\3"+
		"\2\2\2\u010a\u0109\3\2\2\2\u010b8\3\2\2\2\u010c\u010e\5A!\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\5C\"\2\u0110"+
		"\u0112\5;\36\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112:\3\2\2\2"+
		"\u0113\u0115\7)\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011e\3\2\2\2\u0118\u011a\7.\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011e\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0119\3\2\2\2\u011e"+
		"<\3\2\2\2\u011f\u0121\5\7\4\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u0126\3\2\2\2\u0122\u0124\7\61\2\2\u0123\u0125\5\7\4\2\u0124\u0123"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127>\3\2\2\2\u0128\u0129\5\7\4\2\u0129\u012a\7\61\2\2"+
		"\u012a\u012b\5\7\4\2\u012b@\3\2\2\2\u012c\u0133\7`\2\2\u012d\u012e\7`"+
		"\2\2\u012e\u0133\7`\2\2\u012f\u0133\t\6\2\2\u0130\u0131\7a\2\2\u0131\u0133"+
		"\7a\2\2\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012f\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133B\3\2\2\2\u0134\u0135\t\7\2\2\u0135D\3\2\2\2\u0136"+
		"\u0137\7|\2\2\u0137F\3\2\2\2\u0138\u013a\5I%\2\u0139\u013b\5\63\32\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013dH\3\2\2\2\u013e\u013f\7*\2\2\u013f\u0140\5\5\3\2\u0140J\3\2"+
		"\2\2\u0141\u0143\7]\2\2\u0142\u0144\5\65\33\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\7_\2\2\u0148L\3\2\2\2\u0149\u0155\7~\2\2\u014a\u014b"+
		"\7~\2\2\u014b\u0155\7~\2\2\u014c\u014d\7]\2\2\u014d\u0155\7~\2\2\u014e"+
		"\u014f\7~\2\2\u014f\u0155\7_\2\2\u0150\u0151\7<\2\2\u0151\u0155\7~\2\2"+
		"\u0152\u0153\7~\2\2\u0153\u0155\7<\2\2\u0154\u0149\3\2\2\2\u0154\u014a"+
		"\3\2\2\2\u0154\u014c\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0150\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155N\3\2\2\2\u0156\u0157\7]\2\2\u0157\u015b\7\63\2\2"+
		"\u0158\u0159\7]\2\2\u0159\u015b\7\64\2\2\u015a\u0156\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015bP\3\2\2\2\u015c\u015d\7y\2\2\u015d\u015e\7<\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0163\5\3\2\2\u0160\u0162\5S*\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164R\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0168\7\"\2\2\u0167\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0171\3\2\2\2\u016b"+
		"\u0171\t\b\2\2\u016c\u016d\7^\2\2\u016d\u0171\7/\2\2\u016e\u0171\7~\2"+
		"\2\u016f\u0171\5U+\2\u0170\u0167\3\2\2\2\u0170\u016b\3\2\2\2\u0170\u016c"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171T\3\2\2\2\u0172"+
		"\u0174\n\t\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176V\3\2\2\2\62\2Zafhmu{\u0081\u0087\u008d"+
		"\u0093\u0099\u00a1\u00a7\u00ad\u00b3\u00b9\u00bf\u00c5\u00cb\u00d1\u00d7"+
		"\u00dd\u00e2\u00e8\u00ec\u00f6\u0102\u0106\u010a\u010d\u0111\u0116\u011b"+
		"\u011d\u0120\u0124\u0126\u0132\u013c\u0145\u0154\u015a\u0163\u0169\u0170"+
		"\u0175";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}