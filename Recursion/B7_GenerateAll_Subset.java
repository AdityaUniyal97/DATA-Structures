package Recursion;

public class B7_GenerateAll_Subset {
    public static void printSUb(String str , String curr , int index)
    {
        if(index == str.length())
        {
            System.out.print(curr+" ");
            return;
        }
        printSUb(str, curr, index + 1);
        printSUb(str, curr+str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String str = "Aditya";
        printSUb(str, " ", 0);
        return ;
        }
}
