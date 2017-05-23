package interviewsKdn251.Company.Uber;

/**
 * Created by user on 22.05.2017.
 */

// Given two strings S and T, determine if they are both one edit distance apart.
public class OneEditDistance {
    public static boolean isOneEditDistance(String s1, String s2){

        if (s1 == null || s2 == null){
            return false;
        }

        for (int i = 0 ; i < Math.min(s1.length(), s2.length()) ; i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if (s1.length() == s2.length()){
                    return s1.substring(i + 1).equals(s2.substring(i + 1));
                }else if (s1.length() > s2.length()){
                    return s1.substring(i + 1).equals(s2.substring(i));
                }else{
                    return s1.substring(i).equals(s2.substring(i + 1));
                }
            }
        }

        return Math.abs(s1.length() - s2.length()) == 1;
    }
}
