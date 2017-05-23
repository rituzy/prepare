package interviewsKdn251.Company.Google;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class InsertIntervalTest {
    @Test
    public void insert() throws Exception {
        ArrayList<Interval> src = new ArrayList<>();
        src.add(new Interval(1,2));
        src.add(new Interval(3,5));
        src.add(new Interval(6,7));
        src.add(new Interval(8,10));
        src.add(new Interval(12,16));

                /*Arrays.asList(new InsertInterval.Interval(1,2),
                new InsertInterval.Interval(3,5), new InsertInterval.Interval(6,7),
                new InsertInterval.Interval(8,10), new InsertInterval.Interval(12,16));*/

        System.out.println(src);

        System.out.println(InsertInterval.insert(src, new Interval(4,9)));
    }

    @Test
    public void insertIntervalTest() throws Exception {
        ArrayList<Interval> src = new ArrayList<>();
        src.add(new Interval(1,2));
        src.add(new Interval(3,5));
        src.add(new Interval(6,7));
        src.add(new Interval(8,10));
        src.add(new Interval(12,16));

                /*Arrays.asList(new InsertInterval.Interval(1,2),
                new InsertInterval.Interval(3,5), new InsertInterval.Interval(6,7),
                new InsertInterval.Interval(8,10), new InsertInterval.Interval(12,16));*/

        System.out.println(src);

        System.out.println(InsertInterval.insertInterval(src, new Interval(4,9)));
    }

}