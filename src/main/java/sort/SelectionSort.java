package sort;

/**
 * Created by user on 02.04.2017.
 */
public class SelectionSort extends CommonSort{


    public int[] sort(int[] numbers){
        int size = numbers.length;

        for (int out = 0; out < size - 1; out++){
            int min = out;
            for (int in = out + 1; in < size; in++){
                if (numbers[min] > numbers[in]){
                    min = in;
                }
            }

            swap(min, out, numbers);
        }

        return numbers;
    }

}
