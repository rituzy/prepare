package interviewsKdn251.Company.Facebook;

import java.util.Set;

/**
 * Created by user on 23.04.2017.
 */
// Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
// determine if s can be segmented into a space-separated sequence of one or more dictionary words.
// You may assume the dictionary does not contain duplicate words.

// For example, given
// s = "leetcode",
// dict = ["leet", "code"].

// Return true because "leetcode" can be segmented as "leet code".
public class WordBreak {
    public static boolean isSgemented(String s, Set<String> dict){

        // array of matching flags
        boolean[] dp = new boolean[s.length() + 1];
        // first element is true(empty string is matching always)
        dp[0] = true;

        for (int i = 0 ; i <= s.length(); i++){
            for (int j = 0 ; j <= i; j ++){
                // if previous part of string has been matchend and the next(after j) is matched, thang
                // all current string part is matching
                if (dp[j] && dict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
