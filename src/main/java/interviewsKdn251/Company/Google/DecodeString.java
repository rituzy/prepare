package interviewsKdn251.Company.Google;

import java.util.Stack;

/**
 * Created by user on 24.04.2017.
 */
// Given an encoded string, return it's decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is
// being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// You may assume that the input string is always valid; No extra white spaces,
// square brackets are well-formed, etc.

// Furthermore, you may assume that the original data does not contain any digits
// and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

public class DecodeString {
    public static String decode (String str){


        String decoded = "";
        Stack<String> decodedString = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        int index = 0;

        while (index < str.length()){

            if ( Character.isDigit(str.charAt(index)) ){
                int counter = 0;
                int number = 0;

                while (Character.isDigit(str.charAt(index))){
                    number += 10*counter + Character.getNumericValue(str.charAt(index));
                    index++;
                }

                counts.push(number);
            } else if ( str.charAt(index) == '[' ){
                decodedString.push(decoded);
                decoded = "";
                index++;
            }else if ( str.charAt(index) == ']' ){
                StringBuilder temp = new StringBuilder( decodedString.pop() );
                int j = counts.pop();
                while (j > 0){
                    temp.append(decoded);
                    j--;
                }

                decoded = temp.toString();
                index++;
            }else{
                decoded += str.charAt(index);
                index++;
            }
        }

        return decoded;
    }
}
