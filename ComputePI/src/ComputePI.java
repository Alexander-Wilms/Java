// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html

public class ComputePI {

	public static void main(String[] args) {
		long maxDenominator = 10000000L;
		double sum = 0;
		
		for(long i = 1;i<=maxDenominator;i++) {
			// System.out.println(i);
			if(i%4 == 1) {
				sum += (double) 1/i;
			} else if(i%4 == 3) {
				sum -= (double) 1/i;
			}
		}
		
		sum*=4;
		
		System.out.println("Computed: " + sum);
		System.out.println("Math.PI:  " + Math.PI);
		System.out.println("Difference: " + (Math.PI - sum));
		
		

	}

}
