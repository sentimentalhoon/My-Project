package JavaFestival;

import java.util.Scanner;

public class question_27 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("======= 채점하기 =======");
            String[] strArray = sc.next().split("");

            int sum = 0;
            int n = 1;
            for (String str : strArray){
                if (str.equals("o")){
                    sum += n;
                    n++;
                } else {
                    n = 1;
                }
            }
            System.out.println(sum);
        }
    }
}
