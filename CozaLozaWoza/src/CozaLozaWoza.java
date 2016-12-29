// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html

public class CozaLozaWoza {

	public static void main(String[] args) {
		boolean thisReplaced = false;
		
		for(int i = 1;i<=110;i++) {
			thisReplaced = false;
			
			if(i%3 == 0) {
				System.out.print("Coza");
				thisReplaced = true;
			}
			if(i%5 == 0) {
				System.out.print("Loza");
				thisReplaced = true;
			}
			if(i%7 == 0) {
				System.out.print("Woza");
				thisReplaced = true;
			}
			
			if(!thisReplaced) {
				System.out.print(i);
			}
			
			if(i%11 == 0)
				System.out.println();
			else
				System.out.print(" ");
		}

	}

}
