import java.util.*;
public class B11_Prime_Range {
    static void sieve(int n)
    {
        if(n <= 1)
        {
            return;
        }
        boolean isPrime[] = new boolean[n + 1]; // n + 1 size array
        Arrays.fill(isPrime , true); // filling the entire array as true
        for(int i = 2 ; i * i <= n ; i++)
        {
            if(isPrime[i])
            {
                for(int j = 2 * i ; j <= n ; j = j + i)
                {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2 ;i <= n ;i++)
        {
            if(isPrime[i])
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 18;
        sieve(n);
    }
}
