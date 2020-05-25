/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123
 * Output: 321
 
 * Example 2:
 * 
 * Input: -123
 * Output: -321
 
 * Example 3:
 * 
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 */
class ReverseInteger {
    
    public int reverse(int x) {
        int y = x > 0 ? x : -x;
        long reversed = 0;
        while(y > 0) {
            reversed = reversed * 10 +  y % 10;
            y = y / 10;
        } 
        if(reversed > Integer.MAX_VALUE) {
            return 0;
        }
        return x > 0 ? (int) reversed : - (int)reversed;
    }
}