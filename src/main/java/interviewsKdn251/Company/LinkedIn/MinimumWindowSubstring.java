package interviewsKdn251.Company.LinkedIn;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 20.05.2017.
 */
// Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

// For example,
// S = "ADOBECODEBANC"
// T = "ABC"
// Minimum window is "BANC".

// Note:
// If there is no such window in S that covers all characters in T, return the empty string "".

// If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
public class MinimumWindowSubstring {

    public static String getMinWindow(String src, String template){
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : src.toCharArray()){
            map.put(ch, 0);
        }

        for (char ch : template.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                return "";
            }
        }

        int start = 0;
        int end = 0;
        int startMinWindow = 0;
        int lenMinWindow = Integer.MAX_VALUE;
        int counter = template.length();

        while (end < src.length()){
            char current = src.charAt(end);

            // if counter > 0 than char is in template: decrement counter
            if (map.get(current) > 0){
                counter--;
            }

            // decrement count for every char thus for chars not in template will be at least -1
            map.put(current, map.get(current) - 1);

            end++;

            // region when all template's chars are found
            while (counter == 0){
                // check if this subastring is shorter than the one found earlier: if yes remember it
                if (lenMinWindow > end - start){
                    lenMinWindow = end - start;
                    startMinWindow = start;
                }
                // it this cycle we start from last begin
                char ch = src.charAt(start);
                // increment count for the char again as we take it out from sliding window:
                // will be 0 or less for chars not in the template
                map.put(ch, map.get(ch) + 1);
                // char from template found: increment counter
                if (map.get(ch) > 0 ){
                    counter++;
                }
                //iterate internal cycle
                start++;

            }
        }

        return lenMinWindow == Integer.MAX_VALUE ? "" : src.substring(startMinWindow, startMinWindow + lenMinWindow);

    }

}
