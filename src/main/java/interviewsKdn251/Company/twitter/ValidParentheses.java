package interviewsKdn251.Company.twitter;

import java.util.Stack;

/**
 * Created by user on 21.05.2017.
 */
// Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.

// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
public class ValidParentheses {
    public static boolean validParentheses(String str){
        if (str.length() % 2 != 0 ) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i < str.length(); i++){
            char cur = str.charAt(i);
            if ( cur == '{' || cur == '[' || cur == '('){
                stack.push(cur);
            }else if (cur == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if (cur == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if (cur == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.isEmpty();
    }
}
