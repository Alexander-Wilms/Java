// https://projecteuler.net/problem=9
public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {		
		int a = 1, b = 1, c = 1;
		
		for(a = 1; a <= 1000; a++) {
			for(b = 1; b <= 1000; b++) {
				for(c = 1; c <= 1000; c++) {
					if(a < b && b < c && (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) && (a+b+c == 1000)) {
						System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
						System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
						System.out.println("a*b*c = " + a*b*c);
					}
				}
			}
		}

		
	}
}
