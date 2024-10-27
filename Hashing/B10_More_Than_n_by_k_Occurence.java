package Hashing;
import java.util.*;
//Print those element which appear more than n / k times of the array
public class B10_More_Than_n_by_k_Occurence {
    static void printNByK(int arr[] , int n , int k)
    {
        HashMap<Integer,Integer> m = new HashMap<Integer , Integer>();
        for(int x : arr)
        {
            m.put(x , m.getOrDefault(x , 0) + 1);
        }
        for(Map.Entry <Integer,Integer> e:m.entrySet())
        {
            if(e.getValue() > n / k)
            {
                System.out.println(e.getKey() + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 30, 20, 10, 10};
        int n = arr.length;
        int k = 2;
        printNByK(arr, n, k);
    }
}