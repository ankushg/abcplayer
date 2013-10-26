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
fragment BASENOTE				: ('A'..'G' | 'a'..'g');
fragment REST					: 'z';
fragment SPACE 			: [ \t]+;
fragment DIGIT 			: [0-9];
fragment INTEGER 		: DIGIT+;
fragment STRING 		: (BASENOTE | REST | 'H'..'Z' | 'h'..'y' | '.' | SPACE | INTEGER)+;
NEWLINE 				: ('\r'|'\n')+;
COMMENT 				: '%' STRING NEWLINE;
fragment EOL			: (COMMENT
						| NEWLINE);
WHITESPACE 	: [ \t]+ -> skip;

// Header lexer rules
FIELD_TRACK_NUMBER 		: 'X:' SPACE? INTEGER EOL;
FIELD_TITLE 			: 'T:' SPACE? STRING EOL;
FIELD_KEY 				: 'K:' SPACE? KEY EOL;

OTHER_FIELD 			: FIELD_COMPOSER
						| FIELD_DEFAULT_LENGTH
						| FIELD_METER
						| FIELD_TEMPO
						| FIELD_VOICE
						| COMMENT;
						
FIELD_COMPOSER 			: 'C:' SPACE? STRING EOL;
FIELD_DEFAULT_LENGTH 	: 'L:' SPACE? NOTE_LENGTH_STRICT EOL;
FIELD_METER 			: 'M:' SPACE? METER EOL;
FIELD_TEMPO 			: 'Q:' SPACE? TEMPO EOL;
FIELD_VOICE 			: 'V:' SPACE? STRING EOL;

fragment KEY 			: 	(KEYNOTE MODEMINOR?);
fragment KEYNOTE 				:	(BASENOTE KEY_ACCIDENTAL?);
KEY_ACCIDENTAL			:	('#' | 'b');
MODEMINOR 				: 	('m');

fragment METER 					: 	'C'
							|	'C|'
							|	METER_FRACTION;
fragment METER_FRACTION 	: 	INTEGER '/' INTEGER;
TEMPO 						: 	METER_FRACTION '=' INTEGER;


// Music rules
MEASURE_ELEMENT			:	NOTE_ELEMENT
						|	TUPLET_ELEMENT;
NOTE_ELEMENT			:	NOTE
						|	MULTI_NOTE;
NOTE					:	NOTE_OR_REST NOTE_LENGTH?;
NOTE_OR_REST			:	PITCH  |	REST;
PITCH                   : 	ACCIDENTAL? BASENOTE OCTAVE?;

OCTAVE					:	'\''+
						|	','+;
fragment NOTE_LENGTH	:	INTEGER? ('/' INTEGER?)?;
NOTE_LENGTH_STRICT		:	INTEGER '/' INTEGER;

ACCIDENTAL				: '^' | '^^' | '=' | '_' | '__';

TUPLET_ELEMENT			:	TUPLET_SPEC NOTE_ELEMENT+;
TUPLET_SPEC				:	'(' DIGIT;

MULTI_NOTE				:	'[' NOTE+ ']';

BAR_LINE				:	'|'
						|	'||'
						|	'[|'
						|	'|]'
						| OPEN_REPEAT
						| CLOSE_REPEAT;
OPEN_REPEAT				: 	'|:';
CLOSE_REPEAT			:	':|';
NTH_REPEAT				:	'[1'
						|	'[2';
						

LYRIC					:	'w:' SPACE LYRICAL_ELEMENT*;
fragment LYRICAL_ELEMENT			:	' '+ | '-' | '_' | '*' | '~' | '\-' | '|' | LYRIC_TEXT;
fragment LYRIC_TEXT				:	~[LYRICAL_ELEMENT]+;


/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
 */
abc_tune 		: abc_header abc_music EOF;
abc_header 		: FIELD_TRACK_NUMBER COMMENT* FIELD_TITLE OTHER_FIELD* FIELD_KEY;
abc_music   	: abc_line+;
abc_line 		: element+ NEWLINE* (LYRIC NEWLINE)?
				| mid_tune_field
				| COMMENT;
element 		: measure | repeat | NTH_REPEAT;
measure			: (MEASURE_ELEMENT)* BAR_LINE;
repeat			: (OPEN_REPEAT)? (measure)+ CLOSE_REPEAT;
mid_tune_field 	: FIELD_VOICE;