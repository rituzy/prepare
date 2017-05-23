package interviewsKdn251.Company.Facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 21.04.2017.
 */
// Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

// For example,
// S = "ADOBECODEBANC"
// T = "ABC"
// Minimum window is "BANC".

// Note:
// If there is no such window in S that covers all characters in T, return the empty string "".

// If there are multiple such windows, you are guaranteed that there will always be only
// one unique minimum window in S.

public class MinimumWindowSubstring {
    public static String findMinWindow(String s, String t){
        Map<Character, Integer> charCount = new HashMap<>();

        // fill the map with all the characters from the string
        for (char ch : s.toCharArray()){
            charCount.put(ch, 0);
        }

        // increment count of the map for the chars belong to template string(count maybe more than 1)
        // (if any of them is not found - return empty string)
        for (char ch : t.toCharArray()){
           if (charCount.containsKey(ch)) {
               charCount.put(ch, charCount.get(ch) + 1);
           }else{
               return "";
           }
        }
        // end = external index for source string from begin to end
        // start = internal index detecting template string's symbols started
        // minLen and minStart - borders for window to return
        int end = 0, start = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        // local counter: decremented when symbol of template string is found
        int counter = t.length();

        // main cycle for source string
        while (end < s.length()){
            // current symbol
            char ch = s.charAt(end);
            // if template contains char, decrement counter
            if ( charCount.get(ch) > 0){
                counter--;
            }
            // put modified counter of every char to map(we found one than decrement it)
            charCount.put(ch, charCount.get(ch) - 1);

            end++;

            // if we reached the end of template(all chars are found int the string)
            while (counter == 0){
                // find if this window's length is minimal
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;
                }
                // analyze next symbol in the source string
                char firstChar = s.charAt(start);
                // put to the map
                charCount.put(firstChar, charCount.get(firstChar) + 1);
                // if it's found in the map increment counter for this char
                // to return from inner cycle to external one(

                // if this the beginning of new window(char is in template)
                if (charCount.get(firstChar) > 0){
                    counter++;
                }

                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

    }
}
