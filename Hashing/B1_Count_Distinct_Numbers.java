package Hashing;

import java.util.HashSet;

// we need to count the distinct elements in an array
public class B1_Count_Distinct_Numbers {
    public static int countDistinct(int arr[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int x : arr)
        {
            hs.add(x);
        }
        System.out.println(hs);
        return hs.size();
    }

    public static void main(String[] args) {
        int arr[] = {15, 16, 27, 28, 27, 15};
        System.out.println(countDistinct(arr));
    }
}
