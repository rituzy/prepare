package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.04.2017.
 */
public class MergeSort extends CommonSort{

    int[] aux;

    public int[] sort(int[] numbers) {
        aux = new int[numbers.length];

        recursiveSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void recursiveSort(int[] numbers, int low, int hi){
        if (hi <= low) return;
        int mid = low + (hi - low)/2;
        recursiveSort(numbers, low, mid);
        recursiveSort(numbers, mid+1, hi);
        merge(numbers, low, mid, hi);
    }

    private void merge(int[] numbers, int low, int mid, int hi){
        //copying to aux
        System.arraycopy(numbers, 0, aux, 0, numbers.length);

        int i = low;
        int j = mid+1;

        for ( int k =low ; k <= hi; k++ ){
            if ( i > mid ) numbers[k] = aux[j++];
            else if ( j > hi ) numbers[k] = aux[i++];
            else if ( aux[i] > aux[j] ) numbers[k] = aux[j++];
            else numbers[k] = aux[i++];
        }

    }

    public int[] optimalSort(int[] numbers){
        ArrayList<Integer> source = new ArrayList<Integer>();
        for (int i = 0 ; i < numbers.length; i++)
            source.add(numbers[i]);

        ArrayList<Integer> result = new ArrayList<Integer>(optimalSort(source));

        for (int i = 0 ; i < numbers.length; i++)
            numbers[i] = result.get(i);

        return numbers;
    }

    public List<Integer> optimalSort(ArrayList<Integer> numbers){
        return recursiveOptimalSort(numbers);
    }

    private ArrayList<Integer> recursiveOptimalSort(ArrayList<Integer> numbers){
        if (numbers.size() < 2){
            return numbers;
        }

        ArrayList<Integer> left = new ArrayList<Integer>( numbers.subList(0, numbers.size()/2));
        ArrayList<Integer> right = new ArrayList<Integer>( numbers.subList(numbers.size()/2, numbers.size()) );
        return merge(recursiveOptimalSort(left), recursiveOptimalSort(right));
    }

    private ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
        int leftInd = 0;
        int rightInd = 0;

        ArrayList<Integer> merged = new ArrayList<Integer>(left.size() + right.size());

        while (leftInd < left.size() && rightInd < right.size()){
            if (left.get(leftInd) < right.get(rightInd)){
                merged.add(left.get(leftInd++));
            }else{
                merged.add(right.get(rightInd++));
            }
        }

        while (leftInd < left.size()){
            merged.add(left.get(leftInd++));
        }

        while (rightInd < right.size()){
            merged.add(right.get(rightInd++));
        }

        return merged;
    }


}
