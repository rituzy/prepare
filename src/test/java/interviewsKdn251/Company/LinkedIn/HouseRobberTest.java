package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 17.05.2017.
 */
public class HouseRobberTest {
    @Test
    public void robMax() throws Exception {
        Assert.assertEquals(19, HouseRobber.robMax(new int[]{1,8,9,5,6,2,3}));
    }

}