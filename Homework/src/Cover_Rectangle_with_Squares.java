
public class Cover_Rectangle_with_Squares {

	public static double Amount_Needed(double A, double B, double K) {

		double row =  Math.ceil(B / K);

		double column =  Math.ceil(A / K);
         
		System.out.println("Area of your rectangle = " + (A * B));
		System.out.println("Squares of length K needed to cover it = "+ (int)(row * column));
		return (int)row * column;
	}

}
