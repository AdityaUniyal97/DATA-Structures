package Hashing;
import java.util.*;
public class B3_Print_The_intersection {
    public static void intersect(int arr[] , int brr[] , int m , int n)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int num : brr)
        {
            s.add(num);
        }
        for(int i = 0; i < m ; i++)
        {
            if(s.contains(arr[i]))
            {
                System.out.print(arr[i]+" ");
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int brr[] = {30, 20, 10};
        int m = arr.length;
        int n = brr.length;
        intersect(arr, brr, m, n);
    }
}
