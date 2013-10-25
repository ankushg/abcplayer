// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "SPACE", "NEWLINE", "COMMENT", "FIELD_TRACK_NUMBER", "FIELD_TITLE", 
		"FIELD_KEY", "OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "WHITESPACE", "KEY", "KEYNOTE", 
		"KEY_ACCIDENTAL", "'m'", "METER", "METER_FRACTION", "TEMPO", "NOTE_ELEMENT", 
		"NOTE", "NOTE_OR_REST", "PITCH", "OCTAVE", "NOTE_LENGTH_STRICT", "ACCIDENTAL", 
		"TUPLET_ELEMENT", "TUPLET_SPEC", "MULTI_NOTE", "BAR_LINE", "NTH_REPEAT", 
		"LYRIC", "LYRICAL_ELEMENT", "LYRIC_TEXT"
	};
	public static final int
		RULE_root = 0, RULE_abc_tune = 1, RULE_abc_header = 2, RULE_abc_music = 3, 
		RULE_abc_line = 4, RULE_element = 5, RULE_mid_tune_field = 6;
	public static final String[] ruleNames = {
		"root", "abc_tune", "abc_header", "abc_music", "abc_line", "element", 
		"mid_tune_field"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public Abc_tuneContext abc_tune() {
			return getRuleContext(Abc_tuneContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); abc_tune();
			setState(15); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); abc_header();
			setState(18); abc_music();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_headerContext extends ParserRuleContext {
		public TerminalNode FIELD_TRACK_NUMBER() { return getToken(ABCMusicParser.FIELD_TRACK_NUMBER, 0); }
		public List<TerminalNode> OTHER_FIELD() { return getTokens(ABCMusicParser.OTHER_FIELD); }
		public TerminalNode FIELD_TITLE() { return getToken(ABCMusicParser.FIELD_TITLE, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(ABCMusicParser.COMMENT); }
		public TerminalNode OTHER_FIELD(int i) {
			return getToken(ABCMusicParser.OTHER_FIELD, i);
		}
		public TerminalNode FIELD_KEY() { return getToken(ABCMusicParser.FIELD_KEY, 0); }
		public TerminalNode COMMENT(int i) {
			return getToken(ABCMusicParser.COMMENT, i);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); match(FIELD_TRACK_NUMBER);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(21); match(COMMENT);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); match(FIELD_TITLE);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OTHER_FIELD) {
				{
				{
				setState(28); match(OTHER_FIELD);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(FIELD_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); abc_line();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << COMMENT) | (1L << FIELD_VOICE) | (1L << NOTE_ELEMENT) | (1L << TUPLET_ELEMENT) | (1L << BAR_LINE) | (1L << NTH_REPEAT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_lineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public TerminalNode COMMENT() { return getToken(ABCMusicParser.COMMENT, 0); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
		}
		public TerminalNode LYRIC() { return getToken(ABCMusicParser.LYRIC, 0); }
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_abc_line);
		int _la;
		try {
			setState(53);
			switch (_input.LA(1)) {
			case SPACE:
			case NOTE_ELEMENT:
			case TUPLET_ELEMENT:
			case BAR_LINE:
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(41); element();
					}
					}
					setState(44); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NOTE_ELEMENT) | (1L << TUPLET_ELEMENT) | (1L << BAR_LINE) | (1L << NTH_REPEAT))) != 0) );
				setState(46); match(NEWLINE);
				setState(49);
				_la = _input.LA(1);
				if (_la==LYRIC) {
					{
					setState(47); match(LYRIC);
					setState(48); match(NEWLINE);
					}
				}

				}
				break;
			case FIELD_VOICE:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); mid_tune_field();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode NTH_REPEAT() { return getToken(ABCMusicParser.NTH_REPEAT, 0); }
		public TerminalNode NOTE_ELEMENT() { return getToken(ABCMusicParser.NOTE_ELEMENT, 0); }
		public TerminalNode SPACE() { return getToken(ABCMusicParser.SPACE, 0); }
		public TerminalNode TUPLET_ELEMENT() { return getToken(ABCMusicParser.TUPLET_ELEMENT, 0); }
		public TerminalNode BAR_LINE() { return getToken(ABCMusicParser.BAR_LINE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NOTE_ELEMENT) | (1L << TUPLET_ELEMENT) | (1L << BAR_LINE) | (1L << NTH_REPEAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public TerminalNode FIELD_VOICE() { return getToken(ABCMusicParser.FIELD_VOICE, 0); }
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(FIELD_VOICE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3%>\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\7\4\31\n\4\f\4\16\4\34\13\4\3\4\3\4\7\4 \n\4"+
		"\f\4\16\4#\13\4\3\4\3\4\3\5\6\5(\n\5\r\5\16\5)\3\6\6\6-\n\6\r\6\16\6."+
		"\3\6\3\6\3\6\5\6\64\n\6\3\6\3\6\5\68\n\6\3\7\3\7\3\b\3\b\3\b\2\t\2\4\6"+
		"\b\n\f\16\2\3\6\3\3\27\27\36\36!\"=\2\20\3\2\2\2\4\23\3\2\2\2\6\26\3\2"+
		"\2\2\b\'\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20\21\5\4\3\2\21"+
		"\22\7\1\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\25\5\b\5\2\25\5\3\2\2\2\26\32"+
		"\7\6\2\2\27\31\7\5\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33"+
		"\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35!\7\7\2\2\36 \7\t\2\2\37\36\3\2"+
		"\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\b\2\2%"+
		"\7\3\2\2\2&(\5\n\6\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2"+
		"\2\2+-\5\f\7\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60"+
		"\63\7\4\2\2\61\62\7#\2\2\62\64\7\4\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"8\3\2\2\2\658\5\16\b\2\668\7\5\2\2\67,\3\2\2\2\67\65\3\2\2\2\67\66\3\2"+
		"\2\28\13\3\2\2\29:\t\2\2\2:\r\3\2\2\2;<\7\16\2\2<\17\3\2\2\2\b\32!).\63"+
		"\67";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}