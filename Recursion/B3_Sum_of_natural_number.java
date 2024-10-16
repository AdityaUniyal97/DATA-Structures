package Recursion;

public class B3_Sum_of_natural_number {
    public static int getSum(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        return n + getSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(getSum(n));
    }
}
