// https://projecteuler.net/problem=46
public class GoldbachsOtherConjecture {
    static boolean GoldbachSatisfied(long n) {
        int sum = 0;
        boolean satisfied = false;
        for(long i = 1;i <= n;i++) {
            sum = 0;
            for(long j = 1;j <= n; j++) {
                if (i % j == 0)
                    ++sum;
            }
            if (sum == 2) {
            	if(((int)Math.pow((int)Math.sqrt((n-i) / 2), 2)) == (n -i) / 2) {
            
                satisfied = true;
                //System.out.println(n + " = " + i + " + 2 * " + Math.sqrt((n-i) / 2) + "^2");
            	}
            }
        }
        return satisfied;
    }

    public static void main(String[] args) {
        long currentNumber = 0;
        long lastNumber = 0;
        boolean done = false;
        while (!done) {
            for(long i = 1; i < currentNumber; i++) {
                for(long j = 1; j < currentNumber; j++) {
                    if (lastNumber != currentNumber && i * j == currentNumber && currentNumber % 2 != 0) {
                        lastNumber = currentNumber;
                        //System.out.println("composite number: " + currentNumber);
                        if (!GoldbachSatisfied(currentNumber)) {
                            System.out.println("counterproof: " + currentNumber);
                            done = true;
                        }
                        //System.out.println();
                    }
                }
            }
            currentNumber++;
        }
    }
}