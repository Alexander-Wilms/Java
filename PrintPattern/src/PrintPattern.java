// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html#zz-2.3
public class PrintPattern {

	public static void main(String[] args) {
		int size = 7;
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row >= col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row+col <= size+1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row <= col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row+col >= size+1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row == 1 || row == size || col == 1 || col == size) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row == 1 || row == size || col == row) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row == 1 || row == size || col == size-row+1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row == 1 || row == size || col == size-row+1 || row == col) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row == 1 || row == size || col == size-row+1 || row == col || col == 1 || col == size) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
