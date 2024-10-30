package A_LeetCode;
// sqr root
/*
 * Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
 */
public class Problem_69 {
    public int mySqrt(int x) {
        if( x < 2)
        {
         return x; // we cant sqr root number less than 2
        }
 
        int left = 1;
        int right = x / 2; // basically reducing the range
        while(left <= right)
        {
         int mid = left + (right - left) / 2;
         long msq = (long) mid * mid; //types casting it to long
 
         if(msq == x)
         {
             return mid; //exact sqaure root is found
         }
         else if(msq < x)
         {
             left = mid + 1;
         }
         else{
             right = mid - 1;
         }
        }
        return right; // right will be the integer part of the sqr root
     }
}
