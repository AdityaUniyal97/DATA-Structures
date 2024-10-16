import java.util.*;
public class B1_Count_Digits {
    static int countDigits(int n)
    {
        int res = 0;
        while(n > 0)
        {
            n = n / 10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 124;
        System.out.println(countDigits(n));
    }
}