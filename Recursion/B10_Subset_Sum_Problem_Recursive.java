package Recursion;

public class B10_Subset_Sum_Problem_Recursive {
    public static int countSubset(int arr[] , int n , int sum)
    {
        if(n == 0)
        {
            return sum == 0 ? 1 : 0;
        }

        return countSubset(arr, n - 1, sum) + countSubset(arr, n, sum - arr[n - 1]);
    }

    public static void main(String[] args) {
        int n = 3 ; 
        int arr[] = {10, 20, 15};
        int sum = 25;
        System.out.println(countSubset(arr, n, sum));
    }
}
