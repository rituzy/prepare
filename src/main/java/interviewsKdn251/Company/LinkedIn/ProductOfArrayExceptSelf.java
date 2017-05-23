package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 20.05.2017.
 */
// Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product
// of all the elements of nums except nums[i].

// Solve it without division and in O(n).

// For example, given [1,2,3,4], return [24,12,8,6].

// Follow up:
// Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

public class ProductOfArrayExceptSelf {
    public static int[] getProduct(int[] numbers){

        int left = 1;

        for (int i = 0 ; i < numbers.length; i++){
            if (i > 0){
                left *= numbers[i - 1];
                numbers[i] = left;
            }
        }

        int right = 1;

        for (int i = numbers.length - 1 ; i >= 0; i--){
            if (i < numbers.length - 1){
                right *= numbers[i];
            }
            numbers[i] *= right;
        }


        return numbers;
    }
}
