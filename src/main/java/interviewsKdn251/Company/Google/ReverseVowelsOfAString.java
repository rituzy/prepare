package interviewsKdn251.Company.Google;

/**
 * Created by user on 11.05.2017.
 */
// Write a function that takes a string as input and reverse only the vowels of a string.

// Example 1:
// Given s = "hello", return "holle".

// Example 2:
// Given s = "leetcode", return "leotcede".

// Note:
// The vowels does not include the letter "y"
public class ReverseVowelsOfAString {
    public static String reverseVowels(String str){

        String vowelsString = "aeiouAEIOU";
        char[] result = str.toCharArray();

        int begin = 0;
        int end = str.length() - 1;

        while (begin < end){
            while (begin < end && !vowelsString.contains(String.valueOf(result[begin]))){
                begin++;
            }

            while (end > begin && !vowelsString.contains(String.valueOf(result[end]))){
                end--;
            }

            char tmp = result[begin];
            result[begin] = result[end];
            result[end] = tmp;
            begin++;
            end--;
        }

        return new String(result);

    }
}
