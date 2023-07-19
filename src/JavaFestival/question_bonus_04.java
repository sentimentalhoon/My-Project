package JavaFestival;

import java.util.Scanner;

public class question_bonus_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 5;
            int[] loop = new int[n];
            
            for (int i = 0; i < n; i ++){
                System.out.printf("%d 번째 별의 수 : ", (i + 1));
                loop[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++){
                String str = loop[i] + " : ";
                for (int j = 0; j < loop[i]; j++){
                    str += "*";
                }
                System.out.println(str);
            }
        }
    }
}
