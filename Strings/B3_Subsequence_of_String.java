package Strings;
import java.util.*;
public class B3_Subsequence_of_String {
    static boolean isSubs(String s1 , String s2 , int m , int n)
    {
        int j = 0;
        for(int i = 0 ; i < n && j < m ; i++)
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                j++;
            }
        }
        return j == m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , m;
        n = sc.nextInt();
        m = sc.nextInt();
        String s1 , s2;
        s1 = sc.next();
        s2 = sc.next();
        System.out.println(isSubs(s1, s2, m, n));
    }
}
