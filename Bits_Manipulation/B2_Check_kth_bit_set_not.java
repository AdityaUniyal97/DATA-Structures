package Bits_Manipulation;
import java.util.*;
public class B2_Check_kth_bit_set_not {
    public static void isKthBit(int n , int k)
    {
        if((n & ( 1 << (k - 1))) == 1)
        {
            System.out.println("SET");
        }
        else{
            System.out.println("NOT SET");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        isKthBit(n, k);
    }
}
