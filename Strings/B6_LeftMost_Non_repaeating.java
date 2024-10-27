package Strings;
import java.util.*;
public class B6_LeftMost_Non_repaeating {
    static final int CHAR = 256;
    static int nonRep(String str)
    {
        int[] FI = new int[CHAR];
        Arrays.fill(FI , -1); // filling the entire array as -1
        for(int i = 0 ; i < str.length(); i++)
        {
            if(FI[str.charAt(i)]== -1) // if the charcater is coming first time
            {
                FI[str.charAt(i)] = i;
            }
            else{
                FI[str.charAt(i)] = -2; // if the charcaters are same than mark it with -2
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < CHAR ; i++)
        {
            if(FI[i] >= 0)
            {
                res= Math.min(res , FI[i]);
            }
        }
        return (res== Integer.MAX_VALUE) ? -1 : res;


    }

    /*
     * Given String: str = "abbcda"

First Loop (Filling FI Array)
i = 0: FI['a'] = 0 (first occurrence)
i = 1: FI['b'] = 1 (first occurrence)
i = 2: FI['b'] = -2 (repeated)
i = 3: FI['c'] = 3 (first occurrence)
i = 4: FI['d'] = 4 (first occurrence)
i = 5: FI['a'] = -2 (repeated)
Second Loop (Finding Leftmost Non-Repeating)
Result: FI['c'] = 3 (leftmost non-repeating character)
     */

    public static void main(String[] args) {
        String str = "abbcda";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str)); 
    }
}
