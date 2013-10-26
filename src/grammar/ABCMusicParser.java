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
		WHITESPACE=1, BASENOTE=2, REST=3, INTEGER=4, NEWLINE=5, STRING=6, EQUALS=7, 
		OVER=8, TRACK_NUMBER_START=9, TITLE_START=10, KEY_START=11, COMPOSER_START=12, 
		DEFAULT_LENGTH_START=13, METER_START=14, TEMPO_START=15, VOICE_START=16, 
		KEY_ACCIDENTAL=17, MODEMINOR=18, NON_FRACTION_METER=19, OCTAVE=20, ACCIDENTAL_TYPE=21, 
		TUPLET_START=22, OPEN_CHORD=23, CLOSE_CHORD=24, BAR_LINE=25, OPEN_REPEAT=26, 
		CLOSE_REPEAT=27, NTH_REPEAT=28, COMMENT_START=29, LYRIC=30, LYRIC_START=31;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "BASENOTE", "'z'", "INTEGER", "NEWLINE", "STRING", 
		"'='", "'/'", "'X:'", "'T:'", "'K:'", "'C:'", "'L:'", "'M:'", "'Q:'", 
		"'V:'", "KEY_ACCIDENTAL", "'m'", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", 
		"'('", "'['", "']'", "BAR_LINE", "'|:'", "':|'", "NTH_REPEAT", "'%'", 
		"LYRIC", "'w:'"
	};
	public static final int
		RULE_comment = 0, RULE_eol = 1, RULE_abc_tune = 2, RULE_abc_header = 3, 
		RULE_field_track_number = 4, RULE_field_title = 5, RULE_field_key = 6, 
		RULE_field_composer = 7, RULE_field_default_length = 8, RULE_field_meter = 9, 
		RULE_field_tempo = 10, RULE_field_voice = 11, RULE_tempo = 12, RULE_other_field = 13, 
		RULE_abc_music = 14, RULE_abc_line = 15, RULE_element = 16, RULE_measure = 17, 
		RULE_repeat = 18, RULE_chord = 19, RULE_accidental = 20, RULE_key_signature = 21, 
		RULE_note = 22, RULE_fraction = 23, RULE_tuplet = 24, RULE_pitch = 25;
	public static final String[] ruleNames = {
		"comment", "eol", "abc_tune", "abc_header", "field_track_number", "field_title", 
		"field_key", "field_composer", "field_default_length", "field_meter", 
		"field_tempo", "field_voice", "tempo", "other_field", "abc_music", "abc_line", 
		"element", "measure", "repeat", "chord", "accidental", "key_signature", 
		"note", "fraction", "tuplet", "pitch"
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT_START() { return getToken(ABCMusicParser.COMMENT_START, 0); }
		public TerminalNode STRING() { return getToken(ABCMusicParser.STRING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(COMMENT_START);
			setState(53); match(STRING);
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

	public static class EolContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eol);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case COMMENT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(NEWLINE);
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
		enterRule(_localctx, 4, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); abc_header();
			setState(60); abc_music();
			setState(61); match(EOF);
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
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public Other_fieldContext other_field(int i) {
			return getRuleContext(Other_fieldContext.class,i);
		}
		public Field_track_numberContext field_track_number() {
			return getRuleContext(Field_track_numberContext.class,0);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<Other_fieldContext> other_field() {
			return getRuleContexts(Other_fieldContext.class);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
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
		enterRule(_localctx, 6, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); field_track_number();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_START) {
				{
				{
				setState(64); comment();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); field_title();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER_START) | (1L << DEFAULT_LENGTH_START) | (1L << METER_START) | (1L << TEMPO_START) | (1L << VOICE_START) | (1L << COMMENT_START))) != 0)) {
				{
				{
				setState(71); other_field();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); field_key();
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

	public static class Field_track_numberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ABCMusicParser.INTEGER, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode TRACK_NUMBER_START() { return getToken(ABCMusicParser.TRACK_NUMBER_START, 0); }
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public Field_track_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_track_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_track_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_track_number(this);
		}
	}

	public final Field_track_numberContext field_track_number() throws RecognitionException {
		Field_track_numberContext _localctx = new Field_track_numberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_track_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(TRACK_NUMBER_START);
			setState(80); match(INTEGER);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(81); eol();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Field_titleContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(ABCMusicParser.INTEGER); }
		public TerminalNode TITLE_START() { return getToken(ABCMusicParser.TITLE_START, 0); }
		public TerminalNode STRING(int i) {
			return getToken(ABCMusicParser.STRING, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode INTEGER(int i) {
			return getToken(ABCMusicParser.INTEGER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ABCMusicParser.STRING); }
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_title);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(TITLE_START);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER || _la==STRING );
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(93); eol();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Field_keyContext extends ParserRuleContext {
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public Key_signatureContext key_signature() {
			return getRuleContext(Key_signatureContext.class,0);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode KEY_START() { return getToken(ABCMusicParser.KEY_START, 0); }
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_key);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(KEY_START);
			setState(100); key_signature();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(101); eol();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Field_composerContext extends ParserRuleContext {
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode COMPOSER_START() { return getToken(ABCMusicParser.COMPOSER_START, 0); }
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ABCMusicParser.STRING, 0); }
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_composer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(COMPOSER_START);
			setState(108); match(STRING);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(109); eol();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Field_default_lengthContext extends ParserRuleContext {
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode DEFAULT_LENGTH_START() { return getToken(ABCMusicParser.DEFAULT_LENGTH_START, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_default_length);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(DEFAULT_LENGTH_START);
			setState(116); fraction();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(117); eol();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Field_meterContext extends ParserRuleContext {
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode METER_START() { return getToken(ABCMusicParser.METER_START, 0); }
		public TerminalNode NON_FRACTION_METER() { return getToken(ABCMusicParser.NON_FRACTION_METER, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_meter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(METER_START);
			setState(126);
			switch (_input.LA(1)) {
			case NON_FRACTION_METER:
				{
				setState(124); match(NON_FRACTION_METER);
				}
				break;
			case INTEGER:
			case OVER:
				{
				setState(125); fraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(128); eol();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode TEMPO_START() { return getToken(ABCMusicParser.TEMPO_START, 0); }
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_tempo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(TEMPO_START);
			setState(135); tempo();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(136); eol();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Field_voiceContext extends ParserRuleContext {
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ABCMusicParser.STRING, 0); }
		public TerminalNode VOICE_START() { return getToken(ABCMusicParser.VOICE_START, 0); }
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_field_voice);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(VOICE_START);
			setState(143); match(STRING);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(144); eol();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ABCMusicParser.INTEGER, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(ABCMusicParser.EQUALS, 0); }
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); fraction();
			setState(151); match(EQUALS);
			setState(152); match(INTEGER);
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

	public static class Other_fieldContext extends ParserRuleContext {
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOther_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOther_field(this);
		}
	}

	public final Other_fieldContext other_field() throws RecognitionException {
		Other_fieldContext _localctx = new Other_fieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_other_field);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case COMPOSER_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); field_composer();
				}
				break;
			case DEFAULT_LENGTH_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); field_default_length();
				}
				break;
			case METER_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); field_meter();
				}
				break;
			case TEMPO_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(157); field_tempo();
				}
				break;
			case VOICE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(158); field_voice();
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 6);
				{
				setState(159); comment();
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

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
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
		enterRule(_localctx, 28, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162); abc_line();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(163); match(NEWLINE);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << VOICE_START) | (1L << ACCIDENTAL_TYPE) | (1L << TUPLET_START) | (1L << OPEN_CHORD) | (1L << OPEN_REPEAT) | (1L << NTH_REPEAT) | (1L << COMMENT_START))) != 0) );
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
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode LYRIC() { return getToken(ABCMusicParser.LYRIC, 0); }
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_abc_line);
		int _la;
		try {
			int _alt;
			setState(190);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case ACCIDENTAL_TYPE:
			case TUPLET_START:
			case OPEN_CHORD:
			case OPEN_REPEAT:
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(173); element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(176); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(178); match(NEWLINE);
						}
						} 
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(186);
				_la = _input.LA(1);
				if (_la==LYRIC) {
					{
					setState(184); match(LYRIC);
					setState(185); match(NEWLINE);
					}
				}

				}
				break;
			case VOICE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); field_voice();
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); comment();
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
		enterRule(_localctx, 32, RULE_element);
		try {
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); measure();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); repeat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194); match(NTH_REPEAT);
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
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public TupletContext tuplet(int i) {
			return getRuleContext(TupletContext.class,i);
		}
		public List<TupletContext> tuplet() {
			return getRuleContexts(TupletContext.class);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
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
		enterRule(_localctx, 34, RULE_measure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(199);
				switch (_input.LA(1)) {
				case BASENOTE:
				case REST:
				case ACCIDENTAL_TYPE:
				case OPEN_CHORD:
					{
					setState(197); chord();
					}
					break;
				case TUPLET_START:
					{
					setState(198); tuplet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL_TYPE) | (1L << TUPLET_START) | (1L << OPEN_CHORD))) != 0) );
			setState(203); match(BAR_LINE);
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
		enterRule(_localctx, 36, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if (_la==OPEN_REPEAT) {
				{
				setState(205); match(OPEN_REPEAT);
				}
			}

			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208); measure();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL_TYPE) | (1L << TUPLET_START) | (1L << OPEN_CHORD))) != 0) );
			setState(213); match(CLOSE_REPEAT);
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

	public static class ChordContext extends ParserRuleContext {
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TerminalNode CLOSE_CHORD() { return getToken(ABCMusicParser.CLOSE_CHORD, 0); }
		public TerminalNode OPEN_CHORD() { return getToken(ABCMusicParser.OPEN_CHORD, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_chord);
		int _la;
		try {
			setState(224);
			switch (_input.LA(1)) {
			case OPEN_CHORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(OPEN_CHORD);
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216); note();
					}
					}
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << ACCIDENTAL_TYPE))) != 0) );
				setState(221); match(CLOSE_CHORD);
				}
				break;
			case BASENOTE:
			case REST:
			case ACCIDENTAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); note();
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

	public static class AccidentalContext extends ParserRuleContext {
		public TerminalNode ACCIDENTAL_TYPE() { return getToken(ABCMusicParser.ACCIDENTAL_TYPE, 0); }
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAccidental(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_accidental);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(ACCIDENTAL_TYPE);
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

	public static class Key_signatureContext extends ParserRuleContext {
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public TerminalNode MODEMINOR() { return getToken(ABCMusicParser.MODEMINOR, 0); }
		public TerminalNode KEY_ACCIDENTAL() { return getToken(ABCMusicParser.KEY_ACCIDENTAL, 0); }
		public Key_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey_signature(this);
		}
	}

	public final Key_signatureContext key_signature() throws RecognitionException {
		Key_signatureContext _localctx = new Key_signatureContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_key_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(BASENOTE);
			setState(230);
			_la = _input.LA(1);
			if (_la==KEY_ACCIDENTAL) {
				{
				setState(229); match(KEY_ACCIDENTAL);
				}
			}

			setState(233);
			_la = _input.LA(1);
			if (_la==MODEMINOR) {
				{
				setState(232); match(MODEMINOR);
				}
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ABCMusicParser.INTEGER, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			switch (_input.LA(1)) {
			case BASENOTE:
			case ACCIDENTAL_TYPE:
				{
				setState(235); pitch();
				}
				break;
			case REST:
				{
				setState(236); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(239); match(INTEGER);
				}
				break;

			case 2:
				{
				setState(240); fraction();
				}
				break;
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

	public static class FractionContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(ABCMusicParser.INTEGER); }
		public TerminalNode OVER() { return getToken(ABCMusicParser.OVER, 0); }
		public TerminalNode INTEGER(int i) {
			return getToken(ABCMusicParser.INTEGER, i);
		}
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFraction(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(243); match(INTEGER);
				}
			}

			setState(246); match(OVER);
			setState(248);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(247); match(INTEGER);
				}
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

	public static class TupletContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ABCMusicParser.INTEGER, 0); }
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public TerminalNode TUPLET_START() { return getToken(ABCMusicParser.TUPLET_START, 0); }
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public TupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet(this);
		}
	}

	public final TupletContext tuplet() throws RecognitionException {
		TupletContext _localctx = new TupletContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tuplet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(TUPLET_START);
			setState(251); match(INTEGER);
			setState(253); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(252); chord();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class PitchContext extends ParserRuleContext {
		public TerminalNode OCTAVE() { return getToken(ABCMusicParser.OCTAVE, 0); }
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL_TYPE) {
				{
				setState(257); accidental();
				}
			}

			setState(260); match(BASENOTE);
			setState(262);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(261); match(OCTAVE);
				}
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

	public static final String _serializedATN =
		"\2\3!\u010b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\5\3<\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\7\5K\n\5\f\5"+
		"\16\5N\13\5\3\5\3\5\3\6\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\3\7\6\7\\"+
		"\n\7\r\7\16\7]\3\7\7\7a\n\7\f\7\16\7d\13\7\3\b\3\b\3\b\7\bi\n\b\f\b\16"+
		"\bl\13\b\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13\t\3\n\3\n\3\n\7\ny\n\n\f\n"+
		"\16\n|\13\n\3\13\3\13\3\13\5\13\u0081\n\13\3\13\7\13\u0084\n\13\f\13\16"+
		"\13\u0087\13\13\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\r\3\r"+
		"\3\r\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\7\20\u00a7\n\20\f\20\16\20"+
		"\u00aa\13\20\6\20\u00ac\n\20\r\20\16\20\u00ad\3\21\6\21\u00b1\n\21\r\21"+
		"\16\21\u00b2\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9\13\21\3\21\3\21\5\21"+
		"\u00bd\n\21\3\21\3\21\5\21\u00c1\n\21\3\22\3\22\3\22\5\22\u00c6\n\22\3"+
		"\23\3\23\6\23\u00ca\n\23\r\23\16\23\u00cb\3\23\3\23\3\24\5\24\u00d1\n"+
		"\24\3\24\6\24\u00d4\n\24\r\24\16\24\u00d5\3\24\3\24\3\25\3\25\6\25\u00dc"+
		"\n\25\r\25\16\25\u00dd\3\25\3\25\3\25\5\25\u00e3\n\25\3\26\3\26\3\27\3"+
		"\27\5\27\u00e9\n\27\3\27\5\27\u00ec\n\27\3\30\3\30\5\30\u00f0\n\30\3\30"+
		"\3\30\5\30\u00f4\n\30\3\31\5\31\u00f7\n\31\3\31\3\31\5\31\u00fb\n\31\3"+
		"\32\3\32\3\32\6\32\u0100\n\32\r\32\16\32\u0101\3\33\5\33\u0105\n\33\3"+
		"\33\3\33\5\33\u0109\n\33\3\33\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\3\4\6\6\b\b\u011b\2\66\3\2\2\2\4;\3\2\2\2\6=\3"+
		"\2\2\2\bA\3\2\2\2\nQ\3\2\2\2\fY\3\2\2\2\16e\3\2\2\2\20m\3\2\2\2\22u\3"+
		"\2\2\2\24}\3\2\2\2\26\u0088\3\2\2\2\30\u0090\3\2\2\2\32\u0098\3\2\2\2"+
		"\34\u00a2\3\2\2\2\36\u00ab\3\2\2\2 \u00c0\3\2\2\2\"\u00c5\3\2\2\2$\u00c9"+
		"\3\2\2\2&\u00d0\3\2\2\2(\u00e2\3\2\2\2*\u00e4\3\2\2\2,\u00e6\3\2\2\2."+
		"\u00ef\3\2\2\2\60\u00f6\3\2\2\2\62\u00fc\3\2\2\2\64\u0104\3\2\2\2\66\67"+
		"\7\37\2\2\678\7\b\2\28\3\3\2\2\29<\5\2\2\2:<\7\7\2\2;9\3\2\2\2;:\3\2\2"+
		"\2<\5\3\2\2\2=>\5\b\5\2>?\5\36\20\2?@\7\1\2\2@\7\3\2\2\2AE\5\n\6\2BD\5"+
		"\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\5"+
		"\f\7\2IK\5\34\17\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2N"+
		"L\3\2\2\2OP\5\16\b\2P\t\3\2\2\2QR\7\13\2\2RV\7\6\2\2SU\5\4\3\2TS\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2Y[\7\f\2\2Z\\\t"+
		"\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2\2\2_a\5\4\3\2`_"+
		"\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2\2db\3\2\2\2ef\7\r\2\2"+
		"fj\5,\27\2gi\5\4\3\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2"+
		"\2lj\3\2\2\2mn\7\16\2\2nr\7\b\2\2oq\5\4\3\2po\3\2\2\2qt\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2s\21\3\2\2\2tr\3\2\2\2uv\7\17\2\2vz\5\60\31\2wy\5\4\3\2"+
		"xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|z\3\2\2\2}\u0080"+
		"\7\20\2\2~\u0081\7\25\2\2\177\u0081\5\60\31\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0085\3\2\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0088\u0089\7\21\2\2\u0089\u008d\5\32\16\2\u008a"+
		"\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\7\22\2\2\u0091\u0095\7\b\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\31"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\60\31\2\u0099\u009a\7\t\2\2"+
		"\u009a\u009b\7\6\2\2\u009b\33\3\2\2\2\u009c\u00a3\5\20\t\2\u009d\u00a3"+
		"\5\22\n\2\u009e\u00a3\5\24\13\2\u009f\u00a3\5\26\f\2\u00a0\u00a3\5\30"+
		"\r\2\u00a1\u00a3\5\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\35\3\2\2\2\u00a4\u00a8\5 \21\2\u00a5\u00a7\7\7\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\37\3\2\2\2\u00af\u00b1"+
		"\5\"\22\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\7\7\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bc\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bd\7\7"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be"+
		"\u00c1\5\30\r\2\u00bf\u00c1\5\2\2\2\u00c0\u00b0\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00bf\3\2\2\2\u00c1!\3\2\2\2\u00c2\u00c6\5$\23\2\u00c3\u00c6"+
		"\5&\24\2\u00c4\u00c6\7\36\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c5\u00c4\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00ca\5(\25\2\u00c8\u00ca\5"+
		"\62\32\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\33"+
		"\2\2\u00ce%\3\2\2\2\u00cf\u00d1\7\34\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\5$\23\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\7\35\2\2\u00d8\'\3\2\2\2\u00d9\u00db\7\31\2\2\u00da\u00dc"+
		"\5.\30\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\32\2\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00e3\5.\30\2\u00e2\u00d9\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		")\3\2\2\2\u00e4\u00e5\7\27\2\2\u00e5+\3\2\2\2\u00e6\u00e8\7\4\2\2\u00e7"+
		"\u00e9\7\23\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3"+
		"\2\2\2\u00ea\u00ec\7\24\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"-\3\2\2\2\u00ed\u00f0\5\64\33\2\u00ee\u00f0\7\5\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f4\7\6\2\2\u00f2\u00f4"+
		"\5\60\31\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f4/\3\2\2\2\u00f5\u00f7\7\6\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\7\n\2\2\u00f9\u00fb\7\6\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\61\3\2\2\2\u00fc\u00fd\7\30\2"+
		"\2\u00fd\u00ff\7\6\2\2\u00fe\u0100\5(\25\2\u00ff\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\63\3\2\2\2\u0103"+
		"\u0105\5*\26\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\7\4\2\2\u0107\u0109\7\26\2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\65\3\2\2\2&;ELV]bjrz\u0080\u0085\u008d\u0095\u00a2"+
		"\u00a8\u00ad\u00b2\u00b7\u00bc\u00c0\u00c5\u00c9\u00cb\u00d0\u00d5\u00dd"+
		"\u00e2\u00e8\u00eb\u00ef\u00f3\u00f6\u00fa\u0101\u0104\u0108";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}