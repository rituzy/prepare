package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.05.2017.
 */
// Given a sorted integer array without duplicates, return the summary of its ranges.

// For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
public class SummaryRanges {
    public static List<String> getSummaryRanges(int[] nums){
        List<String> toReturn = new ArrayList<>();

        if (nums.length == 1){
            toReturn.add(String.valueOf(nums[0]));
            return toReturn;
        }

        for (int i = 0 ; i < nums.length; i++){
            int current = nums[i];

            while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1){
                i++;
            }

            if (current != nums[i]){
                toReturn.add(String.valueOf(current + "->" + nums[i]));
            }else{
                toReturn.add(String.valueOf(current));
            }
        }


        return toReturn;
    }
}
