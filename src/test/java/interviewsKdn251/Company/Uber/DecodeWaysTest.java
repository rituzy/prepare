package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class DecodeWaysTest {
    @Test
    public void getWaysTest() throws Exception {
        Assert.assertEquals(2, DecodeWays.getWays("12") );
        Assert.assertEquals(589824, DecodeWays.getWays("4757562545844617494555774581341211511296816786586787755257741178599337186486723247528324612117156948") );
    }

}