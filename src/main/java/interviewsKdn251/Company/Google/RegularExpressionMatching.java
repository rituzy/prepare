package interviewsKdn251.Company.Google;

/**
 * Created by user on 10.05.2017.
 */

public class RegularExpressionMatching {
    public static boolean regex(String pat, String str){
        // pattern is of zero length
        if (pat.length() == 0){
            return str.length() == 0;
        }

        // pattern is of length 1
        if (pat.length() == 1){
            if ( str.length() < 1 || ( pat.charAt(0) != '*' && pat.charAt(0) != str.charAt(0) ) ){
                return false;
            }else {
                return regex(pat.substring(1), str.substring(1));
            }
        }

        // common case but not '*'
        if (pat.charAt(1) != '*'){
            if ( str.length() < 1 || ( pat.charAt(0) != '.' && pat.charAt(0) != str.charAt(0) ) ){
                return false;
            }else {
                return regex( pat.substring(1), str.substring(1) );
            }
        // common case with '*'
        }else{
            if (regex( pat.substring(2), str) ){
                return true;
            }

            int i = 0;
            while (i < str.length() && (pat.charAt(0) == str.charAt(i) || pat.charAt(0) == '.') ){
                if ( regex( pat.substring(2), str.substring(i + 1) ) ){
                    return true;
                }
                i++;
            }

            return false;
        }
    }
}