package JavaFestival;

import java.util.Scanner;

public class question_17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 10;
            String str = "";
            for (int i = 0; i < n ; i++){
                System.out.print((i + 1) + " 번째 정수 : ");
                int num = sc.nextInt();
                if (num % 3 == 0){
                    str += num + " ";
                }
            }
            System.out.println("3의 배수 : " + str);
        }
    }
}
