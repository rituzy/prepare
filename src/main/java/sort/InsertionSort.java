package sort;

import java.util.LinkedList;

/**
 * Created by user on 02.04.2017.
 */
public class InsertionSort extends CommonSort{

    public int[] sort(int[] numbers){
        int size = numbers.length;

        for (int out = 1; out < size; out++){
            for (int in = out; in > 0 && numbers[in] < numbers[in - 1] ; in--){
                swap(in, in-1, numbers);
            }
        }

        return numbers;
    }

    public int[] sortOptimal(int[] numbers){
        LinkedList<Integer> sortedList = new LinkedList<Integer>();

        OriginalList:for (int number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue OriginalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }


        for (int i = 0 ; i < numbers.length; i++){
                numbers[i] = sortedList.get(i);
        }

        return numbers;
    }

}
