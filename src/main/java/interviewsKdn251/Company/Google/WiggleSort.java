package interviewsKdn251.Company.Google;

/**
 * Created by user on 14.05.2017.
 */

// Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....
// For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].

public class WiggleSort {
    public static int[] wSort(int[] numbers){

        for (int i = 0; i < numbers.length - 1; i++){

            if ( ( i % 2 == 0 ) == ( numbers[i] > numbers[i + 1] ) ){
                int tmp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tmp;
            }

        }


        return numbers;
    }
}
