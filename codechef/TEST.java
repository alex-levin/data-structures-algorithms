import java.util.Scanner;

/**
 * https://www.codechef.com/problems/TEST
 *
 * Your program is to use the brute-force approach in order to find the Answer
 * to Life, the Universe, and Everything. More precisely... rewrite small
 * numbers from input to output. Stop processing input after reading in the
 * number 42. All numbers at input are integers of one or two digits.
 * 
 * Example
 * 
 * Input: 1 2 88 42 99
 * 
 * Output: 1 2 88
 *
 * 
 */
public class TEST {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int k = sc.nextInt();
			if(k == 42) {
				System.exit(0);
			}
			System.out.println(k);
		}
	}
}