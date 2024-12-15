
public class TwoDigit_Numbers_Divisible_by_Digit_Sum {

	public static int numbers() {

		int result = 0;
		int amount = 0;
		for (int i = 10; i < 100; i++) {
			int currentNumber = i;

			while (currentNumber != 0) {
				int digit = currentNumber % 10;
				currentNumber = currentNumber / 10;
				result = result + digit;

			}
			if (i % result == 0) {
				System.out.println(i);
				amount++;
			}
			result = 0;

		}

		System.out.println(amount);
		return amount;
	}

}
