public class B7_LCM {
    static int HCF(int a , int b)
    {
        if(b == 0)
        {
            return a;
        }
        return HCF(a , a % b);
    }
    static int LCM(int a , int b)
    {
        return (a * b) / HCF(a , b);
    }


    public static void main(String[] args) {
       System.out.println(HCF(4, 5));
       System.out.println(LCM(4 , 6));
    }
}
