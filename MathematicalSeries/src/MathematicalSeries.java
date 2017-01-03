// https://en.wikipedia.org/wiki/Series_(mathematics)
import java.util.Locale;
import java.util.Scanner;

public class MathematicalSeries {

	private static double sum = 0;
	private static int iteration = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Enter number:");
		
		double input = sc.nextDouble();
		
		sc.close();
		
		series(input);

	}

	private static void series(double input) {
		iteration++;
		
		System.out.println(sum);
		
		sum += input;
		if(iteration < 100)
			series(input/2);
	}

}
