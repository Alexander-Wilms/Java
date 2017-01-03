import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in).useLocale(Locale.US);;
		double a, b;
		
		System.out.println("Enter first number:");
		
		a = myScanner.nextDouble();
		
		System.out.println("Enter second number:");
		
		b = myScanner.nextDouble();
		
		System.out.println(a*b);
		
	}
}
