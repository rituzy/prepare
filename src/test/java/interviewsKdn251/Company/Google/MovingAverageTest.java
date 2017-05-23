package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class MovingAverageTest {
    @Test
    public void nextTest() throws Exception {
        MovingAverage m = new MovingAverage(3);

        Assert.assertEquals(1.0, m.next(1) ,0.1);
        Assert.assertEquals(11/2, m.next(10) ,0.1);
        Assert.assertEquals(14/3,  m.next(3) ,0.1);
        Assert.assertEquals(18/3, m.next(5) ,0.1);

    }

}