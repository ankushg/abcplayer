/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusic;

/*
 * This puts "package grammar;" at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
WHITESPACE        : [ \t]+ -> skip;
BASENOTE          : ('A'..'G' | 'a'..'g');
REST              : 'z';
fragment DIGIT    : [0-9];
INTEGER           : DIGIT+;
NEWLINE           : ('\r'|'\n')+;

EQUALS            : '=';
OVER              : '/';

// Header lexer rules
TRACK_NUMBER_START      : 'X:';
TITLE_START             : 'T:';
KEY_START               : 'K:';
COMPOSER_START          : 'C:';
DEFAULT_LENGTH_START    : 'L:';
METER_START             : 'M:';
TEMPO_START             : 'Q:';
VOICE_START             : 'V:';


KEY_ACCIDENTAL           :    ('#' | 'b');
MODEMINOR                :    'm';

NON_FRACTION_METER       :    'C'
                         |    'C|';

// Music rules
OCTAVE                  :    '\''+
                        |    ','+;

ACCIDENTAL_TYPE         : '^'
                        | '^^'
                        | '='
                        | '_'
                        | '__';

DUPLET_START            :    '(2';
TRIPLET_START            :    '(3';
QUADRUPLET_START         :    '(4';

OPEN_CHORD              :     '[';
CLOSE_CHORD             :     ']';


BAR_LINE                :    '|'
                        |    '||'
                        |    '[|'
                        |    '|]'
                        |     OPEN_REPEAT
                        |     CLOSE_REPEAT;

OPEN_REPEAT             :     '|:';
CLOSE_REPEAT            :    ':|';

NTH_REPEAT              :    '[1'
                        |    '[2';

COMMENT_START           :    '%';

LYRIC_START              :    'w:';
LYRIC_MODIFIER           :    '_'
                         |    '*'
                         |    '~'
                         |    '\\-'
                         |    '|';
LYRIC_SEPARATOR          :    '-'
                         |    ' ';                       
NONBASENOTE              :    ('H'..'Z' | 'h'..'y');
PUNCTUATION              :    '.';


/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 */

string          : (BASENOTE | REST | PUNCTUATION | NONBASENOTE | INTEGER)+;
comment         : COMMENT_START string;
eol             : comment | NEWLINE;

abc_tune        : abc_header abc_music EOF;
abc_header      : field_track_number comment* field_title other_field* field_key;

field_track_number         : TRACK_NUMBER_START INTEGER eol*;
field_title                : TITLE_START string eol*;
field_key                  : KEY_START key_signature eol*;


field_composer          : COMPOSER_START string eol*;
field_default_length    : DEFAULT_LENGTH_START fraction eol*;
field_meter             : METER_START (NON_FRACTION_METER | fraction) eol*;
field_tempo             : TEMPO_START tempo eol*;
field_voice             : VOICE_START string eol+;
tempo                   : fraction EQUALS INTEGER;
other_field             : field_composer
                        | field_default_length
                        | field_meter
                        | field_tempo
                        | field_voice
                        | comment;

abc_music       : (field_voice? voice NEWLINE*)+;
lyric_element   : (LYRIC_MODIFIER | BASENOTE | NONBASENOTE | PUNCTUATION | REST | WHITESPACE | MODEMINOR | ACCIDENTAL_TYPE)+ LYRIC_SEPARATOR? BAR_LINE?;
lyric           : LYRIC_START lyric_element* eol+;
voice           : (tune (eol lyric)?)+
                | comment;
// element         : tune | repeat | NTH_REPEAT;
tune             : (chord | tuplet | BAR_LINE | NTH_REPEAT)+ eol*;
// measure         : (chord | tuplet)+ BAR_LINE;
// repeat          : (OPEN_REPEAT)? (measure)+ CLOSE_REPEAT;
chord           : OPEN_CHORD note+ CLOSE_CHORD
                | note;
accidental      : ACCIDENTAL_TYPE;
key_signature   : BASENOTE KEY_ACCIDENTAL? MODEMINOR?;
note            : (pitch | REST) (INTEGER | fraction)?;
fraction        : INTEGER? OVER INTEGER?;
tuplet          : duplet | triplet | quadruplet;
duplet          : DUPLET_START chord chord;
triplet         : TRIPLET_START chord chord chord;
quadruplet      : QUADRUPLET_START chord chord chord chord;
pitch           : accidental? BASENOTE OCTAVE?;

//syllable      : ;
//alt_ending	: ;