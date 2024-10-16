package Recursion;

public class A5_Sum_of_Digits {
    static int fun(int n)
    {
        if(n < 10)
        {
            return n;
        }
        return fun(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(fun(n));
    }
}
