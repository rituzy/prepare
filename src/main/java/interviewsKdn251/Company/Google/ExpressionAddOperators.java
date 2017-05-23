package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.04.2017.
 */
// Given a string that contains only digits 0-9 and a target value, return all possibilities
// to add binary operators (not unary) +, -, or * between the digits so they evaluate to the target value.

// Examples:
// "123", 6 -> ["1+2+3", "1*2*3"]
// "232", 8 -> ["2*3+2", "2+3*2"]
// "105", 5 -> ["1*0+5","10-5"]
// "00", 0 -> ["0+0", "0-0", "0*0"]
// "3456237490", 9191 -> []

public class ExpressionAddOperators {
    public static List<String> getOperatorCombinations(String num, int target){
        
        List<String> toReturn = new ArrayList<>();
        if (num == null || num == "" ) return toReturn;
        
        helper(toReturn, "", num, 0, 0, 0, target);
        
        return toReturn;
        
    }

    private static void helper(List<String> toReturn, String s, String num, int pos, long eval, long mult
    ,int target) {
        if (pos == num.length()){
            if (eval == target) {
                toReturn.add(s);
            }
            return;
        }

        for (int i = pos; i < num.length(); i++){


            if (i != pos && num.charAt(pos) == '0') break;

            long l = Long.parseLong(num.substring(pos, i + 1));

            if (pos == 0){
                helper(toReturn, s + l, num, i + 1, l,
                        l, target);
            }else{
                helper(toReturn, s + "+" + l, num, i + 1,
                        eval + l, l, target);
                helper(toReturn, s + "-" + l, num, i + 1,
                        eval - l, -l, target);
                helper(toReturn, s + "*" + l, num, i + 1,
                        eval - mult + mult * l,
                        mult * l, target);
            }

        }
    }
}
