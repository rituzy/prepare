package interviewsKdn251.Company.coursera_algorithm;

import java.util.EmptyStackException;

/**
 * Created by user on 28.05.2017.
 * Stack with max. Create a data structure that efficiently supports the stack operations
 * (push and pop) and also a return-the-maximum operation. Assume the elements are reals
 * numbers so that you can compare them.
 */
public class StackMax {

    private double[] arr = new double[1];
    private int N = 0;
    private double max;

    public boolean isEmpty() { return N==0;}

    public int size() {return N;}

    public void push(double d)
    {

        arr[N++] = d;
        if (N == 1){
            max = d;
        }else{
            max = (max < d)?d:max;
        }

    }

    public double pop()
    {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        double retval = arr[N];
        arr[N] = 0d;
        N--;
        return retval;
    }

    public double max()
    {
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return max;
    }
}
