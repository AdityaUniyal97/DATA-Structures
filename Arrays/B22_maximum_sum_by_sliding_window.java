package Arrays;

public class B22_maximum_sum_by_sliding_window {
    static int maxSum(int arr[] , int n , int k)
    {
        int curr_sum = 0;
        for(int i = 0 ; i < k ; i++)
        {
            curr_sum += arr[i];
        }
        int max_Sum = curr_sum;
        for(int i = k ; i < n ; i++)
        {
            curr_sum += Math.max(max_Sum , curr_sum);
            max_Sum = Math.max(max_Sum , curr_sum);
        }
        return max_Sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7};
        int n = 6;
        int k = 3;
        int max= maxSum(arr, n, k);
        System.out.println(max);
    }
}
