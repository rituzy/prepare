package interviewsKdn251.Company.Amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by user on 16.04.2017.
 */
// Given a set of distinct integers, nums, return all possible subsets.

// Note: The solution set must not contain duplicate subsets.

// For example,
// If nums = [1,2,3], a solution is:

// [
//   [3],
//   [1],
//   [2],
//   [1,2,3],
//   [1,3],
//   [2,3],
//   [1,2],
//   []
// ]
public class Subsets {
    public static List<List<Integer>> getSubsets(int[] numbers){
        if (numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("numbers must not be a null");
        }

        List<List <Integer> > toReturn = new ArrayList<>();
        fillStack(toReturn, numbers, new Stack<Integer>(), 0);

        return toReturn;
    }

    private static void fillStack(List<List<Integer>> result, int[] numbers, Stack stack, int level){
        if (numbers.length == level){
            result.add(new ArrayList<>(stack));
            return;
        }

        stack.push(numbers[level]);
        // this will return one maximum combination
        fillStack(result, numbers, stack, level + 1);

        // to keep retrieving combinations needs to take the last one out and take another
        // combinations of n-1 elements and so forth to 0 elements
        stack.pop();
        fillStack(result, numbers, stack, level + 1);

    }
}
