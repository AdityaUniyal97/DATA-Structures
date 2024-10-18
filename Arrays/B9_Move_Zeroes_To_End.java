package Arrays;

public class B9_Move_Zeroes_To_End {
    static void pushZeroes(int arr[] , int  n)
    {
        int count = 0;
        for(int i =0 ; i < n ; i ++)
        {
            if(arr[i] != 0)
            {
                arr[count++] = arr[i]; //stopring the non zeroes value into arr[count] and than increment it 
            }
        }

        while(count < n)
        {
            arr[count++] = 0; // as all the non zeroes shiftee to the end no rest as zeroes
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 0 ,6, 9, 7, 9};
        int n = arr.length;
        pushZeroes(arr, n);
        for(int i =0 ; i < n ; i ++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
