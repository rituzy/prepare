package interviewsKdn251.Company.twitter;

/**
 * Created by user on 21.05.2017.
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
    public static boolean isMatch(String str, String pat) {

        if (str == null || pat == null) return false;

        // empty pattern
        if (pat.length() == 0) {
            return str.length() == 0;
        }

        // case when pattern of 1 symbol length
        if (pat.length() == 1) {
            if (str.length() < 1 || (pat.charAt(0) != '*' && str.charAt(0) != pat.charAt(0))) {
                return false;
            } else {
                return isMatch(str.substring(1), pat.substring(1));
            }
        }

        // common case when next symbol is not *
        if (pat.charAt(1) != '*') {
            if (str.length() < 1 || (pat.charAt(0) != '.' && str.charAt(0) != pat.charAt(0))) {
                return false;
            } else {
                return isMatch(str.substring(1), pat.substring(1));
            }
        } else {
            // if rest of string (after *) is found from the begin
            if (isMatch(str, pat.substring(2))) {
                return true;
            }
            // looking for matching substring on every position
            int i = 0;

            while (i < str.length() && (str.charAt(i) == pat.charAt(0) || pat.charAt(0) == '.')) {
                if (isMatch(str.substring(i + 1), pat.substring(2))) {
                    return true;
                }
                i++;
            }

            return false;
        }
    }
}
