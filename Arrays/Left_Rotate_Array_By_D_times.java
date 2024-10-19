public class Left_Rotate_Array_By_D_times
 {
 	static void reverse(int arr[] , int low , int high)
 	{
 		while(low < high)
 		{
 			int temp = arr[low];
 			arr[low] = arr[high];
 			arr[high] = temp;

 			low++;
 			high--;
 		}
 	}
 	static void Left(int arr[] ,int d,  int n)
 	{
 		reverse(arr , 0 , d - 1);
 		reverse(arr , d , n - 1);
 		reverse(arr , 0 , n - 1);
 	}
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        Left(arr , 2, n);
        for(int i =0 ; i <  n ; i++)
        {
        	System.out.print(arr[i]+" ");
        }
    }
}