package interviewsKdn251.Company.Facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 23.04.2017.
 */
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
public class TwoSum {
    public static int[] getSumElementsIndexes(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> numIndex = new HashMap<>();

        for (int i = 0; i < numbers.length ; i++){
            if (numIndex.containsKey(target - numbers[i])){
                result[0] = numIndex.get(target-numbers[i]);
                result[1] = i;
                return result;
            }
            numIndex.put(numbers[i], i);
        }

        return result;
    }

}
