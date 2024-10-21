package Binary_Search;
public class B1_B_Search {
    static int bsearch(int arr[] , int n , int x)
    {
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] == x)
            {
                return mid;
            }
            else if(arr[mid] > x)
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int n = 6;
        int x = 25;
        System.out.println(bsearch(arr, n, x));
    }
}