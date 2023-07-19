package JavaFestival;

import java.util.Scanner;

public class question_bonus_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("첫번째 수 : ");
            int num1 = sc.nextInt();

            System.out.print("두번째 수 : ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 (+, -, *, /) : ");
            char op = sc.next().charAt(0);

            System.out.println(cal(num1, num2, op));
        }
    }

    private static int cal(int num1, int num2, char op) {
        if (op == '+') {
            return num1 + num2;
        } else if (op == '-') {
            return num1 - num2;
        } else if (op == '*') {
            return num1 * num2;
        } else if (op == '/') {
            return num1 / num2;
        } else {
            return 0;
        }
    }
}
