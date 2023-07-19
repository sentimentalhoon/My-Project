package JavaFestival;

import java.util.Scanner;

public class question_25 {
    public static void main(String[] args) {
        final int[] DASH = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("첫자리 0 을 제외한 숫자를 입력해 주세요 >> ");

            String str = sc.next();
            if (str.startsWith("0")){
                str = str.substring(1, str.length());
            }
            System.out.println(str);
            String[] input = str.split("");

            for (String in : input){
                sum += DASH[Integer.parseInt(in)];
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("대시('-')의 총 합 >> " + sum);
    }
}