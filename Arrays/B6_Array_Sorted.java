package Arrays;

public class B6_Array_Sorted {
    public static boolean isSorted(int arr[] , int n)
    {
        for(int i = 1; i < n ;i++)
        {
            if(arr[i] < arr[i - 1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 2};
        int n = arr.length;
        System.out.println(isSorted(arr, n));
    }
}
