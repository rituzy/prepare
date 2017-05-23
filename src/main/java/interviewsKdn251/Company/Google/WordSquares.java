package interviewsKdn251.Company.Google;

import java.util.*;

/**
 * Created by user on 15.05.2017.
 */
// Given a set of words (without duplicates), find all word squares you can build from them.

// A sequence of words forms a valid word square if the kth row and column read the exact same string,
// where 0 ≤ k < max(numRows, numColumns).

// For example, the word sequence ["ball","area","lead","lady"] forms a word square because each word reads
// the same both horizontally and vertically.

// b a l l
// a r e a
// l e a d
// l a d y

// Note:
// There are at least 1 and at most 1000 words.
// All words will have the exact same length.
// Word length is at least 1 and at most 5.
// Each word contains only lowercase English alphabet a-z.

public class WordSquares {
    public static List<List<String>> getSquares(String[] words) {

        List<List<String>> toReturn = new ArrayList<>();

        if (words == null || words.length == 0) return toReturn;

        Map<String, Set<String>> map = new HashMap<>();
        int squareLen = words[0].length();

        // fill in map with values <key>-<list of words> where key is substring from firts char to whole word(w, wo, wor,word)
        for (int i = 0; i < words.length; i++) {
            // first key is always "" (index = -1)
            for (int j = -1; j < squareLen; j++) {
                String curKey = words[i].substring(0, j + 1);
                if (!map.containsKey(curKey)) {
                    map.put(curKey, new HashSet<>());
                }

                map.get(curKey).add(words[i]);
            }
        }

        process(toReturn, new ArrayList(), 0, squareLen, map);

        return toReturn;
    }

    // recursive collecting of result
    private static void process(List<List<String>> toReturn, ArrayList<String> arrayList, int position,
                                int total, Map<String, Set<String>> map) {
        // position reached square length, exit from recursion
        if (position == total) {
            toReturn.add(new ArrayList<>(arrayList));
            return;
        }

        // key for looking for in the map
        StringBuilder sb = new StringBuilder();

        // appending string with chars from different words with i index and the same position in it
        /**
         * magic is here:
         * words list(arrayList) grows recursively by 1 word every time
         * but every time position increments and for first word it was 0 char
         * for first and second word it was 1-st char and so forth until position reaches square lenght
         */
        for (int i = 0; i < position; i++) {
            String curWord = arrayList.get(i);
            char curChar = curWord.charAt(position);
            sb.append(curChar);
        }

        // if map contains first part of the word
        Set<String> found = map.get(sb.toString());

        if (found == null) {
            return;
        }

        for (String str : found) {
            arrayList.add(str);
            process(toReturn, arrayList, position + 1, total, map);
            arrayList.remove(arrayList.size() - 1);
        }

    }

}

