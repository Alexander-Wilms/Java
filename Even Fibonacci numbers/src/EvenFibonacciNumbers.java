// https://projecteuler.net/problem=2
public class EvenFibonacciNumbers {

	static long fibonacci(long n) {
		if(n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		boolean exceedingFourMillion = false;
		long i = 1;
		long sum = 0;
		
		while(!exceedingFourMillion) {
			if(fibonacci(i) > 4000000) {
				exceedingFourMillion = true;
				break;
			}
			if(fibonacci(i) % 2 == 0)
				sum += fibonacci(i);
			System.out.println(fibonacci(i));
			i++;
		}

		System.out.println("Sum: " + sum);
	}

}
