package JavaFestival;

import java.util.Scanner;

public class question_26 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int f = 0, s = 0, t = 0;

			System.out.println("첫 번째 숫자 입력");
			int num1 = sc.nextInt();
			System.out.println("두 번째 숫자 입력");
			int num2 = sc.nextInt();

			f = num1 * (num2 % 10);
			s = num1 * (num2 % 100 / 10);
			t = num1 * (num2 / 100);

			System.out.println(f);
			System.out.println(s);
			System.out.println(t);

			System.out.println(num1 * num2);
		}

	}

}
