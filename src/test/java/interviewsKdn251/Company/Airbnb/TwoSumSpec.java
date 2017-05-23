package interviewsKdn251.Company.Airbnb;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 15.04.2017.
 */
public class TwoSumSpec {
    @Test
    public void getIndexForSum() throws Exception {
        int[] src = {2, 7, 11, 15, 20, 1, 111};
        int[] expected = {2, 4};
        int[] actual = TwoSum.getIndexForSum(src, 31);
        Assert.assertArrayEquals(expected, actual);
    }

}