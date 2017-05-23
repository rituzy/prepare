package interviewsKdn251.Company.Facebook;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 19.04.2017.
 */
public class InsertIntervalSpec {
    @Test
    public void intsertIntervalTest() throws Exception {
        ArrayList<InsertInterval.Interval> src = new ArrayList<>();
        src.add(new InsertInterval.Interval(1,2));
        src.add(new InsertInterval.Interval(3,5));
        src.add(new InsertInterval.Interval(6,7));
        src.add(new InsertInterval.Interval(8,10));
        src.add(new InsertInterval.Interval(12,16));

                /*Arrays.asList(new InsertInterval.Interval(1,2),
                new InsertInterval.Interval(3,5), new InsertInterval.Interval(6,7),
                new InsertInterval.Interval(8,10), new InsertInterval.Interval(12,16));*/

        System.out.println(src);

        InsertInterval.intsertInterval(src, new InsertInterval.Interval(4,9));

        System.out.println(src);

    }

}