// https://projecteuler.net/problem=5
public class SmallestMultiple {

	public static void main(String[] args) {
		long toBeTested = 0;
		int sum = 0;
		boolean evenlyDivisible = false;
		
		while(!evenlyDivisible) {
			toBeTested++;
			sum = 0;
			for(int i = 1; i <=20; i++) {
				sum += toBeTested%i;
			}
			if(sum == 0)
				evenlyDivisible = true;
		}
		
		System.out.println(toBeTested);

	}

}
