package interviewsKdn251.Company.Airbnb;

/**
 * Created by user on 15.04.2017.
 */
public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {

        if (p.length() == 0){
            return s.length() == 0;
        }

        //pattern is of lengh 1
        if (p.length() == 1){
            if (s.length() < 1 || (p.charAt(0) != '*' && p.charAt(0) != s.charAt(0)) ){
                return false;
            }else{
                return isMatch(s.substring(1), p.substring(1));
            }
        }

        //common case pattern is not with *
        if (p.charAt(1) != '*'){
            if (s.length() < 1 || (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0)) ){
                return false;
            }else{
                return isMatch(s.substring(1), p.substring(1));
            }
        // pattern with *
        }else{
            // for 0 element
            if (isMatch(s, p.substring(2))){
                return true;
            }
            // check every substring
            int i = 0;
            while ( i < s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.') ){
                if (isMatch(s.substring(i+1), p.substring(2))){
                    return true;
                }
                i++;
            }
            return false;
        }

    }
}
