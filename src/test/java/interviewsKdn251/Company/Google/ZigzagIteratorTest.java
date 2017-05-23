package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 15.05.2017.
 */
public class ZigzagIteratorTest {
    @Test
    public void hasNextTest() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(1,2), Arrays.asList(3,4,5,6));
        Assert.assertTrue(zigzagIterator.hasNext());
        ZigzagIterator zigzagIterator2 = new ZigzagIterator(Arrays.asList(), Arrays.asList());
        Assert.assertFalse(zigzagIterator2.hasNext());
    }

    @Test
    public void nextTest() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(1,2), Arrays.asList(3,4,5,6));
        Assert.assertEquals(new Integer(1), zigzagIterator.next());
        Assert.assertEquals(new Integer(3), zigzagIterator.next());
        Assert.assertEquals(new Integer(2), zigzagIterator.next());
    }

}