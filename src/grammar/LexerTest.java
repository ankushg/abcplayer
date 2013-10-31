package grammar;

//Import all the token types from ABCMusicLexer
import static grammar.ABCMusicLexer.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * This suite tests a variety of single tokens (split into rough batches) to
 * check that they aren't split up, and then checks that they are lexed as the
 * correct token type. It also tests complex strings featuring all the token
 * types to make sure they are lexed correctly.
 */
public class LexerTest {
    /**
     * Tests the header field starter tokens
     */
    @Test
    public void testSingleHeaderFieldStarterTokens() {
        String[] singleTokens = { "X:", "T:", "C:", "L:", "M:", "Q:", "V:", "K:" };
        int[] singleTokenTypes = { TRACK_NUMBER_START, TITLE_START, COMPOSER_START, DEFAULT_LENGTH_START, METER_START,
                TEMPO_START, VOICE_START, KEY_START };

        testSingleTokens(singleTokens, singleTokenTypes);
    }

    /**
     * Tests octave descriptors, types of bars, accidental types ("=" becomes an
     * EQUALS and it handled at the parser level), whitespace, newlines and
     * comment start tokens
     */
    @Test
    public void testSingleMusicTokens() {
        String[] singleTokens = { "'", ",", "^", "^^", "=", "_", "__", "(2", "(3", "(4", "[", "]", "|", "||", "[|",
                "|]", "|:", "|:", "[1", "[2", "%", " ", "\n", "\r\n" };
        int[] singleTokenTypes = { OCTAVE, OCTAVE, ACCIDENTAL_TYPE, ACCIDENTAL_TYPE, EQUALS, ACCIDENTAL_TYPE,
                ACCIDENTAL_TYPE, DUPLET_START, TRIPLET_START, QUADRUPLET_START, OPEN_BRACKET, CLOSE_BRACKET,
                SINGLE_BAR, BAR_LINE, BAR_LINE, BAR_LINE, BAR_LINE, BAR_LINE, BAR_LINE, BAR_LINE, COMMENT_START,
                WHITESPACE, NEWLINE, NEWLINE };

        testSingleTokens(singleTokens, singleTokenTypes);
    }

    /**
     * Tests all notes and rests individually
     */
    @Test
    public void testNotesAndRests() {
        String[] singleTokens = { "A", "B", "C", "D", "E", "F", "G", "a", "b", "c", "d", "e", "f", "g", "z" };
        int[] singleTokenTypes = { BASE, BASE, BASE, BASE, BASE, BASE, BASE, BASE, BASE, BASE, BASE, BASE, BASE, BASE,
                REST };
        testSingleTokens(singleTokens, singleTokenTypes);
    }

    /**
     * Tests a combined set of lyrics with separators, special characters.
     */
    @Test
    public void testLyrics() {
        String input = "w: Sa-ys my au-l' wan to your aul' wan, Will~ye come to the Wa-x-ies dar-gle?";
        String[] tokens = { "w:", " ", "S", "a", "-", "y", "s", " ", "m", "y", " ", "a", "u", "-", "l", "'", " ", "w",
                "a", "n", " ", "t", "o", " ", "y", "o", "u", "r", " ", "a", "u", "l", "'", " ", "w", "a", "n", ",",
                " ", "W", "i", "l", "l", "~", "y", "e", " ", "c", "o", "m", "e", " ", "t", "o", " ", "t", "h", "e",
                " ", "W", "a", "-", "x", "-", "i", "e", "s", " ", "d", "a", "r", "-", "g", "l", "e", "?", };
        int[] tokenTypes = { LYRIC_START, WHITESPACE, NONBASENOTE, BASE, LYRIC_HYPHEN, NONBASENOTE, NONBASENOTE,
                WHITESPACE, NONBASENOTE, NONBASENOTE, WHITESPACE, BASE, NONBASENOTE, LYRIC_HYPHEN, NONBASENOTE,
                OCTAVE, WHITESPACE, NONBASENOTE, BASE, NONBASENOTE, WHITESPACE, NONBASENOTE, NONBASENOTE, WHITESPACE,
                NONBASENOTE, NONBASENOTE, NONBASENOTE, NONBASENOTE, WHITESPACE, BASE, NONBASENOTE, NONBASENOTE, OCTAVE,
                WHITESPACE, NONBASENOTE, BASE, NONBASENOTE, OCTAVE, WHITESPACE, NONBASENOTE, NONBASENOTE, NONBASENOTE,
                NONBASENOTE, SYLLABLE_JOINER, NONBASENOTE, BASE, WHITESPACE, BASE, NONBASENOTE, NONBASENOTE, BASE,
                WHITESPACE, NONBASENOTE, NONBASENOTE, WHITESPACE, NONBASENOTE, NONBASENOTE, BASE, WHITESPACE,
                NONBASENOTE, BASE, LYRIC_HYPHEN, NONBASENOTE, LYRIC_HYPHEN, NONBASENOTE, BASE, NONBASENOTE,
                WHITESPACE, BASE, BASE, NONBASENOTE, LYRIC_HYPHEN, BASE, NONBASENOTE, BASE, PUNCTUATION, };
        verifyLexerTokenTypes(input, tokenTypes, false, false, false, true);
        verifyLexerTokens(input, tokens, false, false, false, true);
    }

