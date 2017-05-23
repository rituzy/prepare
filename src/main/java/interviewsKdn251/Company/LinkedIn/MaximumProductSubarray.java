package interviewsKdn251.Company.LinkedIn;

import java.util.List;

/**
 * Created by user on 20.05.2017.
 */
// Find the contiguous subarray within an array (containing at least one number) which has the largest product.

// For example, given the array [2,3,-2,4],
// the contiguous subarray [2,3] has the largest product = 6.
public class MaximumProductSubarray {
    public static int getMaxProdSubArr(int[] numbers){

        if (numbers == null || numbers.length == 0) return -1;

        int max = numbers[0], min = numbers[0], result = numbers[0];

        for (int i = 1 ; i < numbers.length ; i++){
            int temp = max;
            max = Math.max(min* numbers[i], max * numbers[i]);
            min = Math.min(min * numbers[i], temp * numbers[i]);

            result = Math.max(max, result);
        }


        return result;
    }
}
