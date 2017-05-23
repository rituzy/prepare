package interviewsKdn251.Company.Uber;

/**
 * Created by user on 24.05.2017.
 */
public class ValidPalindrome {
    public static boolean isValidPalindrome(String str) {

        if (str == null) return false;
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }

            if ( Character.toLowerCase(str.charAt(left) ) != Character.toLowerCase(str.charAt(right)) ){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
