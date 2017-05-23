package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class MaximumProductSubarrayTest {
    @Test
    public void getMaxProdSubArrTest() throws Exception {
        Assert.assertEquals(6, MaximumProductSubarray.getMaxProdSubArr(new int[]{2,3,-2,4}));
    }

}