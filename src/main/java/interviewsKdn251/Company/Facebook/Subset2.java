package interviewsKdn251.Company.Facebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 22.04.2017.
 */
// Given a collection of integers that might contain duplicates, nums, return all possible subsets.

// Note: The solution set must not contain duplicate subsets.

// For example,
// If nums = [1,2,2], a solution is:

// [
//   [2],
//   [1],
//   [1,2,2],
//   [2,2],
//   [1,2],
//   []
// ]
public class Subset2 {
    public static List<List<Integer>> getSubsets2(int[] numbers){
        Set<List<Integer>> subsets = new HashSet<>(Subsets.getAllCombinations(numbers));
        return new ArrayList<>(subsets);
    }

    public static List<List<Integer>> getSubsets2Cycle(int[] numbers){
        List<List<Integer>> toReturn = new ArrayList<>();
        getSubset2Rec(toReturn, numbers, 0, new ArrayList<Integer>());
        return toReturn;
    }

    private static void getSubset2Rec(List<List<Integer>> toReturn, int[] numbers,
                                      int pos, ArrayList<Integer> integers) {
        toReturn.add(integers);

        for (int i = pos; i < numbers.length; pos++){
            if (i > pos && numbers[pos - 1] == numbers[i]) continue;

            ArrayList<Integer> newList = new ArrayList<>(integers);
            newList.add(numbers[i]);
            getSubset2Rec(toReturn, numbers, i + 1, newList);
        }
    }
}
