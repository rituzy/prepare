package interviewsKdn251.Company.Google;

/**
 * Created by user on 14.05.2017.
 */
// A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

// Write a function to determine if a number is strobogrammatic. The number is represented as a string.

// For example, the numbers "69", "88", and "818" are all strobogrammatic.
public class StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num){
        for (int i = 0, j = num.length() - 1; i < j; i++, j--){
            if (!"00 11 696 88".contains(num.charAt(i) + "" + num.charAt(j))){
                return false;
            }
        }

        return true;
    }
}
