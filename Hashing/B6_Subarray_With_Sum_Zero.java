package Hashing;
import java.util.*;
public class B6_Subarray_With_Sum_Zero {
    static int ZeroSumSubArray(int arr[] , int n)
    {
        HashSet<Integer> us = new HashSet<Integer>();
        int prefix_Sum = 0;
        for(int i = 0 ; i < n ; i++)
        {
            prefix_Sum = prefix_Sum + arr[i];
            if(us.contains(prefix_Sum) == true)
            {
                return 1;
            }
            else{
                us.add(prefix_Sum);
            }
        }
        return 0;
    }
    /*
     * arr : {-3, 4, -3, -1, 1}
     *INITIALLY
     *  pre_sum = 0;
     * h = {}
     * 
     * i - 0 : pre_sum = -3;
     * h = {-3}
     * i - 1 : pre_sum = 1;
     * h = {-3, 1}
     * i - 2 : pre_sum = -2;
     * h = {-3 , 1 , 2}
     * i - 3 : pre_sum = -3 //already present in the HashSet
     * return 1:
     */

    public static void main(String[] args) {
        int arr[] = {5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;
        System.out.println(ZeroSumSubArray(arr, n));
    }
}
