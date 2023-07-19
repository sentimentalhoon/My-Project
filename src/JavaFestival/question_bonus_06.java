package JavaFestival;

public class question_bonus_06 {
    public static void main(String[] args) {
        int base = 2, n = 3;
        System.out.println("결과 확인[Math.pow 사용] : " + powerN(base, n));
        System.out.println("결과 확인[재귀 사용] : " + powerNRecursion(base, n));
        System.out.println("결과 확인[For 사용] : " + powerNFor(base, n));
    }

    private static int powerN(int base, int n) {
        return (int) (Math.pow(base, n));
    }

    private static int powerNRecursion(int num, int pow) {
        if (pow == 0)
            return 1;
        else
            return num * powerN(num, pow - 1);
    }

    private static int powerNFor(int num, int power) {
        int answer = 1;
        if (num > 0 && power == 0) {
            return answer;
        } else if (num == 0 && power >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= power; i++) {
                answer = answer * num;
            }
            return answer;
        }
    }
}