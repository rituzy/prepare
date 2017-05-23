package interviewsKdn251.Company.LinkedIn;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 17.05.2017.
 */
public class InsertIntervalTest {
    @Test
    public void insertTest() throws Exception {
        ArrayList<Interval> src = new ArrayList<>();
         src.add(new Interval(1,2));
        src.add(new Interval(3,5));
        src.add(new Interval(6,7));
        src.add(new Interval(8,10));
        src.add(new Interval(12,16));

                /*Arrays.asList(new Interval(1,2),
                new Interval(3,5), new Interval(6,7),
                new Interval(8,10), new Interval(12,16));*/

        System.out.println(src);

        InsertInterval.insert(src, new Interval(4,9));

        System.out.println(src);
    }

}