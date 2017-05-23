package interviewsKdn251.Company.twitter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class TrappingRainWaterTest {
    @Test
    public void trapTest() throws Exception {
        int[] src = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assert.assertEquals(6, TrappingRainWater.trap(src));
    }

}