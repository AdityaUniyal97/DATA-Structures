//package B_CodeFOrces;
/*
 * A- Team 
 * InputCopy
3
1 1 0
1 1 1
1 0 0
Output = 2
 */
import java.util.*;
public class Problem_231A {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int solvableTasks = 0; // variable for counting the number of task
    for(int i =0 ; i < n ; i++)
    {
        int count = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == 1) count++;
        if(b == 1) count++;
        if(c == 1) count++;

        if(count >= 2) // this condition only happen is greter than 2 
        {
            solvableTasks++;
        }
    }
    System.out.println(solvableTasks);

}
}
