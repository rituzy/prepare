package interviewsKdn251.Company.Facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 22.04.2017.
 */
public class Roman2Integer {
    public static int convert(String romanDigit){
        Map<Character, Integer> digMap = new HashMap<>();
        digMap.put('I',1);
        digMap.put('V', 5);
        digMap.put('L', 50);
        digMap.put('X', 10);
        digMap.put('C', 100);
        digMap.put('D', 500);
        digMap.put('M', 1000);

        int total = 0;

        for (int i = 0; i < romanDigit.length() - 1; i++){
            if ( digMap.get(romanDigit.charAt(i)) < digMap.get(romanDigit.charAt(i+1)) ){
                total -= digMap.get(romanDigit.charAt(i));
            }else{
                total += digMap.get(romanDigit.charAt(i));
            }
        }

        total += digMap.get(romanDigit.charAt(romanDigit.length() - 1));

        return total;
    }
}
