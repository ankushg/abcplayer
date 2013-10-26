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
		BASENOTE=1, REST=2, SPACE=3, NEWLINE=4, COMMENT=5, FIELD_TRACK_NUMBER=6, 
		FIELD_TITLE=7, FIELD_KEY=8, OTHER_FIELD=9, FIELD_COMPOSER=10, FIELD_DEFAULT_LENGTH=11, 
		FIELD_METER=12, FIELD_TEMPO=13, FIELD_VOICE=14, WHITESPACE=15, KEY=16, 
		KEYNOTE=17, KEY_ACCIDENTAL=18, MODEMINOR=19, METER=20, METER_FRACTION=21, 
		TEMPO=22, NOTE_ELEMENT=23, NOTE=24, NOTE_OR_REST=25, PITCH=26, OCTAVE=27, 
		NOTE_LENGTH_STRICT=28, ACCIDENTAL=29, TUPLET_ELEMENT=30, TUPLET_SPEC=31, 
		MULTI_NOTE=32, BAR_LINE=33, NTH_REPEAT=34, LYRIC=35, LYRICAL_ELEMENT=36, 
		LYRIC_TEXT=37;
	public static final String[] tokenNames = {
		"<INVALID>", "BASENOTE", "'z'", "SPACE", "NEWLINE", "COMMENT", "FIELD_TRACK_NUMBER", 
		"FIELD_TITLE", "FIELD_KEY", "OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "WHITESPACE", "KEY", "KEYNOTE", 
		"KEY_ACCIDENTAL", "'m'", "METER", "METER_FRACTION", "TEMPO", "NOTE_ELEMENT", 
		"NOTE", "NOTE_OR_REST", "PITCH", "OCTAVE", "NOTE_LENGTH_STRICT", "ACCIDENTAL", 
		"TUPLET_ELEMENT", "TUPLET_SPEC", "MULTI_NOTE", "BAR_LINE", "NTH_REPEAT", 
		"LYRIC", "LYRICAL_ELEMENT", "LYRIC_TEXT"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_abc_music = 2, RULE_abc_line = 3, 
		RULE_element = 4, RULE_mid_tune_field = 5;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "abc_music", "abc_line", "element", "mid_tune_field"
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
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); abc_header();
			setState(13); abc_music();
			setState(14); match(EOF);
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
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(FIELD_TRACK_NUMBER);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(17); match(COMMENT);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); match(FIELD_TITLE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OTHER_FIELD) {
				{
				{
				setState(24); match(OTHER_FIELD);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30); match(FIELD_KEY);
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
		enterRule(_localctx, 4, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32); abc_line();
				}
				}
				setState(35); 
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
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
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
		enterRule(_localctx, 6, RULE_abc_line);
		int _la;
		try {
			int _alt;
			setState(54);
			switch (_input.LA(1)) {
			case SPACE:
			case NOTE_ELEMENT:
			case TUPLET_ELEMENT:
			case BAR_LINE:
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37); element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(42); match(NEWLINE);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				_la = _input.LA(1);
				if (_la==LYRIC) {
					{
					setState(48); match(LYRIC);
					setState(49); match(NEWLINE);
					}
				}

				}
				break;
			case FIELD_VOICE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); mid_tune_field();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); match(COMMENT);
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
		enterRule(_localctx, 8, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		enterRule(_localctx, 10, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(FIELD_VOICE);
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
		"\2\3\'?\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\7\3\25\n\3\f\3\16\3\30\13\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37"+
		"\13\3\3\3\3\3\3\4\6\4$\n\4\r\4\16\4%\3\5\6\5)\n\5\r\5\16\5*\3\5\7\5.\n"+
		"\5\f\5\16\5\61\13\5\3\5\3\5\5\5\65\n\5\3\5\3\5\5\59\n\5\3\6\3\6\3\7\3"+
		"\7\3\7\2\b\2\4\6\b\n\f\2\3\6\5\5\31\31  #$@\2\16\3\2\2\2\4\22\3\2\2\2"+
		"\6#\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16\17\5\4\3\2\17\20\5\6\4"+
		"\2\20\21\7\1\2\2\21\3\3\2\2\2\22\26\7\b\2\2\23\25\7\7\2\2\24\23\3\2\2"+
		"\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2"+
		"\2\31\35\7\t\2\2\32\34\7\13\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2"+
		"\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\n\2\2!\5\3\2\2\2\"$\5"+
		"\b\5\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\7\3\2\2\2\')\5\n\6\2"+
		"(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+/\3\2\2\2,.\7\6\2\2-,\3\2\2"+
		"\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61/\3\2\2\2\62\63\7"+
		"%\2\2\63\65\7\6\2\2\64\62\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\669\5\f\7"+
		"\2\679\7\7\2\28(\3\2\2\28\66\3\2\2\28\67\3\2\2\29\t\3\2\2\2:;\t\2\2\2"+
		";\13\3\2\2\2<=\7\20\2\2=\r\3\2\2\2\t\26\35%*/\648";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}