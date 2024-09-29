package GUI;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        super("Taschenrechner");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JFrame getFrame() {
        return this;
    }
}
