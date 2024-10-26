package Hashing;

import java.util.*;

//Pair with the given Sum
public class B5_Pair_With_Given_Sum {
    public static int pairWithSum(int arr[], int n, int x) {
        HashSet<Integer> us = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (us.contains(x - arr[i])) {
                return 1;
            } else {
                us.add(arr[i]);
            }
        }
        return 0;
    }

    /*
     * arr[] = {8, 3, 4, 2, 5} , sum = 6
     * Initially = {}
     * i = 0 : {8}
     * i = 1 : {8, 3}
     * i = 2 : {8, 3, 4}
     * i = 3 : return true:
     */
    public static void main(String[] args) {
        int arr[] = {3, 8, 4, 7, 6, 1};
        int n = arr.length;
        int x = 14;
        System.out.println(pairWithSum(arr, n, x));
    }
}
