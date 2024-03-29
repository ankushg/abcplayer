package player;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;
import grammar.Listener;

import java.io.IOException;

import music.Song;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays header information
     * to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file
     *            the name of input abc file
     */
    public static void play(String file) {
        try {
            SequencePlayer player = getSong(file).getPlayer();
            System.out.println(player);
            player.play();
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    /**
     * Lexes and parses the input file and creates a Song object.
     * 
     * @param file
     *            the name of input valid, well-formed abc file
     * 
     * @return the Song object represented by the file
     */
    private static Song getSong(String file) {
        // Create a stream of tokens using the lexer.
        CharStream stream = null;
        try {
            stream = new ANTLRFileStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert stream != null;

        // Feed the tokens into the parser.
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        // List<? extends Token> allTokens = lexer.getAllTokens();
        // for (Token t : allTokens) {
        // System.out.format("<<<%s===%s>>>%n", t.getText(),
        // ABCMusicLexer.tokenNames[t.getType()]);
        // }
        // lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);

        // Feed the tokens into the parser.
        ABCMusicParser parser = new ABCMusicParser(tokens);
        // parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        ParseTree tree;
        tree = parser.abc_tune();

        // Walk the tree with a listener.
        Listener listener = new Listener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        // Display the parsetree
        try {
            ((RuleContext) tree).inspect(parser);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // return the song
        return listener.getSong();
    }

    /**
     * Plays the file specified by the first argument.
     * 
     * @param args
     *            the command line arguments. Only the first is looked at, and
     *            it must be the path to a valid abc file
     */
    public static void main(String[] args) {
        // Replace the filepath with an actual .abc file.
        play("sample_abc/piece2.abc");
    }
}
