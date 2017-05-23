package sort;

/**
 * Created by user on 02.04.2017.
 */
public class BubbleSort extends CommonSort{

    public int[] sort(int[] numbers){
        int size = numbers.length;

        for (int out = size - 1; out > 1; out-- ){
            for (int in = 0; in < out; in++){
                if (numbers[out] < numbers[in]){
                    swap(out, in , numbers);
                }
            }
        }
        return numbers;
    }

    public int[] sortOptimal(int[] numbers){
        boolean swapped;
        do{
            swapped = false;
            for (int i = 0 ; i < numbers.length - 1; i++){
                if (numbers[i] > numbers[i+1]){
                    swap(i, i+ 1, numbers);
                    swapped = true;
                }
            }
        }while(swapped);

        return numbers;
    }


}
