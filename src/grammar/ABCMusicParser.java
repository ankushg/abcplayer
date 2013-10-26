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
		NEWLINE=1, COMMENT=2, WHITESPACE=3, FIELD_TRACK_NUMBER=4, FIELD_TITLE=5, 
		FIELD_KEY=6, OTHER_FIELD=7, FIELD_COMPOSER=8, FIELD_DEFAULT_LENGTH=9, 
		FIELD_METER=10, FIELD_TEMPO=11, FIELD_VOICE=12, KEY_ACCIDENTAL=13, MODEMINOR=14, 
		TEMPO=15, MEASURE_ELEMENT=16, NOTE_ELEMENT=17, NOTE=18, NOTE_OR_REST=19, 
		PITCH=20, OCTAVE=21, NOTE_LENGTH_STRICT=22, ACCIDENTAL=23, TUPLET_ELEMENT=24, 
		TUPLET_SPEC=25, MULTI_NOTE=26, BAR_LINE=27, OPEN_REPEAT=28, CLOSE_REPEAT=29, 
		NTH_REPEAT=30, LYRIC=31;
	public static final String[] tokenNames = {
		"<INVALID>", "NEWLINE", "COMMENT", "WHITESPACE", "FIELD_TRACK_NUMBER", 
		"FIELD_TITLE", "FIELD_KEY", "OTHER_FIELD", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "KEY_ACCIDENTAL", "MODEMINOR", 
		"TEMPO", "MEASURE_ELEMENT", "NOTE_ELEMENT", "NOTE", "NOTE_OR_REST", "PITCH", 
		"OCTAVE", "NOTE_LENGTH_STRICT", "ACCIDENTAL", "TUPLET_ELEMENT", "TUPLET_SPEC", 
		"MULTI_NOTE", "BAR_LINE", "'|:'", "':|'", "NTH_REPEAT", "LYRIC"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_abc_music = 2, RULE_abc_line = 3, 
		RULE_element = 4, RULE_measure = 5, RULE_repeat = 6, RULE_mid_tune_field = 7;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "abc_music", "abc_line", "element", "measure", 
		"repeat", "mid_tune_field"
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
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
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
		enterRule(_localctx, 0, RULE_abc_tune);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); abc_header();
			setState(17); abc_music();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(18); match(NEWLINE);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24); match(EOF);
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
			setState(26); match(FIELD_TRACK_NUMBER);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(27); match(COMMENT);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33); match(FIELD_TITLE);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OTHER_FIELD) {
				{
				{
				setState(34); match(OTHER_FIELD);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); match(FIELD_KEY);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42); abc_line();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << FIELD_VOICE) | (1L << MEASURE_ELEMENT) | (1L << BAR_LINE) | (1L << OPEN_REPEAT) | (1L << NTH_REPEAT))) != 0) );
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public TerminalNode COMMENT() { return getToken(ABCMusicParser.COMMENT, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch (_input.LA(1)) {
			case MEASURE_ELEMENT:
			case BAR_LINE:
			case OPEN_REPEAT:
			case NTH_REPEAT:
				{
				setState(48); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(47); element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(50); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(52); match(NEWLINE);
						}
						} 
					}
					setState(57);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(60);
				_la = _input.LA(1);
				if (_la==LYRIC) {
					{
					setState(58); match(LYRIC);
					setState(59); match(NEWLINE);
					}
				}

				}
				break;
			case FIELD_VOICE:
				{
				setState(62); mid_tune_field();
				}
				break;
			case COMMENT:
				{
				setState(63); match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
		public MeasureContext measure() {
			return getRuleContext(MeasureContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
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
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); measure();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); repeat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); match(NTH_REPEAT);
				}
				break;
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

	public static class MeasureContext extends ParserRuleContext {
		public List<TerminalNode> MEASURE_ELEMENT() { return getTokens(ABCMusicParser.MEASURE_ELEMENT); }
		public TerminalNode MEASURE_ELEMENT(int i) {
			return getToken(ABCMusicParser.MEASURE_ELEMENT, i);
		}
		public TerminalNode BAR_LINE() { return getToken(ABCMusicParser.BAR_LINE, 0); }
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_measure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MEASURE_ELEMENT) {
				{
				{
				setState(71); match(MEASURE_ELEMENT);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(BAR_LINE);
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

	public static class RepeatContext extends ParserRuleContext {
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public TerminalNode OPEN_REPEAT() { return getToken(ABCMusicParser.OPEN_REPEAT, 0); }
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public TerminalNode CLOSE_REPEAT() { return getToken(ABCMusicParser.CLOSE_REPEAT, 0); }
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitRepeat(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if (_la==OPEN_REPEAT) {
				{
				setState(79); match(OPEN_REPEAT);
				}
			}

			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82); measure();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MEASURE_ELEMENT || _la==BAR_LINE );
			setState(87); match(CLOSE_REPEAT);
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
		enterRule(_localctx, 14, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(FIELD_VOICE);
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
		"\2\3!^\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\3\2\3\2\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\7\3\37\n\3\f"+
		"\3\16\3\"\13\3\3\3\3\3\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\4\6\4.\n\4\r"+
		"\4\16\4/\3\5\6\5\63\n\5\r\5\16\5\64\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\3"+
		"\5\5\5?\n\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6\5\6H\n\6\3\7\7\7K\n\7\f\7\16"+
		"\7N\13\7\3\7\3\7\3\b\5\bS\n\b\3\b\6\bV\n\b\r\b\16\bW\3\b\3\b\3\t\3\t\3"+
		"\t\2\n\2\4\6\b\n\f\16\20\2\2c\2\22\3\2\2\2\4\34\3\2\2\2\6-\3\2\2\2\bB"+
		"\3\2\2\2\nG\3\2\2\2\fL\3\2\2\2\16R\3\2\2\2\20[\3\2\2\2\22\23\5\4\3\2\23"+
		"\27\5\6\4\2\24\26\7\3\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\1\2\2\33\3\3\2\2\2\34"+
		" \7\6\2\2\35\37\7\4\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2"+
		"\2!#\3\2\2\2\" \3\2\2\2#\'\7\7\2\2$&\7\t\2\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\b\2\2+\5\3\2\2\2,.\5\b\5\2"+
		"-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61\63\5\n\6\2"+
		"\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\66"+
		"8\7\3\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3\2\2\2;9\3"+
		"\2\2\2<=\7!\2\2=?\7\3\2\2><\3\2\2\2>?\3\2\2\2?C\3\2\2\2@C\5\20\t\2AC\7"+
		"\4\2\2B\62\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\t\3\2\2\2DH\5\f\7\2EH\5\16\b\2"+
		"FH\7 \2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IK\7\22\2\2JI\3\2\2"+
		"\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\35\2\2P\r\3\2"+
		"\2\2QS\7\36\2\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\f\7\2UT\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\37\2\2Z\17\3\2\2\2[\\\7\16\2"+
		"\2\\\21\3\2\2\2\16\27 \'/\649>BGLRW";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}