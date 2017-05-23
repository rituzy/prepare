package interviewsKdn251.Company.Amazon;

/**
 * Created by user on 16.04.2017.
 */
// Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to
// the product of all the elements of nums except nums[i].

// Solve it without division and in O(n).

// For example, given [1,2,3,4], return [24,12,8,6].

// Follow up:
// Could you solve it with constant space complexity? (Note: The output array does not count as extra
// space for the purpose of space complexity analysis.)

public class ProductOfArrayExceptSelf {

    public static int[] getProductArrayExcepSelf(int[] numbers){

        int[] toReturn = new int[numbers.length];
        // production for all elements to the left
        int leftProd = 1;

        for (int i = 0; i < numbers.length; i++){
            if (i > 0){
                leftProd *= numbers[i-1];
            }

            toReturn[i] = leftProd;
        }
        // production for all elements to the right
        int rightProd = 1;

        for (int i = numbers.length - 1; i >= 0; i-- ){

            if (i < numbers.length - 1){
                rightProd *= numbers[i + 1];
            }

            toReturn[i] *= rightProd;
        }

        return toReturn;
    }
}
