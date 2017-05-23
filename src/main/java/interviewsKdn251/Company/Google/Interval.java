package interviewsKdn251.Company.Google;

/**
 * Created by user on 08.05.2017.
 */
public class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Interval() {
        this(0,0);
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
