package interviewsKdn251.Company.Google;

/**
 * Created by user on 08.05.2017.
 */
// Given a string, find the length of the longest substring T that contains at most k distinct
// characters.

// For example, Given s = “eceba” and k = 2,

// T is "ece" which its length is 3.
public class LongestSubstringWithAtMostKDistinctCharacters {
    public static int countMaxSubsTringKDistinctCharacters(String s, int k){

        int[] counts = new int[256]; // 256 ASCII symbols

        int internalIndex = 0;
        int toReturn = 0;
        int countOfDistinct = 0;


        for (int j = 0; j < s.length(); j++){
            // brand new char in the string
            if (counts[s.charAt(j)] == 0){
                countOfDistinct++;
            }

            // mark the char as met : count of this char repeating in the string
            counts[s.charAt(j)]++;

            // counf of distinct chars exceeded go from the beginning of the string and take out
            // char by char until count of distinct will be equal to k
            while (k < countOfDistinct){
                //decrease number of repeating chars as the char is taken out
                counts[s.charAt(internalIndex)]--;

                if (counts[s.charAt(internalIndex)] == 0){
                    countOfDistinct--;
                }

                internalIndex++;

            }

            toReturn = Math.max(j - internalIndex + 1, toReturn);
        }


        return toReturn;
    }
}
