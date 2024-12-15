
public class speedrun {

	public static void noContinue() {

		for (int i = 1; i < 40; i += 2) {
			System.out.println(i);
		}

	}

	public static void withContinue() {

		for (int i = 1; i < 40; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}

	}

}
