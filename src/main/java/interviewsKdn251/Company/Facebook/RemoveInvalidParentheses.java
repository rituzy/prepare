package interviewsKdn251.Company.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 22.04.2017.
 */
public class RemoveInvalidParentheses {

    public static List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        remove(s, result, 0, 0, new char[]{'(', ')'});
        return result;
    }

    public static void remove(String s, List<String> result, int last_i, int last_j,  char[] par) {
        for (int stack = 0 ,i = last_i; i < s.length(); i++){
            // moving forward while there won't be a pair of parentheses
            if (s.charAt(i) == par[0]) stack++;
            if (s.charAt(i) == par[1]) stack--;
            if (stack >= 0) continue;

            //found orphan parentheses: find the orphan and take it out from s string
            for (int j = last_j; j <= i; j++){
                // if found closing bracket at the beginning or there is no previous closing bracket
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]) ){
                    remove(s.substring(0, j) + s.substring(j+1), result, i, j, par);
                }
            }
            // exiting for cycle after every orphan found
            return;
        }

        //reverse the string
        String reversed = new StringBuilder(s).reverse().toString();
        //checking par and change it for looking from end to start
        if (par[0] == '('){
            // calling for reversed string from the beginning
            remove(reversed, result, 0, 0, new char[]{')','('});
        }else{
            // it has been reversed twice and checeked twice
            result.add(reversed);
        }

    }
}
