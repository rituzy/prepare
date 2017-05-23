package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class TrappingRainWaterSpec {
    @Test
    public void trapMaxWaterTest() throws Exception {
        int[] src = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assert.assertEquals(6, TrappingRainWater.trapMaxWater(src));
    }

}