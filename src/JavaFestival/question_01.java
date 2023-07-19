package JavaFestival;

import java.util.Scanner;

public class question_01 {
    public static void main(String[] args) {
        /**
         * 
         * 문제 1. 
         * 
         * 현재 몸무게와 목표 몸무게를 각각 입력 받고
         * 주차별 감량 몸무게를 입력 받아 목표 달성 시
         * 축하 메세지를 띄우는 프로그램을 구현하시오.
         * 
         *
         */


        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("현재 몸무게 : ");
            int nowWeight = sc.nextInt();
            System.out.print("목표 몸무게 : ");
            int targetWeight = sc.nextInt();
            int i = 1;
            while (true) {
                System.out.print(i + " 주차 감량 몸무게 : ");
                int minusWeight = sc.nextInt();
                nowWeight -= minusWeight;
                if (targetWeight > nowWeight) {
                    if (nowWeight <= 0) {
                        System.out.println(nowWeight + "kg 달성!! 당신은 인간이 아닙니다.");
                        break;
                    }
                    System.out.println(nowWeight + "kg 달성!! 축하합니다.");
                    break;
                }
                i++;
            }
        }
    }
}