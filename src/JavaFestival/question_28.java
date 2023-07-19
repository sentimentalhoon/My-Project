package JavaFestival;

import java.util.Scanner;

public class question_28 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("2진수로 입력하여 주십시요. (0,1만 이용 가능!) : ");

            String str2Num = sc.next();
            String[] str2NumSplit = str2Num.split("");
            /******* Integer.parseInt 사용 ******/
            System.out.printf("%s(2) = %d(10)", str2Num, Integer.parseInt(str2Num, 2));
            System.out.println(str2Num + "(2) = " +  Integer.parseInt(str2Num, 2) + "(10)");
            /******* For 문 사용 ******/
            int sum = 0;
            int sqr = 0;
            // 1 1 1 0  0 0 0 1
            // 기본적으로 for문 1회 돌 때 sql 값도 +1 증가 시켜준다.
            // 1일 때는 sum 에 합쳐준다.
            // 1 (2^6)
            // 1 (2^5)
            // 0 (2^4)
            // 0 (2^3) 
            // 0 (2^2)
            // 0 (2^1)
            // 1 (2^0)
            for (int i = str2NumSplit.length - 1; i >= 0; i--) {
                sqr++;
                if (str2NumSplit[i].equals("0")) {
                    sqr++;
                } else if (str2NumSplit[i].equals("1")) {
                    sum += Math.pow(2, sqr);
                    sqr++;
                }
            }
            System.out.printf("%s(2) = %d(10)", str2Num, sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
