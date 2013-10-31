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
		TRACK_NUMBER_START=8, TITLE_START=9, COMPOSER_START=10, DEFAULT_LENGTH_START=11, 
		METER_START=12, TEMPO_START=13, VOICE_START=14, KEY_START=15, KEY_TOKEN=16, 
		NON_FRACTION_METER=17, OCTAVE=18, ACCIDENTAL_TYPE=19, DUPLET_START=20, 
		TRIPLET_START=21, QUADRUPLET_START=22, BAR_LINE=23, OPEN_BRACKET=24, CLOSE_BRACKET=25, 
		SINGLE_BAR=26, COMMENT_START=27, LYRIC_START=28, BLANK_SYLLABLE=29, SYLLABLE_JOINER=30, 
		SYLLABLE_EXTENDER=31, LYRIC_HYPHEN=32, LYRIC_BARLINE=33, NONBASENOTE=34, 
		PUNCTUATION=35, OTHER_CHAR=36;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "BASE", "'z'", "INTEGER", "NEWLINE", "'='", 
		"'/'", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"KEY_TOKEN", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", "'(2'", 
		"'(3'", "'(4'", "BAR_LINE", "'['", "']'", "SINGLE_BAR", "'%'", "'w:'", 
		"BLANK_SYLLABLE", "SYLLABLE_JOINER", "SYLLABLE_EXTENDER", "LYRIC_HYPHEN", 
		"LYRIC_BARLINE", "NONBASENOTE", "PUNCTUATION", "OTHER_CHAR"
	};
	public static final int
		RULE_string = 0, RULE_comment = 1, RULE_eol = 2, RULE_abc_tune = 3, RULE_abc_header = 4, 
		RULE_field_track_number = 5, RULE_field_title = 6, RULE_field_key = 7, 
		RULE_field_composer = 8, RULE_field_default_length = 9, RULE_field_meter = 10, 
		RULE_field_tempo = 11, RULE_field_voice = 12, RULE_field_optional = 13, 
		RULE_tempo = 14, RULE_abc_music = 15, RULE_voice = 16, RULE_syllable = 17, 
		RULE_lyric_barline = 18, RULE_lyric = 19, RULE_tune = 20, RULE_chord = 21, 
		RULE_accidental = 22, RULE_key_signature = 23, RULE_note = 24, RULE_fraction = 25, 
		RULE_tuplet = 26, RULE_duplet = 27, RULE_triplet = 28, RULE_quadruplet = 29, 
		RULE_pitch = 30, RULE_bar_line = 31;
	public static final String[] ruleNames = {
		"string", "comment", "eol", "abc_tune", "abc_header", "field_track_number", 
		"field_title", "field_key", "field_composer", "field_default_length", 
		"field_meter", "field_tempo", "field_voice", "field_optional", "tempo", 
		"abc_music", "voice", "syllable", "lyric_barline", "lyric", "tune", "chord", 
		"accidental", "key_signature", "note", "fraction", "tuplet", "duplet", 
		"triplet", "quadruplet", "pitch", "bar_line"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    public boolean inKey, inHeader, inMeter, inLyric, inVoice;
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
		public List<TerminalNode> OTHER_CHAR() { return getTokens(ABCMusicParser.OTHER_CHAR); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(ABCMusicParser.PUNCTUATION, i);
		}
		public List<TerminalNode> REST() { return getTokens(ABCMusicParser.REST); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
		public TerminalNode OTHER_CHAR(int i) {
			return getToken(ABCMusicParser.OTHER_CHAR, i);
		}
		public TerminalNode BASE(int i) {
			return getToken(ABCMusicParser.BASE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << INTEGER) | (1L << OCTAVE) | (1L << NONBASENOTE) | (1L << PUNCTUATION) | (1L << OTHER_CHAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
			setState(69); match(COMMENT_START);
			setState(71);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << INTEGER) | (1L << OCTAVE) | (1L << NONBASENOTE) | (1L << PUNCTUATION) | (1L << OTHER_CHAR))) != 0)) {
				{
				setState(70); string();
				}
			}

			setState(73); match(NEWLINE);
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
			setState(77);
			switch (_input.LA(1)) {
			case COMMENT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(NEWLINE);
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
			setState(79); abc_header();
			setState(80); abc_music();
			setState(81); match(EOF);
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
		public Field_track_numberContext field_track_number() {
			return getRuleContext(Field_track_numberContext.class,0);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Field_optionalContext field_optional(int i) {
			return getRuleContext(Field_optionalContext.class,i);
		}
		public List<Field_optionalContext> field_optional() {
			return getRuleContexts(Field_optionalContext.class);
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
			setState(83); field_track_number();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_START) {
				{
				{
				setState(84); comment();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); field_title();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER_START) | (1L << DEFAULT_LENGTH_START) | (1L << METER_START) | (1L << TEMPO_START) | (1L << VOICE_START) | (1L << COMMENT_START))) != 0)) {
				{
				{
				setState(91); field_optional();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); field_key();
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
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode TRACK_NUMBER_START() { return getToken(ABCMusicParser.TRACK_NUMBER_START, 0); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
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
			setState(99); match(TRACK_NUMBER_START);
			setState(101);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(100); match(WHITESPACE);
				}
			}

			setState(103); match(INTEGER);
			setState(105);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(104); match(WHITESPACE);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(107); eol();
					}
					} 
				}
				setState(112);
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

	public static class Field_titleContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public TerminalNode TITLE_START() { return getToken(ABCMusicParser.TITLE_START, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(TITLE_START);
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114); match(WHITESPACE);
				}
				break;
			}
			setState(117); string();
			setState(119);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(118); match(WHITESPACE);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(121); eol();
					}
					} 
				}
				setState(126);
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

	public static class Field_keyContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
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
			setState(127); match(KEY_START);
			setState(129);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(128); match(WHITESPACE);
				}
			}

			setState(131); key_signature();
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(132); match(WHITESPACE);
				}
				break;
			}
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(135); eol();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode COMPOSER_START() { return getToken(ABCMusicParser.COMPOSER_START, 0); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(COMPOSER_START);
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(142); match(WHITESPACE);
				}
				break;
			}
			setState(145); string();
			setState(147);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(146); match(WHITESPACE);
				}
			}

			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode DEFAULT_LENGTH_START() { return getToken(ABCMusicParser.DEFAULT_LENGTH_START, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
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
			setState(155); match(DEFAULT_LENGTH_START);
			setState(157);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(156); match(WHITESPACE);
				}
			}

			setState(159); fraction();
			setState(161);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(160); match(WHITESPACE);
				}
			}

			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(163); eol();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public TerminalNode METER_START() { return getToken(ABCMusicParser.METER_START, 0); }
		public TerminalNode NON_FRACTION_METER() { return getToken(ABCMusicParser.NON_FRACTION_METER, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(METER_START);
			setState(171);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(170); match(WHITESPACE);
				}
			}

			setState(175);
			switch (_input.LA(1)) {
			case NON_FRACTION_METER:
				{
				setState(173); match(NON_FRACTION_METER);
				}
				break;
			case INTEGER:
			case OVER:
				{
				setState(174); fraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(177); match(WHITESPACE);
				}
			}

			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(180); eol();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public TerminalNode TEMPO_START() { return getToken(ABCMusicParser.TEMPO_START, 0); }
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(TEMPO_START);
			setState(188);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(187); match(WHITESPACE);
				}
			}

			setState(190); tempo();
			setState(192);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(191); match(WHITESPACE);
				}
			}

			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(194); eol();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(VOICE_START);
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(201); match(WHITESPACE);
				}
				break;
			}
			setState(204); string();
			setState(206);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(205); match(WHITESPACE);
				}
			}

			setState(209); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(208); eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Field_optionalContext extends ParserRuleContext {
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
		public Field_optionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_optional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_optional(this);
		}
	}

	public final Field_optionalContext field_optional() throws RecognitionException {
		Field_optionalContext _localctx = new Field_optionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field_optional);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case COMPOSER_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); field_composer();
				}
				break;
			case DEFAULT_LENGTH_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); field_default_length();
				}
				break;
			case METER_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); field_meter();
				}
				break;
			case TEMPO_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(216); field_tempo();
				}
				break;
			case VOICE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(217); field_voice();
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 6);
				{
				setState(218); comment();
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
		enterRule(_localctx, 28, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); fraction();
			setState(222); match(EQUALS);
			setState(223); match(INTEGER);
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
			setState(229); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(226);
					_la = _input.LA(1);
					if (_la==VOICE_START) {
						{
						setState(225); field_voice();
						}
					}

					setState(228); voice();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==COMMENT_START) {
				{
				{
				setState(233); eol();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 32, RULE_voice);
		try {
			int _alt;
			setState(250);
			switch (_input.LA(1)) {
			case WHITESPACE:
			case BASE:
			case REST:
			case EQUALS:
			case ACCIDENTAL_TYPE:
			case DUPLET_START:
			case TRIPLET_START:
			case QUADRUPLET_START:
			case BAR_LINE:
			case OPEN_BRACKET:
			case SINGLE_BAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(245); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(239); tune();
						setState(243);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(240); eol();
							setState(241); lyric();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); comment();
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

	public static class SyllableContext extends ParserRuleContext {
		public List<TerminalNode> PUNCTUATION() { return getTokens(ABCMusicParser.PUNCTUATION); }
		public List<TerminalNode> OTHER_CHAR() { return getTokens(ABCMusicParser.OTHER_CHAR); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(ABCMusicParser.PUNCTUATION, i);
		}
		public List<TerminalNode> REST() { return getTokens(ABCMusicParser.REST); }
		public TerminalNode OTHER_CHAR(int i) {
			return getToken(ABCMusicParser.OTHER_CHAR, i);
		}
		public List<TerminalNode> SYLLABLE_JOINER() { return getTokens(ABCMusicParser.SYLLABLE_JOINER); }
		public TerminalNode BASE(int i) {
			return getToken(ABCMusicParser.BASE, i);
		}
		public TerminalNode SYLLABLE_EXTENDER(int i) {
			return getToken(ABCMusicParser.SYLLABLE_EXTENDER, i);
		}
		public List<TerminalNode> OCTAVE() { return getTokens(ABCMusicParser.OCTAVE); }
		public List<TerminalNode> BASE() { return getTokens(ABCMusicParser.BASE); }
		public TerminalNode OCTAVE(int i) {
			return getToken(ABCMusicParser.OCTAVE, i);
		}
		public TerminalNode NONBASENOTE(int i) {
			return getToken(ABCMusicParser.NONBASENOTE, i);
		}
		public TerminalNode SYLLABLE_JOINER(int i) {
			return getToken(ABCMusicParser.SYLLABLE_JOINER, i);
		}
		public TerminalNode ACCIDENTAL_TYPE(int i) {
			return getToken(ABCMusicParser.ACCIDENTAL_TYPE, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ABCMusicParser.EQUALS); }
		public List<TerminalNode> SYLLABLE_EXTENDER() { return getTokens(ABCMusicParser.SYLLABLE_EXTENDER); }
		public TerminalNode EQUALS(int i) {
			return getToken(ABCMusicParser.EQUALS, i);
		}
		public List<TerminalNode> NONBASENOTE() { return getTokens(ABCMusicParser.NONBASENOTE); }
		public TerminalNode REST(int i) {
			return getToken(ABCMusicParser.REST, i);
		}
		public List<TerminalNode> ACCIDENTAL_TYPE() { return getTokens(ABCMusicParser.ACCIDENTAL_TYPE); }
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
		enterRule(_localctx, 34, RULE_syllable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(252);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << REST) | (1L << EQUALS) | (1L << OCTAVE) | (1L << ACCIDENTAL_TYPE) | (1L << SYLLABLE_JOINER) | (1L << SYLLABLE_EXTENDER) | (1L << NONBASENOTE) | (1L << PUNCTUATION) | (1L << OTHER_CHAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class Lyric_barlineContext extends ParserRuleContext {
		public TerminalNode LYRIC_BARLINE() { return getToken(ABCMusicParser.LYRIC_BARLINE, 0); }
		public Lyric_barlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric_barline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric_barline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric_barline(this);
		}
	}

	public final Lyric_barlineContext lyric_barline() throws RecognitionException {
		Lyric_barlineContext _localctx = new Lyric_barlineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lyric_barline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(LYRIC_BARLINE);
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
		public TerminalNode LYRIC_HYPHEN(int i) {
			return getToken(ABCMusicParser.LYRIC_HYPHEN, i);
		}
		public List<TerminalNode> LYRIC_HYPHEN() { return getTokens(ABCMusicParser.LYRIC_HYPHEN); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
		public SyllableContext syllable(int i) {
			return getRuleContext(SyllableContext.class,i);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public Lyric_barlineContext lyric_barline(int i) {
			return getRuleContext(Lyric_barlineContext.class,i);
		}
		public List<SyllableContext> syllable() {
			return getRuleContexts(SyllableContext.class);
		}
		public TerminalNode LYRIC_START() { return getToken(ABCMusicParser.LYRIC_START, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public List<TerminalNode> BLANK_SYLLABLE() { return getTokens(ABCMusicParser.BLANK_SYLLABLE); }
		public List<Lyric_barlineContext> lyric_barline() {
			return getRuleContexts(Lyric_barlineContext.class);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public TerminalNode BLANK_SYLLABLE(int i) {
			return getToken(ABCMusicParser.BLANK_SYLLABLE, i);
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
		enterRule(_localctx, 38, RULE_lyric);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(LYRIC_START);
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(260); match(WHITESPACE);
				}
				break;
			}
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(268);
					switch (_input.LA(1)) {
					case BASE:
					case REST:
					case EQUALS:
					case OCTAVE:
					case ACCIDENTAL_TYPE:
					case SYLLABLE_JOINER:
					case SYLLABLE_EXTENDER:
					case NONBASENOTE:
					case PUNCTUATION:
					case OTHER_CHAR:
						{
						setState(263); syllable();
						}
						break;
					case LYRIC_HYPHEN:
						{
						setState(264); match(LYRIC_HYPHEN);
						}
						break;
					case LYRIC_BARLINE:
						{
						setState(265); lyric_barline();
						}
						break;
					case BLANK_SYLLABLE:
						{
						setState(266); match(BLANK_SYLLABLE);
						}
						break;
					case WHITESPACE:
						{
						setState(267); match(WHITESPACE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(273); eol();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class TuneContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public TupletContext tuplet(int i) {
			return getRuleContext(TupletContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public List<Bar_lineContext> bar_line() {
			return getRuleContexts(Bar_lineContext.class);
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
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public Bar_lineContext bar_line(int i) {
			return getRuleContext(Bar_lineContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_tune);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(283);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(279); chord();
						}
						break;

					case 2:
						{
						setState(280); tuplet();
						}
						break;

					case 3:
						{
						setState(281); bar_line();
						}
						break;

					case 4:
						{
						setState(282); match(WHITESPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(287); eol();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode OPEN_BRACKET() { return getToken(ABCMusicParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(ABCMusicParser.CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 42, RULE_chord);
		int _la;
		try {
			setState(305);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(OPEN_BRACKET);
				setState(294); note();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << EQUALS) | (1L << ACCIDENTAL_TYPE))) != 0)) {
					{
					setState(297);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(295); match(WHITESPACE);
						}
						break;
					case BASE:
					case REST:
					case EQUALS:
					case ACCIDENTAL_TYPE:
						{
						setState(296); note();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302); match(CLOSE_BRACKET);
				}
				break;
			case BASE:
			case REST:
			case EQUALS:
			case ACCIDENTAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); note();
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
		enterRule(_localctx, 44, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
		public TerminalNode KEY_TOKEN() { return getToken(ABCMusicParser.KEY_TOKEN, 0); }
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
		enterRule(_localctx, 46, RULE_key_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(KEY_TOKEN);
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
		enterRule(_localctx, 48, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			switch (_input.LA(1)) {
			case BASE:
			case EQUALS:
			case ACCIDENTAL_TYPE:
				{
				setState(311); pitch();
				}
				break;
			case REST:
				{
				setState(312); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(315); match(INTEGER);
				}
				break;

			case 2:
				{
				setState(316); fraction();
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
		enterRule(_localctx, 50, RULE_fraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(319); match(INTEGER);
				}
			}

			setState(322); match(OVER);
			setState(324);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(323); match(INTEGER);
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
		enterRule(_localctx, 52, RULE_tuplet);
		try {
			setState(329);
			switch (_input.LA(1)) {
			case DUPLET_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); duplet();
				}
				break;
			case TRIPLET_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); triplet();
				}
				break;
			case QUADRUPLET_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); quadruplet();
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
		enterRule(_localctx, 54, RULE_duplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(DUPLET_START);
			setState(332); chord();
			setState(333); chord();
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
		enterRule(_localctx, 56, RULE_triplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(TRIPLET_START);
			setState(336); chord();
			setState(337); chord();
			setState(338); chord();
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
		enterRule(_localctx, 58, RULE_quadruplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(QUADRUPLET_START);
			setState(341); chord();
			setState(342); chord();
			setState(343); chord();
			setState(344); chord();
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
		enterRule(_localctx, 60, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if (_la==EQUALS || _la==ACCIDENTAL_TYPE) {
				{
				setState(346); accidental();
				}
			}

			setState(349); match(BASE);
			setState(351);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(350); match(OCTAVE);
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

	public static class Bar_lineContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ABCMusicParser.INTEGER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(ABCMusicParser.OPEN_BRACKET, 0); }
		public TerminalNode SINGLE_BAR() { return getToken(ABCMusicParser.SINGLE_BAR, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(ABCMusicParser.CLOSE_BRACKET, 0); }
		public TerminalNode BAR_LINE() { return getToken(ABCMusicParser.BAR_LINE, 0); }
		public Bar_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterBar_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitBar_line(this);
		}
	}

	public final Bar_lineContext bar_line() throws RecognitionException {
		Bar_lineContext _localctx = new Bar_lineContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bar_line);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); match(SINGLE_BAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354); match(BAR_LINE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355); match(OPEN_BRACKET);
				setState(356); match(SINGLE_BAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(357); match(OPEN_BRACKET);
				setState(358); match(INTEGER);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(359); match(SINGLE_BAR);
				setState(360); match(CLOSE_BRACKET);
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

	public static final String _serializedATN =
		"\2\3&\u016e\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\3\2\6\2D\n\2\r\2\16\2E\3\3\3\3\5\3J\n\3\3\3\3\3"+
		"\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6"+
		"\3\6\7\6_\n\6\f\6\16\6b\13\6\3\6\3\6\3\7\3\7\5\7h\n\7\3\7\3\7\5\7l\n\7"+
		"\3\7\7\7o\n\7\f\7\16\7r\13\7\3\b\3\b\5\bv\n\b\3\b\3\b\5\bz\n\b\3\b\7\b"+
		"}\n\b\f\b\16\b\u0080\13\b\3\t\3\t\5\t\u0084\n\t\3\t\3\t\5\t\u0088\n\t"+
		"\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\n\3\n\5\n\u0092\n\n\3\n\3\n\5"+
		"\n\u0096\n\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13\n\3\13\3\13\5\13\u00a0"+
		"\n\13\3\13\3\13\5\13\u00a4\n\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa"+
		"\13\13\3\f\3\f\5\f\u00ae\n\f\3\f\3\f\5\f\u00b2\n\f\3\f\5\f\u00b5\n\f\3"+
		"\f\7\f\u00b8\n\f\f\f\16\f\u00bb\13\f\3\r\3\r\5\r\u00bf\n\r\3\r\3\r\5\r"+
		"\u00c3\n\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\16\3\16\5\16\u00cd"+
		"\n\16\3\16\3\16\5\16\u00d1\n\16\3\16\6\16\u00d4\n\16\r\16\16\16\u00d5"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00de\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\5\21\u00e5\n\21\3\21\6\21\u00e8\n\21\r\21\16\21\u00e9\3\21\7\21\u00ed"+
		"\n\21\f\21\16\21\u00f0\13\21\3\22\3\22\3\22\3\22\5\22\u00f6\n\22\6\22"+
		"\u00f8\n\22\r\22\16\22\u00f9\3\22\5\22\u00fd\n\22\3\23\6\23\u0100\n\23"+
		"\r\23\16\23\u0101\3\24\3\24\3\25\3\25\5\25\u0108\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u010f\n\25\f\25\16\25\u0112\13\25\3\25\7\25\u0115\n\25\f"+
		"\25\16\25\u0118\13\25\3\26\3\26\3\26\3\26\6\26\u011e\n\26\r\26\16\26\u011f"+
		"\3\26\7\26\u0123\n\26\f\26\16\26\u0126\13\26\3\27\3\27\3\27\3\27\7\27"+
		"\u012c\n\27\f\27\16\27\u012f\13\27\3\27\3\27\3\27\5\27\u0134\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\5\32\u013c\n\32\3\32\3\32\5\32\u0140\n\32\3"+
		"\33\5\33\u0143\n\33\3\33\3\33\5\33\u0147\n\33\3\34\3\34\3\34\5\34\u014c"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \5 \u015e\n \3 \3 \5 \u0162\n \3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u016c\n!\3!\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@\2\5\5\3\6\24\24$&\7\4\5\b\b\24\25 !$&\4\b\b\25\25\u0193\2"+
		"C\3\2\2\2\4G\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\nU\3\2\2\2\fe\3\2\2\2\16s\3"+
		"\2\2\2\20\u0081\3\2\2\2\22\u008f\3\2\2\2\24\u009d\3\2\2\2\26\u00ab\3\2"+
		"\2\2\30\u00bc\3\2\2\2\32\u00ca\3\2\2\2\34\u00dd\3\2\2\2\36\u00df\3\2\2"+
		"\2 \u00e7\3\2\2\2\"\u00fc\3\2\2\2$\u00ff\3\2\2\2&\u0103\3\2\2\2(\u0105"+
		"\3\2\2\2*\u011d\3\2\2\2,\u0133\3\2\2\2.\u0135\3\2\2\2\60\u0137\3\2\2\2"+
		"\62\u013b\3\2\2\2\64\u0142\3\2\2\2\66\u014b\3\2\2\28\u014d\3\2\2\2:\u0151"+
		"\3\2\2\2<\u0156\3\2\2\2>\u015d\3\2\2\2@\u016b\3\2\2\2BD\t\2\2\2CB\3\2"+
		"\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GI\7\35\2\2HJ\5\2\2\2IH\3"+
		"\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\7\2\2L\5\3\2\2\2MP\5\4\3\2NP\7\7\2\2OM"+
		"\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\5\n\6\2RS\5 \21\2ST\7\1\2\2T\t\3\2\2\2"+
		"UY\5\f\7\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2"+
		"\2[Y\3\2\2\2\\`\5\16\b\2]_\5\34\17\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2ac\3\2\2\2b`\3\2\2\2cd\5\20\t\2d\13\3\2\2\2eg\7\n\2\2fh\7\3\2\2"+
		"gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\6\2\2jl\7\3\2\2kj\3\2\2\2kl\3\2\2\2"+
		"lp\3\2\2\2mo\5\6\4\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2"+
		"\2rp\3\2\2\2su\7\13\2\2tv\7\3\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\2"+
		"\2\2xz\7\3\2\2yx\3\2\2\2yz\3\2\2\2z~\3\2\2\2{}\5\6\4\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\17\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\7\21\2\2\u0082\u0084\7\3\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\5\60\31\2\u0086\u0088\7\3\2\2\u0087\u0086"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\6\4\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\21\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\7\f\2\2\u0090\u0092"+
		"\7\3\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\5\2\2\2\u0094\u0096\7\3\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u009a\3\2\2\2\u0097\u0099\5\6\4\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\23\3\2\2"+
		"\2\u009c\u009a\3\2\2\2\u009d\u009f\7\r\2\2\u009e\u00a0\7\3\2\2\u009f\u009e"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\5\64\33\2"+
		"\u00a2\u00a4\7\3\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8"+
		"\3\2\2\2\u00a5\u00a7\5\6\4\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00ad\7\16\2\2\u00ac\u00ae\7\3\2\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b2\7\23\2\2\u00b0\u00b2\5"+
		"\64\33\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b5\7\3\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\3\2"+
		"\2\2\u00b6\u00b8\5\6\4\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\27\3\2\2\2\u00bb\u00b9\3\2\2"+
		"\2\u00bc\u00be\7\17\2\2\u00bd\u00bf\7\3\2\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\5\36\20\2\u00c1\u00c3\7"+
		"\3\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\3\2\2\2\u00c4"+
		"\u00c6\5\6\4\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc"+
		"\7\20\2\2\u00cb\u00cd\7\3\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5\2\2\2\u00cf\u00d1\7\3\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\5\6\4\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\33\3\2\2\2\u00d7\u00de\5\22\n\2\u00d8\u00de\5\24\13\2\u00d9"+
		"\u00de\5\26\f\2\u00da\u00de\5\30\r\2\u00db\u00de\5\32\16\2\u00dc\u00de"+
		"\5\4\3\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd"+
		"\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\35\3\2\2"+
		"\2\u00df\u00e0\5\64\33\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\7\6\2\2\u00e2"+
		"\37\3\2\2\2\u00e3\u00e5\5\32\16\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e4\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\3\2"+
		"\2\2\u00eb\u00ed\5\6\4\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef!\3\2\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f1\u00f5\5*\26\2\u00f2\u00f3\5\6\4\2\u00f3\u00f4\5(\25\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f1\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\5\4\3\2\u00fc\u00f7\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd#\3\2\2\2\u00fe\u0100\t\3\2\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102%\3"+
		"\2\2\2\u0103\u0104\7#\2\2\u0104\'\3\2\2\2\u0105\u0107\7\36\2\2\u0106\u0108"+
		"\7\3\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0110\3\2\2\2\u0109"+
		"\u010f\5$\23\2\u010a\u010f\7\"\2\2\u010b\u010f\5&\24\2\u010c\u010f\7\37"+
		"\2\2\u010d\u010f\7\3\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0116\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0115\5\6\4\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117)\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011e\5,\27\2\u011a\u011e\5\66\34\2\u011b\u011e\5@!\2\u011c"+
		"\u011e\7\3\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u0123\5\6\4\2\u0122\u0121\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"+\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\32\2\2\u0128\u012d\5\62\32"+
		"\2\u0129\u012c\7\3\2\2\u012a\u012c\5\62\32\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\33\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0134\5\62\32\2\u0133\u0127\3\2\2\2\u0133\u0132\3"+
		"\2\2\2\u0134-\3\2\2\2\u0135\u0136\t\4\2\2\u0136/\3\2\2\2\u0137\u0138\7"+
		"\22\2\2\u0138\61\3\2\2\2\u0139\u013c\5> \2\u013a\u013c\7\5\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u0140\7\6\2\2\u013e"+
		"\u0140\5\64\33\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u0140\63\3\2\2\2\u0141\u0143\7\6\2\2\u0142\u0141\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\7\t\2\2\u0145\u0147\7\6"+
		"\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\65\3\2\2\2\u0148\u014c"+
		"\58\35\2\u0149\u014c\5:\36\2\u014a\u014c\5<\37\2\u014b\u0148\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\67\3\2\2\2\u014d\u014e\7\26\2"+
		"\2\u014e\u014f\5,\27\2\u014f\u0150\5,\27\2\u01509\3\2\2\2\u0151\u0152"+
		"\7\27\2\2\u0152\u0153\5,\27\2\u0153\u0154\5,\27\2\u0154\u0155\5,\27\2"+
		"\u0155;\3\2\2\2\u0156\u0157\7\30\2\2\u0157\u0158\5,\27\2\u0158\u0159\5"+
		",\27\2\u0159\u015a\5,\27\2\u015a\u015b\5,\27\2\u015b=\3\2\2\2\u015c\u015e"+
		"\5.\30\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\7\4\2\2\u0160\u0162\7\24\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3"+
		"\2\2\2\u0162?\3\2\2\2\u0163\u016c\7\34\2\2\u0164\u016c\7\31\2\2\u0165"+
		"\u0166\7\32\2\2\u0166\u016c\7\34\2\2\u0167\u0168\7\32\2\2\u0168\u016c"+
		"\7\6\2\2\u0169\u016a\7\34\2\2\u016a\u016c\7\33\2\2\u016b\u0163\3\2\2\2"+
		"\u016b\u0164\3\2\2\2\u016b\u0165\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016cA\3\2\2\2:EIOY`gkpuy~\u0083\u0087\u008c\u0091\u0095\u009a"+
		"\u009f\u00a3\u00a8\u00ad\u00b1\u00b4\u00b9\u00be\u00c2\u00c7\u00cc\u00d0"+
		"\u00d5\u00dd\u00e4\u00e9\u00ee\u00f5\u00f9\u00fc\u0101\u0107\u010e\u0110"+
		"\u0116\u011d\u011f\u0124\u012b\u012d\u0133\u013b\u013f\u0142\u0146\u014b"+
		"\u015d\u0161\u016b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}