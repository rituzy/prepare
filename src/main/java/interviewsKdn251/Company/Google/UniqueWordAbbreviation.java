package interviewsKdn251.Company.Google;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 14.05.2017.
 */
// An abbreviation of a word follows the form <first letter><number><last letter>. Below are some examples of word abbreviations:

// a) it                      --> it    (no abbreviation)

//      1
// b) d|o|g                   --> d1g

//               1    1  1
//      1---5----0----5--8
// c) i|nternationalizatio|n  --> i18n

//               1
//      1---5----0
// d) l|ocalizatio|n          --> l10n
// Assume you have a dictionary and given a word, find whether its abbreviation is unique in the dictionary. A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.

// Example:
// Given dictionary = [ "deer", "door", "cake", "card" ]

// isUnique("dear") ->
// false

// isUnique("cart") ->
// true

// isUnique("cane") ->
// false

// isUnique("make") ->
// true
public class UniqueWordAbbreviation {
    Map<String, String> dictionary;

    public UniqueWordAbbreviation(List<String> dict) {
        dictionary = new HashMap<>();

        for (String str : dict){
            if (dictionary.containsKey(getKey(str))){
                if ( dictionary.get(getKey(str)).equals(str) ) {
                    dictionary.put(getKey(str), "");
                }
            }else{
                dictionary.put(getKey(str), str);
            }
        }
    }

    public boolean isUnique(String str){
        String key = getKey(str);
        return !dictionary.containsKey(key) || dictionary.get(key).equals(str);
    }

    private String getKey(String str) {
        if (str.length() <= 2) return str;

        return str.charAt(0) + String.valueOf(str.length() - 2) + str.charAt(str.length() - 1);
    }


}
