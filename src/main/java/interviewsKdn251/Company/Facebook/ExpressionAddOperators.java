package interviewsKdn251.Company.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 18.04.2017.
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

    public static List<String> addOperators(String num, int target){
        List<String> toReturn = new ArrayList<>();
        if (num.isEmpty()) return null;
        // call recursive function
        figureOperations(toReturn, "", num, target,0,0,0);
        return toReturn;
    }

    private static void figureOperations(List<String> result, String resStr, String num, int target,
                                         int pos, long eval, long multed){
        //exit for recursive function : we are done at the end of numeric string
        if (pos == num.length()){
            if (eval == target){
                result.add(resStr);
            }
            return;
        }

        for (int i = pos; i < num.length(); i++){
            // omit parsing if pos = 0
            if (i != pos && num.charAt(pos) == '0') break;

            // number from numeric string
            Long current = Long.parseLong(num.substring(pos, i + 1));

            //first position in numeric string(adding a number without operation)
            if (pos == 0){
                figureOperations(result, resStr + current, num, target, i + 1,
                        current, current);
            }else {
            // not a first number: perform operation with second number
                figureOperations(result, resStr + "+" + current, num, target, i + 1,
                        eval + current, current);
                figureOperations(result, resStr + "-" + current, num, target, i + 1,
                        eval - current, -current);
                figureOperations(result, resStr + "*" + current, num, target, i + 1,
                        eval - multed + current * multed, current * multed);
            }
        }
    }
}
