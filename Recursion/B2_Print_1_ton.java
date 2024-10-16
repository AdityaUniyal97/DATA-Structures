package Recursion;

public class B2_Print_1_ton {
    public static void recur(int n)
    {
        if(n == 0)
        {
            return;
        }

        recur(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        recur(n);
    }
}
