public class TenThousandAndFirstPrime {

	public static void main(String[] args) {
		int NoOfPrimes = 0;
		int  numberToBeTested = 1;
		int sum = 0;
		
		while(NoOfPrimes < 10001) {
			numberToBeTested++;
			sum = 0;
			
			for(int i = 1; i <= numberToBeTested; i++) {
				if(numberToBeTested%i == 0)
					sum++;
			}
			
			// primes are only divisible by 1 and themselves
			if(sum == 2) {
				
				NoOfPrimes++;
				//System.out.println("Primzahl " + NoOfPrimes + ": " + numberToBeTested);
			}
			
		}
		
		System.out.println(numberToBeTested);
	}
}
