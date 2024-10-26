package Hashing;
import java.util.*;
public class B2_Frequency_of_Elements {
    static void countfun(int arr[] , int n)
    {
        HashMap<Integer , Integer> hmp = new HashMap<Integer , Integer>();
        for(int i = 0 ; i < n ; i++)
        {
            int key = arr[i];
            if(hmp.containsKey(arr[i]) == true)
            {
                hmp.put(arr[i] , hmp.get(arr[i]) + 1);
            }
            else{
                hmp.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer , Integer> itr: hmp.entrySet())
        {
            System.out.println(itr.getKey()+" "+itr.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[] = {15, 16, 27, 27, 28, 15};
        int n = arr.length;
        countfun(arr, n);
    }
}
