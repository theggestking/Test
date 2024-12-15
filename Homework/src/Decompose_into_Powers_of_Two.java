
public class Decompose_into_Powers_of_Two {

	public static void num(int num) {

		int max_power_needed = 0;
		int t = num;
		while (t > 1) {
			t = t / 2;
			max_power_needed++;

		}

		boolean first = true;
		for (int i = max_power_needed; i >= 0; i--) {
			if (num >= Math.pow(2, i)) {
				if (!first) {
					System.out.print(" + ");
				}
				System.out.print("2^" + i);
				num = (int) (num - Math.pow(2, i));
				first = false;
			}
		}

	}

}
