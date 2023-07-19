package JavaFestival;

import java.util.Scanner;

public class question_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = 0, num2 = 0;
            System.out.print("단수 입력 : ");
            num1 = sc.nextInt();
            System.out.print("어느 수까지 출력 : ");
            num2 = sc.nextInt();

            System.out.printf("%d 단 출력 :\n", num1);

            for (int i = 1; i <= num2; i++) {
                System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
            }
        }
    }
}
