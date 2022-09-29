package lesson.beatbox.machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySendListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        boolean[] checkBoxStats = new boolean[256];
        for (int i = 0; i < 256; i++) {
            JCheckBox check = (JCheckBox) checkboxList.get(i);
            if (check.isSelected()) {
                checkBoxStats[i] = true;
            }
        }
        try {
            FileOutputStream fileStream = new FileOutputStream(new File("Checkbox.ser"));
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(checkBoxStats);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
