package interviewsKdn251.Company.Facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 19.04.2017.
 */
// Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

// For example,
// Given [100, 4, 200, 1, 3, 2],
// The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

// Your algorithm should run in O(n) complexity.
public class LongestConsecutiveSequence {

    public static int getLenConsecutive(int[] numbers){
        Map<Integer, Integer> valCount = new HashMap<>();
        int toReturn = 0;

        for (int i = 0; i < numbers.length; i++){
            if (!valCount.containsKey(numbers[i])){
                // trying to find neighbours in the map
                int left = valCount.containsKey(numbers[i] - 1)?valCount.get(numbers[i] - 1):0;
                int right = valCount.containsKey(numbers[i] + 1)?valCount.get(numbers[i] + 1):0;

                //summing up next result
                int sum = left + right + 1;
                valCount.put(numbers[i], sum);

                toReturn = Math.max(toReturn, sum);

                // !! sum will be put to the map if and only if left and right !=0(this elements
                // were existing in the map earlier!)
                valCount.put(numbers[i] - left, sum);
                valCount.put(numbers[i] + right, sum);
            }else{
                continue;
            }
        }

        return toReturn;
    }

}
