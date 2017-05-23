package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 15.04.2017.
 */
public class ThreeSumSpec {
    @Test
    public void getThreeNumSumZeroTest() throws Exception {
        int[] src = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> actual = ThreeSum.getThreeNumSumZero(src);
        Assert.assertEquals(-1, (int)actual.get(0).get(0));
        Assert.assertEquals(-1, (int)actual.get(0).get(1));
        Assert.assertEquals(2, (int)actual.get(0).get(2));

        Assert.assertEquals(-1, (int)actual.get(1).get(0));
        Assert.assertEquals(0, (int)actual.get(1).get(1));
        Assert.assertEquals(1, (int)actual.get(1).get(2));
    }

}