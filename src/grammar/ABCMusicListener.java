// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicListener extends ParseTreeListener {
	void enterAbc_music(ABCMusicParser.Abc_musicContext ctx);
	void exitAbc_music(ABCMusicParser.Abc_musicContext ctx);

	void enterVoice(ABCMusicParser.VoiceContext ctx);
	void exitVoice(ABCMusicParser.VoiceContext ctx);

	void enterDuplet(ABCMusicParser.DupletContext ctx);
	void exitDuplet(ABCMusicParser.DupletContext ctx);

	void enterQuadruplet(ABCMusicParser.QuadrupletContext ctx);
	void exitQuadruplet(ABCMusicParser.QuadrupletContext ctx);

	void enterAbc_header(ABCMusicParser.Abc_headerContext ctx);
	void exitAbc_header(ABCMusicParser.Abc_headerContext ctx);

	void enterTempo(ABCMusicParser.TempoContext ctx);
	void exitTempo(ABCMusicParser.TempoContext ctx);

	void enterOther_field(ABCMusicParser.Other_fieldContext ctx);
	void exitOther_field(ABCMusicParser.Other_fieldContext ctx);

	void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx);
	void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx);

	void enterChord(ABCMusicParser.ChordContext ctx);
	void exitChord(ABCMusicParser.ChordContext ctx);

	void enterField_key(ABCMusicParser.Field_keyContext ctx);
	void exitField_key(ABCMusicParser.Field_keyContext ctx);

	void enterEol(ABCMusicParser.EolContext ctx);
	void exitEol(ABCMusicParser.EolContext ctx);

	void enterAccidental(ABCMusicParser.AccidentalContext ctx);
	void exitAccidental(ABCMusicParser.AccidentalContext ctx);

	void enterNote(ABCMusicParser.NoteContext ctx);
	void exitNote(ABCMusicParser.NoteContext ctx);

	void enterField_tempo(ABCMusicParser.Field_tempoContext ctx);
	void exitField_tempo(ABCMusicParser.Field_tempoContext ctx);

	void enterFraction(ABCMusicParser.FractionContext ctx);
	void exitFraction(ABCMusicParser.FractionContext ctx);

	void enterTune(ABCMusicParser.TuneContext ctx);
	void exitTune(ABCMusicParser.TuneContext ctx);

	void enterField_composer(ABCMusicParser.Field_composerContext ctx);
	void exitField_composer(ABCMusicParser.Field_composerContext ctx);

	void enterKey_signature(ABCMusicParser.Key_signatureContext ctx);
	void exitKey_signature(ABCMusicParser.Key_signatureContext ctx);

	void enterSyllable(ABCMusicParser.SyllableContext ctx);
	void exitSyllable(ABCMusicParser.SyllableContext ctx);

	void enterLyric(ABCMusicParser.LyricContext ctx);
	void exitLyric(ABCMusicParser.LyricContext ctx);

	void enterField_default_length(ABCMusicParser.Field_default_lengthContext ctx);
	void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx);

	void enterField_track_number(ABCMusicParser.Field_track_numberContext ctx);
	void exitField_track_number(ABCMusicParser.Field_track_numberContext ctx);

	void enterString(ABCMusicParser.StringContext ctx);
	void exitString(ABCMusicParser.StringContext ctx);

	void enterField_meter(ABCMusicParser.Field_meterContext ctx);
	void exitField_meter(ABCMusicParser.Field_meterContext ctx);

	void enterTriplet(ABCMusicParser.TripletContext ctx);
	void exitTriplet(ABCMusicParser.TripletContext ctx);

	void enterTuplet(ABCMusicParser.TupletContext ctx);
	void exitTuplet(ABCMusicParser.TupletContext ctx);

	void enterField_title(ABCMusicParser.Field_titleContext ctx);
	void exitField_title(ABCMusicParser.Field_titleContext ctx);

	void enterComment(ABCMusicParser.CommentContext ctx);
	void exitComment(ABCMusicParser.CommentContext ctx);

	void enterPitch(ABCMusicParser.PitchContext ctx);
	void exitPitch(ABCMusicParser.PitchContext ctx);

	void enterField_voice(ABCMusicParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicParser.Field_voiceContext ctx);
}