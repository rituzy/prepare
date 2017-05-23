package interviewsKdn251.Company.Google;

/**
 * Created by user on 08.05.2017.
 */
// Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

// For example,
// MovingAverage m = new MovingAverage(3);
// m.next(1) = 1
// m.next(10) = (1 + 10) / 2
// m.next(3) = (1 + 10 + 3) / 3
// m.next(5) = (10 + 3 + 5) / 3


import java.util.LinkedList;
import java.util.Queue;

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
public class MovingAverage {

    int previousSum;
    int maxSize;
    Queue<Integer> queue = new LinkedList<>();

    public MovingAverage(int maxSize) {
        this.maxSize = maxSize;
    }

    public double next(int n){
        if (queue.size() == maxSize){
            previousSum -= queue.remove();
        }

        queue.add(n);
        previousSum += n;
        return previousSum / queue.size();
    }

}
