import java.util.*;
// finding the highest divisors 
public class B6_GCD {
    static int gcd(int a , int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b , a % b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(gcd(a, b));
    }
}
