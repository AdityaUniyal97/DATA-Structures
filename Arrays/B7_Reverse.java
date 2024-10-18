package Arrays;
public class B7_Reverse{
    public static void reverse(int arr[] , int n)
    {
        int low = 0;
        int end = n - 1;
        while(low < end)
        {
            int temp = arr[low];
            arr[low] = arr[end];
            arr[end] = temp;

            low++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10 , 20, 30, 40};
        int n = arr.length;
        reverse(arr, n);
        for(int i =0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}