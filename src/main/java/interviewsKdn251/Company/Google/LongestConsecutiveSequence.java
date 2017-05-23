package interviewsKdn251.Company.Google;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 08.05.2017.
 */
// Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

// For example,
// Given [100, 4, 200, 1, 3, 2],
// The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

// Your algorithm should run in O(n) complexity.

public class LongestConsecutiveSequence {
    public static int findLongesPart(int[] numbers){

        Map<Integer, Integer> map = new HashMap<>();
        int toReturn = 0;

        for (int i = 0; i < numbers.length ; i++){
            // only for new values not added to the map
            if (!map.containsKey(numbers[i])){
                //looking for neighbors and get their counts if exist
                int left = map.containsKey(numbers[i] - 1)?map.get(numbers[i] - 1) : 0;
                int right = map.containsKey(numbers[i] + 1)?map.get(numbers[i] + 1) : 0;

                int sum = left + right + 1;
                map.put(numbers[i], sum);

                toReturn = Math.max(toReturn, sum);
                // this will change counters for neighbors if the left and right != 0
                map.put(numbers[i] - left, sum);
                map.put(numbers[i] + right, sum);

            }else{
                continue;
            }

        }

        return toReturn;
    }
}
