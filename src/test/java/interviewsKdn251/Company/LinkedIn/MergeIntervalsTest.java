package interviewsKdn251.Company.LinkedIn;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class MergeIntervalsTest {
    @Test
    public void mergeIntervalsTest() throws Exception {
        List<Interval> src = Arrays.asList(new Interval(1,3), new Interval(2,6),
                new Interval(8,10), new Interval(15,18));
        System.out.println(src);

        System.out.println(MergeIntervals.mergeIntervals(src));
    }

}