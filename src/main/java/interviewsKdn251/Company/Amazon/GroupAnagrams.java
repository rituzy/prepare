package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by user on 16.04.2017.
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

    public static List<List<String>> groupAnagrams(String[] strings){

        Map<String, List<String>> keyAnagrams = new HashMap<>();

        for (String str : strings){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (! keyAnagrams.containsKey(key)) keyAnagrams.put(key, new ArrayList<String>());
            keyAnagrams.get(key).add(str);
        }

        return new ArrayList<>(keyAnagrams.values());

    }

}
