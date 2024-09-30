package Logic;

import javax.swing.*;
import java.util.ArrayList;

public class ButtonClick {
    private int firstNumber = 0;
    private int secondNumber = 0;
    private String operation;

    public ButtonClick() {

    }

    public void mathematicalOperatorBtnClick(int firstNumber, String operation) {
        this.firstNumber = firstNumber;
        this.operation = operation;
    }

    public void calculateResult(int secondNumber) {
        this.secondNumber = secondNumber;

        System.out.println(checkOperation().toString());
    }

    public String checkOperation() {
        switch (operation) {
            case "+":
                return String.valueOf(firstNumber += secondNumber);
            case "-":
                return String.valueOf(firstNumber -= secondNumber);
            case "*":
                return String.valueOf(firstNumber *= secondNumber);
            case "/":
                return String.valueOf(firstNumber /= secondNumber);
            case "DEL":
                
            case ".":
                break;
        }
        return "";
    }

}
