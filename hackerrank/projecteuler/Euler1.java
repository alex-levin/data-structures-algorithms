/*

https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem

This problem is a programming version of Problem 1 from projecteuler.net

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 
3, 5, 6, and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.
or below

Input Format

First line contains T that denotes the number of test cases.
This is followed by T lines, each containing an integer N.


Output Format

For each test case, print an integer that denotes the sum of all the multiples of
3 or 5 below N.


Sample Input 0

2
10
100

Sample Output 0

23
2318

Explanation 0

For N = 10, if we list all the natural numbers below 10 that are multiples
of 3 or 5, we get 3, 5, 6, and 9. The sum of these multiples is 23.

Similarly for N = 100, we get 2318.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long a0 = 0; a0 < t; a0++){
            long sum = 0;
            long n = in.nextLong();
            /* too slow
            for(int i = 1; i < n; i++) {
                if(i % 3 == 0 || i % 5 == 0) {
                    sum = sum + i;
                }
                if(i % 3 == ) {
                    sum = sum + i;

                }
            }

            Use formula: sum of the first n natural numbers n is n * (n + 1) / 2
            What is the sum of the first numbers 1 to 100 multiples of 3?
            Number of multiples is 100 / 3 = 33:
            3, 6, 9, 12, ... 99
            3 + 6 + 9 + 12 + ... + 99 = 3 * (1 + 2 + 3 + 4 + ... + 33) =
            3 * (33 * (33 + 1) / 2)            
            */

            // We want below n
            n = n - 1;
            // Number of multiples of 3
            long m = n / 3;
            sum = sum + 3 * (m * (m + 1) / 2);
            // Number of multiples of 5
            m = n / 5;
            sum = sum + 5 * (m * (m + 1) / 2);
            // Subtract the sum of multiples of 15
            // Number of multiples of 15
            m = n / 15;
            sum = sum - 15 * (m * (m + 1) / 2);
     
            System.out.println(sum);
        }
    }
}
