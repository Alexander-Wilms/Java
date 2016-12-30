// https://projecteuler.net/problem=3
public class LargestPrimeFactor {	
	public static void main(String[] args) {
		long input = 600851475143L;
		
		for(long i = 2; i<=input; i++) {
			if(input%i == 0) {
				System.out.println(i);
				input /= i;
			}
		}
	}

}
