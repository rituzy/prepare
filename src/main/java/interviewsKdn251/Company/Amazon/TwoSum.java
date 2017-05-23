package interviewsKdn251.Company.Amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 16.04.2017.
 */
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target){

        int[] toRetrun = new int[2];

        Map<Integer, Integer> numInd = new HashMap<>();

        for (int i =0 ; i < numbers.length; i++){
            if (numInd.containsKey(target - numbers[i])){
                toRetrun[0] = numInd.get(target - numbers[i]);
                toRetrun[1] = i;
                return  toRetrun;
            }
            numInd.put(numbers[i], i);
        }

        return toRetrun;

    }
}
