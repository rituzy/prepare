package interviewsKdn251.Company.Facebook;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 20.04.2017.
 */
public class MergeIntervalsSpec {
    @Test
    public void getMergetIntervalsTest() throws Exception {
        List<MergeIntervals.Interval> src = Arrays.asList(new MergeIntervals.Interval(1,3), new MergeIntervals.Interval(2,6),
                new MergeIntervals.Interval(8,10), new MergeIntervals.Interval(15,18));
        System.out.println(src);

        System.out.println(MergeIntervals.getMergetIntervals(src));
    }

}