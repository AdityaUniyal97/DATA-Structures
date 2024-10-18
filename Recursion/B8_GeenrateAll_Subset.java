package Recursion;

public class B8_GeenrateAll_Subset {
    public static void TOH(int n , char a , char b , char c)
    {
        if(n == 1)
        {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        TOH(n - 1 , a , c ,b);
        System.out.println("Move "+ n +" from "+" to "+ c);
        TOH(n - 1 , b , a , c);
    }

    public static void main(String args[])
    {
        int n = 4;
        TOH(n, 'A', 'B', 'C');
    }
}
