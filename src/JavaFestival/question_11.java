package JavaFestival;

import java.util.Scanner;

public class question_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("첫번째 숫자 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            int num2 = sc.nextInt();

            System.out.println("결과확인 : " + isDivide(num1, num2));
        }
    }

    private static Boolean isDivide(int num1, int num2) {
        return (num1 % num2 == 0);
    }
}