package interviewsKdn251.Company.Airbnb;

import java.util.Stack;

/**
 * Created by user on 15.04.2017.
 */
// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class ValidParentheses {
    public static boolean isValidString(String string){
        if (string.length() % 2 == 1){
            return false;
        }

        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                chars.push(ch);
            } else if (ch == ')' && chars.peek() == '('){
                chars.pop();
            } else if (ch == '}' && chars.peek() == '{'){
                chars.pop();
            } else if (ch == ']' && chars.peek() == '['){
                chars.pop();
            } else{
                return false;
            }

        }

        return chars.size() == 0;
    }
}
