package interviewsKdn251.Company.Uber;

import java.util.*;

/**
 * Created by user on 21.05.2017.
 */
// Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:

// "abc" -> "bcd" -> ... -> "xyz"
// Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence.

// For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
// A solution is:

// [
//   ["abc","bcd","xyz"],
//   ["az","ba"],
//   ["acef"],
//   ["a","z"]
// ]

public class GroupShiftedStrings {
    public static List<List<String>> group(List<String> list){

        List<List<String>> toReturn = new ArrayList<>();

        if (list == null || list.size() == 0) return toReturn;

        Map<String, List<String>> map = new HashMap<>();

        for (String str : list){
            int offset = (int) (str.charAt(0) - 'a');
            StringBuilder key = new StringBuilder();

            for (int i = 0 ; i < str.length() ; i++){
                char current = (char) (str.charAt(i) - offset);

                if (current < 'a'){
                    current += 26;
                }
                key.append(current);

            }

            if (!map.containsKey(key.toString())){
                map.put(key.toString(), new ArrayList<String>());
            }

            map.get(key.toString()).add(str);
        }

        for (String k : map.keySet()){
            List<String> curList = map.get(k);
            Collections.sort(curList);
            toReturn.add(curList);
        }


        return toReturn;
    }
}
