package interviewsKdn251.Company.Uber;

/**
 * Created by user on 21.05.2017.
 */
// A message containing letters from A-Z is being encoded to numbers using the following mapping:

// 'A' -> 1
// 'B' -> 2
// ...
// 'Z' -> 26

// Given an encoded message containing digits, determine the total number of ways to decode it.

// For example,
// Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

// The number of ways decoding "12" is 2.
public class DecodeWays {
    public static int getWays(String str){
        if (str == null) return 1;

        int len = str.length();
        int[] dp = new int[len + 1];
        dp[len] = 1;
        dp[len - 1] = str.charAt(len - 1) != '0' ? 1 : 0;

        for (int i = len - 2; i >= 0 ; i--){
            if (str.charAt(i) != '0') {
                dp[i] = Integer.parseInt(str.substring(i, i + 2)) <= 26 ? dp[i + 1] + dp[i + 2] : dp[i + 1];
            }
        }

        return dp[0];
    }
}
