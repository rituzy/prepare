package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class TwoSumTest {
    @Test
    public void getSumElementsIndexesTest() throws Exception {
        Assert.assertArrayEquals(new int[]{0,1}, TwoSum.getSumElementsIndexes(new int[]{2, 7, 11, 15}, 9));
    }

}