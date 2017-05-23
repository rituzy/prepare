package interviewsKdn251.Company.Uber;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 22.05.2017.
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
    public static List<String> combination(String num){

        LinkedList<String> toReturn = new LinkedList<>();

        if (num == null || num.length() == 0){return toReturn;}
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        toReturn.add("");
        for (int i = 0 ; i < num.length(); i++){
            int index = Character.getNumericValue(num.charAt(i));

            while (toReturn.peek().length() == i){
                String old = toReturn.remove();

                for (char ch : mapping[index].toCharArray()){
                    toReturn.add(old + ch);
                }
            }


        }

        return toReturn;
    }
}