    /**
     * Tests a short piece of music with a combination of notes, rests,
     * fractions of various forms, measures of different types, tuplets, and
     * chords
     */
    @Test
    public void testShortMusic() {
        String input = "V: testvoice\n[| A B1/2 z/2 C^ [DE] | A/ (4ABC |]";
        int[] tokenTypes = { VOICE_START, WHITESPACE, NONBASENOTE, BASE, NONBASENOTE, NONBASENOTE, NONBASENOTE,
                NONBASENOTE, NONBASENOTE, BASE, BASE, NEWLINE, BAR_LINE, WHITESPACE, BASE, WHITESPACE, BASE, INTEGER,
                OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, ACCIDENTAL_TYPE, WHITESPACE,
                OPEN_BRACKET, BASE, BASE, CLOSE_BRACKET, WHITESPACE, SINGLE_BAR, WHITESPACE, BASE, OVER, WHITESPACE,
                QUADRUPLET_START, BASE, BASE, BASE, WHITESPACE, BAR_LINE, };
        String[] tokens = { "V:", " ", "t", "e", "s", "t", "v", "o", "i", "c", "e", "\n", "[|", " ", "A", " ", "B",
                "1", "/", "2", " ", "z", "/", "2", " ", "C", "^", " ", "[", "D", "E", "]", " ", "|", " ", "A", "/",
                " ", "(4", "A", "B", "C", " ", "|]", };
        verifyLexerTokenTypes(input, tokenTypes);
        verifyLexerTokens(input, tokens);
    }

    /**
     * Tests an entire header
     */
    @Test
    public void testHeader() {
        String input = "X: 3\nT: Turkish March\nC: W. Mozart\nM: C\nL: 1/8\nK: Abm";
        int[] tokenTypes = { TRACK_NUMBER_START, WHITESPACE, INTEGER, NEWLINE, TITLE_START, WHITESPACE, NONBASENOTE,
                NONBASENOTE, NONBASENOTE, NONBASENOTE, NONBASENOTE, NONBASENOTE, NONBASENOTE, WHITESPACE, NONBASENOTE,
                BASE, NONBASENOTE, BASE, NONBASENOTE, NEWLINE, COMPOSER_START, WHITESPACE, NONBASENOTE, PUNCTUATION,
                WHITESPACE, NONBASENOTE, NONBASENOTE, REST, BASE, NONBASENOTE, NONBASENOTE, NEWLINE, METER_START,
                WHITESPACE, NON_FRACTION_METER, NEWLINE, DEFAULT_LENGTH_START, WHITESPACE, INTEGER, OVER, INTEGER,
                NEWLINE, KEY_START, WHITESPACE, KEY_TOKEN, };
        String[] tokens = { "X:", " ", "3", "\n", "T:", " ", "T", "u", "r", "k", "i", "s", "h", " ", "M", "a", "r",
                "c", "h", "\n", "C:", " ", "W", ".", " ", "M", "o", "z", "a", "r", "t", "\n", "M:", " ", "C", "\n",
                "L:", " ", "1", "/", "8", "\n", "K:", " ", "Abm", };
        verifyLexerTokenTypes(input, tokenTypes);
        verifyLexerTokens(input, tokens);
    }

