package interviewsKdn251.Company.Uber;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by user on 23.05.2017.
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
    public static List<List<Integer>> getSubsets(int[] nums){
        List<List<Integer>> toReturn = new ArrayList<>();

        if (nums == null || nums.length == 0 ) return toReturn;

        recHelper(toReturn, new Stack<Integer>(), 0, nums);

        return toReturn;
    }

    private static void recHelper(List<List<Integer>> result, Stack<Integer> stack,
                                  int position, int[] nums){
        if (nums.length == position){
            result.add(new ArrayList<>(stack));
            return;
        }

        stack.push(nums[position]);
        recHelper(result, stack, position + 1, nums);

        stack.pop();
        recHelper(result, stack, position + 1, nums);
    }
}
