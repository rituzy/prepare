package interviewsKdn251.Company.Airbnb;

import java.util.HashMap;

/**
 * Created by user on 15.04.2017.
 */
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
public class TwoSum {

    public static int[] getIndexForSum(int[] arr, int target){
        int[] toReturn = new int[2];

        HashMap<Integer, Integer> numInd = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            if (numInd.containsKey(target - arr[i])){
                toReturn[1] = i;
                toReturn[0] = numInd.get(target - arr[i]);
                return toReturn;
            }
            numInd.put(arr[i], i);

        }

        return toReturn;
    }

}
