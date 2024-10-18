package Arrays;

public class B1_insertion {
    public static int  insert(int arr[] , int x , int cap , int pos , int n)
    {
        if(n == cap)
        {
            return n;
        }
        int inx = pos- 1;
        for(int i = n - 1 ; i >= inx ; i--)
        {
            arr[i + 1] = arr[i];
        }
        arr[inx] = x;
        return n + 1;
    }
    public static void main(String[] args) {
        int arr[] = new int[5], cap = 5, n = 3;

        arr[0] = 5; arr[1] = 10; arr[2] = 20;
 
        System.out.println("Before insertion ");
 
        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
 
        System.out.println();
 
        int x = 7, pos = 2;
 
        n = insert( arr , x , cap ,  pos , n);
 
        System.out.println("AfterInsertion:=> ");
 
        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
