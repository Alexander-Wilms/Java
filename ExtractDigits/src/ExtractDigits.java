// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html

public class ExtractDigits {

	public static void main(String[] args) {
		int input = 15423;
		int tmp;
		
		while(input > 0) {
			tmp = input % 10;
			input /= 10;
			System.out.print(tmp + " ");
		}
	}
}
