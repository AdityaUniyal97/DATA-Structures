package Strings;
import java.util.*;
public class B4_isAnaGram {
    static final int CHAR = 256;
    static boolean isAna(String s1 , String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        int count[] = new int[CHAR];
        for(int i = 0 ;i < s1.length() ; i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i =0 ; i < CHAR ; i++)
        {
            if(count[i] != 0)
            {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "Aditya";
        String str2 = "Uniyal";
        if(isAna(str1, str2))
        {
            System.out.println("IS Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
