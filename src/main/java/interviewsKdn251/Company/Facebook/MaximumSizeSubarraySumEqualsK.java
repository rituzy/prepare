package interviewsKdn251.Company.Facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 20.04.2017.
 */

// Given an array nums and a target value k, find the maximum length of a subarray that sums to k.
// If there isn't one, return 0 instead.

// Note:
// The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

// Example 1:
// Given nums = [1, -1, 5, -2, 3], k = 3,
// return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)

// Example 2:
// Given nums = [-2, -1, 2, 1], k = 1,
// return 2. (because the subarray [-1, 2] sums to 1 and is the longest)

// Follow Up:
// Can you do it in O(n) time?
public class MaximumSizeSubarraySumEqualsK {

    public static int getMaxLenSumK(int[] numbers, int k){
        Map<Integer, Integer> elementVal = new HashMap<>();
        int maxLen = 0;
        int total = 0;
        // first element (-1 index does not exist)
        elementVal.put(0, - 1);

        for (int i = 0; i < numbers.length; i++){
            total += numbers[i];
            if (elementVal.containsKey(total - k)){
                maxLen = Math.max(maxLen, i - elementVal.get(total - k));
            }

            if (!elementVal.containsKey(total)) {
                elementVal.put(total, i);
            }
        }

        return maxLen;

    }

}
