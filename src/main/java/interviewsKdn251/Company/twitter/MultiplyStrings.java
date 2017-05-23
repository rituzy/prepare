package interviewsKdn251.Company.twitter;

/**
 * Created by user on 21.05.2017.
 */
// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.

// Note:

// The length of both num1 and num2 is < 110.
// Both num1 and num2 contains only digits 0-9.
// Both num1 and num2 does not contain any leading zero.
// You must not use any built-in BigInteger library or convert the inputs to integer directly.
public class MultiplyStrings {
    public static String multiply(String num1, String num2){
        String toReturn = "";

        if (num1 == null || num2 == null) return toReturn;

        int len1 = num1.length();
        int len2 = num2.length();

        int[] stolbik = new int[len1 + len2];

        // from right to left
        for (int i = len1 - 1 ; i >= 0; i--){
            for (int j = len2 - 1 ; j >= 0 ; j--){
                int ind1 = i + j;
                int ind2 = i + j + 1;
                int prod = Character.getNumericValue(num1.charAt(i)) *
                                Character.getNumericValue(num2.charAt(j));

                // total current sum
                int sum = prod + stolbik[ind2];

                // left digit more significant and sum it up
                stolbik[ind1] += sum / 10;
                // right digit less significant and it has been summed up in sum
                stolbik[ind2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        // from left to right (most significant digits to less
        for (int i = 0 ; i < stolbik.length ; i++){
            if ( !(stolbik[i] == 0 && sb.length() == 0) ){
                sb.append(stolbik[i]);
            }
        }

        return sb.toString();
    }
}
