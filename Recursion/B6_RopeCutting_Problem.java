package Recursion;
import java.util.*;
public class B6_RopeCutting_Problem {
    public static int maxCutt(int n , int a , int b , int c)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n <= -1)
        {
            return -1;
        }

        int res = Math.max(maxCutt(n - a, a, b, c),
                   Math.max(maxCutt(n - b, a, b, c),
                    maxCutt(n - c, a, b, c)));
        if(res == -1)
        {
            return -1;
        }            
        return res + 1;
    }

    public static void main(String[] args) {
        int n = 5;
        int a = 2;
        int b = 1;
        int c = 5;
        System.out.println(maxCutt(n, a, b, c));
    }
}
