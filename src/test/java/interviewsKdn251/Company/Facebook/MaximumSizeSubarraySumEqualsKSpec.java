package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.04.2017.
 */
public class MaximumSizeSubarraySumEqualsKSpec {
    @Test
    public void getMaxLenSumKTest() throws Exception {
        int[] src = {1, -1, 5, -2, 3};

        Assert.assertEquals(4, MaximumSizeSubarraySumEqualsK.getMaxLenSumK(src, 3));
    }

}