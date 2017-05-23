package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 23.04.2017.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String str){
        int left =0;
        int right = str.length() - 1;

        while (left <= right){
            while ( !Character.isLetterOrDigit(str.charAt(left)) && left <= right ) left++;
            while ( !Character.isLetterOrDigit(str.charAt(right)) && left <= right ) right--;

            if ( str.toLowerCase().charAt(left) != str.toLowerCase().charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}
