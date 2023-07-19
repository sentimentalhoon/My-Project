package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class question_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("정수를 입력하여 주세요 : ");
            int num = sc.nextInt();
            int[][] array = new int[num][num];
            for (int i = 0; i < num; i++) {
                array[i][0] = i + 1;
                for (int j = 1; j < num; j++){
                    array[i][j] = array[i][j-1] + num;
                }

                System.out.println(Arrays.toString(array[i]));
            }
        }     
    }
}