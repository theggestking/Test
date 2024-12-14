import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your number");
		if(!scan.hasNextInt()) {
			System.out.println("Invalid input");
			scan.close();
			return;
		}
		int number = scan.nextInt();
		scan.close();
		

		if (isPrime(number))
			System.out.println("Your number is prime");
		else
			System.out.println("Your number isn't prime");
System.out.println("hi");
System.out.println();
	}
	
	public static boolean isPrime(int num) {
         
		if(num == 2) 
			return true;
		if (num <= 1 || num % 2 == 0)
			return false;

		
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
