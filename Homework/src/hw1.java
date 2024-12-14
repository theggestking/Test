
public class hw1 {

	public static void isPrime(int num) {
		if (num == 2) {
			System.out.println(true);
			return;
		}
		if (num <= 1 || num % 2 == 0) {
			System.out.println(false);
			return;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);

	}

}
