package Binary_Search;

public class B4_last_Occurence {
    static int lastOcc(int arr[] , int n , int x)
    {
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(x > arr[mid])
            {
                low = mid + 1;
            }
            else if(x < arr[mid])
            {
                high = mid - 1;
            }
            else{
                if(mid == n - 1 || arr[mid + 1] != arr[mid])
                {
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20};
        int n = arr.length;
        int x = 10;
        System.out.println(lastOcc(arr, n, x));
    }
}
