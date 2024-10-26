package Hashing;
import java.util.*;
public class B7_Sub_Array_With_Given_Sum {
    public static boolean isSub(int arr[] , int n , int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            pre_sum = pre_sum + arr[i];
            if(pre_sum == arr[i])
            {
                return true;
            }
            if(s.contains(pre_sum - sum) == true)
            {
                return true;
            }
            else{
                s.add(pre_sum);
            }
        }
        return false;
    }
/*
 * arr[] = {5, 3, 2, -1}
 * sum = 4
 * INITIALLY = h = {}
 * i = 0 : pre_sum = 5 , h = {5}
 * i = 1 : pre_sum = 8 , h = {5, 8}
 * i = 2 : pre_sum = 10 , h = {5, 8}
 * i = 3 : pre_sum = 9 , return true(because 5 is already present in the Has Set)
 */
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 13, 3, -1};
        int n = arr.length;
        int sum = 22;
        System.out.println(isSub(arr, n, sum));
    }
}
