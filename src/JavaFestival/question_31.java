package JavaFestival;

import java.util.Scanner;

public class question_31 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("입력 : ");
            int n = sc.nextInt();
            System.out.println(factorial(n));
        }
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
