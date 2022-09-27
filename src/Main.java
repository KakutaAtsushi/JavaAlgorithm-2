import java.util.Scanner;

public class Main {
    static int left;
    static int right;

    public static void main(String[] args) {
        new Main().multiplexMath();
    }

    public void multiplexMath() {
        Scanner scanner = new Scanner(System.in);
        String receiveString = scanner.next();
        if (operandChecker(receiveString).equals("Error")) {
            System.out.println("Error");
            return;
        }

        left = Integer.parseInt(receiveString.substring(0, receiveString.indexOf(operandChecker(receiveString))));
        right = Integer.parseInt(receiveString.substring(receiveString.indexOf(operandChecker(receiveString)) + 1));
        if (receiveString.contains("+")) {
            System.out.println(plusOperand());
        } else if (receiveString.contains("-")) {
            System.out.println(minusOperand());
        } else if (receiveString.contains("*")) {
            System.out.println(multiplicationOperand());
        } else if (receiveString.contains("/")) {
            System.out.println(quotientOperand());
        }
    }

    private static String operandChecker(String receiveString) {
        if (receiveString.contains("+")) {
            return "+";
        } else if (receiveString.contains("-")) {
            return "-";
        } else if (receiveString.contains("*")) {
            return "*";
        } else if (receiveString.contains("/")) {
            return "/";
        }
        return "Error";
    }

    private static int plusOperand() {
        return left + right;
    }

    private static int minusOperand() {
        return left - right;
    }

    private static int multiplicationOperand() {
        return left * right;
    }

    private static int quotientOperand() {
        return left / right;
    }
}

