package interviewsKdn251.Company.Uber;

import java.util.Set;

/**
 * Created by user on 24.05.2017.
 */
public class WordBreak {
    public static boolean isFit(String str, Set<String> dict){

        int len = str.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;

        for (int i = 1; i <= len ; i++){
            for (int j = 0 ; j < i ; j++){
                if (dp[j] && dict.contains(str.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len];

    }
}
