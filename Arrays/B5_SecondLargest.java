package Arrays;

public class B5_SecondLargest {
    public static int secondLargest(int arr[] , int n)
    {
        int largest = 0;
        int secondlargest = -1;
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] > arr[largest])
            {
                largest = i;
            }
        }

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] != arr[largest])
            {
                if(secondlargest == -1)
                {
                    secondlargest = i;
                }

                else if(arr[i] > arr[secondlargest])
                {
                    secondlargest = i;
                }
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int n = arr.length;
        int second = secondLargest(arr, n);
        if(second == -1)
        {
            System.out.println("Second Largest foesnt exitis: ! ");
        }
        else{
            System.out.println("Second Largest: "+second);
        }
    }
}
