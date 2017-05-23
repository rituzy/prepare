package interviewsKdn251.Company.Google;

import java.util.Arrays;

/**
 * Created by user on 23.04.2017.
 */
// Given an array of n integers nums and a target, find the number of index triplets i, j, k
// with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

// For example, given nums = [-2, 0, 1, 3], and target = 2.

// Return 2. Because there are two triplets which sums are less than 2:

// [-2, 0, 1]
// [-2, 0, 3]

// Follow up:
// Could you solve it in O(n2) runtime?
public class ThreeSumSmaller {
    public static int countThreeSumSmaller(int[] numbers, int target){
        int[] sorted = new int[numbers.length];
        System.arraycopy(numbers, 0, sorted, 0, numbers.length);
        // result
        int count = 0;

        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length - 2 ; i++){
            int left = i + 1;
            int right = sorted.length - 1;

            while (left < right){

                if (sorted[i] + sorted[left] + sorted[right] < target){
                    count += right - left;
                    left++;
                } else{
                    right--;
                }

            }

        }

        return count;
    }

}
