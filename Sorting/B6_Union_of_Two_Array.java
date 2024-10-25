
package Sorting;
import java.util.*;
public class B6_Union_of_Two_Array {
    public static int findUnion(int a[] , int b[])
    {
        int m = a.length;
        int n = b.length;
        int i = 0; 
        int j = 0;
        List<Integer> unionList = new ArrayList<>();
        while(i < m && j < n)
        {
            if(i > 0 && a[i] == a[i - 1])
            {
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j - 1])
            {
                j++;
                continue;
            }
            if(a[i] < b[j])
            {
                unionList.add(a[i]);
                i++;
            }
            else if(b[j] < a[i])
            {
                unionList.add(b[j]);
                j++;
            }
            else{
                unionList.add(a[i]);
                i++;
                j++;
            }
        }
        while(i < m)
        {
            if(i == 0 || a[i] != a[i - 1])
            {
                unionList.add(a[i]);
            }
            i++;
        }
        while(j < n)
        {
            if(j == 0 || b[j] != b[j - 1])
            {
                unionList.add(b[j]);
            }
            j++;
        }
        System.out.println("Union: "+unionList);
        return unionList.size();
    }
    public static void main(String[] args) {
        int m ;
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sizes of the Array: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        System.out.print("First Array Element :=> ");
        for(int i =0 ; i < m ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Second Array Element :=> ");
        for(int i =0 ; i < n; i++)
        {
            b[i] = sc.nextInt();
        }

       System.out.println(findUnion(a, b));
    }
}