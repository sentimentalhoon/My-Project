package JavaFestival;

public class question_03 {
    public static void main(String[] args) {
                /**
         * 
         * 문제 3. 
         * 
         * 1-2+3-4+5......+99-100 을 계산하여 답(-50)을 출력하시오.
         * 
         * 홀수일때는 더해주고 짝수일 때는 가감하여 준다.
         */
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
                stringBuilder.append("+" + i + " ");
            } else {
                sum -= i;
                stringBuilder.append("-" + i + " ");
            }
        }
        System.out.println(stringBuilder.toString());
        System.out.printf("결과 : %d", sum);
    }
}
