package interviewsKdn251.Company.Google;

import java.util.Stack;

/**
 * Created by user on 14.05.2017.
 */

// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
public class ValidParentheses {
    public static boolean isValid(String str){

        if (str.length() % 2 != 0) return false;

        Stack<Character> chars = new Stack();

        for (int i = 0; i < str.length(); i++){

            char current = str.charAt(i);

            if (current == '{' || current == '[' || current == '('){
                chars.push(current);
            }else if (current == '}' && !chars.isEmpty() && chars.peek() == '{'){
                chars.pop();
            }else if (current == ']' && !chars.isEmpty() && chars.peek() == '['){
                chars.pop();
            }else if (current == ')' && !chars.isEmpty() && chars.peek() == '('){
                chars.pop();
            }else{
                return false;
            }
        }

        return chars.isEmpty();
    }
}
