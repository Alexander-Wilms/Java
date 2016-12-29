// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
public class Product1ToN {

	public static void main(String[] args) {
		long product = 1;
		
		for(int i = 1;i<=13;i++)
		{
			product *= i;
		}
		
		System.out.println(product);

	}

}
