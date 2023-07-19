package JavaFestival;

import java.util.Scanner;

public class question_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("숫자입력 : ");
            int num = sc.nextInt();
            System.out.println("======= Math.round 함수 사용 ========");
            System.out.printf("반올림 수 : %d\n", Math.round(num*0.1) * 10);

            System.out.println("======== 10으로 나눈 후 일의 자리 값을 구하여 반올림 ======");
            int divNum = num % 10;
            if (divNum >= 5) {
                System.out.printf("반올림 수 : %d", ((num - divNum) + 10));
            } else {
                System.out.printf("반올림 수 : %d", (num - divNum));
            }
        }
    }
}
