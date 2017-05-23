package interviewsKdn251.Company.Uber;

/**
 * Created by user on 22.05.2017.
 */
public class PalindromePermutation {
    public static boolean isPalindromPermutation(String s){
        int counter = 0 ;
        int[] charCnt = new int[256];

        for (char ch : s.toCharArray()) {
            charCnt[ch]++;
        }

        for (char ch : s.toCharArray()){

            if (charCnt[ch] % 2 == 1){
                counter++;
                if (counter > 1) return false;
            }
        }

        return true;
    }
}
