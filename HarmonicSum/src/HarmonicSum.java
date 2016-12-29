
// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
public class HarmonicSum {
	public static void main(String[] args) {
		int n = 50000;
		double harmonic = 0;
		
		for(int i=1;i<=n;i++) {
			harmonic += (double) 1/n;
		}
		
		System.out.println(harmonic);
		
		harmonic = 0;
		
		for(int i = n;i>=1;i--) {
			harmonic += (double) 1/n;
		}
		
		System.out.println(harmonic);
	}
}
