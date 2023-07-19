package JavaFestival;

import java.util.Scanner;

public class question_04 {
    public static void main(String[] args) {
        try (/**
                 * 
                 * 문제 4.
                 * 
                 * 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오.
                 * 단 최대 단위는 10,000원, 최소 단위는 100원이다.
                 * 
                 */
        Scanner sc = new Scanner(System.in)) {
            System.out.print("총 금액 입력 : ");
            int money = sc.nextInt();
            System.out.println("잔돈 : " + money);
            
            System.out.println("================= 1번 풀이법 ================");
            System.out.println("10,000원 : " + money / 10000);
            System.out.println("5,000원 : " + money % 10000 / 5000);
            System.out.println("1,000원 : " + money % 10000 % 5000 / 1000);
            System.out.println("500원 : " + money % 10000 % 5000 % 1000 / 500);
            System.out.println("100원 : " + money % 10000 % 5000 % 1000 % 500 / 100);

            System.out.println("================= 2번 풀이법 ================");
            int[] cointUnit = { 10000, 5000, 1000, 500, 100 };
            for (int i : cointUnit){
                System.out.println(i + "원 : " + money / i);
                money %= i;
            }
        }        
    }
}
