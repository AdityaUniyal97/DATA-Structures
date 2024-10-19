public class Left_Rotate_Array_By_one {

	static void lRotate(int arr[] , int n)
	{
		int temp = arr[0];
		for(int i = 1; i < n ; i ++)
		{
			arr[i - 1] = arr[i];
		}
		arr[n  -  1] = temp; 
	}

    public static void main(String[] args) {
    	int arr[] = {1, 2, 3, 4, 5};
    	int n = arr.length;
    	lRotate(arr , n );
    	for(int i =0 ; i < n ; i ++)
    	{
    		System.out.print(arr[i]+" ");
    	}
      }
}