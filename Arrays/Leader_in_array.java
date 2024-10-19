public class Leader_in_array {
	public static void Leader( int arr[] , int n)
	{
		int curr_leader = arr[n - 1];
		System.out.print(curr_leader+" ");
		for(int i = n -2 ; i >= 0 ; i--)
		{
			if(curr_leader < arr[i])
			{
				curr_leader = arr[i];
				System.out.print(curr_leader+" ");
			}
		}
	}
    public static void main(String[] args) {
    	int arr[] = {7, 12, 44 ,22,1,65,1, 9};
    	int n = arr.length;
    	Leader(arr , n);
    }
}