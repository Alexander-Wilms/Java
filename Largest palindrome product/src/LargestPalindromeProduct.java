// https://projecteuler.net/problem=4
public class LargestPalindromeProduct {

	static boolean isPalindrome(long n) {
		Long myN = new Long(n);
		String myNString = myN.toString();
		boolean isPalindrome = true;
		while(myNString.length() > 1 && isPalindrome == true) {
			if(myNString.charAt(0) == myNString.charAt(myNString.length()-1)) {
				// System.out.println(myNString);
				myNString = myNString.substring(1, myNString.length()-1);
			} else
				isPalindrome = false;
		}
		
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		boolean done = false;
		long palindrome = 0;
		
		for(long i = 999; i >= 100; i--){
			for(long j = 999; j >= 100; j--){
				if(isPalindrome(i*j) && i*j > palindrome) {
					palindrome = i*j;
				}
			}
		}
		
		System.out.println(palindrome);
	}
}
