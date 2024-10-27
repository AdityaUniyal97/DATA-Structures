package Strings;

public class B1_COunt_Frquency_of_Chacters {
    public static void main(String[] args) {
        String str = "aditya";
        int[] count = new int[26];
        for(int i = 0 ; i < str.length ; i++)
        {
            count[str.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++)
        {
            if(count[i] > 0)
            {
                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }
    }    
}
