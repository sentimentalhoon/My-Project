package JavaFestival;

public class question_13 {
    public static void main(String[] args) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";

        char[] charArray = score.toLowerCase().toCharArray();
        for (int i = 'a'; i <= 'z'; i++){
            int charI = 0;
            for (char str : charArray){
                if (i == str){
                    charI++;
                }
            }
            if (charI > 0) System.out.printf("%c : %d 명\n", i, charI);
        }

        System.out.println("================================");

        String[] strArray = score.toLowerCase().split(",");
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("a")){
                a++;
            } else if (strArray[i].equals("b")){
                b++;
            } else if (strArray[i].equals("c")){
                c++;
            } else if (strArray[i].equals("d")){
                d++;
            } else if (strArray[i].equals("e")){
                e++;
            } else if (strArray[i].equals("f")){
                f++;
            }
        }

        System.out.printf("a : %d 명\n", a);
        System.out.printf("b : %d 명\n", b);
        System.out.printf("c : %d 명\n", c);
        System.out.printf("d : %d 명\n", d);
        System.out.printf("e : %d 명\n", e);
        System.out.printf("f : %d 명\n", f);

    }
}
