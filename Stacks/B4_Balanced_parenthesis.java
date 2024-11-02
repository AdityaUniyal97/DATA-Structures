package Stacks;
import java.util.*;
import java.util.Stack;
public class B4_Balanced_parenthesis {
    static boolean isbal(String s)
    {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{')
            {
                st.push(c);
            }
            else{
                if(st.isEmpty())
                {
                    return false;
                }
                else if(c == ')' && st.peek() != '(')
                {
                    return false;
                }
                else if(c == ']' && st.peek() != '[')
                {
                    return false;
                }
                else if(c == ']' && st.peek() != '[')
                {
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.empty();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isbal(s))
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not - Balanced");
        }
    }
}
