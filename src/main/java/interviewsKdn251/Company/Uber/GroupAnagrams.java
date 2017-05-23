package interviewsKdn251.Company.Uber;

import java.util.*;

/**
 * Created by user on 21.05.2017.
 */
// Given an array of strings, group anagrams together.

// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Return:

// [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note: All inputs will be in lower-case.
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){

        if (strs == null || strs.length == 0) return null;

        Map<String, List<String>> map = new HashMap<>();
        Arrays.sort(strs);

        for (String s : strs){
            char[] charKeys = s.toCharArray();
            Arrays.sort(charKeys);
            String key = new String(charKeys);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
