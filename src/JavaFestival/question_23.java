package JavaFestival;

import java.util.Arrays;

public class question_23 {
    public static void main(String[] args) {
        int n = 5;
        int[][] beforeArray = new int[n][n];
        int[][] afterArray = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                beforeArray[i][j] = num++;
            }
        }
        System.out.println("=======원본======");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(beforeArray[i]));
        }

        System.out.println("=======왼쪽 90도 회전 후=======");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                afterArray[i][j] = beforeArray[j][beforeArray[i].length - 1 - i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(afterArray[i]));
        }
    }
}