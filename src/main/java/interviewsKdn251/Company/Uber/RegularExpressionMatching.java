package interviewsKdn251.Company.Uber;

/**
 * Created by user on 22.05.2017.
 */
// Implement regular expression matching with support for '.' and '*'.

// '.' Matches any single character.
// '*' Matches zero or more of the preceding element.

// The matching should cover the entire input string (not partial).

// The function prototype should be:
// bool isMatch(const char *s, const char *p)

// Some examples:
// isMatch("aa","a") → false
// isMatch("aa","aa") → true
// isMatch("aaa","aa") → false
// isMatch("aa", "a*") → true
// isMatch("aa", ".*") → true
// isMatch("ab", ".*") → true
// isMatch("aab", "c*a*b") → true
public class RegularExpressionMatching {
    public static boolean isMatch(String s, String t){

        if (t.length() == 0){
            return s.length() == 0;
        }

        if (t.length() == 1){
            if (s.length() < 1 || (t.charAt(0) != '*' && t.charAt(0) != s.charAt(0))){
                return false;
            }else{
                return isMatch(s.substring(1), t.substring(1));
            }
        }

        if (t.charAt(1) != '*'){
            if (s.length() < 1 || (t.charAt(0) != '.' && t.charAt(0) != s.charAt(0))){
                return false;
            }else{
                return isMatch(s.substring(1), t.substring(1));
            }
        }else{
            if (isMatch(s, t.substring(2))){
                return true;
            }

            int i = 0;
            while ( i < s.length() && (t.charAt(0) == '.' || s.charAt(i) == t.charAt(0) ) ){
                if (isMatch(s.substring(i + 1), t.substring(2))){
                    return true;
                }
                i++;
            }
            return false;
        }

    }
}
