package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 18.04.2017.
 */
public class CombinationSumIVSpec {
    @Test
    public void getAllCombinationsTest() throws Exception {
        int[] src = {1,2,3};
        int target = 4;

        int actual = CombinationSumIV.getAllCombinations(src, target);

        Assert.assertEquals(7, actual);
    }

}