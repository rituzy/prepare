package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 18.04.2017.
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
    public static int getCombinationsDecoded(String str){
        int len = str.length();
        if (len == 0) return 0;

        int[] combinations = new int[len + 1];
        // first combination for the last not existing symbol
        combinations[len] = 1;
        // second combination for the second from the right side of the string
        // if not a '0' then 1 else no new combinations
        combinations[len - 1] = str.charAt(len - 1) == '0' ? 0 : 1;
        // summing combinations up if symbols are not a '0' and sum two last elements if the code is less than 26
        // as there are more than 1 combinations, i.e. "12" = "AB" or "L"
        for (int i = len - 2; i >=0; i--){
            if (str.charAt(i) == '0') continue;

            combinations[i] += Integer.parseInt(str.substring(i, i + 2)) < 27 ? combinations[i + 1]
                    + combinations[i + 2] : combinations[i + 1];

        }

        return combinations[0];

    }
}
