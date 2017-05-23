package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.05.2017.
 */
// Given a sorted integer array where the range of elements are in the inclusive range [lower, upper],
// return its missing ranges.

// For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
public class MissingRanges {
    public static List<String> findMissingRanges(int[] numbers, int begin, int end){

        List<String> toReturn = new ArrayList<>();

        for (int i = 0 ; i <= numbers.length ; i++){
            int start = i == 0 ? begin : numbers[i - 1] + 1;
            int finish = i == numbers.length ? end : numbers[i] - 1;

            recFinding(toReturn, start, finish);
        }

        return toReturn;
    }

    private static void recFinding(List<String> toReturn, int start, int finish) {
        if (start > finish){
            return;
        }else if (start == finish){
            toReturn.add(String.valueOf(start));
        }else{
            toReturn.add(String.valueOf(start) + "->" + String.valueOf(finish));
        }
    }
}
