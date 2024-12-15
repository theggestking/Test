
public class Sum_of_Digits {

	public static int Your_Number(int a) {

		int result = 0;
		while (a != 0) {
			int digit = a % 10;
			a = a / 10;

			result = result + digit;
		}

		System.out.println(result);
		return result;
	}

}
