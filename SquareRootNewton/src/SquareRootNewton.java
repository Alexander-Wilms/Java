// https://www.cl.cam.ac.uk/teaching/1213/OOProg/Files/OOP_Harle_Examples_1213.pdf
// Exercise 29
// https://de.wikipedia.org/wiki/Newton-Verfahren

import java.util.Scanner;

public class SquareRootNewton {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to calculate the square root:");
		
		double input = sc.nextDouble();
		
		sc.close();
		
		sqrt(input);
	}
	
	private static double radicand;
	
	private static int iteration = 0;

	private static void sqrt(double input) {
		radicand = input;
		recursiveSqrt((input+1)/2);
	}

	private static void recursiveSqrt(double input) {
		iteration++;
		
		System.out.println(input);
		
		if(iteration < 1000)
			recursiveSqrt(input - (1-radicand/Math.pow(input, 2))/(2*radicand/Math.pow(input, 2)));
		
	}

}
