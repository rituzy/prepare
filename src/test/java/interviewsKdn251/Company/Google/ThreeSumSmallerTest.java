package interviewsKdn251.Company.Google;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class ThreeSumSmallerTest {
    @Test
    public void countThreeSumSmallerTest() throws Exception {
        Assert.assertEquals(2, ThreeSumSmaller.countThreeSumSmaller(new int[]{-2,0,1,3}, 2));
    }

}