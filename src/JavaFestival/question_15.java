package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class question_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("n 값을 입력하여 주세요 : ");
            int n = sc.nextInt();
            int sum = 1;
            int[] array = new int[n];
            for (int i = 0; i < n; i++){
                sum += i;
                array[i]= sum;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
