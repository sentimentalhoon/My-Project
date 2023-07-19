package JavaFestival;

import java.util.Random;
import java.util.Scanner;

public class question_29 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random ran = new Random();
            int chance = 5;
            while (true) {
                int n = ran.nextInt(10) + 1;
                int m = ran.nextInt(10) + 1;
                int k = 0;
                System.out.printf("%d + %d = ", n, m);
                k = sc.nextInt();
                if (n + m == k) {
                    System.out.println("SUCCESS!!");
                } else {
                    System.out.println("Fail.....!!");
                    chance--;
                    if (chance <= 0) {
                        System.out.println("GAME OVER!");
                        break;
                    }
                }
            }
        }
    }
}
