package A_LeetCode;

import java.util.HashSet;

public class Problem_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getNextNumber(n);
        }
        
        return n == 1; // true if we reach 1, false if we detect a cycle
    }

    private int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;      // Extract last digit
            sum += digit * digit;    // Square it and add to sum
            n /= 10;                 // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem_202 solution = new Problem_202();

        int n1 = 19;
        System.out.println("Input: " + n1);
        System.out.println("Is " + n1 + " a happy number? " + solution.isHappy(n1));

        int n2 = 2;
        System.out.println("Input: " + n2);
        System.out.println("Is " + n2 + " a happy number? " + solution.isHappy(n2));
    }
}
