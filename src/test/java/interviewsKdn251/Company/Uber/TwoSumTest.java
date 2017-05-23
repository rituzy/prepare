package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.05.2017.
 */
public class TwoSumTest {
    @Test
    public void getSumsTest() throws Exception {
        int[] src = {2, 7, 11, 15, 20, 1, 111};
        int[] expected = {2, 4};
        int[] actual = TwoSum.getSums(src, 31);
        Assert.assertArrayEquals(expected, actual);
    }

}