package JavaFestival;

import java.util.Scanner;

public class question_02 {
    public static void main(String[] args) {
                /**
         * 
         * 문제 2. 
         * 
         * 일한 시간을 입력 받아 총 임금을 계산하는 시급 계산기이다.
         * 시급은 5,000원이며 8시간 보다 초과 근무한 시간에 대해 1.5의 시급이 책정된다.
         * 
         * 임금을 출력하시오.    
         * 
         */


        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("일한 시간을 입력하세요 : ");
            int workTime = sc.nextInt();
            double pay = ((workTime - (workTime % 8)) * 5000) + (workTime % 8 * 5000 * 1.5);
            System.out.printf("총 임금은 %d 원입니다.", (int) pay);
        }
    }
}
