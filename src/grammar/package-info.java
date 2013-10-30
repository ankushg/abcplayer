/**
 * Package containing all of our grammar files.
 *
 * To create Expresion.g4, we split the given BNF grammar into the
 * fundamental basic terminals (the tokens for the lexer) and the tree
 * structures constructed by them (the parser). We defined tokens that
 * weren't in the BNF grammar like DIGIT and INTEGER created catch-all
 * tokens to allow for special characters in strings.
 *
 * We output all errors to the console, but attempt to continue playing
 * music wherever possible. This ranges from ignoring excess whitespace to
 * allowing measures that don't comply with the meter.
 *
 * Once we have an AST, we'll create a custom ParseTreeListener which will
 * crawl through the tree, generating Notes (and their Pitches and
 * Durations), Chords (and their List of Notes), Measures (where we combine
 * Syllables and Chords), Repeats (which contain other ChordSequences) and
 * Voices as it exits the various nodes of the tree. We'll then wrap it in a
 * Song to combine the header metadata and the Voices.
 *
 * Song's getPlayer() method will be used to create a SequencePlayer with
 * all the notes and lyrics appropriately added to it.
 */
package grammar;

