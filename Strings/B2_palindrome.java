package Strings;

public class B2_palindrome {
    static boolean isPla(String str)
    {
        int left = 0;
        int right = str.length() - 1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right++;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Aditya";
        System.out.println(isPla(str));
    }
}
