package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 19.04.2017.
 */
// Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.

// For example,

// 123 -> "One Hundred Twenty Three"
// 12345 -> "Twelve Thousand Three Hundred Forty Five"
// 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
public class IntegerToEnglishWord {
    private final static String[] LESS_THAN_20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private final static String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    private final static String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

    public static String intToString(int n){

        if (n == 0) return "Zero";

        String resultString = "";
        int i = 0;

        while (n > 0){
            if (n % 1000 != 0){
                resultString = operate(n%1000) + THOUSANDS[i] + " " + resultString;
            }

            n /= 1000;
            i++;
        }

        return resultString.trim();
    }

    private static String operate(int i) {
        if (i == 0 ){
            return "";
        }
        if (i < 20){
            return LESS_THAN_20[i] + " ";
        }

        if (i < 100){
            return TENS[i/10] + " " + operate(i%10);
        }

        return LESS_THAN_20[i/100] + " Hundred " + operate(i%100);
    }
}
