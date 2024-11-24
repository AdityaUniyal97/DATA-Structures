
package Sorting;
import java.util.*;
public class Intersection_of_Two_Array {
    public static void intersection(int a[] , int b[] , int m, int n)
    {
        int i = 0;
        int j = 0;
        while(i < m && j < n)
        {
            if(i > 0 && a[i - 1] == a[i])
            {
                i++;
                continue;
            }
            if(a[i] < b[j])
            {
                i++;
            }
            else if(a[i] > b[j])
            {
                j++;
            }
            else{
                System.out.println(a[i]+" ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{3,5,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        int m = a.length;
        int n = b.length;
        intersection(a, b, m, n);
    }
}