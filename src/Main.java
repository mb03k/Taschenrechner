import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import GUI.Frame;
import GUI.Screen;

public class Main {
    public static void main(String[] Args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new Frame();

            Screen screen = new Screen(frame);
            screen.setButtonScreen();
        });
    }
}
