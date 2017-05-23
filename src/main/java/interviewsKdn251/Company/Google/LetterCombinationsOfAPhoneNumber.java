package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 08.05.2017.
 */
// Given a digit string, return all possible letter combinations that the number could represent.

// A mapping of digit to letters (just like on the telephone buttons) is given below.

// 2 - abc
// 3 - def
// 4 - ghi
// 5 - jkl
// 6 - mno
// 7 - pqrs
// 8 - tuv
// 9 - wxyz

// Input:Digit string "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

public class LetterCombinationsOfAPhoneNumber {
    public static List<String> combinate(String num){
        LinkedList<String> toReturn = new LinkedList<>();
        // init Collections of strings
        String[] strings = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // initial first empty valut in result
        toReturn.add("");

        // going through the num string
        for (int i = 0 ; i < num.length(); i++) {
            int currentDigit = Character.getNumericValue(num.charAt(i));

            while (toReturn.peek().length() == i){
                // pull current element to add with every char from strings[currentDigit]
                String str = toReturn.remove();
                for (char ch : strings[currentDigit].toCharArray()){
                    toReturn.add(str + ch);
                }

            }

        }
        return toReturn;
    }
}
