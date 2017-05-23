package interviewsKdn251.Company.Google;

/**
 * Created by user on 08.05.2017.
 */
// Given a string array words, find the maximum value of length(word[i]) * length(word[j])
// where the two words do not share common letters. You may assume that each word will
// contain only lower case letters. If no such two words exist, return 0.

// Example 1:
// Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
// Return 16
// The two words can be "abcw", "xtfn".

// Example 2:
// Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
// Return 4
// The two words can be "ab", "cd".

// Example 3:
// Given ["a", "aa", "aaa", "aaaa"]
// Return 0
// No such pair of words.
public class MaximumProductOfWordLengths {
    public static int maxProductWords(String[] words){

        int toReturn = 0;
        int len = words.length;
        int[] values = new int[len];

        for (int i = 0 ; i < len ; i++){
            String current = words[i];

            values[i] = 0;

            for (int j = 0 ; j < current.length(); j++){
                values[i] |= 1 << (current.charAt(j) - 'a');
            }
        }

        for (int i = 0; i < len; i++){
            for (int j = 1; j < len; j++){
                if ( (values[i] & values[j]) == 0 && (words[i].length()
                        * words[j].length()) > toReturn){
                    toReturn = words[i].length() * words[j].length();
                }
            }
        }

        return toReturn;

    }
}
