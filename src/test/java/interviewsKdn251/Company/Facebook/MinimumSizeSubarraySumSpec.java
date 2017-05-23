package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.04.2017.
 */
public class MinimumSizeSubarraySumSpec {
    @Test
    public void findSubarraySum() throws Exception {
        int[] numbers = {2,3,1,2,4,3};
        Assert.assertEquals(2, MinimumSizeSubarraySum.findSubarraySum(numbers, 7));
    }

}