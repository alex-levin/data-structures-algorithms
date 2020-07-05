import java.util.*;
import java.lang.*;
import java.io.*;

// https://www.codechef.com/problems/HORSES

class HORSES
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
		    int tests = scanner.nextInt();
		    for(int j = 0; j < tests; j++) {
    		    int number = scanner.nextInt();
    		    scanner.nextLine();
        		String line = scanner.nextLine();
        		String[] numbers = line.split(" ");
        		int[] nums = new int[numbers.length];
        		for(int i = 0; i < nums.length; i++) {
        		    nums[i] = Integer.parseInt(numbers[i]);
        		}
        		Arrays.sort(nums);
        		int result = Integer.MAX_VALUE;
        		for(int i = 0; i < nums.length - 1; i++) {
        		    int diff = nums[i + 1] - nums[i];
        		    if(diff < result) {
        		        result = diff;
        		    }
        		}
        		System.out.println(result);
		    }
    		break;
		}
	}
}