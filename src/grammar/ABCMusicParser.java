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
		WHITESPACE=1, BASE=2, REST=3, INTEGER=4, NEWLINE=5, EQUALS=6, OVER=7, 
		TRACK_NUMBER_START=8, TITLE_START=9, KEY_START=10, COMPOSER_START=11, 
		DEFAULT_LENGTH_START=12, METER_START=13, TEMPO_START=14, VOICE_START=15, 
		KEY_ACCIDENTAL=16, MODEMINOR=17, NON_FRACTION_METER=18, OCTAVE=19, ACCIDENTAL_TYPE=20, 
		DUPLET_START=21, TRIPLET_START=22, QUADRUPLET_START=23, OPEN_CHORD=24, 
		CLOSE_CHORD=25, BAR_LINE=26, OPEN_REPEAT=27, CLOSE_REPEAT=28, NTH_REPEAT=29, 
		COMMENT_START=30, LYRIC_START=31, LYRIC_MODIFIER=32, LYRIC_SEPARATOR=33, 
		NONBASENOTE=34, PUNCTUATION=35;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "BASE", "'z'", "INTEGER", "NEWLINE", "'='", 
		"'/'", "'X:'", "'T:'", "'K:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", 
		"KEY_ACCIDENTAL", "'m'", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", 
		"'(2'", "'(3'", "'(4'", "'['", "']'", "BAR_LINE", "'|:'", "':|'", "NTH_REPEAT", 
		"'%'", "'w:'", "LYRIC_MODIFIER", "'-'", "NONBASENOTE", "PUNCTUATION"
	};
	public static final int
		RULE_string = 0, RULE_comment = 1, RULE_eol = 2, RULE_abc_tune = 3, RULE_abc_header = 4, 
		RULE_field_track_number = 5, RULE_field_title = 6, RULE_field_key = 7, 
		RULE_field_composer = 8, RULE_field_default_length = 9, RULE_field_meter = 10, 
		RULE_field_tempo = 11, RULE_field_voice = 12, RULE_tempo = 13, RULE_other_field = 14, 
		RULE_abc_music = 15, RULE_syllable = 16, RULE_lyric = 17, RULE_voice = 18, 
		RULE_tune = 19, RULE_chord = 20, RULE_accidental = 21, RULE_key_signature = 22, 
		RULE_note = 23, RULE_fraction = 24, RULE_tuplet = 25, RULE_duplet = 26, 
		RULE_triplet = 27, RULE_quadruplet = 28, RULE_pitch = 29;
	public static final String[] ruleNames = {
		"string", "comment", "eol", "abc_tune", "abc_header", "field_track_number", 
		"field_title", "field_key", "field_composer", "field_default_length", 
		"field_meter", "field_tempo", "field_voice", "tempo", "other_field", "abc_music", 
		"syllable", "lyric", "voice", "tune", "chord", "accidental", "key_signature", 
		"note", "fraction", "tuplet", "duplet", "triplet", "quadruplet", "pitch"
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
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> PUNCTUATION() { return getTokens(ABCMusicParser.PUNCTUATION); }
		public List<TerminalNode> INTEGER() { return getTokens(ABCMusicParser.INTEGER); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(ABCMusicParser.PUNCTUATION, i);
		}
		public List<TerminalNode> REST() { return getTokens(ABCMusicParser.REST); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
		public TerminalNode BASE(int i) {
			return getToken(ABCMusicParser.BASE, i);
		}
		public TerminalNode MODEMINOR(int i) {
			return getToken(ABCMusicParser.MODEMINOR, i);
		}
		public List<TerminalNode> OCTAVE() { return getTokens(ABCMusicParser.OCTAVE); }
		public List<TerminalNode> BASE() { return getTokens(ABCMusicParser.BASE); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public TerminalNode OCTAVE(int i) {
			return getToken(ABCMusicParser.OCTAVE, i);
		}
		public TerminalNode NONBASENOTE(int i) {
			return getToken(ABCMusicParser.NONBASENOTE, i);
		}
		public List<TerminalNode> NONBASENOTE() { return getTokens(ABCMusicParser.NONBASENOTE); }
		public List<TerminalNode> MODEMINOR() { return getTokens(ABCMusicParser.MODEMINOR); }
		public TerminalNode REST(int i) {
			return getToken(ABCMusicParser.REST, i);
		}
		public TerminalNode INTEGER(int i) {
			return getToken(ABCMusicParser.INTEGER, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << INTEGER) | (1L << MODEMINOR) | (1L << OCTAVE) | (1L << NONBASENOTE) | (1L << PUNCTUATION))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << INTEGER) | (1L << MODEMINOR) | (1L << OCTAVE) | (1L << NONBASENOTE) | (1L << PUNCTUATION))) != 0) );
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode COMMENT_START() { return getToken(ABCMusicParser.COMMENT_START, 0); }
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
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(COMMENT_START);
			setState(67);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << INTEGER) | (1L << MODEMINOR) | (1L << OCTAVE) | (1L << NONBASENOTE) | (1L << PUNCTUATION))) != 0)) {
				{
				setState(66); string();
				}
			}

			setState(69); match(NEWLINE);
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
		enterRule(_localctx, 4, RULE_eol);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case COMMENT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(NEWLINE);
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
		enterRule(_localctx, 6, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); abc_header();
			setState(76); abc_music();
			setState(77); match(EOF);
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
		enterRule(_localctx, 8, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); field_track_number();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_START) {
				{
				{
				setState(80); comment();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); field_title();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER_START) | (1L << DEFAULT_LENGTH_START) | (1L << METER_START) | (1L << TEMPO_START) | (1L << VOICE_START) | (1L << COMMENT_START))) != 0)) {
				{
				{
				setState(87); other_field();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); field_key();
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
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
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
		enterRule(_localctx, 10, RULE_field_track_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(TRACK_NUMBER_START);
			setState(97);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(96); match(WHITESPACE);
				}
			}

			setState(99); match(INTEGER);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(100); eol();
					}
					} 
				}
				setState(105);
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

	public static class Field_titleContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
		public TerminalNode TITLE_START() { return getToken(ABCMusicParser.TITLE_START, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
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
		enterRule(_localctx, 12, RULE_field_title);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(TITLE_START);
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(107); match(WHITESPACE);
				}
				break;
			}
			setState(110); string();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(111); eol();
					}
					} 
				}
				setState(116);
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

	public static class Field_keyContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
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
		enterRule(_localctx, 14, RULE_field_key);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(KEY_START);
			setState(119);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(118); match(WHITESPACE);
				}
			}

			setState(121); key_signature();
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(122); eol();
					}
					} 
				}
				setState(127);
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

	public static class Field_composerContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode COMPOSER_START() { return getToken(ABCMusicParser.COMPOSER_START, 0); }
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_field_composer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(COMPOSER_START);
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(129); match(WHITESPACE);
				}
				break;
			}
			setState(132); string();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(133); eol();
					}
					} 
				}
				setState(138);
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

	public static class Field_default_lengthContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
		public FractionContext fraction(int i) {
			return getRuleContext(FractionContext.class,i);
		}
		public List<FractionContext> fraction() {
			return getRuleContexts(FractionContext.class);
		}
		public TerminalNode DEFAULT_LENGTH_START() { return getToken(ABCMusicParser.DEFAULT_LENGTH_START, 0); }
		public TerminalNode EQUALS() { return getToken(ABCMusicParser.EQUALS, 0); }
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
		enterRule(_localctx, 18, RULE_field_default_length);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(DEFAULT_LENGTH_START);
			setState(141);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(140); match(WHITESPACE);
				}
			}

			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(143); fraction();
				setState(144); match(EQUALS);
				}
				break;
			}
			setState(148); fraction();
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(149); eol();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 20, RULE_field_meter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(METER_START);
			setState(158);
			switch (_input.LA(1)) {
			case NON_FRACTION_METER:
				{
				setState(156); match(NON_FRACTION_METER);
				}
				break;
			case INTEGER:
			case OVER:
				{
				setState(157); fraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(160); eol();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 22, RULE_field_tempo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(TEMPO_START);
			setState(167); tempo();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(168); eol();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_field_voice);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(VOICE_START);
			setState(175); string();
			setState(177); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(176); eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 26, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(181); fraction();
				setState(182); match(EQUALS);
				}
				break;
			}
			setState(186); match(INTEGER);
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
		enterRule(_localctx, 28, RULE_other_field);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case COMPOSER_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); field_composer();
				}
				break;
			case DEFAULT_LENGTH_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); field_default_length();
				}
				break;
			case METER_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(190); field_meter();
				}
				break;
			case TEMPO_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(191); field_tempo();
				}
				break;
			case VOICE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(192); field_voice();
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 6);
				{
				setState(193); comment();
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
		public Field_voiceContext field_voice(int i) {
			return getRuleContext(Field_voiceContext.class,i);
		}
		public List<VoiceContext> voice() {
			return getRuleContexts(VoiceContext.class);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public VoiceContext voice(int i) {
			return getRuleContext(VoiceContext.class,i);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<Field_voiceContext> field_voice() {
			return getRuleContexts(Field_voiceContext.class);
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
		enterRule(_localctx, 30, RULE_abc_music);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				_la = _input.LA(1);
				if (_la==VOICE_START) {
					{
					setState(196); field_voice();
					}
				}

				setState(199); voice();
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(200); eol();
						}
						} 
					}
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << EQUALS) | (1L << VOICE_START) | (1L << ACCIDENTAL_TYPE) | (1L << DUPLET_START) | (1L << TRIPLET_START) | (1L << QUADRUPLET_START) | (1L << OPEN_CHORD) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << COMMENT_START))) != 0) );
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

	public static class SyllableContext extends ParserRuleContext {
		public List<TerminalNode> PUNCTUATION() { return getTokens(ABCMusicParser.PUNCTUATION); }
		public TerminalNode LYRIC_SEPARATOR() { return getToken(ABCMusicParser.LYRIC_SEPARATOR, 0); }
		public TerminalNode LYRIC_MODIFIER(int i) {
			return getToken(ABCMusicParser.LYRIC_MODIFIER, i);
		}
		public List<TerminalNode> LYRIC_MODIFIER() { return getTokens(ABCMusicParser.LYRIC_MODIFIER); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(ABCMusicParser.PUNCTUATION, i);
		}
		public List<TerminalNode> REST() { return getTokens(ABCMusicParser.REST); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
		public TerminalNode BASE(int i) {
			return getToken(ABCMusicParser.BASE, i);
		}
		public TerminalNode MODEMINOR(int i) {
			return getToken(ABCMusicParser.MODEMINOR, i);
		}
		public List<TerminalNode> OCTAVE() { return getTokens(ABCMusicParser.OCTAVE); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public List<TerminalNode> BASE() { return getTokens(ABCMusicParser.BASE); }
		public TerminalNode OCTAVE(int i) {
			return getToken(ABCMusicParser.OCTAVE, i);
		}
		public TerminalNode NONBASENOTE(int i) {
			return getToken(ABCMusicParser.NONBASENOTE, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ABCMusicParser.EQUALS); }
		public TerminalNode ACCIDENTAL_TYPE(int i) {
			return getToken(ABCMusicParser.ACCIDENTAL_TYPE, i);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(ABCMusicParser.EQUALS, i);
		}
		public List<TerminalNode> NONBASENOTE() { return getTokens(ABCMusicParser.NONBASENOTE); }
		public TerminalNode REST(int i) {
			return getToken(ABCMusicParser.REST, i);
		}
		public List<TerminalNode> MODEMINOR() { return getTokens(ABCMusicParser.MODEMINOR); }
		public List<TerminalNode> ACCIDENTAL_TYPE() { return getTokens(ABCMusicParser.ACCIDENTAL_TYPE); }
		public TerminalNode BAR_LINE() { return getToken(ABCMusicParser.BAR_LINE, 0); }
		public SyllableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syllable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterSyllable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitSyllable(this);
		}
	}

	public final SyllableContext syllable() throws RecognitionException {
		SyllableContext _localctx = new SyllableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_syllable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(218);
					switch (_input.LA(1)) {
					case LYRIC_MODIFIER:
						{
						setState(210); match(LYRIC_MODIFIER);
						}
						break;
					case BASE:
						{
						setState(211); match(BASE);
						}
						break;
					case NONBASENOTE:
						{
						setState(212); match(NONBASENOTE);
						}
						break;
					case PUNCTUATION:
						{
						setState(213); match(PUNCTUATION);
						}
						break;
					case REST:
						{
						setState(214); match(REST);
						}
						break;
					case MODEMINOR:
						{
						setState(215); match(MODEMINOR);
						}
						break;
					case EQUALS:
					case ACCIDENTAL_TYPE:
						{
						setState(216);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==ACCIDENTAL_TYPE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case OCTAVE:
						{
						setState(217); match(OCTAVE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(223);
			_la = _input.LA(1);
			if (_la==LYRIC_SEPARATOR) {
				{
				setState(222); match(LYRIC_SEPARATOR);
				}
			}

			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(225); match(WHITESPACE);
				}
				break;
			}
			setState(229);
			_la = _input.LA(1);
			if (_la==BAR_LINE) {
				{
				setState(228); match(BAR_LINE);
				}
			}

			setState(232);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(231); match(WHITESPACE);
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

	public static class LyricContext extends ParserRuleContext {
		public TerminalNode LYRIC_START() { return getToken(ABCMusicParser.LYRIC_START, 0); }
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public SyllableContext syllable(int i) {
			return getRuleContext(SyllableContext.class,i);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SyllableContext> syllable() {
			return getRuleContexts(SyllableContext.class);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lyric);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(LYRIC_START);
			setState(236);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(235); match(WHITESPACE);
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << REST) | (1L << EQUALS) | (1L << MODEMINOR) | (1L << OCTAVE) | (1L << ACCIDENTAL_TYPE) | (1L << LYRIC_MODIFIER) | (1L << NONBASENOTE) | (1L << PUNCTUATION))) != 0)) {
				{
				{
				setState(238); syllable();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(244); eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(247); 
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

	public static class VoiceContext extends ParserRuleContext {
		public List<LyricContext> lyric() {
			return getRuleContexts(LyricContext.class);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TuneContext tune(int i) {
			return getRuleContext(TuneContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LyricContext lyric(int i) {
			return getRuleContext(LyricContext.class,i);
		}
		public List<TuneContext> tune() {
			return getRuleContexts(TuneContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitVoice(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_voice);
		try {
			int _alt;
			setState(260);
			switch (_input.LA(1)) {
			case WHITESPACE:
			case BASE:
			case REST:
			case EQUALS:
			case ACCIDENTAL_TYPE:
			case DUPLET_START:
			case TRIPLET_START:
			case QUADRUPLET_START:
			case OPEN_CHORD:
			case BAR_LINE:
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(249); tune();
						setState(253);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(250); eol();
							setState(251); lyric();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(257); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); comment();
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

	public static class TuneContext extends ParserRuleContext {
		public List<TerminalNode> NTH_REPEAT() { return getTokens(ABCMusicParser.NTH_REPEAT); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public TerminalNode NTH_REPEAT(int i) {
			return getToken(ABCMusicParser.NTH_REPEAT, i);
		}
		public TupletContext tuplet(int i) {
			return getRuleContext(TupletContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public List<TupletContext> tuplet() {
			return getRuleContexts(TupletContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode BAR_LINE(int i) {
			return getToken(ABCMusicParser.BAR_LINE, i);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public List<TerminalNode> BAR_LINE() { return getTokens(ABCMusicParser.BAR_LINE); }
		public TuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTune(this);
		}
	}

	public final TuneContext tune() throws RecognitionException {
		TuneContext _localctx = new TuneContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tune);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(267);
					switch (_input.LA(1)) {
					case BASE:
					case REST:
					case EQUALS:
					case ACCIDENTAL_TYPE:
					case OPEN_CHORD:
						{
						setState(262); chord();
						}
						break;
					case DUPLET_START:
					case TRIPLET_START:
					case QUADRUPLET_START:
						{
						setState(263); tuplet();
						}
						break;
					case BAR_LINE:
						{
						setState(264); match(BAR_LINE);
						}
						break;
					case NTH_REPEAT:
						{
						setState(265); match(NTH_REPEAT);
						}
						break;
					case WHITESPACE:
						{
						setState(266); match(WHITESPACE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(271); eol();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 40, RULE_chord);
		int _la;
		try {
			setState(286);
			switch (_input.LA(1)) {
			case OPEN_CHORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); match(OPEN_CHORD);
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278); note();
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << REST) | (1L << EQUALS) | (1L << ACCIDENTAL_TYPE))) != 0) );
				setState(283); match(CLOSE_CHORD);
				}
				break;
			case BASE:
			case REST:
			case EQUALS:
			case ACCIDENTAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); note();
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
		public TerminalNode EQUALS() { return getToken(ABCMusicParser.EQUALS, 0); }
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
		enterRule(_localctx, 42, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==ACCIDENTAL_TYPE) ) {
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

	public static class Key_signatureContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(ABCMusicParser.BASE, 0); }
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
		enterRule(_localctx, 44, RULE_key_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(BASE);
			setState(292);
			_la = _input.LA(1);
			if (_la==KEY_ACCIDENTAL) {
				{
				setState(291); match(KEY_ACCIDENTAL);
				}
			}

			setState(295);
			_la = _input.LA(1);
			if (_la==MODEMINOR) {
				{
				setState(294); match(MODEMINOR);
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
		enterRule(_localctx, 46, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			switch (_input.LA(1)) {
			case BASE:
			case EQUALS:
			case ACCIDENTAL_TYPE:
				{
				setState(297); pitch();
				}
				break;
			case REST:
				{
				setState(298); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(301); match(INTEGER);
				}
				break;

			case 2:
				{
				setState(302); fraction();
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
		enterRule(_localctx, 48, RULE_fraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(305); match(INTEGER);
				}
			}

			setState(308); match(OVER);
			setState(310);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(309); match(INTEGER);
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
		public DupletContext duplet() {
			return getRuleContext(DupletContext.class,0);
		}
		public QuadrupletContext quadruplet() {
			return getRuleContext(QuadrupletContext.class,0);
		}
		public TripletContext triplet() {
			return getRuleContext(TripletContext.class,0);
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
		enterRule(_localctx, 50, RULE_tuplet);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case DUPLET_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); duplet();
				}
				break;
			case TRIPLET_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); triplet();
				}
				break;
			case QUADRUPLET_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(314); quadruplet();
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

	public static class DupletContext extends ParserRuleContext {
		public TerminalNode DUPLET_START() { return getToken(ABCMusicParser.DUPLET_START, 0); }
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public DupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterDuplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitDuplet(this);
		}
	}

	public final DupletContext duplet() throws RecognitionException {
		DupletContext _localctx = new DupletContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_duplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(DUPLET_START);
			setState(318); chord();
			setState(319); chord();
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

	public static class TripletContext extends ParserRuleContext {
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public TerminalNode TRIPLET_START() { return getToken(ABCMusicParser.TRIPLET_START, 0); }
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public TripletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTriplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTriplet(this);
		}
	}

	public final TripletContext triplet() throws RecognitionException {
		TripletContext _localctx = new TripletContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_triplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(TRIPLET_START);
			setState(322); chord();
			setState(323); chord();
			setState(324); chord();
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

	public static class QuadrupletContext extends ParserRuleContext {
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public TerminalNode QUADRUPLET_START() { return getToken(ABCMusicParser.QUADRUPLET_START, 0); }
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public QuadrupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadruplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterQuadruplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitQuadruplet(this);
		}
	}

	public final QuadrupletContext quadruplet() throws RecognitionException {
		QuadrupletContext _localctx = new QuadrupletContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_quadruplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(QUADRUPLET_START);
			setState(327); chord();
			setState(328); chord();
			setState(329); chord();
			setState(330); chord();
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
		public TerminalNode BASE() { return getToken(ABCMusicParser.BASE, 0); }
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
		enterRule(_localctx, 58, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if (_la==EQUALS || _la==ACCIDENTAL_TYPE) {
				{
				setState(332); accidental();
				}
			}

			setState(335); match(BASE);
			setState(337);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(336); match(OCTAVE);
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
		"\2\3%\u0156\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\3\2\6\2@\n\2\r\2\16\2A\3\3\3\3\5\3F\n\3\3\3\3\3\3\4\3\4\5\4"+
		"L\n\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\7\6[\n\6"+
		"\f\6\16\6^\13\6\3\6\3\6\3\7\3\7\5\7d\n\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13"+
		"\7\3\b\3\b\5\bo\n\b\3\b\3\b\7\bs\n\b\f\b\16\bv\13\b\3\t\3\t\5\tz\n\t\3"+
		"\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\n\3\n\5\n\u0085\n\n\3\n\3\n\7\n"+
		"\u0089\n\n\f\n\16\n\u008c\13\n\3\13\3\13\5\13\u0090\n\13\3\13\3\13\3\13"+
		"\5\13\u0095\n\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\f"+
		"\3\f\3\f\5\f\u00a1\n\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\r\3\r\3"+
		"\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\16\3\16\3\16\6\16\u00b4\n\16\r"+
		"\16\16\16\u00b5\3\17\3\17\3\17\5\17\u00bb\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00c5\n\20\3\21\5\21\u00c8\n\21\3\21\3\21\7\21\u00cc"+
		"\n\21\f\21\16\21\u00cf\13\21\6\21\u00d1\n\21\r\21\16\21\u00d2\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00dd\n\22\r\22\16\22\u00de\3\22\5"+
		"\22\u00e2\n\22\3\22\5\22\u00e5\n\22\3\22\5\22\u00e8\n\22\3\22\5\22\u00eb"+
		"\n\22\3\23\3\23\5\23\u00ef\n\23\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5"+
		"\13\23\3\23\6\23\u00f8\n\23\r\23\16\23\u00f9\3\24\3\24\3\24\3\24\5\24"+
		"\u0100\n\24\6\24\u0102\n\24\r\24\16\24\u0103\3\24\5\24\u0107\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\6\25\u010e\n\25\r\25\16\25\u010f\3\25\7\25\u0113"+
		"\n\25\f\25\16\25\u0116\13\25\3\26\3\26\6\26\u011a\n\26\r\26\16\26\u011b"+
		"\3\26\3\26\3\26\5\26\u0121\n\26\3\27\3\27\3\30\3\30\5\30\u0127\n\30\3"+
		"\30\5\30\u012a\n\30\3\31\3\31\5\31\u012e\n\31\3\31\3\31\5\31\u0132\n\31"+
		"\3\32\5\32\u0135\n\32\3\32\3\32\5\32\u0139\n\32\3\33\3\33\3\33\5\33\u013e"+
		"\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\5\37\u0150\n\37\3\37\3\37\5\37\u0154\n\37\3\37\2 \2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\6\3\6"+
		"\23\23\25\25$%\4\b\b\26\26\4\b\b\26\26\u0179\2?\3\2\2\2\4C\3\2\2\2\6K"+
		"\3\2\2\2\bM\3\2\2\2\nQ\3\2\2\2\fa\3\2\2\2\16l\3\2\2\2\20w\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\u008d\3\2\2\2\26\u009d\3\2\2\2\30\u00a8\3\2\2\2\32\u00b0\3"+
		"\2\2\2\34\u00ba\3\2\2\2\36\u00c4\3\2\2\2 \u00d0\3\2\2\2\"\u00dc\3\2\2"+
		"\2$\u00ec\3\2\2\2&\u0106\3\2\2\2(\u010d\3\2\2\2*\u0120\3\2\2\2,\u0122"+
		"\3\2\2\2.\u0124\3\2\2\2\60\u012d\3\2\2\2\62\u0134\3\2\2\2\64\u013d\3\2"+
		"\2\2\66\u013f\3\2\2\28\u0143\3\2\2\2:\u0148\3\2\2\2<\u014f\3\2\2\2>@\t"+
		"\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CE\7 \2\2DF\5"+
		"\2\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\7\2\2H\5\3\2\2\2IL\5\4\3\2JL"+
		"\7\7\2\2KI\3\2\2\2KJ\3\2\2\2L\7\3\2\2\2MN\5\n\6\2NO\5 \21\2OP\7\1\2\2"+
		"P\t\3\2\2\2QU\5\f\7\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2VX\3\2\2\2WU\3\2\2\2X\\\5\16\b\2Y[\5\36\20\2ZY\3\2\2\2[^\3\2\2\2\\Z"+
		"\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\20\t\2`\13\3\2\2\2ac\7\n"+
		"\2\2bd\7\3\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ei\7\6\2\2fh\5\6\4\2gf\3\2"+
		"\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2ln\7\13\2\2mo\7"+
		"\3\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pt\5\2\2\2qs\5\6\4\2rq\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2u\17\3\2\2\2vt\3\2\2\2wy\7\f\2\2xz\7\3\2\2y"+
		"x\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\177\5.\30\2|~\5\6\4\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0084\7\r\2\2\u0083\u0085\7\3\2\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\5\2\2\2\u0087\u0089\5\6"+
		"\4\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\23\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7\16\2"+
		"\2\u008e\u0090\7\3\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094"+
		"\3\2\2\2\u0091\u0092\5\62\32\2\u0092\u0093\7\b\2\2\u0093\u0095\3\2\2\2"+
		"\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a"+
		"\5\62\32\2\u0097\u0099\5\6\4\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a0\7\17\2\2\u009e\u00a1\7\24\2\2\u009f\u00a1\5\62\32"+
		"\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4"+
		"\5\6\4\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\20\2"+
		"\2\u00a9\u00ad\5\34\17\2\u00aa\u00ac\5\6\4\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\31\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\21\2\2\u00b1\u00b3\5\2\2\2\u00b2"+
		"\u00b4\5\6\4\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\5\62\32\2\u00b8"+
		"\u00b9\7\b\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\35\3\2\2\2\u00be\u00c5"+
		"\5\22\n\2\u00bf\u00c5\5\24\13\2\u00c0\u00c5\5\26\f\2\u00c1\u00c5\5\30"+
		"\r\2\u00c2\u00c5\5\32\16\2\u00c3\u00c5\5\4\3\2\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\37\3\2\2\2\u00c6\u00c8\5\32\16\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\5&"+
		"\24\2\u00ca\u00cc\5\6\4\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00c7\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3!\3\2\2\2\u00d4\u00dd\7\"\2\2\u00d5\u00dd\7\4\2\2"+
		"\u00d6\u00dd\7$\2\2\u00d7\u00dd\7%\2\2\u00d8\u00dd\7\5\2\2\u00d9\u00dd"+
		"\7\23\2\2\u00da\u00dd\t\3\2\2\u00db\u00dd\7\25\2\2\u00dc\u00d4\3\2\2\2"+
		"\u00dc\u00d5\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8"+
		"\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00e2\7#\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e5\7\3\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\7\34\2\2\u00e7\u00e6\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\7\3\2\2\u00ea\u00e9\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ee\7!\2\2\u00ed\u00ef"+
		"\7\3\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0"+
		"\u00f2\5\"\22\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\5\6\4\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa%\3\2\2\2\u00fb\u00ff\5(\25\2\u00fc\u00fd"+
		"\5\6\4\2\u00fd\u00fe\5$\23\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00fb\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0107\5\4\3\2\u0106\u0101\3\2\2\2\u0106\u0105\3\2\2\2\u0107\'\3\2\2\2"+
		"\u0108\u010e\5*\26\2\u0109\u010e\5\64\33\2\u010a\u010e\7\34\2\2\u010b"+
		"\u010e\7\37\2\2\u010c\u010e\7\3\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3"+
		"\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2"+
		"\2\2\u0111\u0113\5\6\4\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115)\3\2\2\2\u0116\u0114\3\2\2\2"+
		"\u0117\u0119\7\32\2\2\u0118\u011a\5\60\31\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\7\33\2\2\u011e\u0121\3\2\2\2\u011f\u0121\5\60\31\2\u0120"+
		"\u0117\3\2\2\2\u0120\u011f\3\2\2\2\u0121+\3\2\2\2\u0122\u0123\t\4\2\2"+
		"\u0123-\3\2\2\2\u0124\u0126\7\4\2\2\u0125\u0127\7\22\2\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\7\23\2\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a/\3\2\2\2\u012b\u012e\5<\37\2"+
		"\u012c\u012e\7\5\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u0132\7\6\2\2\u0130\u0132\5\62\32\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\61\3\2\2\2\u0133\u0135"+
		"\7\6\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\7\t\2\2\u0137\u0139\7\6\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\63\3\2\2\2\u013a\u013e\5\66\34\2\u013b\u013e\58\35\2\u013c"+
		"\u013e\5:\36\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2"+
		"\2\2\u013e\65\3\2\2\2\u013f\u0140\7\27\2\2\u0140\u0141\5*\26\2\u0141\u0142"+
		"\5*\26\2\u0142\67\3\2\2\2\u0143\u0144\7\30\2\2\u0144\u0145\5*\26\2\u0145"+
		"\u0146\5*\26\2\u0146\u0147\5*\26\2\u01479\3\2\2\2\u0148\u0149\7\31\2\2"+
		"\u0149\u014a\5*\26\2\u014a\u014b\5*\26\2\u014b\u014c\5*\26\2\u014c\u014d"+
		"\5*\26\2\u014d;\3\2\2\2\u014e\u0150\5,\27\2\u014f\u014e\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7\4\2\2\u0152\u0154\7\25"+
		"\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154=\3\2\2\2\65AEKU\\c"+
		"inty\177\u0084\u008a\u008f\u0094\u009a\u00a0\u00a5\u00ad\u00b5\u00ba\u00c4"+
		"\u00c7\u00cd\u00d2\u00dc\u00de\u00e1\u00e4\u00e7\u00ea\u00ee\u00f3\u00f9"+
		"\u00ff\u0103\u0106\u010d\u010f\u0114\u011b\u0120\u0126\u0129\u012d\u0131"+
		"\u0134\u0138\u013d\u014f\u0153";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}