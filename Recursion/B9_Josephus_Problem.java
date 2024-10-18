package Recursion;

public class B9_Josephus_Problem {
    static int jos(int n , int k)
    {
        if(n == 1)
        {
            return 0;
        }
        else{
            return (jos(n - 1 , k) + k) % n;
        }
    }
    static int myjos(int n , int k){
        return jos(n , k) + 1;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println(jos(n, k));
    }
}
