package Recursion;

public class B4_Palindrome {
    static boolean isPalindrome(String str , int start , int end)
    {
        if(start >= end)
        {
            return true;
        }

        return ((str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1));
    }

    public static void main(String[] args) {
        String str = "Aditya";
        int start = 0;
        int end = str.length() - 1;
        System.out.println(isPalindrome(str, start + 1, end - 1));
    }
}
