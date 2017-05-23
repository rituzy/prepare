package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 06.05.2017.
 */

// Write a function to generate the generalized abbreviations of a word.

// Example:
// Given word = "word", return the following list (order does not matter):
// ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]

public class GeneralizedAbbreviation {
    public static List<String> getAbbrList(String word){
        List<String> toReturn = new ArrayList<>();
        if (word == null) return toReturn;

        recOperate(toReturn, word, "",0, 0);

        return toReturn;
    }

    private static void recOperate(List<String> toReturn,
                                   String word,
                                   String current,
                                   int position,
                                   int count) {
        if (position == word.length()){
            if (count > 0){
                current += count;
            }

            toReturn.add(current);
        }else {
            recOperate(toReturn,
                    word,
                    current,
                    position + 1,
                    count + 1);
            recOperate(toReturn,
                    word,
                    current + (count > 0 ? count : "") + word.charAt(position),
                    position + 1,
                    0);
        }
    }
}
