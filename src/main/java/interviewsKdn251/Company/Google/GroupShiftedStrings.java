package interviewsKdn251.Company.Google;

import java.util.*;

/**
 * Created by user on 07.05.2017.
 */
// Given a string, we can "shift" each of its letter to its successive letter,
// for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:

// "abc" -> "bcd" -> ... -> "xyz"
// Given a list of strings which contains only lowercase alphabets, group all strings that
// belong to the same shifting sequence.

// For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
// A solution is:

// [
//   ["abc","bcd","xyz"],
//   ["az","ba"],
//   ["acef"],
//   ["a","z"]
// ]
public class GroupShiftedStrings {
    public static List<List<String>> groupWords(List<String> words){

        List<List<String>> toReturn = new ArrayList<>();
        // collect  all words with the same order of letters from the 'a'
        Map<String, List<String>> keyList = new HashMap<>();

        for (String str : words){
            // shift from 'a' to first char in the word
            int offcet = str.charAt(0) - 'a';
            // key will be the same for different words with the same order
            String key = "";

            for (int i = 0; i < str.length(); i++){
                // here is a magic: we move back to the very beginning and start collect key from 'a'
                char current = (char) (str.charAt(i) - offcet);
                // in case we reached char after 'a' we need to move bact to the end of alphabet 'z' , 'y' ...
                if (current < 'a'){
                    current += 26;
                }

                key += current;
            }

            // put pair key-list of words to the map
            if (!keyList.containsKey(key)){
                List<String> newList = new ArrayList<>();
                keyList.put(key, newList);
            }

            keyList.get(key).add(str);

        }

        for (String key : keyList.keySet()){
            List<String> curList = keyList.get(key);
            Collections.sort(curList);
            toReturn.add(curList);
        }

        return toReturn;
    }
}
