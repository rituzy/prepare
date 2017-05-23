package interviewsKdn251.Company.Google;

import java.util.List;
import java.util.Set;

/**
 * Created by user on 15.05.2017.
 */
// Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
// determine if s can be segmented into a space-separated sequence of one or more dictionary words.
// You may assume the dictionary does not contain duplicate words.

// For example, given
// s = "leetcode",
// dict = ["leet", "code"].

// Return true because "leetcode" can be segmented as "leet code".
public class WordBreak {
    public static boolean isSegmented(Set<String> dict, String str){
        if (str == null || str.isEmpty()) return false;

        // positions in the string array: if substring matches a word in the dict, than true
        boolean[] matches = new boolean[str.length() + 1];
        // 0 pos is true as it matches with empty string
        matches[0] = true;

        for (int i = 1; i <= str.length() ; i++){
            // looking from the beginning every time if there are combinations
            for (int j = 0; j < i; j++){
                if ( matches[j] && dict.contains(str.substring(j, i)) ){
                    matches[i] = true;
                    break;
                }
            }

        }

        return matches[str.length()];
    }
}
