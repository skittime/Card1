package lesson11;

import javax.sound.midi.*;
import java.io.InputStream;
import java.util.Scanner;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        int[] b = new int[2];
        Scanner read = new Scanner(System.in);
        b[0] = read.nextInt();
        Scanner read1 = new Scanner(System.in);
        b[1] = read1.nextInt();

        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (b[0] == 0 & b[1] == 0) {
            System.out.println("Не введены данные для проигрывания");
        } else {
            int instrument = b[0];
            int note = b[1];
            mini.play(instrument, note);
        }

    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(144, 1, instrument, 101);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);


            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
