package lesson12;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MIniMusicPlayer1 {
    static JFrame f = new JFrame("Музычка");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        MIniMusicPlayer1 mini = new MIniMusicPlayer1();
        mini.go();
    }

    public void setUpGUI() {
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public void go() {
        setUpGUI();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(ml, new int[]{127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            int r = 0;

            for (int i = 5; i < 1222; i += 4) {
                r = (int) ((Math.random() * 66) + 1);
                track.add(makeEvent(122, 1, r, 100, i));
                track.add(makeEvent(144, 1, 127, 0, i));
                track.add(makeEvent(178, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(443);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
        }
        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (msg) {
                Graphics2D g2 = (Graphics2D) g;
                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);
                g.setColor(new Color(r, gr, b));
                int hr = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);

                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);
                g.fillOval(x, y, hr, width);
                msg = false;
            }
        }
    }
}


