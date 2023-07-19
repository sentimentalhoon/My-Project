package JavaFestival;

import java.util.Scanner;

public class question_24 {
    public static void main(String[] args) {
        int n = 0, x = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("N 입력 : ");
            n = sc.nextInt();
            System.out.print("X 입력 : ");
            x = sc.nextInt();
            
            String str = "결과 >> ";
            for (int i = 0; i < n; i++){
                System.out.print((i + 1) + "번째 정수 입력 : ");
                int j = sc.nextInt();
                if (j < x){
                    str += j + " ";
                }     
            }
            System.out.println(str);
        }
    }
}
