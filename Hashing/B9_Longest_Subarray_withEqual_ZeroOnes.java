package Hashing;
import java.util.*;
public class B9_Longest_Subarray_withEqual_ZeroOnes {
    public static int largest(int arr[] , int n){
    HashMap<Integer, Integer> hm = new HashMap<Integer , Integer>();
    int sum = 0;
    int maxLne = 0;
    for(int i =0 ; i < n ; i++)
    { // replacing the 0 with the -1 and applying the same logic oflongest sub array with the given sum
        arr[i] = (arr[i] == 0) ? -1 : 1;
    }
    for(int i = 0 ; i < n ; i++)
    {
        sum = sum + arr[i];
        if(sum == 0)
        {
            maxLne = i + 1;
        }
        if(hm.containsKey(sum + n) == true)
        {
            if(maxLne < i - hm.get(sum + n))
            {
                maxLne = i - hm.get(sum + n);
            }
        }else{
            hm.put(sum + n  , i);
        }
    }

    return maxLne;
}

public static void main(String[] args) {
    int arr[] ={1, 1, 1, 0, 1,0, 1, 1, 1};
    int len = arr.length;
    System.out.println(largest(arr, len));
}
}