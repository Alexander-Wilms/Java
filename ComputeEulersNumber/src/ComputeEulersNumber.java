// http://www.intmath.com/exponential-logarithmic-functions/calculating-e.php
public class ComputeEulersNumber {
	
	static double e = 0;
	
	static long factorial(long k) {
		long factorial = 1;
	
		for (int i = 1; i <= k; i++) {
			factorial = factorial * i;
		}
	
		return factorial;
	}
	
	static double brothersFormulaSummand(long n) {
		return (double) (2*n+2)/factorial(2*n+1);
	}
	
	static double brothersFormula(long steps) {
		for(long n = 0; n <= steps; n++) {
			e += brothersFormulaSummand(n);		
		}
		return e;
	}
	
	public static void main(String[] args) {
		System.out.println(brothersFormula(30));

	}
}
