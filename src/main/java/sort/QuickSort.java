package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 02.04.2017.
 */
public class QuickSort extends CommonSort{
    public void swap(int ind1, int ind2, int[] array){
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public int[] sortOptimal(int[] numbers){
        ArrayList<Integer> source = new ArrayList<Integer>();
        for (int i = 0 ; i < numbers.length; i++)
            source.add(numbers[i]);
        Collections.reverse(source);

        ArrayList<Integer> sortedList = new ArrayList<Integer>(sortList(source));

        for (int i = 0 ; i < sortedList.size(); i++)
            numbers[i] = sortedList.get(i);

        return numbers;
    }

    private List<Integer> sortList(List<Integer> numbersList){
        if (numbersList.size() < 2)
            return numbersList;

        List<Integer> lowList = new ArrayList<Integer>();
        List<Integer> hiList = new ArrayList<Integer>();

        Integer pivot = numbersList.get(0);
        for (int i = 1; i < numbersList.size(); i++){
            Integer current = numbersList.get(i);
            if (current < pivot){
                lowList.add(current);
            }else{
                hiList.add(current);
            }
        }

        List<Integer> toReturn = new ArrayList<Integer>(sortList(lowList));
        toReturn.add(pivot);
        toReturn.addAll(sortList(hiList));

        return toReturn;
    }

    public int[] sort(int[] numbers){
        recursiveSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void recursiveSort(int[] numbers, int low, int hi){
        if (low >= hi) return;
        int pivot = partition(numbers, low, hi);
        recursiveSort(numbers, low, pivot-1);
        recursiveSort(numbers, pivot+1, hi);
    }

    private int partition(int[] numbers, int low, int hi){

        int i = low;
        int j = hi+1;

        int current = numbers[low];
        while(true){

            while( numbers[++i] < current )
                if (i >= hi) break;

            while ( numbers[--j] > current )
                if (low >= j) break;

            if (i >= j) break;
            swap(i, j, numbers);
        }

        swap(low, j, numbers);

        return j;
    }
}
