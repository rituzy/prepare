package interviewsKdn251.Company.Uber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 22.05.2017.
 */
public class MinimumWindowSubstring {
    public static String getWindow(String s, String t){

        if (s == null || t == null) return "";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            if (!map.containsKey(ch)){
                map.put(ch, 0);
            }
        }

        for (char ch : t.toCharArray()){
            if (!map.containsKey(ch)) {
                return "";
            }
            map.put(ch, map.get(ch) + 1);
        }

        int start = 0;
        int end = 0;
        int windowStart = 0;
        int windowLen = Integer.MAX_VALUE;
        int counter = t.length();

        while (end < s.length()){

            char current = s.charAt(end);

            if (map.get(current) > 0){
                counter--;
            }

            map.put(current, map.get(current) - 1);

            end++;

            while (counter == 0){
                if (windowLen > end - start){
                    windowLen = end - start;
                    windowStart = start;
                }

                char internalCurrent = s.charAt(start);
                map.put(internalCurrent, map.get(internalCurrent) + 1);

                if (map.get(internalCurrent) > 0){
                    counter++;
                }

                start++;
            }

        }

        return windowLen == Integer.MAX_VALUE ? "":s.substring(windowStart, windowStart + windowLen);
    }
}
