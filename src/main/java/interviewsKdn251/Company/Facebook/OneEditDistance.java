package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */

// Given two strings S and T, determine if they are both one edit distance apart.

public class OneEditDistance {
    public static boolean isOneEditDistance(String s, String t){

        for (int i = 0 ; i < Math.min(s.length(), t.length()); i++){
            // if any characters are not equal the only chance for true
            // is to have the same remainders
            if (s.charAt(i) != t.charAt(i)){
                if (s.length() == t.length()){
                    return s.substring(i + 1).equals(t.substring(i + 1));
                }else if (s.length() > t.length()){
                    return s.substring(i + 1).equals(t.substring(i));
                }else if (s.length() < t.length()){
                    return t.substring(i + 1).equals(s.substring(i));
                }
            }
        }

        // all chars are the same check lengh diff

        return Math.abs(s.length() - t.length()) == 1;
    }
}
