package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.

// Note:

// The length of both num1 and num2 is < 110.
// Both num1 and num2 contains only digits 0-9.
// Both num1 and num2 does not contain any leading zero.
// You must not use any built-in BigInteger library or convert the inputs to integer directly.
public class MultiplyStrings {
    public static String MultiplyStrings(String num1, String num2){
        int[] digits = new int[num1.length() + num2.length()];
        // reverse strings for multiplying from the less sign to gross sign
        StringBuilder sb1 = new StringBuilder(num1).reverse();
        StringBuilder sb2 = new StringBuilder(num2).reverse();
        StringBuilder result = new StringBuilder();

        //multiply each digit
        for (int i = 0; i < sb1.length(); i++){
            for (int j = 0; j < sb2.length(); j++){
                digits[i + j] += Character.getNumericValue(sb1.charAt(i)) *
                        Character.getNumericValue(sb2.charAt(j));
            }
        }

        //calculate and for result
        for (int i = 0 ; i < digits.length; i++){
            int mod = digits[i] % 10;
            int carrier = digits[i] / 10;


            if (i < digits.length - 1){
                digits[i+1] += carrier;
            }

            result.insert(0,mod);
        }

        //delete leading zeroes
        while (result.charAt(0) == '0' && result.length() > 0){
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
