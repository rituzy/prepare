package interviewsKdn251.Company.Facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by user on 22.04.2017.
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
    public static List<List<Integer>> getAllCombinations(int[] nums){
        List<List<Integer>> toReturn = new ArrayList<>();
        getAllCombinationsRec(toReturn, new Stack<Integer>(), 0, nums);
        return toReturn;
    }

    private static void getAllCombinationsRec(List<List<Integer>> result, Stack<Integer> stack,
                                              int position, int[] array){
        if (position == array.length){
            result.add(new ArrayList<>(stack));
            return;
        }
        // push one element
        stack.push(array[position]);
        // and receive the longest combination
        getAllCombinationsRec(result, stack, position + 1, array);
        // take the last element out
        stack.pop();
        // so as to get all combinations
        getAllCombinationsRec(result, stack, position + 1, array);

    }
}
