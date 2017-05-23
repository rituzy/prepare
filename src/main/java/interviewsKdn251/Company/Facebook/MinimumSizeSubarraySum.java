package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 21.04.2017.
 */
// Given an array of n positive integers and a positive integer s, find the minimal length of
// a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

// For example, given the array [2,3,1,2,4,3] and s = 7,
// the subarray [4,3] has the minimal length under the problem constraint.
public class MinimumSizeSubarraySum {
   public static int findSubarraySum(int[] numbers, int sum){
       int i = 0, j = 0;
       int total = 0;

       int toReturn = Integer.MAX_VALUE;

       while (i < numbers.length){
           total += numbers[i++];

            while (total >= sum) {
                toReturn = Math.min(toReturn, i - j);
                total -= numbers[j++];
            }

       }

       return toReturn;
   }
}
