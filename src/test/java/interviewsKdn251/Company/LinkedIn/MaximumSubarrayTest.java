package interviewsKdn251.Company.LinkedIn;

import interviewsKdn251.Company.Facebook.MaximumSizeSubarraySumEqualsK;
import interviewsKdn251.Company.Google.MaximumProductOfWordLengths;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class MaximumSubarrayTest {
    @Test
    public void getMaxSumTest() throws Exception {

        Assert.assertEquals(6, MaximumSubarray.getMaxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }

}