package interviewsKdn251.Company.Amazon;

import java.util.Arrays;

/**
 * Created by user on 16.04.2017.
 */
// Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

// For example,
// Given [3,2,1,5,6,4] and k = 2, return 5.

// Note:
// You may assume k is always valid, 1 ≤ k ≤ array's length.

public class KthLargestElementInAnArray {
    public static int getKthLargestElement(int[] numbers, int k){
        Arrays.sort(numbers);
        return numbers[numbers.length - k];
    }
}
