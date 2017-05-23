package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 20.05.2017.
 */
public class TwoSumTest {
    @Test
    public void getInds2SumTest() throws Exception {
        int[] src = {2, 7, 11, 15, 20, 1, 111};
        int[] expected = {2, 4};
        int[] actual = TwoSum.getInds2Sum(src, 31);
        Assert.assertArrayEquals(expected, actual);
    }

}