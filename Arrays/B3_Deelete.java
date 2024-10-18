package Arrays;

public class B3_Deelete {
    
    public static int delete(int arr[] , int n , int x)
    {
        int i =0;
        for(i =0 ; i < n ; i ++)
        {
            if(arr[i] == x)
            {
                break;
            }
            if(i == n)
            {
                return n;
            }
            for(int j = i ; j < n  - 1; j++)
            {
                arr[j] = arr[j + 1];
            }
        }
        return n - 1;
    }

    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30};
        int n = arr.length;
        int x = 20;
        n = delete(arr, n, x);
        for(int i =0 ; i < n ; i ++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
