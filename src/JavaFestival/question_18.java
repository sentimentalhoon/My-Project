package JavaFestival;

import java.util.Arrays;
import java.util.Random;

public class question_18 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] lotto = new int[6];
        Boolean b = true;
        int n = 0, r = 0;
        while (true) {
            r = ran.nextInt(45) + 1;

            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == r) {
                    b = false;
                    break;
                }
            }

            if (b) {
                lotto[n++] = r;
                if (n == 6) {
                    break;
                }
            }
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}
