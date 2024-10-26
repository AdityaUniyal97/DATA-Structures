package Hashing;
import java.util.*;
// count the Distinct Element in an array
public class B4_count_union {
    public static int unionSize(int arr[], int m , int brr[] , int n)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i < m ; i++)
        {
            hs.add(arr[i]);
        }
        for(int i = 0 ; i < n ; i++)
        {
            hs.add(brr[i]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 5};
        int brr[] = {4, 8, 3, 6, 1};
        int m = arr.length;
        int n = brr.length;
        System.out.println(unionSize(arr, m, brr, n));
    }
}
