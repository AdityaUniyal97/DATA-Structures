package Arrays;

import javax.naming.OperationNotSupportedException;

public class B2_search {
    public static int search(int arr[] , int n , int x)
    {
        for(int i = 0 ; i < n ; i++){
        if(arr[i] == x)
        {
            return i;
        }
        } 
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 49};
        int x = 30;
        System.out.println(search(arr, x, x));
    }
}
