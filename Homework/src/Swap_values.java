
public class Swap_values {

	public static int[] Swap_3(int num1, int num2) {

		  int t = num1;
		    num1 = num2;
		    num2 = t;

		    System.out.println(num1 + " " + num2);
		    return new int[] { num1, num2 }; // Return both swapped values
	}
	
	public static int[] Swap_2(int num1, int num2) {
		
		num1 = num1 + num2; // Step 1: num1 now holds the sum of num1 and num2
	    num2 = num1 - num2; // Step 2: num2 becomes the original num1
	    num1 = num1 - num2; // Step 3: num1 becomes the original num2
		
		System.out.println(num1 + " " + num2);
		return new int[] { num1, num2 };
	}

}
