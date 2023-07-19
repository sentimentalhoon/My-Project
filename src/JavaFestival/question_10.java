package JavaFestival;

import java.util.Arrays;
import java.util.Random;

public class question_10 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random ran = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(100) + 1;
        }

        System.out.printf("배열에 있는 모든 값 : %s", Arrays.toString(array));
        System.out.print("\n/************ Arrays.sort() 를 사용 ***********/");
        Arrays.sort(array);
        System.out.printf("\n배열에 있는 모든 값 : %s", Arrays.toString(array));
        System.out.printf("\n가장 큰 값 : %d", array[array.length - 1]);
        System.out.printf("\n가장 작은 값 : %d", array[0]);

        int min = array[0], max = 0;
        for (int i : array) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        System.out.printf("\n가장 큰 값 : %d", max);
        System.out.printf("\n가장 작은 값 : %d", min);

        min = 0;
        max = 0;
        for (int i : array){
            if (max < i) max = i;
            min = (min == 0 ? i : min > i ? i : min);
        }

        System.out.printf("가장 큰 값 : %d\n", max);
        System.out.printf("가장 작은 값 : %d", min);
    }
}