public class B10_PrintAll_Divisiors {
    static void printDivi(int n)
    {
        for(int i = 1; i * i <= n ; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");

                if(i != n / i)
                {
                    System.out.println((n / i)+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 25;
        printDivi(n);
    }
}
