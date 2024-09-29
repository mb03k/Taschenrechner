package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
    public Frame() {
        super("Taschenrechner");
        JLabel label = new JLabel("Geeks Premier League 2023");
        this.add(label);
        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JFrame getFrame() {
        return this;
    }
}
