import java.util.*;
public class B2_Palindrome {
    static boolean isPal(int n)
    {
        int rev = 0;
        int temp = n;
        while(temp != 0)
        {
            int ld = temp % 10;
            rev = temp * 10 + ld;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(isPal(n));
    }
}
