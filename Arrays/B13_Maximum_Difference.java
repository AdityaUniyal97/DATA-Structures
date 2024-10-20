package Arrays;

public class B13_Maximum_Difference {
    public static int maxDIff(int arr[] , int n)
    {
        int res = arr[1] - arr[0];
        int min_value = arr[0];
        for(int i =1 ; i< n ; i ++)
        {
            res = Math.max(res , arr[i] - min_value);
            min_value = Math.min(min_value , arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        int n = 7;
        System.out.println(maxDIff(arr, n));
    }
}
