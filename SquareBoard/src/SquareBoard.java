// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
public class SquareBoard {

	public static void main(String[] args) {
		int n = 5;
		
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}