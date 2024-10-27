package Strings;
import java.util.*;

public class B8_PatternSearching {
    static void patSearch(String txt , String pat) {
        int m = pat.length();
        int n = txt.length();
        for(int i = 0; i <= n - m; ) {
            int j;
            for(j = 0; j < m; j++) {
                if(pat.charAt(j) != txt.charAt(i + j)) { // if characters do not match
                    break;
                }
            }
            if(j == m) { // if characters match, print the index
                System.out.print(i + " ");
            }
            if(j == 0) {
                // If no Charcater is matched(first character itself did not match) 
                i++;
            } else {
                // If some Character matched before a mismatch occur.
                // We skip ahead by 'j' position 
                i = i + j;
            }
        }
    }
/*
 * txt = "ABCEABEFABCD"
 * pat = "ABCD"
 * n = 12
 * m = 4
 * outdor loop will remain (n - m )times (12 - 4) => 8 times
 * i = 0 : (i = i + 3)
 * i = 3 : j++
 * i = 4 : (i = 4 + 2)
 * i = 6:
 * i = 7: 
 * i = 8: print(8)
 */
    public static void main(String[] args) {
        String txt = "ABCABCD";
        String pat = "ABCD";
        System.out.print("All index numbers where pattern found is :=> ");
        patSearch(txt, pat);
    }
}
