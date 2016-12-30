// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
public class CheckerBoard {

	public static void main(String[] args) {
		int n = 7;
		
		for(int row = 1; row <=n; row++) {
			for(int col = 1; col <=n; col++) {
				if(row%2 == 1)
					System.out.print("# ");
				else
					System.out.print(" #");
			}
			System.out.println();
		}

	}

}
