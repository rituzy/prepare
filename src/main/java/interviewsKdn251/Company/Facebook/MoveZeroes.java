package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
// Given an array nums, write a function to move all 0's to the end of it while maintaining the
// relative order of the non-zero elements.

// For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

// Note:
// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.
public class MoveZeroes {
    public static int[] moveZeroes(int[] nums){
        if (nums == null || nums.length == 0) return null;

        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }

        return nums;
    }

}
