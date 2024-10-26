package Hashing;

import java.util.HashMap;

/*
 * IP arr[] => {5, 8, -4, -4, 9, -2, 2}
 * OP : 3 {Thier are two sub array whose sum is 0 
 *         i) 8 - 4 - 4 == 0
 *        ii) -2 + 2 == 0   , But the longest one is i so three answere cause it hase three elements}
 */
public class B8_Longest_Subarray_with_given_sum {
    static int longSubArray(int arr[] , int n , int k)
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i =0 ; i < n ; i++)
        {
            sum = sum + arr[i];
            if(sum == k) // if the sum is equal to the target element
            {
                maxLen = i + 1;
            }
            if(!map.containsKey((sum)))
            {
                map.put(sum , i);
            }
            if(map.containsKey(sum- k))
            {
                if(maxLen < (i - map.get(sum - k)))
                {
                    maxLen = i - map.get(sum - k);
                }
            }
        }
        return maxLen;
    }
    /*
     * arr[] = {5, 2 ,3} , sum = 5;
     * Initially: m = {} , maxLen = 0;
     * 
     * i = 0 : pre_sum = 5 , maxLen = 1 , map = {(5, 0)}
     * i = 1 : pre_sum = 7 , maxlen = 1 , map = {(5 , 0), (7 , 1)}
     * i = 2: pre_sum = 10 , maxLen = 2  , map = {(5 , 0),
     (7 , 1) , (10 , 2)}

     return maxLen(2)
     */

    public static void main(String[] args) {
        int arr[] = {5, 8, -4, -4, 9, -2, 2};
        int n= arr.length;
        int sum = 0;
        System.out.println(longSubArray(arr, n, sum));
    }
}
