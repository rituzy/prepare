package interviewsKdn251.Company.coursera_algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 29.05.2017.
 */
public class IntersectSetsTest {
    @Test
    public void getIntersectioinTest() throws Exception {
        List<Point> A = Arrays.asList(new Point(1,2), new Point(2,3), new Point(4, 5),
                new Point(6,7), new Point(100, 500));
        List<Point> B = Arrays.asList(new Point(11,12), new Point(23,35), new Point(45, 5),
                new Point(6,73), new Point(100, 500));
        Assert.assertEquals(Arrays.asList(new Point(100, 500)),
                IntersectSets.getIntersectioin(A, B));

    }

}