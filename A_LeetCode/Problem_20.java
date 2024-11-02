package A_LeetCode;

import java.util.Stack;

/*
 * Valid Parentheses
 */
public class Problem_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push open brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Process closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // Check if stack is empty (no matching opening bracket)
                if (stack.isEmpty()) {
                    return false;
                }
                
                char lastOpen = stack.pop();
                // Check if the current closing bracket matches the last opening bracket
                if ((c == ')' && lastOpen != '(') ||
                    (c == ']' && lastOpen != '[') ||
                    (c == '}' && lastOpen != '{')) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
