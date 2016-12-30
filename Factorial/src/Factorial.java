// http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html#zz-2.3
public class Factorial {
   // Print factorial of n
   public static void main(String[] args) {  // Set an initital breakpoint at this statement
      int n = 20;
      long factorial = 1;

      // n! = 1*2*3...*n
      for (int i = 1; i <= n; i++) {
         factorial = factorial * i;
      }
      System.out.println("The Factorial of " + n + " is " + factorial);
   }
}