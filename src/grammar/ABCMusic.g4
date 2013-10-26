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
STRING            : (BASENOTE | REST | 'H'..'Z' | 'h'..'y' | '.')+;

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

TUPLET_START            :    '(';

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

LYRIC                    :    LYRIC_START LYRICAL_ELEMENT*;
LYRIC_START              :    'w:';
fragment LYRICAL_ELEMENT :    ' '+
                         |    '-'
                         |    '_'
                         |    '*'
                         |    '~'
                         |    '\-'
                         |    '|'
                         |    STRING;

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 */


comment         : COMMENT_START STRING;
eol             : comment | NEWLINE;

abc_tune        : abc_header abc_music EOF;
abc_header      : field_track_number comment* field_title other_field* field_key;

field_track_number         : TRACK_NUMBER_START INTEGER eol*;
field_title                : TITLE_START (STRING|INTEGER)+ eol*;
field_key                  : KEY_START key_signature eol*;


field_composer          : COMPOSER_START STRING eol*;
field_default_length    : DEFAULT_LENGTH_START fraction eol*;
field_meter             : METER_START (NON_FRACTION_METER | fraction) eol*;
field_tempo             : TEMPO_START tempo eol*;
field_voice             : VOICE_START STRING eol*;
tempo                   : fraction EQUALS INTEGER;
other_field             : field_composer
                        | field_default_length
                        | field_meter
                        | field_tempo
                        | field_voice
                        | comment;

abc_music       : (abc_line NEWLINE*)+;
abc_line        : element+ NEWLINE* (LYRIC NEWLINE)?
                | field_voice
                | comment;
element         : measure | repeat | NTH_REPEAT;
measure         : (chord | tuplet)+ BAR_LINE;
repeat          : (OPEN_REPEAT)? (measure)+ CLOSE_REPEAT;
chord           : OPEN_CHORD note+ CLOSE_CHORD
                | note;
accidental      : ACCIDENTAL_TYPE;
key_signature   : BASENOTE KEY_ACCIDENTAL? MODEMINOR?;
note            : (pitch | REST) (INTEGER | fraction)?;
fraction        : INTEGER? OVER INTEGER?;
tuplet          : TUPLET_START INTEGER chord+;
pitch           : accidental? BASENOTE OCTAVE?;

//syllable      : ;
//voice         : element+;
//alt_ending	: ;