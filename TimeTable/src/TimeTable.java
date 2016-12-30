// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
public class TimeTable {

	public static void main(String[] args) {
		boolean print = true;
		
		for(int row = 0; row <= 9; row++) {
			for(int col = 0; col <= 9; col++) {
				print = true;
				
				if(row == 0 && col == 0) {
					System.out.print(" * |");
					print = false;
				}
					
				if(print == true) {
					if(row*col > 0){
							System.out.printf("%2d ", row * col);
					} else {
						System.out.printf("%2d ", row + col);
						if(col == 0)
							System.out.print("|");
					}
					
				}
				
				if(row == 0 && col == 9) {
					System.out.println();
					System.out.print("-------------------------------");
				}
			}
			System.out.println();
		}

	}

}
