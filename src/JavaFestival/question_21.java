package JavaFestival;

import java.util.Arrays;

public class question_21 {
    public static void main(String[] args) {
        int[] point = { 92, 32, 52, 9, 81, 2, 68 };
        int gap = 0;
        int resultAddress1 = 0, resultAddress2 = 0;

        for (int i = 0; i < point.length; i++) {
            for (int j = 1 + i; j < point.length; j++) {
                int k = Math.abs(point[i] - point[j]);
                if (gap == 0) {
                    gap = k;
                    resultAddress1 = i;
                    resultAddress2 = j;
                    continue;
                }
                if (k < gap) {
                    gap = k;
                    resultAddress1 = i;
                    resultAddress2 = j;
                }
            }
        }
        System.out.println(
                "배열 : " + Arrays.toString(point) + "\n"
                        + resultAddress1 + " / " + resultAddress2);
    }
}
