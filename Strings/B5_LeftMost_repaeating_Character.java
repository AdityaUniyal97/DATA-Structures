package Strings;
import java.util.*;
public class B5_LeftMost_repaeating_Character {
    static final int CHAR = 256;
    static int leftMost(String str)
    {
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for(int i = str.length() - 1 ; i >= 0 ; i--)
        {
            if(visited[str.charAt(i)]) // update the res only if the new charcater is already marked as vistied 
            {
                res = i;
            }
            else{
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }

    /*
     * str = "abccnd"
     * res = -1
     * i = 5: visted = true;
     * i = 4: visted = true;
     * i = 3: visited = true;
     * i = 2: visited = res - 2
     * i = 1: visited = true;
     */
    public static void main(String[] args) {
        String str = "abccbd";
        System.out.println("Index of the most reapeating charcater is: ");
        System.out.println(leftMost(str));
    }
}
