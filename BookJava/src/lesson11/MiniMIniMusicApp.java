package lesson11;

import javax.sound.midi.*;

public class MiniMIniMusicApp {
    public static void main(String[] args) {
        MiniMIniMusicApp mini = new MiniMIniMusicApp();
        mini.play();

    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 55, 101);
            MidiEvent noteOn = new MidiEvent(a, 11);
            track.add(noteOn);


            ShortMessage b = new ShortMessage();
            MidiEvent noteOff = new MidiEvent(b, 88);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
