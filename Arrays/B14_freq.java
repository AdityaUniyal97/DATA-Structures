package Arrays;

public class B14_freq {
   public static void frequency(int arr[] , int n)
   {
    int freq = 1;
    int i = 1;
    while(i < n)
    {
        while(i < n && arr[i] == arr[i - 1])
        {
            freq++;
            i++;
        }

        System.out.println(arr[i- 1]+" "+freq);
        i++;
        freq = 1;
    }
    if(n == 1 || arr[n - 1] != arr[n - 2])
    {
        System.out.print(arr[n - 1]+" "+1);
    }
   }
   
   public static void main(String[] args) {
    int arr[]= {10, 10, 20, 20, 30, 40, 40, 40, 50, 50, 5};
    int n = arr.length;
    frequency(arr, n);
   }
}