    /**
     * Tests a very long, complex file with almost every element. Mainly just to
     * ensure that the lexer is working properly, but also to ensure that it's
     * reasonably performant. It tests that it takes no more than 1 second to
     * parse the file.
     */
    @Test(timeout = 1000)
    public void testComplexFile() {
        String file = "sample_abc/tests/greensleeves.abc";
        String[] singleTokens = { "X:", " ", "1", "\n", "T:", " ", "G", "r", "e", "e", "n", "s", "l", "e", "e", "v",
                "e", "s", " ", "\n", "L:", " ", "1", "/", "4", "\n", "Q:", " ", "118", "\n", "K:", " ", "Abm", "\n",
                "z", "25", "/", "8", " ", "[", "d", "/", "2", "D", "/", "2", "]", " ", "z", "/", "8", " ", "[", "f",
                "9", "/", "8", "D", "9", "/", "8", "]", " ", "z", "/", "8", " ", "[", "g", "/", "2", "E", "/", "2",
                "]", " ", "z", "/", "8", " ", "[", "a", "3", "/", "4", "F", "3", "/", "4", "]", " ", "z", "/", "8",
                "\n", "[", "^", "a", "/", "4", "G", "/", "4", "]", " ", "z", "/", "8", " ", "[", "=", "a", "/", "2",
                "F", "/", "2", "]", " ", "z", "/", "8", " ", "[", "g", "9", "/", "8", "C", "9", "/", "8", "]", " ",
                "z", "/", "8", " ", "[", "e", "/", "2", "C", "/", "2", "]", " ", "z", "/", "8", " ", "[", "c", "3",
                "/", "4", "E", "3", "/", "4", "]", "\n", "z", "/", "8", " ", "[", "d", "/", "4", "F", "/", "4", "]",
                " ", "[", "e", "5", "/", "8", "G", "5", "/", "8", "]", " ", "[", "f", "5", "/", "4", "D", "15", "/",
                "8", "]", " ", "d", "5", "/", "8", " ", "[", "d", "/", "2", "^", "A", ",", "9", "/", "8", "]", " ",
                "z", "/", "8", " ", "^", "c", "/", "2", " ", "z", "/", "8", "\n", "[", "d", "/", "2", "^", "A", "/",
                "2", "]", " ", "z", "/", "8", " ", "[", "e", "9", "/", "8", "=", "A", "15", "/", "8", "]", " ", "z",
                "/", "8", " ", "^", "c", "/", "2", " ", "z", "/", "8", " ", "A", "9", "/", "8", " ", "z", "/", "8",
                " ", "[", "d", "/", "2", "D", "/", "2", "]", " ", "z", "/", "8", "\n", "[", "f", "9", "/", "8", "D",
                "9", "/", "8", "]", " ", "z", "/", "8", " ", "[", "g", "/", "2", "C", "/", "2", "]", " ", "z", "/",
                "8", " ", "[", "a", "7", "/", "8", "F", "9", "/", "8", "]", " ", "^", "a", "/", "4", " ", "z", "/",
                "8", " ", "[", "=", "a", "/", "2", "F", "/", "2", "]", " ", "z", "/", "8", "\n", "[", "g", "9", "/",
                "8", "C", "9", "/", "8", "]", " ", "z", "/", "8", " ", "[", "e", "/", "2", "C", "/", "2", "]", " ",
                "z", "/", "8", " ", "[", "=", "c", "3", "/", "4", "E", "3", "/", "4", "]", " ", "z", "/", "8", " ",
                "[", "d", "/", "4", "F", "/", "4", "]", " ", "z", "/", "8", " ", "[", "e", "/", "2", "G", "/", "2",
                "]", " ", "z", "/", "8", "\n", "[", "f", "3", "/", "4", "D", "7", "/", "4", "]", " ", "z", "/", "8",
                " ", "e", "/", "4", " ", "z", "/", "8", " ", "d", "/", "2", " ", "z", "/", "8", " ", "[", "^", "c",
                "/", "2", "A", "/", "2", "]", " ", "z", "/", "8", " ", "[", "B", "/", "2", "G", "/", "2", "]", " ",
                "z", "/", "8", " ", "[", "^", "c", "/", "2", "E", "/", "2", "]", "\n", "[", "d", "5", "/", "4", "F",
                "7", "/", "8", "]", " ", "z", "/", "8", " ", "G", "/", "4", " ", "[", "d", "5", "/", "8", "E", "5",
                "/", "8", "]", " ", "[", "d", "7", "/", "4", "D", "7", "/", "4", "]", " ", "z", "/", "8", " ", "[",
                "c", "'", "7", "/", "4", "A", "7", "/", "8", "]", " ", "z", "/", "8", " ", "G", "/", "4", " ", "F",
                "/", "2", "\n", "z", "/", "8", " ", "[", "c", "'", "7", "/", "8", "F", "7", "/", "8", "]", " ", "z",
                "/", "8", " ", "[", "b", "/", "4", "G", "/", "4", "]", " ", "[", "a", "/", "2", "F", "/", "2", "]",
                " ", "z", "/", "8", " ", "[", "g", "9", "/", "8", "=", "c", "9", "/", "8", "]", " ", "z", "/", "8",
                " ", "[", "e", "/", "2", "C", "/", "2", "]", "\n", "z", "/", "8", " ", "[", "c", "7", "/", "8", "E",
                "7", "/", "8", "]", " ", "[", "d", "3", "/", "8", "F", "3", "/", "8", "]", " ", "[", "e", "/", "2",
                "G", "/", "2", "]", " ", "z", "/", "8", " ", "[", "f", "9", "/", "8", "D", "7", "/", "4", "]", " ",
                "z", "/", "8", " ", "d", "/", "2", " ", "z", "/", "8", "\n", "[", "d", "7", "/", "8", "^", "A", ",",
                "9", "/", "8", "]", " ", "^", "c", "/", "4", " ", "z", "/", "8", " ", "[", "d", "/", "2", "^", "A",
                "/", "2", "]", " ", "z", "/", "8", " ", "[", "e", "9", "/", "8", "=", "A", "15", "/", "8", "]", " ",
                "z", "/", "8", " ", "^", "c", "/", "2", " ", "z", "/", "8", " ", "A", "7", "/", "4", "\n", "z", "/",
                "8", " ", "[", "c", "'", "7", "/", "4", "A", "3", "/", "4", "]", " ", "z", "/", "8", " ", "G", "/",
                "4", " ", "F", "5", "/", "8", " ", "[", "c", "'", "7", "/", "8", "F", "7", "/", "8", "]", " ", "z",
                "/", "8", " ", "[", "b", "/", "4", "G", "/", "4", "]", " ", "[", "a", "5", "/", "8", "F", "5", "/",
                "8", "]", "\n", "[", "g", "9", "/", "8", "C", "7", "/", "4", "]", " ", "z", "/", "8", " ", "e", "/",
                "2", " ", "z", "/", "8", " ", "[", "=", "c", "7", "/", "8", "E", "7", "/", "8", "]", " ", "z", "/",
                "8", " ", "[", "d", "/", "4", "F", "/", "4", "]", " ", "[", "e", "/", "2", "G", "/", "2", "]", " ",
                "z", "/", "8", "\n", "[", "f", "7", "/", "8", "D", "7", "/", "8", "]", " ", "z", "/", "8", " ", "[",
                "e", "/", "4", "E", "/", "4", "]", " ", "[", "d", "/", "2", "F", "/", "2", "]", " ", "z", "/", "8",
                " ", "[", "^", "c", "7", "/", "8", "A", "7", "/", "8", "]", " ", "z", "/", "8", " ", "[", "B", "/",
                "4", "G", "/", "4", "]", "\n", "[", "^", "c", "/", "2", "E", "/", "2", "]", " ", "z", "/", "8", " ",
                "[", "d", "9", "/", "8", "F", "7", "/", "8", "]", " ", "G", "/", "4", " ", "z", "/", "8", " ", "[",
                "d", "/", "2", "E", "/", "2", "]", " ", "z", "/", "8", " ", "[", "d", "9", "/", "8", "D", "9", "/",
                "8", "]", " ", "z", "/", "8", "\n", "[", "D", "/", "2", "D", ",", "/", "2", "]", " ", "z", "/", "8",
                " ", "[", "F", "9", "/", "8", "D", ",", "9", "/", "8", "]", " ", "z", "/", "8", " ", "[", "G", "/",
                "2", "E", ",", "/", "2", "]", " ", "z", "/", "8", " ", "[", "A", "3", "/", "4", "F", ",", "3", "/",
                "4", "]", " ", "z", "/", "8", "\n", "[", "^", "A", "/", "4", "G", ",", "/", "4", "]", " ", "z", "/",
                "8", " ", "[", "=", "A", "/", "2", "F", ",", "/", "2", "]", " ", "z", "/", "8", " ", "[", "G", "9",
                "/", "8", "C", "9", "/", "8", "]", " ", "z", "/", "8", " ", "E", "/", "2", " ", "C", "7", "/", "8",
                " ", "z", "/", "8", " ", "D", "/", "4", "\n", "[", "E", "5", "/", "8", "C", "5", "/", "8", "]", " ",
                "[", "F", "5", "/", "4", "D", "5", "/", "4", "]", " ", "[", "D", "/", "2", "=", "A", ",", "/", "2",
                "]", " ", "z", "/", "8", " ", "[", "D", "/", "2", "^", "A", ",", "9", "/", "8", "]", " ", "z", "/",
                "8", " ", "^", "C", "/", "2", " ", "z", "/", "8", "\n", "[", "D", "/", "2", "^", "A", ",", "/", "2",
                "]", " ", "z", "/", "8", " ", "[", "E", "9", "/", "8", "=", "A", ",", "7", "/", "4", "]", " ", "z",
                "/", "8", " ", "^", "C", "/", "2", " ", "z", "/", "8", " ", "A", ",", "9", "/", "8", " ", "z", "/",
                "8", " ", "D", "/", "2", " ", "z", "/", "8", " ", "[", "F", "9", "/", "8", "D", "9", "/", "8", "]",
                "\n", "z", "/", "8", " ", "[", "G", "/", "2", "=", "C", "/", "2", "]", " ", "z", "/", "8", " ", "[",
                "A", "7", "/", "8", "F", ",", "7", "/", "8", "]", " ", "[", "^", "A", "/", "4", "G", ",", "/", "4",
                "]", " ", "z", "/", "8", " ", "[", "=", "A", "/", "2", "F", ",", "/", "2", "]", " ", "z", "/", "8",
                "\n", "[", "G", "9", "/", "8", "C", "9", "/", "8", "]", " ", "z", "/", "8", " ", "E", "/", "2", " ",
                "z", "/", "8", " ", "C", "3", "/", "4", " ", "z", "/", "8", " ", "D", "/", "4", " ", "z", "/", "8",
                " ", "[", "E", "/", "2", "C", "/", "2", "]", " ", "z", "/", "8", " ", "[", "F", "3", "/", "4", "D",
                "5", "/", "4", "]", " ", "z", "/", "8", "\n", "E", "/", "4", " ", "z", "/", "8", " ", "D", "/", "2",
                " ", "z", "/", "8", " ", "[", "^", "C", "/", "2", "A", ",", "7", "/", "4", "]", " ", "z", "/", "8",
                " ", "B", ",", "/", "2", " ", "^", "C", "5", "/", "8", " ", "[", "D", "5", "/", "4", "F", ",", "7",
                "/", "8", "]", " ", "z", "/", "8", " ", "G", ",", "/", "4", "\n", "[", "D", "5", "/", "8", "E", ",",
                "5", "/", "8", "]", " ", "[", "D", "7", "/", "4", "D", ",", "9", "/", "8", "]", " ", "z", "3", "/",
                "4", " ", "[", "=", "c", "7", "/", "4", "A", ",", "7", "/", "8", "]", " ", "z", "/", "8", " ", "G",
                ",", "/", "4", " ", "F", ",", "/", "2", " ", "z", "/", "8", "\n", "[", "c", "7", "/", "8", "F", ",",
                "7", "/", "8", "]", " ", "z", "/", "8", " ", "[", "B", "/", "4", "G", ",", "/", "4", "]", " ", "[",
                "A", "/", "2", "F", ",", "/", "2", "]", " ", "z", "/", "8", " ", "[", "G", "9", "/", "8", "=", "C",
                "9", "/", "8", "]", " ", "z", "/", "8", " ", "E", "/", "2", " ", "z", "/", "8", " ", "C", "7", "/",
                "8", "\n", "D", "3", "/", "8", " ", "[", "E", "/", "2", "C", "/", "2", "]", " ", "z", "/", "8", " ",
                "[", "F", "9", "/", "8", "D", "9", "/", "8", "]", " ", "z", "/", "8", " ", "[", "D", "/", "2", "A",
                ",", "/", "2", "]", " ", "z", "/", "8", " ", "[", "D", "7", "/", "8", "^", "A", ",", "9", "/", "8",
                "]", " ", "^", "C", "/", "4", " ", "z", "/", "8", "\n", "[", "D", "/", "2", "^", "A", ",", "/", "2",
                "]", " ", "z", "/", "8", " ", "[", "E", "9", "/", "8", "=", "A", ",", "9", "/", "8", "]", " ", "z",
                "/", "8", " ", "^", "C", "/", "2", " ", "z", "/", "8", " ", "A", ",", "9", "/", "8", " ", "z", "3",
                "/", "4", " ", "[", "c", "7", "/", "4", "A", ",", "3", "/", "4", "]", " ", "z", "/", "8", "\n", "G",
                ",", "/", "4", " ", "F", ",", "5", "/", "8", " ", "[", "c", "7", "/", "8", "F", ",", "7", "/", "8",
                "]", " ", "z", "/", "8", " ", "[", "B", "/", "4", "G", ",", "/", "4", "]", " ", "[", "A", "/", "2",
                "F", ",", "/", "2", "]", " ", "z", "/", "8", " ", "[", "G", "9", "/", "8", "=", "C", "9", "/", "8",
                "]", " ", "z", "/", "8", "\n", "E", "/", "2", " ", "z", "/", "8", " ", "C", "7", "/", "8", " ", "z",
                "/", "8", " ", "D", "/", "4", " ", "[", "E", "/", "2", "C", "/", "2", "]", " ", "z", "/", "8", " ",
                "[", "F", "7", "/", "8", "D", "5", "/", "4", "]", " ", "z", "/", "8", " ", "E", "/", "4", " ", "D",
                "/", "2", " ", "z", "/", "8", "\n", "[", "^", "C", "7", "/", "8", "A", ",", "7", "/", "4", "]", " ",
                "B", ",", "3", "/", "8", " ", "^", "C", "/", "2", " ", "z", "/", "8", " ", "[", "D", "7", "/", "4",
                "F", ",", "7", "/", "8", "]", " ", "G", ",", "/", "4", " ", "z", "/", "8", " ", "E", ",", "/", "2",
                " ", "z", "/", "8", " ", "[", "D", "9", "/", "8", "D", ",", "9", "/", "8", "]", "\n", "z", "/", "8",
                " ", "[", "d", "/", "2", "D", "/", "2", "]", " ", "z", "/", "8", " ", "[", "f", "9", "/", "8", "D",
                "9", "/", "8", "]", " ", "z", "/", "8", " ", "[", "g", "/", "2", "E", "/", "2", "]", " ", "z", "/",
                "8", " ", "[", "a", "3", "/", "4", "F", "3", "/", "4", "]", " ", "z", "/", "8", " ", "[", "^", "a",
                "/", "4", "G", "/", "4", "]", "\n", "z", "/", "8", " ", "[", "=", "a", "/", "2", "F", "/", "2", "]",
                " ", "z", "/", "8", " ", "[", "g", "9", "/", "8", "=", "C", "9", "/", "8", "]", " ", "z", "/", "8",
                " ", "[", "e", "/", "2", "C", "/", "2", "]", " ", "[", "c", "7", "/", "8", "E", "7", "/", "8", "]",
                " ", "z", "/", "8", " ", "[", "d", "/", "4", "F", "/", "4", "]", "\n", "[", "e", "5", "/", "8", "G",
                "5", "/", "8", "]", " ", "[", "f", "9", "/", "8", "D", "7", "/", "4", "]", " ", "z", "/", "8", " ",
                "d", "/", "2", " ", "z", "/", "8", " ", "[", "d", "/", "2", "^", "A", ",", "9", "/", "8", "]", " ",
                "z", "/", "8", " ", "^", "c", "/", "2", " ", "z", "/", "8", " ", "[", "d", "/", "2", "^", "A", "/",
                "2", "]", "\n", "z", "/", "8", " ", "[", "e", "9", "/", "8", "=", "A", "15", "/", "8", "]", " ", "z",
                "/", "8", " ", "^", "c", "/", "2", " ", "z", "/", "8", " ", "A", "9", "/", "8", " ", "z", "/", "8",
                " ", "[", "d", "/", "2", "D", "/", "2", "]", " ", "z", "/", "8", " ", "[", "f", "9", "/", "8", "D",
                "9", "/", "8", "]", " ", "z", "/", "8", "\n", "[", "g", "/", "2", "C", "/", "2", "]", " ", "z", "/",
                "8", " ", "[", "a", "7", "/", "8", "F", "9", "/", "8", "]", " ", "^", "a", "/", "4", " ", "z", "/",
                "8", " ", "[", "=", "a", "/", "2", "F", "/", "2", "]", " ", "z", "/", "8", " ", "[", "g", "9", "/",
                "8", "C", "9", "/", "8", "]", " ", "z", "/", "8", "\n", "[", "e", "/", "2", "C", "/", "2", "]", " ",
                "z", "/", "8", " ", "[", "=", "c", "3", "/", "4", "E", "3", "/", "4", "]", " ", "z", "/", "8", " ",
                "[", "d", "/", "4", "F", "/", "4", "]", " ", "z", "/", "8", " ", "[", "e", "/", "2", "G", "/", "2",
                "]", " ", "z", "/", "8", " ", "[", "f", "3", "/", "4", "D", "7", "/", "4", "]", " ", "z", "/", "8",
                "\n", "e", "/", "4", " ", "z", "/", "8", " ", "d", "/", "2", " ", "z", "/", "8", " ", "[", "^", "c",
                "/", "2", "A", "/", "2", "]", " ", "[", "B", "5", "/", "8", "G", "5", "/", "8", "]", " ", "[", "^",
                "c", "5", "/", "8", "E", "5", "/", "8", "]", " ", "[", "d", "5", "/", "4", "F", "7", "/", "8", "]",
                " ", "z", "/", "8", " ", "G", "/", "4", "\n", "[", "d", "5", "/", "8", "E", "5", "/", "8", "]", " ",
                "[", "d", "7", "/", "4", "D", "7", "/", "4", "]", " ", "z", "/", "8", " ", "[", "c", "'", "7", "/",
                "4", "A", "7", "/", "8", "]", " ", "z", "/", "8", " ", "G", "/", "4", " ", "F", "/", "2", " ", "z",
                "/", "8", " ", "[", "c", "'", "7", "/", "8", "F", "7", "/", "8", "]", " ", "z", "/", "8", "\n", "[",
                "b", "/", "4", "G", "/", "4", "]", " ", "[", "a", "/", "2", "F", "/", "2", "]", " ", "z", "/", "8",
                " ", "[", "g", "9", "/", "8", "=", "c", "9", "/", "8", "]", " ", "z", "/", "8", " ", "[", "e", "/",
                "2", "C", "/", "2", "]", " ", "z", "/", "8", " ", "[", "c", "7", "/", "8", "E", "7", "/", "8", "]",
                "\n", "[", "d", "/", "4", "F", "/", "4", "]", " ", "z", "/", "8", " ", "[", "e", "/", "2", "G", "/",
                "2", "]", " ", "z", "/", "8", " ", "[", "f", "9", "/", "8", "D", "7", "/", "4", "]", " ", "z", "/",
                "8", " ", "d", "/", "2", " ", "z", "/", "8", " ", "[", "d", "3", "/", "4", "^", "A", ",", "9", "/",
                "8", "]", " ", "z", "/", "8", "\n", "^", "c", "/", "4", " ", "z", "/", "8", " ", "[", "d", "/", "2",
                "^", "A", "/", "2", "]", " ", "z", "/", "8", " ", "[", "e", "9", "/", "8", "=", "A", "15", "/", "8",
                "]", " ", "z", "/", "8", " ", "^", "c", "/", "2", " ", "z", "/", "8", " ", "A", "7", "/", "4", " ",
                "[", "c", "'", "15", "/", "8", "A", "7", "/", "8", "]", "\n", "z", "/", "8", " ", "G", "/", "4", " ",
                "F", "5", "/", "8", " ", "[", "c", "'", "7", "/", "8", "F", "7", "/", "8", "]", " ", "z", "/", "8",
                " ", "[", "b", "/", "4", "G", "/", "4", "]", " ", "[", "a", "/", "2", "F", "/", "2", "]", " ", "z",
                "/", "8", " ", "[", "g", "9", "/", "8", "C", "7", "/", "4", "]", " ", "z", "/", "8", " ", "e", "/",
                "2", "\n", "z", "/", "8", " ", "[", "=", "c", "7", "/", "8", "E", "7", "/", "8", "]", " ", "z", "/",
                "8", " ", "[", "d", "/", "4", "F", "/", "4", "]", " ", "[", "e", "/", "2", "G", "/", "2", "]", " ",
                "z", "/", "8", " ", "[", "f", "7", "/", "8", "D", "7", "/", "8", "]", " ", "z", "/", "8", " ", "[",
                "e", "/", "4", "E", "/", "4", "]", "\n", "[", "d", "/", "2", "F", "/", "2", "]", " ", "z", "/", "8",
                " ", "[", "^", "c", "7", "/", "8", "A", "7", "/", "8", "]", " ", "[", "B", "3", "/", "8", "G", "3",
                "/", "8", "]", " ", "[", "^", "c", "/", "2", "E", "/", "2", "]", " ", "z", "/", "8", " ", "[", "d",
                "9", "/", "8", "F", "7", "/", "8", "]", " ", "G", "/", "4", " ", "z", "/", "8", "\n", "[", "d", "/",
                "2", "E", "/", "2", "]", " ", "z", "/", "8", " ", "[", "d", "7", "/", "4", "D", "7", "/", "4", "]",
                " ", };
        int[] tokenTypes = { TRACK_NUMBER_START, WHITESPACE, INTEGER, NEWLINE, TITLE_START, WHITESPACE, BASE,
                NONBASENOTE, BASE, BASE, NONBASENOTE, NONBASENOTE, NONBASENOTE, BASE, BASE, NONBASENOTE, BASE,
                NONBASENOTE, WHITESPACE, NEWLINE, DEFAULT_LENGTH_START, WHITESPACE, INTEGER, OVER, INTEGER, NEWLINE,
                TEMPO_START, WHITESPACE, INTEGER, NEWLINE, KEY_START, WHITESPACE, KEY_TOKEN, NEWLINE, REST, INTEGER,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, NEWLINE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, BASE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, OVER, INTEGER,
                BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, NEWLINE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, BASE, INTEGER, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, ACCIDENTAL_TYPE, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, NEWLINE,
                OPEN_BRACKET, BASE, OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER,
                INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER, INTEGER, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, ACCIDENTAL_TYPE,
                BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE,
                OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE,
                OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET,
                NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE,
                INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, OCTAVE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, BASE,
                OVER, INTEGER, NEWLINE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OCTAVE, INTEGER, OVER,
                INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE,
                OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER,
                CLOSE_BRACKET, NEWLINE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER,
                INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER,
                INTEGER, ACCIDENTAL_TYPE, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER, INTEGER, NEWLINE, REST, OVER,
                INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OCTAVE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, BASE,
                INTEGER, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OCTAVE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE,
                INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER,
                INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, INTEGER, OVER,
                INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE,
                OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE,
                OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, NEWLINE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, BASE, OVER,
                INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER,
                INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE,
                OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, NEWLINE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, BASE, OCTAVE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, OVER, INTEGER,
                BASE, OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER, INTEGER, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, EQUALS,
                BASE, OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER,
                NEWLINE, OPEN_BRACKET, BASE, OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OCTAVE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                EQUALS, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE,
                OCTAVE, INTEGER, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, NEWLINE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, EQUALS, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, BASE, OCTAVE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, OVER, INTEGER,
                BASE, OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, INTEGER,
                OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE, BASE, OVER, INTEGER,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OCTAVE, OVER, INTEGER, WHITESPACE,
                ACCIDENTAL_TYPE, BASE, INTEGER, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE,
                OCTAVE, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, OCTAVE,
                INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, INTEGER, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, EQUALS, BASE, INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OCTAVE, OVER, INTEGER, WHITESPACE,
                BASE, OCTAVE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, INTEGER,
                OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER, INTEGER, NEWLINE, BASE, INTEGER, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE,
                OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                INTEGER, OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, NEWLINE,
                OPEN_BRACKET, BASE, OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OCTAVE, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE,
                OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OCTAVE,
                INTEGER, OVER, INTEGER, WHITESPACE, REST, INTEGER, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, NEWLINE, BASE, OCTAVE, OVER, INTEGER, WHITESPACE, BASE, OCTAVE, INTEGER, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE,
                OCTAVE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OCTAVE,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER,
                OVER, INTEGER, EQUALS, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                NEWLINE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER,
                INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE,
                REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, INTEGER, OVER, INTEGER, BASE,
                OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, BASE, OCTAVE, INTEGER, OVER, INTEGER,
                WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, BASE, OCTAVE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OCTAVE,
                OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, NEWLINE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                ACCIDENTAL_TYPE, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, NEWLINE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, EQUALS, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER,
                INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER,
                INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER,
                ACCIDENTAL_TYPE, BASE, OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, CLOSE_BRACKET, NEWLINE, REST,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE, INTEGER, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER,
                INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER, INTEGER, WHITESPACE, REST,
                OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, ACCIDENTAL_TYPE,
                BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, NEWLINE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, NEWLINE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE,
                OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER,
                INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, INTEGER,
                OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER,
                OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, BASE, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OCTAVE,
                INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, OCTAVE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                EQUALS, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                NEWLINE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER,
                INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, ACCIDENTAL_TYPE, BASE,
                OCTAVE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, NEWLINE,
                ACCIDENTAL_TYPE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                OVER, INTEGER, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, EQUALS, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, ACCIDENTAL_TYPE, BASE, OVER, INTEGER,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER, INTEGER, WHITESPACE, OPEN_BRACKET,
                BASE, OCTAVE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, NEWLINE, REST, OVER,
                INTEGER, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, BASE, INTEGER, OVER, INTEGER, WHITESPACE,
                OPEN_BRACKET, BASE, OCTAVE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET,
                WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, BASE, OVER, INTEGER,
                NEWLINE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, EQUALS, BASE, INTEGER, OVER, INTEGER, BASE,
                INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE,
                OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE,
                OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER,
                OVER, INTEGER, BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, NEWLINE,
                OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER,
                WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, OPEN_BRACKET, ACCIDENTAL_TYPE, BASE, OVER, INTEGER, BASE, OVER, INTEGER,
                CLOSE_BRACKET, WHITESPACE, REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER,
                BASE, INTEGER, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE, BASE, OVER, INTEGER, WHITESPACE, REST, OVER,
                INTEGER, NEWLINE, OPEN_BRACKET, BASE, OVER, INTEGER, BASE, OVER, INTEGER, CLOSE_BRACKET, WHITESPACE,
                REST, OVER, INTEGER, WHITESPACE, OPEN_BRACKET, BASE, INTEGER, OVER, INTEGER, BASE, INTEGER, OVER,
                INTEGER, CLOSE_BRACKET, WHITESPACE };
        verifyLexerTokensFromFile(file, singleTokens);
        verifyLexerTokenTypesFromFile(file, tokenTypes);

    }

