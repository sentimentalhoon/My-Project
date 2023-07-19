package JavaFestival;

import java.util.Scanner;

public class question_bonus_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("단어를 입력해 주세요 : ");
            System.out.println(getMiddle(sc.next()));
        }
    }

    private static String getMiddle(String str){
        String[] strArray = str.split("");
        int length = strArray.length;
        if (length % 2 == 0){
            return strArray[length / 2 - 1] + strArray[length / 2];
        } else {
            return strArray[length / 2];
        }        
    }
}
