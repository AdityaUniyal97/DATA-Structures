package A_LeetCode;
//Power of three
/*
 * Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
 */
public class Problem_321 {
    public boolean isPowerOfThree(int n) {
        if(n == 1)
        {
            return true;
        }
        while(n > 1 && n % 3 == 0)
        {
            n /= 3;
        }
        return n == 1;
    }
}
