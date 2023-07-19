package JavaFestival;

public class question_06 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 78;
        for (int i = 1; i < 78; i++) {
            sum += i * (j - i);
        }
        System.out.println(sum);

        int n = 77;
        sum = 0;
        for (int i = 0; i < n; i++){
            sum+= (n - i) * (i + 1);
        }

        System.out.println(sum);
    }
}
