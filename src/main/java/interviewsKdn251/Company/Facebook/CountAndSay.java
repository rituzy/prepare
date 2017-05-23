package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 18.04.2017.
 */
// The count-and-say sequence is the sequence of integers beginning as follows:
// 1, 11, 21, 1211, 111221, ...

// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
// Given an integer n, generate the nth sequence.

// Note: The sequence of integers will be represented as a string.
public class CountAndSay {

    public static String countAndSay(int n){
        String str = "1";
        for (int i = 1; i < n; i++) {
            str = performCounting(str);
        }

        return str;
    }

    private static String performCounting(String str) {
        StringBuilder sb = new StringBuilder();

        char ch = str.charAt(0);
        int count = 1;

        for (int i = 0; i < str.length(); i++){

            if (ch == str.charAt(i)){
                count++;
            }else{
                sb.append(count);
                sb.append(ch);
                ch = str.charAt(i);
                count = 1;
            }

        }

        sb.append(count);
        sb.append(ch);

        return sb.toString();
    }

}
