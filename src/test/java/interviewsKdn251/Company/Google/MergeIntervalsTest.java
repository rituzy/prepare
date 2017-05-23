package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Facebook.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class MergeIntervalsTest {
    @Test
    public void mergeIntervalsTest() throws Exception {
        ArrayList<Interval> src = new ArrayList<>();
        src.add(new Interval(1,3));
        src.add(new Interval(2,6));
        src.add(new Interval(8,10));
        src.add(new Interval(15,18));

        System.out.println(src);

        System.out.println(MergeIntervals.mergeIntervals(src));
    }

}