/**
 * Package containing all of our grammar files.
 *<br><br>
 * To create Expresion.g4, we split the given BNF grammar into the
 * fundamental basic terminals (the tokens for the lexer) and the tree
 * structures constructed by them (the parser). We defined tokens that
 * weren't in the BNF grammar like DIGIT and INTEGER created catch-all
 * tokens to allow for special characters in strings.
 *<br><br>
 * We output all errors to the console, but attempt to continue playing
 * music wherever possible. This ranges from ignoring excess whitespace
 * where possible to allowing measures that don't comply with the meter.
 * We are lenient about which characters may be in strings, and about
 * excess consecutive whitespace.
 *<br><br>
 * AST Structure is as follows:<br><br>
 * <ul>
 *    <li>
 *       abc_music
 *       <ul>
 *          <li>
 *             abc_header
 *             <ul>
 *                <li> field_track_number</li>
 *                <li> field_title</li>
 *                <li>
 *                   field_optional
 *                   <ul>
 *                      <li>
 *                         field_default_length
 *                         <ul>
 *                            <li> fraction</li>
 *                         </ul>
 *                      </li>
 *                      <li>
 *                         field_tempo
 *                         <ul>
 *                            <li> tempo</li>
 *                         </ul>
 *                      </li>
 *                      <li>
 *                         field_key
 *                         <ul>
 *                            <li> key_signature</li>
 *                         </ul>
 *                      </li>
 *                   </ul>
 *                </li>
 *             </ul>
 *          </li>
 *          <li>
 *             abc_tune
 *             <ul>
 *                <li>
 *                   voice
 *                   <ul>
 *                      <li>
 *                         tune*
 *                         <ul>
 *                            <li>
 *                               chord*
 *                               <ul>
 *                                  <li>
 *                                     note*
 *                                     <ul>
 *                                        <li>
 *                                           pitch or REST
 *                                           <ul>
 *                                              <li> accidental</li>
 *                                           </ul>
 *                                        </li>
 *                                        <li> fraction</li>
 *                                     </ul>
 *                                  </li>
 *                               </ul>
 *                            </li>
 *                            <li>
 *                               tuplet*
 *                               <ul>
 *                                  <li>
 *                                     chord*
 *                                     <ul>
 *                                        <li>
 *                                           pitch or REST
 *                                           <ul>
 *                                              <li> accidental</li>
 *                                           </ul>
 *                                        </li>
 *                                        <li> fraction</li>
 *                                     </ul>
 *                                  </li>
 *                               </ul>
 *                            </li>
 *                         </ul>
 *                      </li>
 *                      <li> eol*</li>
 *                      <li>
 *                         lyric
 *                         <ul>
 *                            <li> syllable*</li>
 *                         </ul>
 *                      </li>
 *                      <li> eol*</li>
 *                   </ul>
 *                </li>
 *             </ul>
 *          </li>
 *       </ul>
 *    </li>
 * </ul>
 *
 *
 *<br><br>
 * To create the AST, we'll pass the input file into the generated ABCMusicLexer
 * through an ANTLRFileStream. We'll then generate the ParseTree creating a
 * TokenStream from the lexer and passing that into an instance of ABCMusicParser,
 * creating an AST.
 *<br><br>
 * Once we have an AST, we'll create a custom ParseTreeListener which will
 * crawl through the tree, generating Notes (and their Pitches and
 * Durations), Chords (and their List of Notes), Measures (where we combine
 * Syllables and Chords), Repeats (which contain other ChordSequences) and
 * Voices as it exits the various nodes of the tree. We'll then wrap it in a
 * Song to combine the header metadata and the Voices.<br><br>
 *
 * After having the Listener class walk through the AST in Main.java,
 * Listener.getSong().getPlayer() method will be used to create a
 * SequencePlayer with all the notes and lyrics appropriately added to it.
 */
package grammar;

