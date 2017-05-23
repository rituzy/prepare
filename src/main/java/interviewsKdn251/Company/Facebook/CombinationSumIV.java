package interviewsKdn251.Company.Facebook;

import java.util.List;

/**
 * Created by user on 18.04.2017.
 */
// Given an integer array with all positive numbers and no duplicates, find the number
// of possible combinations that add up to a positive integer target.

// Example:

// nums = [1, 2, 3]
// target = 4

// The possible combination ways are:
// (1, 1, 1, 1)
// (1, 1, 2)
// (1, 2, 1)
// (1, 3)
// (2, 1, 1)
// (2, 2)
// (3, 1)

// Note that different sequences are counted as different combinations.

// Therefore the output is 7.

// Follow up:
// What if negative numbers are allowed in the given array?
// How does it change the problem?
// What limitation we need to add to the question to allow negative numbers?
public class CombinationSumIV {

    public static int getAllCombinations(int[] numbers, int target){

        // combinations array
        int[] dp = new int[target + 1];
        // for zero target only one combination
        dp[0] = 1;

        // starting counting combinations from target = 1
        for (int i = 1; i < dp.length; i++){
            // for all num in numbers
            for (int j = 0 ; j < numbers.length; j++){
                // combination for target = i is possible only if it greater or equal to the num
                if (i - numbers[j] >= 0 ){
                    // if yes we sum up number of combinations for target = i and for target = i - numbers[j]
                    dp[i] += dp[i - numbers[j]];
                }
            }
        }
        return dp[target];
    }
}
