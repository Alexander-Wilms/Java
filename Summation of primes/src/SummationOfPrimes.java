// https://projecteuler.net/problem=10
// http://www.algolist.net/Algorithms/Number_theoretic/Sieve_of_Eratosthenes
public class SummationOfPrimes {

	public static void main(String[] args) {
		int N = 2000000;
		long sum = 0;
		int k = 1;
		boolean done = false;
		
		boolean[] isComposite = new boolean[N-1];
		
		for(boolean b: isComposite)
			b = false;
		
		for(int m = 2; m < N; m++) {
			if(!isComposite[m-1]) {
				System.out.println(m);
				sum += m;
				done = false;
				k = 1;
				while(!done) {
					if(k*m < N)
						isComposite[k*m-1] = true;
					else
						done = true;
					k++;
				}
			}
		}
		
		System.out.println(sum);
	}
}
