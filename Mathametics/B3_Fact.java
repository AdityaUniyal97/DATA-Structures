import java.util.*;
public class B3_Fact {
    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        return n * fact(n - 1);
    }    

    public static void main(String[] args) {
        int n = 12;
        System.out.println(fact(n));
    }
}
