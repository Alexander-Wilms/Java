// https://projecteuler.net/problem=6
public class SumSquareDifference {

	public static void main(String[] args) {
		long sumOfSquares = 0;
		long SquareOfSums = 0;
		
		for(int i = 1; i <= 100; i++) {
			sumOfSquares += Math.pow(i, 2);
			SquareOfSums += i;
		}
		
		SquareOfSums = (long) Math.pow(SquareOfSums, 2);
		
		long difference = SquareOfSums - sumOfSquares;
		
		System.out.println(difference);

	}

}
