package A_LeetCode;

public class Problem_7 {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int ld = x % 10;  // Get last digit
            
            // Overflow checks
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && ld > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && ld < -8)) return 0;
            
            rev = rev * 10 + ld;  // Update reversed number
            x = x / 10;           // Remove the last digit from x
        }
        
        return rev;
    }

    public static void main(String[] args) {
        Problem_7 solution = new Problem_7();

        int x1 = 123;
        System.out.println("Input: " + x1);
        System.out.println("Reversed: " + solution.reverse(x1));

        int x2 = -123;
        System.out.println("Input: " + x2);
        System.out.println("Reversed: " + solution.reverse(x2));

        int x3 = 1534236469;  // Example of overflow case
        System.out.println("Input: " + x3);
        System.out.println("Reversed: " + solution.reverse(x3));
    }
}
