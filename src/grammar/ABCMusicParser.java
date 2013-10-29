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
		SINGLE_BAR=26, COMMENT_START=27, LYRIC_START=28, LYRIC_MODIFIER=29, LYRIC_SEPARATOR=30, 
		NONBASENOTE=31, PUNCTUATION=32, OTHER_CHAR=33;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "BASE", "'z'", "INTEGER", "NEWLINE", "'='", 
		"'/'", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"KEY_TOKEN", "NON_FRACTION_METER", "OCTAVE", "ACCIDENTAL_TYPE", "'(2'", 
		"'(3'", "'(4'", "BAR_LINE", "'['", "']'", "SINGLE_BAR", "'%'", "'w:'", 
		"LYRIC_MODIFIER", "LYRIC_SEPARATOR", "NONBASENOTE", "PUNCTUATION", "OTHER_CHAR"
	};
	public static final int
		RULE_string = 0, RULE_comment = 1, RULE_eol = 2, RULE_abc_tune = 3, RULE_abc_header = 4, 
		RULE_field_track_number = 5, RULE_field_title = 6, RULE_field_key = 7, 
		RULE_field_composer = 8, RULE_field_default_length = 9, RULE_field_meter = 10, 
		RULE_field_tempo = 11, RULE_field_voice = 12, RULE_field_optional = 13, 
		RULE_tempo = 14, RULE_abc_music = 15, RULE_voice = 16, RULE_syllable = 17, 
		RULE_lyric = 18, RULE_tune = 19, RULE_chord = 20, RULE_accidental = 21, 
		RULE_key_signature = 22, RULE_note = 23, RULE_fraction = 24, RULE_tuplet = 25, 
		RULE_duplet = 26, RULE_triplet = 27, RULE_quadruplet = 28, RULE_pitch = 29, 
		RULE_bar_line = 30;
	public static final String[] ruleNames = {
		"string", "comment", "eol", "abc_tune", "abc_header", "field_track_number", 
		"field_title", "field_key", "field_composer", "field_default_length", 
		"field_meter", "field_tempo", "field_voice", "field_optional", "tempo", 
		"abc_music", "voice", "syllable", "lyric", "tune", "chord", "accidental", 
		"key_signature", "note", "fraction", "tuplet", "duplet", "triplet", "quadruplet", 
		"pitch", "bar_line"
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
			setState(63); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
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
				setState(65); 
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
			setState(67); match(COMMENT_START);
			setState(69);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << INTEGER) | (1L << OCTAVE) | (1L << NONBASENOTE) | (1L << PUNCTUATION) | (1L << OTHER_CHAR))) != 0)) {
				{
				setState(68); string();
				}
			}

			setState(71); match(NEWLINE);
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
			setState(75);
			switch (_input.LA(1)) {
			case COMMENT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); match(NEWLINE);
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
			setState(77); abc_header();
			setState(78); abc_music();
			setState(79); match(EOF);
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
			setState(81); field_track_number();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_START) {
				{
				{
				setState(82); comment();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); field_title();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER_START) | (1L << DEFAULT_LENGTH_START) | (1L << METER_START) | (1L << TEMPO_START) | (1L << VOICE_START) | (1L << COMMENT_START))) != 0)) {
				{
				{
				setState(89); field_optional();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95); field_key();
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
			setState(97); match(TRACK_NUMBER_START);
			setState(99);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(98); match(WHITESPACE);
				}
			}

			setState(101); match(INTEGER);
			setState(103);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(102); match(WHITESPACE);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(105); eol();
					}
					} 
				}
				setState(110);
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
			setState(111); match(TITLE_START);
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(112); match(WHITESPACE);
				}
				break;
			}
			setState(115); string();
			setState(117);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(116); match(WHITESPACE);
				}
			}

			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(119); eol();
					}
					} 
				}
				setState(124);
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
			setState(125); match(KEY_START);
			setState(127);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(126); match(WHITESPACE);
				}
			}

			setState(129); key_signature();
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(130); match(WHITESPACE);
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(139); match(COMPOSER_START);
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(140); match(WHITESPACE);
				}
				break;
			}
			setState(143); string();
			setState(145);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(144); match(WHITESPACE);
				}
			}

			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(147); eol();
					}
					} 
				}
				setState(152);
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
			setState(153); match(DEFAULT_LENGTH_START);
			setState(155);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(154); match(WHITESPACE);
				}
			}

			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(157); fraction();
				setState(158); match(EQUALS);
				}
				break;
			}
			setState(162); fraction();
			setState(164);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(163); match(WHITESPACE);
				}
			}

			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(166); eol();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(172); match(METER_START);
			setState(174);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(173); match(WHITESPACE);
				}
			}

			setState(178);
			switch (_input.LA(1)) {
			case NON_FRACTION_METER:
				{
				setState(176); match(NON_FRACTION_METER);
				}
				break;
			case INTEGER:
			case OVER:
				{
				setState(177); fraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(180); match(WHITESPACE);
				}
			}

			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(183); eol();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			setState(189); match(TEMPO_START);
			setState(191);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(190); match(WHITESPACE);
				}
			}

			setState(193); tempo();
			setState(195);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(194); match(WHITESPACE);
				}
			}

			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); eol();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(203); match(VOICE_START);
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(204); match(WHITESPACE);
				}
				break;
			}
			setState(207); string();
			setState(209);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(208); match(WHITESPACE);
				}
			}

			setState(212); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(211); eol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			setState(222);
			switch (_input.LA(1)) {
			case COMPOSER_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); field_composer();
				}
				break;
			case DEFAULT_LENGTH_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); field_default_length();
				}
				break;
			case METER_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); field_meter();
				}
				break;
			case TEMPO_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(219); field_tempo();
				}
				break;
			case VOICE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(220); field_voice();
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 6);
				{
				setState(221); comment();
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
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(224); fraction();
				setState(225); match(EQUALS);
				}
				break;
			}
			setState(229); match(INTEGER);
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
			setState(235); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(232);
					_la = _input.LA(1);
					if (_la==VOICE_START) {
						{
						setState(231); field_voice();
						}
					}

					setState(234); voice();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(237); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==COMMENT_START) {
				{
				{
				setState(239); eol();
				}
				}
				setState(244);
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
			setState(256);
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
				setState(251); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(245); tune();
						setState(249);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(246); eol();
							setState(247); lyric();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(253); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case COMMENT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); comment();
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
		public List<TerminalNode> LYRIC_SEPARATOR() { return getTokens(ABCMusicParser.LYRIC_SEPARATOR); }
		public List<TerminalNode> OTHER_CHAR() { return getTokens(ABCMusicParser.OTHER_CHAR); }
		public TerminalNode LYRIC_MODIFIER(int i) {
			return getToken(ABCMusicParser.LYRIC_MODIFIER, i);
		}
		public List<TerminalNode> LYRIC_MODIFIER() { return getTokens(ABCMusicParser.LYRIC_MODIFIER); }
		public TerminalNode LYRIC_SEPARATOR(int i) {
			return getToken(ABCMusicParser.LYRIC_SEPARATOR, i);
		}
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
			setState(259); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(258);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE) | (1L << REST) | (1L << EQUALS) | (1L << OCTAVE) | (1L << ACCIDENTAL_TYPE) | (1L << LYRIC_MODIFIER) | (1L << NONBASENOTE) | (1L << PUNCTUATION) | (1L << OTHER_CHAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					_la = _input.LA(1);
					if ( !(_la==WHITESPACE || _la==LYRIC_SEPARATOR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 36, RULE_lyric);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269); match(LYRIC_START);
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(270); match(WHITESPACE);
				}
				break;
			}
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(273); syllable();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(279); eol();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 38, RULE_tune);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(289);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(285); chord();
						}
						break;

					case 2:
						{
						setState(286); tuplet();
						}
						break;

					case 3:
						{
						setState(287); bar_line();
						}
						break;

					case 4:
						{
						setState(288); match(WHITESPACE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(293); eol();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 40, RULE_chord);
		int _la;
		try {
			setState(311);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(299); match(OPEN_BRACKET);
				setState(300); note();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BASE) | (1L << REST) | (1L << EQUALS) | (1L << ACCIDENTAL_TYPE))) != 0)) {
					{
					setState(303);
					switch (_input.LA(1)) {
					case WHITESPACE:
						{
						setState(301); match(WHITESPACE);
						}
						break;
					case BASE:
					case REST:
					case EQUALS:
					case ACCIDENTAL_TYPE:
						{
						setState(302); note();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308); match(CLOSE_BRACKET);
				}
				break;
			case BASE:
			case REST:
			case EQUALS:
			case ACCIDENTAL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); note();
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
			setState(313);
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
		enterRule(_localctx, 44, RULE_key_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(KEY_TOKEN);
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
			setState(319);
			switch (_input.LA(1)) {
			case BASE:
			case EQUALS:
			case ACCIDENTAL_TYPE:
				{
				setState(317); pitch();
				}
				break;
			case REST:
				{
				setState(318); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(321); match(INTEGER);
				}
				break;

			case 2:
				{
				setState(322); fraction();
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
			setState(326);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(325); match(INTEGER);
				}
			}

			setState(328); match(OVER);
			setState(330);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(329); match(INTEGER);
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
			setState(335);
			switch (_input.LA(1)) {
			case DUPLET_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); duplet();
				}
				break;
			case TRIPLET_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(333); triplet();
				}
				break;
			case QUADRUPLET_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(334); quadruplet();
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
			setState(337); match(DUPLET_START);
			setState(338); chord();
			setState(339); chord();
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
			setState(341); match(TRIPLET_START);
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
			setState(346); match(QUADRUPLET_START);
			setState(347); chord();
			setState(348); chord();
			setState(349); chord();
			setState(350); chord();
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
			setState(353);
			_la = _input.LA(1);
			if (_la==EQUALS || _la==ACCIDENTAL_TYPE) {
				{
				setState(352); accidental();
				}
			}

			setState(355); match(BASE);
			setState(357);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(356); match(OCTAVE);
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
		enterRule(_localctx, 60, RULE_bar_line);
		try {
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359); match(SINGLE_BAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); match(BAR_LINE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361); match(OPEN_BRACKET);
				setState(362); match(SINGLE_BAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363); match(OPEN_BRACKET);
				setState(364); match(INTEGER);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(365); match(SINGLE_BAR);
				setState(366); match(CLOSE_BRACKET);
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
		"\2\3#\u0174\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \3\2\6\2B\n\2\r\2\16\2C\3\3\3\3\5\3H\n\3\3\3\3\3\3\4\3"+
		"\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\7"+
		"\6]\n\6\f\6\16\6`\13\6\3\6\3\6\3\7\3\7\5\7f\n\7\3\7\3\7\5\7j\n\7\3\7\7"+
		"\7m\n\7\f\7\16\7p\13\7\3\b\3\b\5\bt\n\b\3\b\3\b\5\bx\n\b\3\b\7\b{\n\b"+
		"\f\b\16\b~\13\b\3\t\3\t\5\t\u0082\n\t\3\t\3\t\5\t\u0086\n\t\3\t\7\t\u0089"+
		"\n\t\f\t\16\t\u008c\13\t\3\n\3\n\5\n\u0090\n\n\3\n\3\n\5\n\u0094\n\n\3"+
		"\n\7\n\u0097\n\n\f\n\16\n\u009a\13\n\3\13\3\13\5\13\u009e\n\13\3\13\3"+
		"\13\3\13\5\13\u00a3\n\13\3\13\3\13\5\13\u00a7\n\13\3\13\7\13\u00aa\n\13"+
		"\f\13\16\13\u00ad\13\13\3\f\3\f\5\f\u00b1\n\f\3\f\3\f\5\f\u00b5\n\f\3"+
		"\f\5\f\u00b8\n\f\3\f\7\f\u00bb\n\f\f\f\16\f\u00be\13\f\3\r\3\r\5\r\u00c2"+
		"\n\r\3\r\3\r\5\r\u00c6\n\r\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc\13\r\3\16"+
		"\3\16\5\16\u00d0\n\16\3\16\3\16\5\16\u00d4\n\16\3\16\6\16\u00d7\n\16\r"+
		"\16\16\16\u00d8\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e1\n\17\3\20\3\20"+
		"\3\20\5\20\u00e6\n\20\3\20\3\20\3\21\5\21\u00eb\n\21\3\21\6\21\u00ee\n"+
		"\21\r\21\16\21\u00ef\3\21\7\21\u00f3\n\21\f\21\16\21\u00f6\13\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00fc\n\22\6\22\u00fe\n\22\r\22\16\22\u00ff\3\22"+
		"\5\22\u0103\n\22\3\23\6\23\u0106\n\23\r\23\16\23\u0107\3\23\7\23\u010b"+
		"\n\23\f\23\16\23\u010e\13\23\3\24\3\24\5\24\u0112\n\24\3\24\7\24\u0115"+
		"\n\24\f\24\16\24\u0118\13\24\3\24\7\24\u011b\n\24\f\24\16\24\u011e\13"+
		"\24\3\25\3\25\3\25\3\25\6\25\u0124\n\25\r\25\16\25\u0125\3\25\7\25\u0129"+
		"\n\25\f\25\16\25\u012c\13\25\3\26\3\26\3\26\3\26\7\26\u0132\n\26\f\26"+
		"\16\26\u0135\13\26\3\26\3\26\3\26\5\26\u013a\n\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\5\31\u0142\n\31\3\31\3\31\5\31\u0146\n\31\3\32\5\32\u0149\n"+
		"\32\3\32\3\32\5\32\u014d\n\32\3\33\3\33\3\33\5\33\u0152\n\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\5\37\u0164\n\37\3\37\3\37\5\37\u0168\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u0172\n \3 \2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>\2\6\5\3\6\24\24!#\7\4\5\b\b\24\25\37\37!#\4\3\3  \4\b\b\25"+
		"\25\u0199\2A\3\2\2\2\4E\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nS\3\2\2\2\fc\3"+
		"\2\2\2\16q\3\2\2\2\20\177\3\2\2\2\22\u008d\3\2\2\2\24\u009b\3\2\2\2\26"+
		"\u00ae\3\2\2\2\30\u00bf\3\2\2\2\32\u00cd\3\2\2\2\34\u00e0\3\2\2\2\36\u00e5"+
		"\3\2\2\2 \u00ed\3\2\2\2\"\u0102\3\2\2\2$\u0105\3\2\2\2&\u010f\3\2\2\2"+
		"(\u0123\3\2\2\2*\u0139\3\2\2\2,\u013b\3\2\2\2.\u013d\3\2\2\2\60\u0141"+
		"\3\2\2\2\62\u0148\3\2\2\2\64\u0151\3\2\2\2\66\u0153\3\2\2\28\u0157\3\2"+
		"\2\2:\u015c\3\2\2\2<\u0163\3\2\2\2>\u0171\3\2\2\2@B\t\2\2\2A@\3\2\2\2"+
		"BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EG\7\35\2\2FH\5\2\2\2GF\3\2\2"+
		"\2GH\3\2\2\2HI\3\2\2\2IJ\7\7\2\2J\5\3\2\2\2KN\5\4\3\2LN\7\7\2\2MK\3\2"+
		"\2\2ML\3\2\2\2N\7\3\2\2\2OP\5\n\6\2PQ\5 \21\2QR\7\1\2\2R\t\3\2\2\2SW\5"+
		"\f\7\2TV\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3"+
		"\2\2\2Z^\5\16\b\2[]\5\34\17\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2"+
		"\2_a\3\2\2\2`^\3\2\2\2ab\5\20\t\2b\13\3\2\2\2ce\7\n\2\2df\7\3\2\2ed\3"+
		"\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7\6\2\2hj\7\3\2\2ih\3\2\2\2ij\3\2\2\2jn\3"+
		"\2\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\r\3\2\2\2pn"+
		"\3\2\2\2qs\7\13\2\2rt\7\3\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\5\2\2\2"+
		"vx\7\3\2\2wv\3\2\2\2wx\3\2\2\2x|\3\2\2\2y{\5\6\4\2zy\3\2\2\2{~\3\2\2\2"+
		"|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0081\7\21\2\2\u0080\u0082"+
		"\7\3\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\5.\30\2\u0084\u0086\7\3\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u008a\3\2\2\2\u0087\u0089\5\6\4\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\21\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u008f\7\f\2\2\u008e\u0090\7\3\2\2\u008f\u008e"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\5\2\2\2\u0092"+
		"\u0094\7\3\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098\3\2"+
		"\2\2\u0095\u0097\5\6\4\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\23\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009d\7\r\2\2\u009c\u009e\7\3\2\2\u009d\u009c\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a0\5\62\32\2\u00a0\u00a1\7\b\2\2"+
		"\u00a1\u00a3\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\5\62\32\2\u00a5\u00a7\7\3\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\5\6\4\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\16\2\2\u00af\u00b1\7\3\2"+
		"\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b5"+
		"\7\23\2\2\u00b3\u00b5\5\62\32\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2"+
		"\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\7\3\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\5\6\4\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\27\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7\17\2\2\u00c0\u00c2\7\3\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\5\36"+
		"\20\2\u00c4\u00c6\7\3\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00ca\3\2\2\2\u00c7\u00c9\5\6\4\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\31\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00cf\7\20\2\2\u00ce\u00d0\7\3\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5\2\2\2\u00d2\u00d4"+
		"\7\3\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d7\5\6\4\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\33\3\2\2\2\u00da\u00e1\5\22\n\2\u00db\u00e1"+
		"\5\24\13\2\u00dc\u00e1\5\26\f\2\u00dd\u00e1\5\30\r\2\u00de\u00e1\5\32"+
		"\16\2\u00df\u00e1\5\4\3\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0"+
		"\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e4\7\b\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\7\6\2\2\u00e8\37\3\2\2\2\u00e9\u00eb\5\32\16\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\5\""+
		"\22\2\u00ed\u00ea\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\5\6\4\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"!\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb\5(\25\2\u00f8\u00f9\5\6\4\2"+
		"\u00f9\u00fa\5&\24\2\u00fa\u00fc\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0103\5\4"+
		"\3\2\u0102\u00fd\3\2\2\2\u0102\u0101\3\2\2\2\u0103#\3\2\2\2\u0104\u0106"+
		"\t\3\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010c\3\2\2\2\u0109\u010b\t\4\2\2\u010a\u0109\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"%\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\7\36\2\2\u0110\u0112\7\3\2\2"+
		"\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\3\2\2\2\u0113\u0115"+
		"\5$\23\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\5\6"+
		"\4\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\'\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0124\5*\26\2"+
		"\u0120\u0124\5\64\33\2\u0121\u0124\5> \2\u0122\u0124\7\3\2\2\u0123\u011f"+
		"\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\3\2"+
		"\2\2\u0127\u0129\5\6\4\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b)\3\2\2\2\u012c\u012a\3\2\2\2"+
		"\u012d\u012e\7\32\2\2\u012e\u0133\5\60\31\2\u012f\u0132\7\3\2\2\u0130"+
		"\u0132\5\60\31\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7\33\2\2\u0137\u013a\3\2\2\2\u0138\u013a\5"+
		"\60\31\2\u0139\u012d\3\2\2\2\u0139\u0138\3\2\2\2\u013a+\3\2\2\2\u013b"+
		"\u013c\t\5\2\2\u013c-\3\2\2\2\u013d\u013e\7\22\2\2\u013e/\3\2\2\2\u013f"+
		"\u0142\5<\37\2\u0140\u0142\7\5\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0142\u0145\3\2\2\2\u0143\u0146\7\6\2\2\u0144\u0146\5\62\32\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\61\3\2\2"+
		"\2\u0147\u0149\7\6\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014c\7\t\2\2\u014b\u014d\7\6\2\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\63\3\2\2\2\u014e\u0152\5\66\34\2\u014f\u0152\58\35"+
		"\2\u0150\u0152\5:\36\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\65\3\2\2\2\u0153\u0154\7\26\2\2\u0154\u0155\5*\26\2\u0155"+
		"\u0156\5*\26\2\u0156\67\3\2\2\2\u0157\u0158\7\27\2\2\u0158\u0159\5*\26"+
		"\2\u0159\u015a\5*\26\2\u015a\u015b\5*\26\2\u015b9\3\2\2\2\u015c\u015d"+
		"\7\30\2\2\u015d\u015e\5*\26\2\u015e\u015f\5*\26\2\u015f\u0160\5*\26\2"+
		"\u0160\u0161\5*\26\2\u0161;\3\2\2\2\u0162\u0164\5,\27\2\u0163\u0162\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7\4\2\2\u0166"+
		"\u0168\7\24\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168=\3\2\2\2"+
		"\u0169\u0172\7\34\2\2\u016a\u0172\7\31\2\2\u016b\u016c\7\32\2\2\u016c"+
		"\u0172\7\34\2\2\u016d\u016e\7\32\2\2\u016e\u0172\7\6\2\2\u016f\u0170\7"+
		"\34\2\2\u0170\u0172\7\33\2\2\u0171\u0169\3\2\2\2\u0171\u016a\3\2\2\2\u0171"+
		"\u016b\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016f\3\2\2\2\u0172?\3\2\2\2"+
		"<CGMW^einsw|\u0081\u0085\u008a\u008f\u0093\u0098\u009d\u00a2\u00a6\u00ab"+
		"\u00b0\u00b4\u00b7\u00bc\u00c1\u00c5\u00ca\u00cf\u00d3\u00d8\u00e0\u00e5"+
		"\u00ea\u00ef\u00f4\u00fb\u00ff\u0102\u0107\u010c\u0111\u0116\u011c\u0123"+
		"\u0125\u012a\u0131\u0133\u0139\u0141\u0145\u0148\u014c\u0151\u0163\u0167"+
		"\u0171";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}