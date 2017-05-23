package interviewsKdn251.Company.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 15.04.2017.
 */
// Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

// Note: The solution set must not contain duplicate triplets.

// For example, given array S = [-1, 0, 1, 2, -1, -4],

// A solution set is:
// [
//   [-1, 0, 1],
//   [-1, -1, 2]
// ]

public class ThreeSum {
    public static List<List<Integer>> getThreeNumSumZero(final int[] numbers){
        List<List<Integer>> toReturn = new ArrayList<>();
        int[] sorted = new int[numbers.length];
        System.arraycopy(numbers, 0, sorted, 0, numbers.length);
        Arrays.sort(sorted);

        for (int i = 0 ; i < sorted.length - 2; i++){
            if (i > 0 && sorted[i] == sorted[i-1]){
                continue;
            }

            int begin = i + 1;
            int end = sorted.length - 1;

            while (begin < end){
                if (sorted[begin] + sorted[end] + sorted[i] == 0){
                    List<Integer> localResult = new ArrayList<>();
                    localResult.add(sorted[i]);
                    localResult.add(sorted[begin]);
                    localResult.add(sorted[end]);
                    toReturn.add(localResult);

                    begin++;
                    end--;

                    while (begin < end && sorted[begin] == sorted[begin + 1]) begin++;
                    while (begin < end && sorted[end] == sorted[end - 1]) end--;
                } else if (sorted[begin] + sorted[end] + sorted[i] < 0){
                    begin++;
                }else if (sorted[begin] + sorted[end] + sorted[i] > 0){
                    end--;
                }
            }

        }

        return toReturn;
    }
}
