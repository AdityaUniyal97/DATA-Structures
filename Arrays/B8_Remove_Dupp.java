package Arrays;

public class B8_Remove_Dupp {
    public static int Remvoe(int arr[] , int n)
    {
        int res=  1;
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[res - 1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
    {
        int arr[] = {10, 20, 20, 30, 30, 40, 40}; // Dupplicate Elements
        int n = arr.length;
        n = Remvoe(arr, n);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

}