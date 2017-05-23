package interviewsKdn251.Company.twitter;

import interviewsKdn251.Company.Facebook.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class MergeIntervalsTest {
    @Test
    public void mergeTest() throws Exception {
        List<Interval> src = Arrays.asList(new Interval(1,3), new Interval(2,6),
                new Interval(8,10), new Interval(15,18));
        System.out.println(src);

        System.out.println(MergeIntervals.merge(src));
    }

}