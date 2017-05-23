package interviewsKdn251.Company.twitter;

/**
 * Created by user on 21.05.2017.
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
        return "{ " + start +", " + end +" }";
    }
}
