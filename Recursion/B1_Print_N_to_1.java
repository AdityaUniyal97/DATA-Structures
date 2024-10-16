package Recursion;

public class B1_Print_N_to_1 {
    public static void printToN(int n)
    {
        if(n == 0)
        {
            return;
        }

        System.out.print(n+" ");
        printToN(n - 1);
    }

   public static void main(String[] args) {
    int  n = 4;
    printToN(n);
   }
}
