import java.util.*;
public class B13_Iterative_Power {
    static int power(int x , int n)
    {
        int res = 1;
        while(n > 0)
        {
            if(n % 2 != 0)
            {
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        int x = 2;
        System.out.println(power(x, n));
    }
}
