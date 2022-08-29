package lesson12;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Нажми меня");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

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

