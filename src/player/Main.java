package player;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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
        // Create a stream of tokens using the lexer.
        CharStream stream = null;
        try {
            stream = new ANTLRFileStream(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (stream == null) {
            // TODO throw some error
        }

        // Feed the tokens into the parser.
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> allTokens = lexer.getAllTokens();
        for (Token t : allTokens) {
            System.out.format("<<<%s===%s>>>%n", t.getText(), ABCMusicLexer.tokenNames[t.getType()]);
        }
        lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);

        // Feed the tokens into the parser.
        ABCMusicParser parser = new ABCMusicParser(tokens);
        // parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        ParseTree tree;
        tree = parser.abc_tune();

        // Display the tree graph - uncomment before git pushing
        try {
            ((RuleContext) tree).inspect(parser).get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Walk the tree with a listener.
        // TODO: create a Song class and getSong() in the listener
        ParseTreeListener listener = new ABCMusicBaseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        // TODO: take the created song and actually play it instead of
        // displaying the AST
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
        play("sample_abc/piece3.abc");
    }
}
