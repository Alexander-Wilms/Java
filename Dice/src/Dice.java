import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		
		final int COMBINATIONS = 4*6;

		int NoOfRolls = 100000000;
		
		long[] results = new long[COMBINATIONS];
		
		/*for(int i = 0; i <= NoOfRolls; i++) {
			results[(Math.abs(rand.nextInt())%6+1)-1]++;
		}*/
		
		for(int i = 0; i <= NoOfRolls; i++) {
			rand.setSeed(System.currentTimeMillis());
			int a = Math.abs(rand.nextInt())%6+1;
			int b = Math.abs(rand.nextInt())%6+1;
			int c = Math.abs(rand.nextInt())%6+1;
			int d = Math.abs(rand.nextInt())%6+1;
			int e = a+b+c+d;
			results[e-1]++;
		}
		
		long max = 0;
		
		for(int j = 0; j <= COMBINATIONS-1; j++) {
			System.out.println(j+1 + ": " + results[j]);
			if(results[j] > max)
				max = results[j];
		}
		
		System.out.println();
		
		for(int j = 0; j <= COMBINATIONS-1; j++) {
			for(int k = 1; k <= (float) results[j]/max*10; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
