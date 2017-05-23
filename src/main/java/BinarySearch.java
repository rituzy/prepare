import java.util.Arrays;

/**
 * Created by user on 09.04.2017.
 */
public class BinarySearch {
    int[] arr;
    int[] sorted;

    public BinarySearch(int[] numbers ) {
        this.arr = numbers;
        sorted = new int[arr.length];
        System.arraycopy(arr, 0, sorted, 0, arr.length);
        Arrays.sort(sorted);

    }

    public boolean search(int toFind){
        return recursiveSearch(toFind, 0 , arr.length);
    }

    private boolean recursiveSearch(int toFind, int start, int end){
        if (start >= end) return false;
        int mid = start + (end - start)/2;

        if (sorted[mid] == toFind) return true;

        if (sorted[mid] < toFind)
              return recursiveSearch(toFind, mid, end);
        else
              return recursiveSearch(toFind, start, mid-1);
    }
}
