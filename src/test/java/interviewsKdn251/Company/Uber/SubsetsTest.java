package interviewsKdn251.Company.Uber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.05.2017.
 */
public class SubsetsTest {
    @Test
    public void getSubsetsTest() throws Exception {
        int[] src = {1, 2, 3};

        System.out.println(Subsets.getSubsets(src) );

        Assert.assertEquals(8, Subsets.getSubsets(src).size());
    }

}