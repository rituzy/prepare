package sort;

/**
 * Created by user on 04.04.2017.
 */
public abstract class CommonSort {
    public void swap(int ind1, int ind2, int[] array) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public abstract int[] sort(int[] numbers);

}
