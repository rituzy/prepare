package sort;

/**
 * Created by user on 07.04.2017.
 */
public class ShellSort extends CommonSort{
    public int[] sort(int[] numbers){
        int h = 1;
        int len = numbers.length;
        while (h < len/3) h = h*3 + 1;

        while (h>=1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h && numbers[j] < numbers[j - h]; j -= h)
                    swap(j, j - h, numbers);
            }
            h /=3;
        }

        return numbers;
    }

}
