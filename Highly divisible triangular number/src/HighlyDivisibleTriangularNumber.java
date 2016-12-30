// https://projecteuler.net/problem=12
public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {
		long sum = 0, index = 1, divisors = 0;
		boolean done = false;
		
		while(!done) {
			sum = 0;
			
			for(long i = 1; i <= index; i++)
				sum += i;
			
			//System.out.print(sum + ": ");
			
			divisors = 0;
			
			for(long i = 1; i <= sum; i++) {
				if(sum%i == 0) {
					divisors++;
					//System.out.print(i + " ");
				}
			}
			
			//System.out.println();
			
			if(divisors > 500)
				done = true;
			
			index++;
		}
		
		System.out.println(sum);
	}

}
