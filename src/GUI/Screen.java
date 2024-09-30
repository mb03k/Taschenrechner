package GUI;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Logic.ButtonClick;
import static Logic.StringChecks.*;

public class Screen {
    private JFrame frame;

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

    private JPanel textPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JTextArea textArea = new JTextArea();
    private ButtonClick bc = new ButtonClick();

    private ArrayList<String> inputContainer = new ArrayList<>();
    private int currentNumber = 0;

    public Screen(JFrame frame) {
        this.frame = frame;
        frame.setVisible(true);
    }

    public void setButtonScreen() {
        setGridLayoutWithButtons();
        setButtonListener();
    }

    public void setGridLayoutWithButtons() {
        frame.setLayout(new BorderLayout());
        buttonPanel.setLayout(new GridLayout(5,4));
        textArea.setFont(new Font("Arial", Font.PLAIN, 30));

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

        textPanel.add(textArea);

        frame.add(textPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
    }

    public void setButtonListener() {
        for (Component comp : buttonPanel.getComponents()) {
            JButton btn = (JButton) comp;
            btn.setFont(new Font("Arial", Font.PLAIN, 30));

            btn.setFocusPainted(false);
            btn.addActionListener(e -> handleButtonClick(btn));
        }
    }

    public void handleButtonClick(JButton btn) {
        /*
         * case 1:
         * number was clicked
         *  -> add number to ArrayList
         *  
         * case 2:
         * operator was clicked
         *  -> send ArrayList as String with the operator to second method
         */

        String btnText = btn.getText();
        textArea.append(btnText);

        if (isNumeric(btnText)) {
            inputContainer.add(btnText);
        } else if (isMathematicalOperator(btnText)) {
            String input = String.join("", inputContainer);
            currentNumber = Integer.parseInt(input);

            bc.mathematicalOperatorBtnClick(currentNumber, btnText);
        } else {
            if (isEqualOperation(btnText)) {
                bc.calculateResult(currentNumber);
            }
        }
    }
}
