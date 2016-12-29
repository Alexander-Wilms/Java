/*
 * http://www.ntu.edu.sg/home/ehchua/programming/java/j2a_basicsexercises.html
 * Compute the sum and average of running numbers from a lower bound to an upper bound using loop.
 */
public class SumAndAverage {   // Save as "SumAndAverage.java"
   public static void main (String[] args) {
      int sum = 0;          // Store the accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;   // The lower bound to sum
      int upperbound = 100; // The upper bound to sum

      // Use a for-loop to sum from lower bound to upper bound
      for (int number = lowerbound; number <= upperbound; ++number) {
         sum += number;     // same as "sum = sum + number"
      }
      
      // Compute average in double. Beware that int/int produces int.
      average = (double) sum / upperbound;
      
      // Print sum and average.
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
   }
}