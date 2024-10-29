//package B_CodeFOrces;
import java.util.*;
public class TwoSixSixB {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt(); // number of student
        int t = sc.nextInt(); // second 
        String queue = sc.next();
        char[] queueArray = queue.toCharArray();
        for(int second = 0 ;  second < t ; second++)
        {
            for(int i = 0 ; i < n - 1 ; i++)
            {
                if(queueArray[i] == 'B' && queueArray[i + 1] == 'G')
                {
                    queueArray[i] = 'G';
                    queueArray[i + 1] = 'B';
                    i++;
                }
            }
        }
        System.out.println(new String(queueArray));
    }
}
