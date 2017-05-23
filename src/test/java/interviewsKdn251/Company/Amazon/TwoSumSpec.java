package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class TwoSumSpec {
    @Test
    public void twoSum() throws Exception {
        int[] src = {2, 7, 11, 15, 20, 1, 111};
        int[] expected = {2, 4};
        int[] actual = TwoSum.twoSum(src, 31);
        Assert.assertArrayEquals(expected, actual);
    }

}