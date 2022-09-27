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
        if (receiveString.contains("+")) {
            left = Integer.parseInt(receiveString.substring(0, receiveString.indexOf("+")));
            right = Integer.parseInt(receiveString.substring(receiveString.indexOf("+") + 1));
            System.out.println(plusOperand());
        } else if (receiveString.contains("-")) {
            left = Integer.parseInt(receiveString.substring(0, receiveString.indexOf("-")));
            right = Integer.parseInt(receiveString.substring(receiveString.indexOf("-") + 1));
            System.out.println(minusOperand());
        } else if (receiveString.contains("*")) {
            left = Integer.parseInt(receiveString.substring(0, receiveString.indexOf("*")));
            right = Integer.parseInt(receiveString.substring(receiveString.indexOf("*") + 1));
            System.out.println(multiplicationOperand());
        } else if (receiveString.contains("/")) {
            left = Integer.parseInt(receiveString.substring(0, receiveString.indexOf("/")));
            right = Integer.parseInt(receiveString.substring(receiveString.indexOf("/") + 1));
            System.out.println(quotientOperand());
        }
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

//    public int math() {
//        Scanner scanner = new Scanner(System.in);
//        int left = scanner.nextInt();
//        int right = scanner.nextInt();
//        int total = left + right;
//        if (left <= -10000 || right >= 10000 || total >= -10000 && total <= 10000) {
//            return total;
//        }
//        return 0;
//    }
}

