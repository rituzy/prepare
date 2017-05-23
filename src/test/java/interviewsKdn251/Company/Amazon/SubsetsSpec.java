package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class SubsetsSpec {
    @Test
    public void getSubsets() throws Exception {
        int[] src = {1,2,3};

        Assert.assertEquals(8, Subsets.getSubsets(src).size());
    }

}