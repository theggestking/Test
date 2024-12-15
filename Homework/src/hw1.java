
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

	 public static int factorialOfRecursive(int num) {
	        if (num < 0) {
	            System.out.println("fuck off");
	            return -1; // Sentinel value for invalid input
	        }

	        if (num == 0) {
	        	System.out.println(1); 
	        return 1; }// Base case 

	        int result = num * factorialOfRecursive(num - 1);

	        // Print only for the top-level recursive call
	        if (num == 4) 
	            System.out.println(result);
	        

	        return result;
	    
	}
}
