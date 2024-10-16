package Bits_Manipulation;
public class B1_Bit_Wise_operator {
    public static void main(String[] args) {
    int x = 3;
    int y = 6;
    System.out.println(x & y); // AND gives 1 if both bits are 1, otherwise gives 0.
    System.out.println(x | y); // OR gives 1 if at least one of the bits is 1.
    System.out.println(x ^ y);  // XOR gives 1 if the bits are different, and 0 if the bits are the same.
    }
}
