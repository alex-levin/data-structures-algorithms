import java.util.*;
import java.math.BigInteger;

// https://www.spoj.com/problems/FCTRL2/

// Using BigInteger to compute factorial of 100

// Also https://www.geeksforgeeks.org/factorial-large-number/

public class FCTRL2 {

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		// test cases
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
			System.out.println(factorial(x));
		}
	}
}