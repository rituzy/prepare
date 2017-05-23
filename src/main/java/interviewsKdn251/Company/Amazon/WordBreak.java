package interviewsKdn251.Company.Amazon;

import java.util.Set;

/**
 * Created by user on 16.04.2017.
 */
// Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
// determine if s can be segmented into a space-separated sequence of one or more dictionary words.
// You may assume the dictionary does not contain duplicate words.

// For example, given
// s = "leetcode",
// dict = ["leet", "code"].

// Return true because "leetcode" can be segmented as "leet code"
public class WordBreak {
    public static boolean isWordBreak(String str, Set<String> dict){
        boolean[] dp = new boolean[str.length() + 1];
        dp[0] = true;

        for (int i = 1 ; i <= str.length(); i++){
            for (int j = 0; j < i; j++){
                // we check the last success match position and look for the word in dictionary after it
                if (dp[j] && dict.contains(str.substring(j,i))){
                    dp[i] = true;
                    break;
                }

            }
        }

        return  dp[str.length()];
    }
}
