package Strings;
import java.util.*;
public class B7_reverseOWrd {
    static void reverse(char[] str , int low,  int high)
    {
        while(low <= high)
        {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
    static void reverword(char str[] , int n)
    {
        int start = 0;
        for(int end = 0 ; end < n ; end++)
        {
            if(str[end] == ' '){
                reverse(str, start, end - 1); // reverse the string when spaces comes
                start = end + 1; // place the start pointer after the space 
            }
        }
        reverse(str, start, n - 1); // swapping the last word
        reverse(str , 0 , n - 1); //swapping the enitre string
    }
    public static void main(String[] args) {
        String s = "Aditya Uniyal Data Scienctist";
        char[] str = s.toCharArray();
        int n = s.length();
        System.out.println("After reverse the String is");
        reverword(str, n);
        System.out.println(str);
    }
}
