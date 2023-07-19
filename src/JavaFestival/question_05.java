package JavaFestival;

import java.util.Scanner;

public class question_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("행 개수 : ");
            int row = sc.nextInt();

            for (int i = 0; i < row; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
