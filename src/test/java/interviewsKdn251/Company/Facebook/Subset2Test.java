package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */

public class Subset2Test {
    @Test
    public void getSubsets2CycleTest() throws Exception {
        Assert.assertEquals(6, Subset2.getSubsets2(new int[]{1,2,2}).size());
    }

    @Test
    public void getSubsets2Test() throws Exception {
        Assert.assertEquals(6, Subset2.getSubsets2(new int[]{1,2,2}).size());
    }



}