package Logic;

public class StringChecks {
    public static boolean isNumeric(String string) {
        try {
            int intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException ignored) {}
        return false;
    }

    public static boolean isMathematicalOperator(String btnTxt) {
        switch (btnTxt) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }

    public static boolean isEqualOperation(String btnText) {
        return btnText.equals("=");
    }
}