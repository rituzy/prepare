package interviewsKdn251.Company.Uber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 22.05.2017.
 */
public class RomanToInteger {
    public static int convert2int(String roman){
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 100);

        int toReturn = 0;

        for (int i = 0 ; i < roman.length() - 1 ; i++){

            if ( mapping.get(roman.charAt(i) ) < mapping.get(roman.charAt(i + 1))){
                toReturn -= mapping.get(roman.charAt(i));
            }else {
                toReturn += mapping.get(roman.charAt(i));
            }
        }

        toReturn += mapping.get(roman.charAt(roman.length() - 1));

        return toReturn;
    }
}
