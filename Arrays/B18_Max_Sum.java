package Arrays;
// maximum sum if Sub Array
public class B18_Max_Sum {
    public static int maxSum(int arr[] , int n)
    {
        int res = arr[0];
        int maxEnding = 0;

        for(int i = 1;i < n ; i ++)
        {
            maxEnding = Math.max(maxEnding + arr[i] , arr[i]);
            res = Math.max(res , maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {-3, 8, -2, 4, -5, 6};
        int n = arr.length;
        System.out.println(maxSum(arr, n));
    }
}
