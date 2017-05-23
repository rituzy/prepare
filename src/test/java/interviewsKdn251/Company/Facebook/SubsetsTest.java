package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class SubsetsTest {
    @Test
    public void getAllCombinationsTest() throws Exception {
        int[] src = {1, 2, 3};

        Assert.assertEquals(8, Subsets.getAllCombinations(src).size());
    }

}