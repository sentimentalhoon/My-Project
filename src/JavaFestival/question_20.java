package JavaFestival;

import java.util.Scanner;

public class question_20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("숫자 입력 : ");
            int radixNum = sc.nextInt();

            /************** Integer.toString 라이브러리 사용 **********/
            System.out.println(Integer.toString(radixNum, 2));
            /************** Integer.toBinaryString 라이브러리 사용 **********/
            System.out.println(Integer.toBinaryString(radixNum));
            /************** while 반복문 사용 ***********/
            String numNStr = "";
            while(radixNum > 0){
                numNStr = String.valueOf(radixNum % 2) + numNStr;
                radixNum /= 2;
            }
            System.out.println(numNStr);
        }
    }
}