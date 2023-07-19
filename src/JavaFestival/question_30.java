package JavaFestival;

import java.util.Scanner;

public class question_30 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== 알파벳 빈도수 구하기 ===");
            System.out.print("입력 >> ");
            String stringArray = sc.nextLine().toLowerCase();       

            for (int i = 'a'; i <= 'z'; i++){
                System.out.println((char)(i) + " : " + countChar(stringArray, (char) (i)));
            }
        }

    }

    private static int countChar(String str, char ch){
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
