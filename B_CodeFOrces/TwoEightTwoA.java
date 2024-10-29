

import java.util.*;

public class TwoEightTwoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read the number of instructions
        int x = 0;

        // Loop through each instruction
        for (int i = 0; i < n; i++) {
            String instruction = sc.next(); // Read each instruction directly with next()

            if (instruction.contains("++")) {
                x = x + 1; // Increment x by 1
            } else if (instruction.contains("--")) {
                x = x - 1; // Decrement x by 1
            }
        }

        System.out.println(x); // Print the final value of x
    }
}
