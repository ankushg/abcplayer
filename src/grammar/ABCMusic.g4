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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
 // General tokens
WHITESPACE              : [ \t]+;
BASE                    : {!inMeter && !inKey}? (BASENOTE);
fragment BASENOTE       : ('A'..'G' | 'a'..'g');

REST                    : 'z';
fragment DIGIT          : [0-9];
INTEGER                 : DIGIT+ {inMeter = false;};
NEWLINE                 : ('\r'|'\n')+ {inLyric = false; inVoice = false;};

EQUALS                  : '=';
OVER                    : '/';

// Header tokens

// Track number is the first Header field so we can set inHeader to true when we enter
TRACK_NUMBER_START      : 'X:' {inHeader = true;}; 
TITLE_START             : 'T:';
COMPOSER_START          : 'C:';
DEFAULT_LENGTH_START    : 'L:';
METER_START             : 'M:' {inMeter = true;};
TEMPO_START             : 'Q:';
VOICE_START             : 'V:' {inVoice = true;};
KEY_START               : 'K:' {inKey = true;}; 

// Key is the last header field so once it's done, we're not in the header anymore.
KEY_TOKEN               : {inKey}? BASENOTE KEY_ACCIDENTAL? MINOR_MOD? {inKey = false; inHeader = false;}; 

fragment MINOR_MOD      : 'm';
fragment KEY_ACCIDENTAL : ('#' | 'b');

NON_FRACTION_METER      : {inMeter}? ('C'
                        | 'C|') {inMeter = false;};

// Music tokens
OCTAVE                  : '\''+
                        | ','+;

ACCIDENTAL_TYPE         : {!inLyric}?
                        ( '^'
                        | '^^'
                        | '='
                        | '_'
                        | '__');

DUPLET_START            : '(2';
TRIPLET_START           : '(3';
QUADRUPLET_START        : '(4';

BAR_LINE                : '||'
                        | '[|'
                        | '|]'
                        | '|:'
                        | ':|'
                        | '[1'
                        | '[2';
                    
OPEN_BRACKET            :  '[' ;
CLOSE_BRACKET           :  ']';
       
                        
SINGLE_BAR              : {!inLyric}? '|';

COMMENT_START           : '%';

LYRIC_START             : 'w:' {inLyric = true;};
LYRIC_MODIFIER          : {inLyric}?
                        ( '_'
                        | '*'
                        | '~'
                        | '\\-'
                        );
                        
LYRIC_SEPARATOR         : {inLyric}? ('-' | '|')+;
                                          
NONBASENOTE             : {!inKey}? ('H'..'Z' | 'h'..'y');
PUNCTUATION             : '.'
                        | '('
                        | ')'
                        | '?';
// Catch-all for unrecognized characters. They're used only in strings in the parser.
OTHER_CHAR              : {!inKey && (inHeader || inVoice)}? .;   
                     


/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 */
// Generic parser rules
string          : (BASE | REST | PUNCTUATION | NONBASENOTE | INTEGER | WHITESPACE | OCTAVE | OTHER_CHAR)+;
comment         : COMMENT_START string? NEWLINE;
eol             : comment | NEWLINE;

// Root rule
abc_tune        : abc_header abc_music EOF;

// Header parser rules
abc_header              : field_track_number comment* field_title field_optional* field_key;

field_track_number      : TRACK_NUMBER_START WHITESPACE? INTEGER WHITESPACE? eol*;
field_title             : TITLE_START WHITESPACE? string WHITESPACE? eol*;
field_key               : KEY_START WHITESPACE? key_signature WHITESPACE? eol*;
field_composer          : COMPOSER_START WHITESPACE? string WHITESPACE? eol*;
field_default_length    : DEFAULT_LENGTH_START WHITESPACE? (fraction EQUALS)? fraction WHITESPACE? eol*;
field_meter             : METER_START WHITESPACE? (NON_FRACTION_METER | fraction) WHITESPACE? eol*;
field_tempo             : TEMPO_START WHITESPACE? tempo WHITESPACE? eol*;
field_voice             : VOICE_START WHITESPACE? string WHITESPACE? eol+;
field_optional          : field_composer
                        | field_default_length
                        | field_meter
                        | field_tempo
                        | field_voice
                        | comment;
                        
tempo                   : (fraction EQUALS)? INTEGER;


// Music parser rules
abc_music       : (field_voice? voice)+ eol*;

voice           : (tune (eol lyric)?)+
                | comment;
// Lyrics
syllable        : ( LYRIC_MODIFIER
                    | BASE
                    | NONBASENOTE
                    | PUNCTUATION
                    | REST
                    | ACCIDENTAL_TYPE
                    | EQUALS
                    | OCTAVE
                    | OTHER_CHAR
                  )+ (LYRIC_SEPARATOR|WHITESPACE)*;
lyric           : LYRIC_START WHITESPACE? syllable* eol*;

// Music
tune            : (chord | tuplet | bar_line | WHITESPACE)+ eol*;
chord           : OPEN_BRACKET note (WHITESPACE | note)* CLOSE_BRACKET
                | note;
accidental      : ACCIDENTAL_TYPE | EQUALS;
key_signature   : KEY_TOKEN ;
note            : (pitch | REST) (INTEGER | fraction)?;
fraction        : INTEGER? OVER INTEGER?;
tuplet          : duplet | triplet | quadruplet;
duplet          : DUPLET_START chord chord;
triplet         : TRIPLET_START chord chord chord;
quadruplet      : QUADRUPLET_START chord chord chord chord;
pitch           : accidental? BASE OCTAVE?;
bar_line        : SINGLE_BAR
                | BAR_LINE
                | OPEN_BRACKET SINGLE_BAR
                | OPEN_BRACKET INTEGER
                | SINGLE_BAR CLOSE_BRACKET;

// Old parser rules (not used in current parsetree, but kept in case we need to refer to them)
// measure         : (chord | tuplet)+ BAR_LINE;
// repeat          : (OPEN_REPEAT)? (measure)+ CLOSE_REPEAT;
// element         : tune | repeat | NTH_REPEAT;
// alt_ending	   : ;