package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 20.05.2017.
 */
// Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

// For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
// the contiguous subarray [4,-1,2,1] has the largest sum = 6.
public class MaximumSubarray {
    public static int getMaxSum(int[] numbers){
        if (numbers == null || numbers.length == 0) return 0;

        int[] dp = new int[numbers.length];
        dp[0] = numbers[0];
        int max = dp[0];

        for (int i = 1; i < numbers.length; i++){
            dp[i] = numbers[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
