package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class question_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("정수를 입력하여 주십시요 : ");
            int num = sc.nextInt();
            int k = 1;
            int[][] array = new int[num][num];
            for (int i = 0; i < num; i++){
                if (i % 2 == 0){
                    for (int j = 0; j < num; j++){
                        array[i][j] = k++;
                    }
                } else {
                    for (int j = num - 1; j >= 0; j--){
                        array[i][j] = k++;
                    }
                }
            }

            for (int i = 0; i < num; i++){
                System.out.println(Arrays.toString(array[i]));
            }
        }
    }
}
