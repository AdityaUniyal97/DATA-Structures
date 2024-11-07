
import java.util.*;

public class Problem_284A {
    private static int modPow(int base, int exp, int mod) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) // if exp is odd , multipl result by base
            {
                result = (result * base) % mod;
            }
            base = (base * base) % mod; // square the base for the next power
            exp >>= 1; // Divide exp by 2
        }
        return result;
    }

    private static boolean isPrimitiveRoot(int g, int p) {
        Set<Integer> unique = new HashSet<>();// to store the uniue results of power
        // calculate g ^ 1 % p , g ^ 2% p ..... , g ^ (p - 1) % p
        for (int power = 1; power < p; power++) {
            int result = modPow(g, power, p); // Calculate (g ^ power) % p
            if (result == 1 && power != p - 1) {
                return false;
            }
            unique.add(result);
        }
        return unique.size() == p - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int count = 0;
        for (int g = 1; g < p; g++) {
            if (isPrimitiveRoot(g, p)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
