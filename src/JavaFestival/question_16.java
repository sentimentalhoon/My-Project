package JavaFestival;

import java.util.Scanner;

public class question_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("정수 입력 : ");
            String[] str = sc.next().split("");
            int sum = 0;

            for (String strInt : str){
                sum += Integer.valueOf(strInt);
            }
            System.out.printf("합은 %d 입니다.",sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
