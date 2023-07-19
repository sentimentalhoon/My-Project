package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class question_bonus_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[5];
            for (int i = 0; i < 5; i++){
                System.out.print((i + 1) + "번째 정수 입력 : ");
                array[i] = sc.nextInt();
            }

            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
    }
}
