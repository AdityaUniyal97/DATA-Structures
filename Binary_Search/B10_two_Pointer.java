package Binary_Search;

public class B10_two_Pointer {
   static boolean ispal(int arr[] , int n , int x)
   {
    int i = 0;
    int j = n - 1;
    while(i < j)
    {
        if(arr[i] + arr[j] == x)
        {
            return true;
        }
        else if(arr[i] + arr[j] < x)
        {
            i++;
        }
        else{
            j--;
        }
    }
    return false;
   } 

   public static void main(String[] args) {
    int[] arr = {2, 5, 8, 12, 30};
    int n = arr.length;
    int x = 17;
    System.out.println(ispal(arr, n, x));
   }
}
