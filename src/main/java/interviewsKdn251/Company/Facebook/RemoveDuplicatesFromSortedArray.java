package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */

// Given a sorted array, remove the duplicates in place such that each element appear only once
// and return the new length.

// Do not allocate extra space for another array, you must do this in place with constant memory.

// For example,
// Given input array nums = [1,1,2],

// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

public class RemoveDuplicatesFromSortedArray {
    public static int removeDubs(int[] numbers){

        if (numbers == null || numbers.length ==0){
            throw new IllegalArgumentException();
        }

        int index = 1;

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] != numbers[i - 1]){
                numbers[index++] = numbers[i];
            }
        }

        return index;
    }
}
