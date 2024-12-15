
public class hw1_2 {

	public static int factorialOf(int num) {

		if (num < 0) {
			System.out.println("bruh");
			return 0;
		}
		if (num == 0 || num == 1) {
			System.out.println(1);
			return 1;
		}
		int value = 1;

		for (int i = 1; i <= num; i++) {
			value *= i;

		}
		System.out.println(value);
		return value;
	}

}
