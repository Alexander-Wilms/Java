// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
public class Fibonacci {

	static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1;i<=20;i++)
			System.out.println(fibonacci(i));
	}
}
