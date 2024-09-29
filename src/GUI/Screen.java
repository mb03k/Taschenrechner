package GUI;

import java.awt.*;
import javax.swing.*;

public class Screen {
    private JFrame frame;

    private JTextArea textArea = new JTextArea();
    private JButton ac = new JButton("AC");
    private JButton divide = new JButton("/");
    private JButton multiplie = new JButton("*");
    private JButton del = new JButton("DEL");
    private JButton minus = new JButton("-");
    private JButton plus = new JButton("+");
    private JButton equals = new JButton("=");
    private JButton modulo = new JButton("%");
    private JButton dot = new JButton(".");

    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton zero = new JButton("0");

    public Screen(JFrame frame) {
        this.frame = frame;
        frame.setVisible(true);
    }

    public void setButtons() {
        setGridLayoutWithButtons();
    }

    public void setGridLayoutWithButtons() {
        frame.setLayout(new GridLayout());
        JTextArea ta = new JTextArea();
        JPanel panel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        panel.setLayout(new GridLayout(2,0));
        //textPanel.setLayout(new GridLayout());
        buttonPanel.setLayout(new GridLayout(5,4));

        ta.append("HAUS");
        textPanel.add(ta);

        buttonPanel.add(ac);
        buttonPanel.add(divide);
        buttonPanel.add(multiplie);
        buttonPanel.add(del);

        buttonPanel.add(seven);
        buttonPanel.add(eight);
        buttonPanel.add(nine);
        buttonPanel.add(minus);

        buttonPanel.add(four);
        buttonPanel.add(five);
        buttonPanel.add(six);
        buttonPanel.add(plus);

        buttonPanel.add(one);
        buttonPanel.add(two);
        buttonPanel.add(three);
        buttonPanel.add(equals);

        buttonPanel.add(dot);
        buttonPanel.add(zero);
        buttonPanel.add(modulo);

        // removes marker of the text when buttons are clicked
        for (Component comp : buttonPanel.getComponents()) {
            if (comp instanceof JButton) {
                ((JButton) comp).setFocusPainted(false);
            }
        }

        panel.add(textPanel);
        panel.add(buttonPanel);
        frame.add(panel);
    }

    public void setButtonListener() {

    }
}
