import java.util.*;
import java.lang.*;

// https://www.spoj.com/problems/TEST/

class TEST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			if(n != 42) {
				System.out.println(n);
			}
            else {
                break;
            }
		}
        sc.close();
	}
}