// https://projecteuler.net/problem=14
public class LongestCollatzSequence {

	static long length = 0;
	
	static long collatz(long n) {
		//System.out.println(n);
		length++;
		if(n == 1)
			return 1;
		else if(n%2 == 0)
			return collatz(n/2);
		else
			return collatz(3*n+1);
	}
	
	public static void main(String[] args) {
		long maxLength = 0;
		long maxLengthStartValue = 0;
		
		for(int i = 1000000-1; i >= 1; i--) {
			length = 0;
			collatz(i);
			if(length > maxLength) {
				maxLength = length;
				maxLengthStartValue = i;
			}
		}
		
		System.out.println(maxLengthStartValue);
	}
}