    public void testSingleTokens(String[] singleTokens, int[] singleTokenTypes) {
        for (int i = 0; i < singleTokens.length; i++) {
            verifyLexerTokens(singleTokens[i], new String[] { singleTokens[i] });
            verifyLexerTokenTypes(singleTokens[i], new int[] { singleTokenTypes[i] });
        }
    }

    public void verifyLexerTokensFromFile(String fileName, String[] expectedTokens) {
        CharStream stream = null;
        try {
            stream = new ANTLRFileStream(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertNotNull(stream);

        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();
        assertEquals(expectedTokens.length, actualTokens.size());

        for (int i = 0; i < actualTokens.size(); i++) {
            String actualToken = actualTokens.get(i).getText();
            String expectedToken = expectedTokens[i];
            assertEquals(actualToken, expectedToken);
        }
    }

    public void verifyLexerTokenTypesFromFile(String fileName, int[] expectedTokenTypes) {
        CharStream stream = null;
        try {
            stream = new ANTLRFileStream(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertNotNull(stream);

        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokenTypes.length, actualTokens.size());

        for (int i = 0; i < actualTokens.size(); i++) {
            int actualToken = actualTokens.get(i).getType();
            int expectedToken = expectedTokenTypes[i];
            assertEquals(actualToken, expectedToken);
        }
    }

    public void verifyLexerTokens(String input, String[] expectedTokens, boolean inHeader, boolean inKey,
            boolean inMeter, boolean inLyric) {
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.inHeader = inHeader;
        lexer.inKey = inKey;
        lexer.inLyric = inLyric;
        lexer.inMeter = inMeter;
        lexer.setInputStream(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokens.length, actualTokens.size());

        for (int i = 0; i < actualTokens.size(); i++) {
            String actualToken = actualTokens.get(i).getText();
            String expectedToken = expectedTokens[i];
            assertEquals(actualToken, expectedToken);
        }
    }

    public void verifyLexerTokens(String input, String[] expectedTokens) {
        verifyLexerTokens(input, expectedTokens, false, false, false, false);
    }

    public void verifyLexerTokenTypes(String input, int[] expectedTokenTypes) {
        verifyLexerTokenTypes(input, expectedTokenTypes, false, false, false, false);
    }

    public void verifyLexerTokenTypes(String input, int[] expectedTokenTypes, boolean inHeader, boolean inKey,
            boolean inMeter, boolean inLyric) {
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.inHeader = inHeader;
        lexer.inKey = inKey;
        lexer.inLyric = inLyric;
        lexer.inMeter = inMeter;
        lexer.setInputStream(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokenTypes.length, actualTokens.size());

        for (int i = 0; i < actualTokens.size(); i++) {
            int actualToken = actualTokens.get(i).getType();
            int expectedToken = expectedTokenTypes[i];
            assertEquals(actualToken, expectedToken);
        }
    }

}
