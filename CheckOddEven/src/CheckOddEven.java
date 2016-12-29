/*
 * http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
 * Trying if-else statement and modulus (%) operator.
 */
public class CheckOddEven {   // Save as "CheckOddEven.java"
   public static void main(String[] args) {  // Program entry point
      int number = 50;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if (number % 2 != 0) {
         System.out.println("Odd number");
      } else {
         System.out.println("Even number");
      }
      System.out.println("BYE!");
   }
}